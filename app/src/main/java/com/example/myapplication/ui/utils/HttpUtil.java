package com.example.myapplication.ui.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static android.net.ConnectivityManager.*;

/**
 * 作者：张文涛
 * 功能：网络工具类
 * 时间：09点19分
 */

public class HttpUtil {

    /*// 懒汉式
    private static HttpUtil httpUtil = null;
    private HttpUtil(){};
    public static HttpUtil getInstance() {
        if (httpUtil == null) {
            synchronized (HttpUtil.class){
                if (httpUtil == null) {
                    httpUtil = new HttpUtil();
                }
            }
        }
        return httpUtil;
    }

    // 判断网络状态
    public static boolean isNetWorkConnection (Context context) {
        if (context != null) {
            ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = manager.getActiveNetworkInfo();
            if (networkInfo != null) {
                return networkInfo.isAvailable();
            }
        }
        return false;
    }

    // 判断网络状态
    public static boolean isWIFIConnection (Context context) {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = (NetworkInfo) manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (networkInfo != null) {
            return networkInfo.isAvailable();
        }
        return false;
    }

    // 网络连接
    public static String getString (String urlStr) {
        try {
            // 转换成URL
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // 设置请求方法
            connection.setRequestMethod("GET");
            // 设置连接超时方法
            connection.setConnectTimeout(5000);
            // 设置读取超时时间
            connection.setReadTimeout(5000);
            // 判断网络是否请求成功
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // 拼接字符串
                InputStream stream = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder builder = new StringBuilder();
                String str = "";
                if ((str = reader.readLine()) != null) {
                    builder.append(str);
                }
                // 关闭连接
                connection.disconnect();
                // 返回字符串
                return builder.toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }*/




}
