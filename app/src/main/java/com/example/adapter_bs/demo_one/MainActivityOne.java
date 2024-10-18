package com.example.adapter_bs.demo_one;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.GridView;
import com.example.adapter_bs.R;

public class MainActivityOne extends AppCompatActivity {
    GridView gv_one;
    int[] image={R.drawable.nature1,R.drawable.nature2,R.drawable.nature3,R.drawable.nature4,R.drawable.nature5,R.drawable.space1,R.drawable.space2,R.drawable.space3,R.drawable.space3,R.drawable.love,R.drawable.love2,   R.drawable.nature1,R.drawable.nature2,R.drawable.nature3,R.drawable.nature4,R.drawable.nature5,R.drawable.space1,R.drawable.space2,R.drawable.space3,R.drawable.space3,R.drawable.love,R.drawable.love2, R.drawable.nature1,R.drawable.nature2,R.drawable.nature3,R.drawable.nature4,R.drawable.nature5,R.drawable.space1,R.drawable.space2,R.drawable.space3,R.drawable.space3,R.drawable.love,R.drawable.love2};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);

        gv_one=findViewById(R.id.gv_one);

        Bridge_adapter bridgeAdapter=new Bridge_adapter(getApplicationContext(),image);

        gv_one.setAdapter(bridgeAdapter);
    }
}