package com.h.publish;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.h.appui.tab.BottomNavigationBar;
import com.h.appui.tab.BottomNavigationItem;
import com.h.publish.base.PBaseActivity;

import butterknife.BindView;


public class MainActivity extends PBaseActivity implements BottomNavigationBar.OnNavigationItemSelectedListener {


    @BindView(R.id.bar)
    BottomNavigationBar bar;

    @Override
    protected void initListener() {
//        bar.setOnNavigationItemSelectedListener(this);
    }

    @Override
    protected int getContentViewID() {

        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle bundle) {
        super.init(bundle);
        if (bundle == null) {
            loadRootFragment(R.id.fragment_container, HomeFragment.getInstance());
        }
    }

    @Override
    protected void loadData() {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull BottomNavigationItem bottomNavigationItem, int i) {
        return false;
    }

    @Override
    public void onNavigationItemSelectedAgain(@NonNull BottomNavigationItem bottomNavigationItem, int i) {

    }
}
