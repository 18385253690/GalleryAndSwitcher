package com.example.liuyueyue.galleryandswitcher;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

import java.security.BasicPermission;

/**
 * Created by liuyueyue on 2017/8/2.
 */

public class ImageAdapter extends BaseAdapter {
    private int[] res;
    private Context context;

    public ImageAdapter(int []res,Context context){
        this.res=res;
        this.context=context;
    }
    @Override
    //返回已经定义的数据源的数量
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    //告诉适配器取得目前容器中的数据ID和对象
    public Object getItem(int position) {
        return res[position];
    }

    @Override
    //告诉适配器取得目前容器中的数据ID和对象
    public long getItemId(int position) {
        return position;
    }

    @Override
    //取得目前欲显示的图像View，传入数组ID值使之读取与成像
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i("Main","position="+position+"res的角标="+position%res.length);
        ImageView image = new ImageView(context);
        image.setImageResource(res[position%res.length]);
        image.setLayoutParams(new Gallery.LayoutParams(200,150));
        image.setScaleType(ImageView.ScaleType.FIT_XY);
        return image;
    }
}
