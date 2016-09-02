package com.testfirebase.sijan.testfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NotificationClick extends AppCompatActivity {

    TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_click);
        tvData=(TextView)findViewById(R.id.tvData);
        tvData.setText(getIntent().getStringExtra("data"));
    }
}
