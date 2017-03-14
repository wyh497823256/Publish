package com.h.publish.base;

import android.os.Bundle;
import android.view.View;

import com.h.appmvp.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * com.h.publish.base/Publish
 * 作者：Harvey on 2017/3/9 15:28
 * 邮箱：497823256@qq.com
 * 说明：
 * 修改：
 * 修改说明：
 */
public abstract class PBaseFragment extends BaseFragment {



    @Override
    protected void initView(Bundle bundle) {

    }





    @Override
    protected void initButterKnife(View view) {
        ButterKnife.bind(this, view);
    }
}
