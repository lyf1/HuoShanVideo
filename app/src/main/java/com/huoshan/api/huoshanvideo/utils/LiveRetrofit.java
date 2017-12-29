package com.huoshan.api.huoshanvideo.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lenovo on 2017/12/29.
 */

public class LiveRetrofit {
    private static ServicrApi servicrApi;
    public static <T> T createApi(Class<T> tClass,String url){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(tClass);
    }
    public static ServicrApi getServicrApi(){
        if(servicrApi==null){
            synchronized (RetrofitUtils.class){
                if(servicrApi==null){
                    servicrApi=RetrofitUtils.createApi(ServicrApi.class,UrlUtils.LIVE_HOST);
                }
            }
        }
        return  servicrApi;
    }
}
