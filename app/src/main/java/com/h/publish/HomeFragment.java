package com.h.publish;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.blankj.utilcode.utils.BarUtils;
import com.h.publish.base.PBaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * com.h.publish/Publish
 * 作者：Harvey on 2017/3/9 15:28
 * 邮箱：497823256@qq.com
 * 说明：
 * 修改：
 * 修改说明：
 */
public class HomeFragment extends PBaseFragment {

    private HomeAdapter mHomeAdapter;

//    @BindView(R.id.swipe_refresh)
//    SwipeRefreshLayout swipe_refresh;


//    @BindView(R.id.common_list_refresh)
//    TwinklingRefreshLayout common_list_refresh;

    @BindView(R.id.common_list_recycler_view)
    RecyclerView common_list_recycler_view;

    @BindView(R.id.main_iv_placeholder)
    ImageView main_iv_placeholder;

    public static HomeFragment getInstance() {
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }

    protected void initRecyclerView() {
        BarUtils.setTranslucentForImageViewInFragment(getActivity(),20,common_list_recycler_view);

//        SinaRefreshView sinaRefreshView = new SinaRefreshView(getContext());
//        sinaRefreshView.setArrowResource(R.drawable.ic_arrow);
//        common_list_refresh.setHeaderView(sinaRefreshView);
//
//        LoadingView loadingView = new LoadingView(getContext());
//        common_list_refresh.setBottomView(loadingView);


        common_list_recycler_view.setLayoutManager(new LinearLayoutManager(getContext()));
//        swipe_refresh.setProgressViewOffset(false, 0, 50);
    }


    @Override
    protected void loadData() {


    }

    @Override
    protected void getBundleExtras(Bundle bundle) {

    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView(Bundle bundle) {
        initRecyclerView();
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        mHomeAdapter = new HomeAdapter(stringList);
        common_list_recycler_view.setAdapter(mHomeAdapter);
//
//        Bitmap bitmap = ImageUtils.getBitmap(getResources(), R.drawable.a87);
//        main_iv_placeholder.setImageBitmap(ImageUtils.fastBlur(bitmap, 1F, 10));

    }


}
