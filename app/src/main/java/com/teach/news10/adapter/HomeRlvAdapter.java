package com.teach.news10.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.teach.news10.R;
import com.teach.news10.bean.HomeBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Andongn1
 * on 2020/4/26
 */
public class HomeRlvAdapter extends RecyclerView.Adapter<HomeRlvAdapter.ViewHolder> {
    private Context context;
    private List<HomeBean.ResultBean> list;

    public HomeRlvAdapter(Context context, List<HomeBean.ResultBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_home, parent, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mTv1.setText(list.get(position).getText());
        holder.mTv2.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }




    class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tv1)
        TextView mTv1;
        @BindView(R.id.tv2)
        TextView mTv2;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
