package com.huoshan.api.huoshanvideo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.huoshan.api.huoshanvideo.Bean.LiveBean;

import java.util.List;

/**
 * Created by lenovo on 2017/12/29.
 */

public class LiveAdater extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<LiveBean.DataBeanX> list;
    private Context context;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
