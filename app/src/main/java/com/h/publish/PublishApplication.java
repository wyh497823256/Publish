package com.h.publish;

import android.app.Application;

import com.blankj.utilcode.utils.Utils;

/**
 * com.h.publish/Publish
 * 作者：Harvey on 2017/3/11 15:03
 * 邮箱：497823256@qq.com
 * 说明：
 * 修改：
 * 修改说明：
 */
public class PublishApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
