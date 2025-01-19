package com.example.textview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView text;
        text = findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {
                // Your logic here, e.g.:
                count++;

                if (count%7==0) {
                    text.setText("Boom!\n");
                }
                else if(count>=10){
                    int temp=count;
                    boolean found=false;
                    while (temp>0) {
                        if (temp % 10 == 7) {
                            found=true;
                            break;
                        }
                        temp /= 10;

                    }
                    if(found){
                        text.setText(" Boom!\n");
                    }
                    else{
                        text.setText("This is a click number:" + count + "\n");
                    }


                }
                else{
                    text.setText("This is a click number:" + count + "\n");
                }

            }


        });
    };
}
