package com.beicai.wzj.frescodemo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;

import org.xutils.x;

/**
 * Created by MR_Wang on 2017/2/20.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //基本使用Fresco初始化Fresco
       // Fresco.initialize(this);
        //初始化xutils3
        x.Ext.init(this);
        //是否输出Debug信息
        x.Ext.setDebug(BuildConfig.DEBUG);

        //渐进式JPEG图的初始化方法
        ImagePipelineConfig config=ImagePipelineConfig.newBuilder(this)
                .setProgressiveJpegConfig(new SimpleProgressiveJpegConfig())
                .build();
        Fresco.initialize(this,config);
    }
}
