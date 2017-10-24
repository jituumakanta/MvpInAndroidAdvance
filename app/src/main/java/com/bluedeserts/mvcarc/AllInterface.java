package com.bluedeserts.mvcarc;

import android.view.View;

/**
 * Created by jitu on 10/24/2017.
 */

public interface AllInterface {
    interface View1{
        public void initView();
        public void setData(String data);

    }
    interface presenter{
        public void click(View view);
    }
    interface model{
        public String getData();
    }
}
