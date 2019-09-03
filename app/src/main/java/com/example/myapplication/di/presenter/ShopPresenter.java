package com.example.myapplication.di.presenter;

import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.data.data.ShopBean;
import com.example.myapplication.di.contract.IShopContract;
import com.example.myapplication.di.model.ShopModel;

/**
 * 作者：张文涛
 * 功能：商品的逻辑层
 * 时间：09点19分
 */

public class ShopPresenter<V extends IShopContract.IShopView> extends BasePresenter<V> {

    private final ShopModel model;

    public ShopPresenter() {
        model = new ShopModel();
    }

    public void requestShopInfo() {
        model.containShopInfo(new IShopContract.IShopModel.IShopCallBack() {
            @Override
            public void getShopData(ShopBean shopBean) {
                getView().showShopData(shopBean);
            }
        });
    }
}
