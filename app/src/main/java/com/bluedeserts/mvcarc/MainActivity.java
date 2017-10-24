package com.bluedeserts.mvcarc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AllInterface.View1 {
    TextView textView;
    Button button;
    Presenter presenter;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter=new Presenter(this);

    }
    @Override
    public void initView() {
        textView = (TextView) findViewById(R.id.textview);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.click(view);
            }
        });
    }



    @Override
    public void setData(String data){
        textView.setText(data);
    }

}
