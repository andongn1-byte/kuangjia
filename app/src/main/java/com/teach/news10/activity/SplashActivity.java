package com.teach.news10.activity;

import android.os.Build;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.teach.news10.Frame.ApiConfig;
import com.teach.news10.Frame.BaseMvpActivity;

import com.teach.news10.R;
import com.teach.news10.adapter.HomeRlvAdapter;
import com.teach.news10.adapter.TestAdapter;
import com.teach.news10.bean.HomeBean;
import com.teach.news10.bean.LevelAndRoundInfo;
import com.teach.news10.model.HomeModel;
import com.teach.news10.utils.LoadStatusConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class SplashActivity extends BaseMvpActivity<HomeModel> {


    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout refreshLayout;


   Map<String,String> map=new HashMap<>();
   List<HomeBean.ResultBean> mList=new ArrayList<>();
    private HomeRlvAdapter adapter;
    private int page = 1;
    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void initView() {
        initRecycleView(recyclerView,refreshLayout);
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(manager);
        adapter = new HomeRlvAdapter(this, mList);
        recyclerView.setAdapter(adapter);


        //设置分割线
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }

    @Override
    public void initData() {
        showLoadingDialog();
        map.put("page",String.valueOf(page));
        map.put("count","5");
        map.put("type","video");
        mPresenter.getData(ApiConfig.HOME_DRAWERLAYOUT, map,LoadStatusConfig.NORMAL_LOAD);

    }

    @Override
    public HomeModel getModel() {
        return new HomeModel();
    }

    @Override
    public void onError(int whichApi, Throwable e) {

    }

    @Override
    public void onResponse(int whichApi, Object[] t) {
 hideLoadingDialog();
// int loadType= (int) t[1];
//        Log.e("tag", "onResponse: "+loadType);
//        if (loadType==LoadStatusConfig.REFRESH_LOAD){
//            refreshLayout.finishRefresh();
//            mList.clear();
//        }else if (loadType==LoadStatusConfig.MORE_LOAD){
//            refreshLayout.finishLoadMore();
//
//        }
        HomeBean homeBean= (HomeBean) t[0];
        if (homeBean.getResult()!=null && homeBean.getResult().size()>0){
            mList.addAll(homeBean.getResult());
            adapter.notifyDataSetChanged();
        }

    }

    @Override
    public void refresh() {
        super.refresh();
        page=1;
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){
            map.replace("page",String.valueOf(page));
        }
        mPresenter.getData(ApiConfig.HOME_DRAWERLAYOUT,map,LoadStatusConfig.REFRESH_LOAD);
    }

    @Override
    public void loadMore() {
        super.loadMore();
        page++;
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){
            map.replace("page",String.valueOf(page));
        }
        mPresenter.getData(ApiConfig.HOME_DRAWERLAYOUT,map,LoadStatusConfig.MORE_LOAD);
    }
}
