package com.bluedeserts.mvcarc;

import android.view.View;
import android.widget.Toast;

import com.bluedeserts.mvcarc.interfaces.PresenterInterface;
import com.bluedeserts.mvcarc.interfaces.ViewInterface;

/**
 * Created by jitu on 10/24/2017.
 */

public class Presenter extends Mainpresenter<ViewInterface> implements PresenterInterface {
   // private final MainActivity mview;
    Model model;

    public Presenter() {
      //  this.mview=view;

       // getView().initView();
    }

    public void setViewfor() {
        getView().initView();

    }


    public void click(View view) {
        model=new Model();
       String s= model.getData();
        getView().setData(s);
    }
}
