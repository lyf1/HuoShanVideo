package com.huoshan.api.huoshanvideo.live;

import com.huoshan.api.huoshanvideo.Bean.LiveBean;

import io.reactivex.Observer;

/**
 * Created by lenovo on 2017/12/29.
 */

public interface LiveOnImm {
    void OnImm(Observer<LiveBean> observer);
}
