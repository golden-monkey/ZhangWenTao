package com.example.myapplication.base;

import java.lang.ref.WeakReference;

public class BasePresenter<V> {

    private WeakReference<V> weakReference;

    // 绑定
    public void attachView(V v){
        // 弱引用
        weakReference = new WeakReference<>(v);
    }

    // 获取数据
    public V getView() {
        return weakReference.get();
    }

    // 解绑
    public void detachView() {
        weakReference.clear();
    }
}
