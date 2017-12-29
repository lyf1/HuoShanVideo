package com.huoshan.api.huoshanvideo.live;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huoshan.api.huoshanvideo.R;
import com.huoshan.api.huoshanvideo.utils.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by lenovo on 2017/12/28.
 */

public class LiveFragment extends Fragment {
    private View view;
    private Banner mLBanner;
    private RecyclerView mLRv;
    private List<String> images=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.live_fragment, container, false);
        initView(view);
        /**
         *  轮播展示
         */
        mLBanner .setImageLoader(new GlideImageLoader());
        //设置图片集合
        mLBanner .setImages(images);
        //banner设置方法全部调用完毕时最后调用
        mLBanner .start();
        return view;
    }

    private void initView(View view) {
        mLBanner = (Banner) view.findViewById(R.id.l_banner);
        mLRv = (RecyclerView) view.findViewById(R.id.l_rv);
        mLRv.setLayoutManager(new GridLayoutManager(getContext(),2));
    }

}
