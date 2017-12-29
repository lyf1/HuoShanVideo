package com.huoshan.api.huoshanvideo.Login;

import com.huoshan.api.huoshanvideo.Bean.BaseBean;

import io.reactivex.Observer;

/**
 * Created by lenovo on 2017/12/28.
 */

public interface LoginOnImm  {
    void OnImm( String mob,  String pwd,Observer<BaseBean> observer);
}
