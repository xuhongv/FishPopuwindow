package com.xuhong.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.xuhong.smarthome.view.mPopupWindow;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView ic_tab_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ic_tab_add= (ImageView) findViewById(R.id.dd5);
        ic_tab_add.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()){
            case R.id.dd5:
                mPopupWindow mPopupWindow =new mPopupWindow(MainActivity.this, new mPopupWindow.OnPopWindowClickListener() {
                    @Override
                    public void onPopWindowClickListener(View view) {
                        switch (view.getId()){
                            case R.id.iv_push_photo:
                                Toast.makeText(MainActivity.this,"点击了相机",Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.iv_push_resale:
                                Toast.makeText(MainActivity.this,"点击了淘宝",Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });
                mPopupWindow.show();
                break;
        }
    }
}
