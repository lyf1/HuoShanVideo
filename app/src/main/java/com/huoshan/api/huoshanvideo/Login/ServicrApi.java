package com.huoshan.api.huoshanvideo.Login;

import com.huoshan.api.huoshanvideo.Bean.BaseBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lenovo on 2017/12/28.
 */

public interface ServicrApi {
    @GET("user/login")
    Call<BaseBean> login(@Query("mobile") String mob, @Query("password") String pwd);

}
