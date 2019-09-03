package com.example.myapplication.ui.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.data.data.ShopBean;
import com.example.myapplication.di.contract.IShopContract;
import com.example.myapplication.di.presenter.ShopPresenter;
import com.example.myapplication.ui.adapter.MyAdapter;
import com.qy.xlistview.XListView;

import java.util.ArrayList;

/**
 * 作者：张文涛
 * 功能：商品的视图层
 * 时间：09点19分
 */

public class MainActivity extends BaseActivity<IShopContract.IShopView, ShopPresenter<IShopContract.IShopView>> implements IShopContract.IShopView {

    private ListView listView;

    @Override
    public void showShopData(ShopBean shopBean) {
        if (shopBean != null) {
            // 设置数据集合
            ArrayList<ShopBean.DataBean> list = (ArrayList<ShopBean.DataBean>) shopBean.getData();
            MyAdapter adapter = new MyAdapter(MainActivity.this, list);
            listView.setAdapter(adapter);
        }
    }



    @Override
    protected void initView() {
        listView = findViewById(R.id.listView);
    }

    @Override
    protected void initData() {
        mPresenter.requestShopInfo();
    }

    @Override
    protected ShopPresenter<IShopContract.IShopView> createPresenter() {
        return new ShopPresenter<>();
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }
}
