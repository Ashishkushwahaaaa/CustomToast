package com.game.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPlayMusic = findViewById(R.id.btnPlayMusic);
        btnPlayMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getApplicationContext());
                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.viewContainer));
                toast.setView(view);
                toast.setDuration(Toast.LENGTH_LONG);

                TextView txtMsg = view.findViewById(R.id.txtMsg);
                txtMsg.setText("Hey Wanna Playing Music");
//                We can use this method to change our text in runtime,used when same layout used for different msg toast

                toast.setGravity(Gravity.CENTER,0,-250);
                toast.show();
            }
        });

    }
}