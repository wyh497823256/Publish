package com.h.publish.base;

import android.os.Bundle;

import com.h.appmvp.base.BaseActivity;

import butterknife.ButterKnife;

/**
 * com.h.publish.base/Publish
 * 作者：Harvey on 2017/3/9 15:25
 * 邮箱：497823256@qq.com
 * 说明：
 * 修改：
 * 修改说明：
 */
public abstract class PBaseActivity extends BaseActivity {

    @Override
    protected void init(Bundle bundle) {
        ButterKnife.bind(this);
    }
}
