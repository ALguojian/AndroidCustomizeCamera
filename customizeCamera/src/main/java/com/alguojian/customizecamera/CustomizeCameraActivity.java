package com.alguojian.customizecamera;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class CustomizeCameraActivity extends AppCompatActivity {

    private static TakePhotoPath mTakePhotoPath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_customize_camera);
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, Camera2BasicFragment.newInstance(mTakePhotoPath))
                    .commit();
        }
    }

    public static void start(Context context,TakePhotoPath takePhotoPath) {
        Intent starter = new Intent(context, CustomizeCameraActivity.class);
        mTakePhotoPath=takePhotoPath;
        context.startActivity(starter);
    }
}
