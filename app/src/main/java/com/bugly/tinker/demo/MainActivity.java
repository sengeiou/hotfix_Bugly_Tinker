package com.bugly.tinker.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.tencent.bugly.beta.Beta;

public class MainActivity extends Activity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textview);
        StringBuffer data = new StringBuffer();
        data.append(BuildConfig.VERSION_NAME).append("\n");
        data.append("####正常功能").append("\n");
        data.append("#### V3.0 BUG修复V1").append("\n");//BUG修复V1
        textView.setText(data.toString());

        Beta.checkUpgrade();

    }

    public class BugClass {
        public String bug() {
//            Integer.valueOf("a");
            return "This is a bug class";
        }
    }
}
