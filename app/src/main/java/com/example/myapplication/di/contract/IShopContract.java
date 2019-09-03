package com.example.myapplication.di.contract;

import com.example.myapplication.data.data.ShopBean;

/**
 * 作者：张文涛
 * 功能：商品的契约类
 * 时间：09点19分
 */

public interface IShopContract {
    /**
     * View 层
     */
    public interface IShopView {
        public void showShopData(ShopBean shopBean);
    }

    /**
     * P 层
     */
    public interface IShopPresenter<IShopView> {
        // 绑定
        public void attachView(IShopContract.IShopView shopView);

        // 解绑
        public void detachView();
    }

    /**
     * M 层
     */
    public interface IShopModel {
        // 请求
        public void containShopInfo(IShopCallBack shopCallBack);

        // 接口回调
        public interface IShopCallBack {
            public void getShopData(ShopBean shopBean);
        }
    }
}
