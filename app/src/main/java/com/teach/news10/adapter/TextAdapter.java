package com.teach.news10.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.teach.news10.R;
import com.teach.news10.bean.LevelAndRoundInfo;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Andongn1
 * on 2020/5/21
 */
public class TextAdapter extends RecyclerView.Adapter<TextAdapter.ViewHolder> {
    List<LevelAndRoundInfo.ContentBeanX.RoundsBean.ContentBean.DataBean> mList;
    Context mContext;

    public TextAdapter(List<LevelAndRoundInfo.ContentBeanX.RoundsBean.ContentBean.DataBean> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.test_adapter_layout, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LevelAndRoundInfo.ContentBeanX.RoundsBean.ContentBean.DataBean dataBean = mList.get(position);
        Glide.with(mContext).load(dataBean.getTeam_A_logo()).into(holder.mLeftImage);
        Glide.with(mContext).load(dataBean.getTeam_B_logo()).into(holder.mRightImage);
        holder.mLeftText.setText(dataBean.getTeam_A_name());
        holder.mRightText.setText(dataBean.getTeam_B_name());
    }

    @Override
    public int getItemCount() {
        return mList!=null?mList.size():0;
    }



    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.left_image)
        ImageView mLeftImage;
        @BindView(R.id.left_text)
        TextView mLeftText;
        @BindView(R.id.right_image)
        ImageView mRightImage;
        @BindView(R.id.right_text)
        TextView mRightText;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
