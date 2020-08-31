package com.teach.news10.Frame;

import com.teach.news10.bean.HomeBean;
import com.teach.news10.bean.LeftMenuInfo;
import com.teach.news10.bean.LevelAndRoundInfo;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by 任小龙 on 2019/6/27.
 */
public interface INetService {
    @POST("getJoke")
    @FormUrlEncoded
    Observable<HomeBean> getHome(@FieldMap Map<String,String> params);


    @GET()
    Observable<LevelAndRoundInfo> getLevelInfo(@Url String url);
}
