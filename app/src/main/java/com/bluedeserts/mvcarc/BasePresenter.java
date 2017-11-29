package com.bluedeserts.mvcarc;

/**
 * Created by Lenovo on 29-11-2017.
 */

public class BasePresenter<T> {

    public T mvpView;

    public void setView(T mvpView) {
        this.mvpView = mvpView;
    }

    public T getView() {
        return mvpView;
    }
}
