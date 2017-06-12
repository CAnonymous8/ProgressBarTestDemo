package com.tencent.neilchen.progressbartestdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    MyProgressbar progressBarView = (MyProgressbar) findViewById(R.id.pb);
    progressBarView.setMax(100);
    progressBarView.setProgress(45);
    progressBarView.setData("3015分");
    Log.d(MainActivity.class.getSimpleName(),"revert_text");
    Log.d(MainActivity.class.getSimpleName(),"revert_text2");
  }
}
