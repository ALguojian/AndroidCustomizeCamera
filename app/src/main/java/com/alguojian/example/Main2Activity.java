package com.alguojian.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alguojian.customizecamera.CustomizeCameraActivity;
import com.alguojian.customizecamera.TakePhotoPath;
import com.bumptech.glide.Glide;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.textView).setOnClickListener(v ->
                CustomizeCameraActivity.start(Main2Activity.this, path -> {
                    System.out.println("-----=========获得图片地址是：" + path);
                    Glide.with(this)
                            .load(path)
                            .into((ImageView) findViewById(R.id.imageView));
                }));
    }
}
