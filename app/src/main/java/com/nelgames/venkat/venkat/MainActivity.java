package com.nelgames.venkat.venkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ad=(Button)findViewById(R.id.me);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast ts=Toast.makeText(getApplicationContext(),"subburaj",Toast.LENGTH_LONG);
                ts.show();
            }
        });
    }
}
