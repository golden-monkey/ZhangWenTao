package com.example.myapplication.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<V, P extends BasePresenter<V>> extends AppCompatActivity {

    public Context bContext;
    public P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 绑定布局
        setContentView(bindLayout());

        // 上下文
        bContext = this;

        // 创建 P 层
        mPresenter = createPresenter();

        // 绑定 p 层
        mPresenter.attachView((V) this);

        initView();

        // 初始化控件
        initData();
    }

    protected abstract void initView();

    // 初始化控件
    protected abstract void initData();

    // 创建 P 层
    protected abstract P createPresenter();

    // 解绑 P 层
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    // 绑定布局
    public abstract int bindLayout();
}
