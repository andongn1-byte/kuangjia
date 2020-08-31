package com.teach.news10;

import android.content.Intent;
import android.view.View;

import com.teach.news10.Frame.ApiConfig;
import com.teach.news10.Frame.BaseMvpActivity;
import com.teach.news10.Frame.CommonPresenter;
import com.teach.news10.activity.SplashActivity;
import com.teach.news10.bean.LeftMenuInfo;
import com.teach.news10.model.HomeModel;

public class TestActivity extends BaseMvpActivity<HomeModel> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {
       // mPresenter.getData(ApiConfig.SLIDE_LEFT_CENTER_DATA);
    }

    @Override
    public HomeModel getModel() {
        return new HomeModel();
    }

    @Override
    public void onError(int whichApi, Throwable e) {
        showLog(e.getMessage() != null ? e.getMessage()+":"+whichApi : "");
    }

    @Override
    public void onResponse(int whichApi, Object[] t) {
        switch (whichApi) {
         //   case ApiConfig.SLIDE_LEFT_CENTER_DATA:
//                LeftMenuInfo info = (LeftMenuInfo) t[0];
//                String image = info.config.sidebar_bg_image;
//                showLog(image);
//                break;
        }
    }

    public void jump(View view) {
        startActivity(new Intent(this, SplashActivity.class));
    }
}
