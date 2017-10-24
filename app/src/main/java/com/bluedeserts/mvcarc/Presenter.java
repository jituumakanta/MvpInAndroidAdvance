package com.bluedeserts.mvcarc;

import android.view.View;

/**
 * Created by jitu on 10/24/2017.
 */

public class Presenter implements AllInterface.presenter {
    private final MainActivity mview;
    Model model;

    public Presenter(MainActivity view) {
        this.mview=view;
        model=new Model();
        mview.initView();
    }

    public void click(View view) {

       String s= model.getData();
        mview.setData(s);
    }
}
