package com.teach.news10.model;

import com.teach.news10.Frame.ApiConfig;
import com.teach.news10.Frame.BaseObserver;
import com.teach.news10.Frame.ICommonModel;
import com.teach.news10.Frame.ICommonView;
import com.teach.news10.Frame.INetService;
import com.teach.news10.Frame.NetConfig;
import com.teach.news10.Frame.NetManager;
import com.teach.news10.bean.LeftMenuInfo;
import com.teach.news10.utils.LoadStatusConfig;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 任小龙 on 2019/6/27.
 */
public class HomeModel implements ICommonModel {
    NetManager mManager = NetManager.getNetManager();
    int page = 1;
    @Override
    public void getData(final ICommonView view, final int whichApi, Object[] t) {
        switch (whichApi) {
            case ApiConfig.HOME_DRAWERLAYOUT:
                mManager.method(mManager.getNetService().getHome((Map<String,String>)t[0]), view, whichApi, t);
                break;
//            case ApiConfig.TEST_LIST_DATA:
//
//                int loadType = (int) t[0];
//                if (loadType == LoadStatusConfig.REFRESH_LOAD){
//                    page = 1;
//                } else if (loadType == LoadStatusConfig.MORE_LOAD){
//					page++;
//					String url = "http://sport-data.dqdgame.com/sd/biz/data/standing?season_id=119&version=0&platform=";
//					mManager.method(mManager.getNetService().getLevelInfo(url), view, whichApi, t);
//				}
//               break;
        }
    }
}
