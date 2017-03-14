package com.h.publish;

import com.h.appui.adapter.BaseQuickAdapter;
import com.h.appui.adapter.BaseViewHolder;

import java.util.List;

/**
 * com.h.publish/Publish
 * 作者：Harvey on 2017/3/9 16:06
 * 邮箱：497823256@qq.com
 * 说明：
 * 修改：
 * 修改说明：
 */
public class HomeAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public HomeAdapter(List<String> data) {
        super(R.layout.item_home, data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, String s) {
        baseViewHolder.setText(R.id.item_home_tv_bane, s);
    }
}
