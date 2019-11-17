package com.simcoder.whatsappclone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;


 public void goToofficerInfo(View view)
 {
     Intent intent=new Intent(getApplicationContext(),Main2Activity_officerinfo.class);
     startActivity(intent);
 }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }
}
