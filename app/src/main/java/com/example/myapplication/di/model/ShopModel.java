package com.example.myapplication.di.model;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.data.Constant;
import com.example.myapplication.data.data.ShopBean;
import com.example.myapplication.di.contract.IShopContract;
import com.example.myapplication.ui.App;
import com.example.myapplication.ui.utils.HttpUtil;
import com.google.gson.Gson;

/**
 * 作者：张文涛
 * 功能：商品的网络
 * 时间：09点19分
 */

public class ShopModel implements IShopContract.IShopModel {
    @Override
    public void containShopInfo(final IShopCallBack shopCallBack) {
        // 请求对列
        RequestQueue requestQueue = Volley.newRequestQueue(App.context);
        // 请求
        StringRequest stringRequest = new StringRequest(Request.Method.GET, Constant.SHOP_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                ShopBean shopBean = gson.fromJson(response, ShopBean.class);
                shopCallBack.getShopData(shopBean);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                shopCallBack.getShopData(null);
            }
        });
        // 挂载对列
        requestQueue.add(stringRequest);
    }
}
