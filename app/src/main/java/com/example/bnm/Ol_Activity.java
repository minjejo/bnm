package com.example.bnm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ol_Activity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ol_);

        tv = (TextView)findViewById(R.id.olm1);
        Button pb = (Button)findViewById(R.id.pb);
        Button mb = (Button)findViewById(R.id.mb);
    }

    public void BtnClicked(View v){
        int num = Integer.parseInt(tv.getText().toString());

        switch (v.getId()){
            case R.id.pb:
                num++;
                break;

            case R.id.mb:
                num--;
                break;
        }
        tv.setText(String.valueOf(num));
    }
}