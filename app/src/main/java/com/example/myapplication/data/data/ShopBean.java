package com.example.myapplication.data.data;

import java.util.List;

/**
 * 作者：张文涛
 * 功能：商品的封装类
 * 时间：09点19分
 */

public class ShopBean {

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * currency_price : ￥98
         * goods_name : 凡尔赛系列玻璃碗沙拉碗透明碗S
         * goods_thumb : http://img.fulishe.com/images/201908/thumb_img/16843_thumb_G_1565072750629.jpeg
         */

        private String currency_price;
        private String goods_name;
        private String goods_thumb;

        public String getCurrency_price() {
            return currency_price;
        }

        public void setCurrency_price(String currency_price) {
            this.currency_price = currency_price;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public String getGoods_thumb() {
            return goods_thumb;
        }

        public void setGoods_thumb(String goods_thumb) {
            this.goods_thumb = goods_thumb;
        }
    }
}
