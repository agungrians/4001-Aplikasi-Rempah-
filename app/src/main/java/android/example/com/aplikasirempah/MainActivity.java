package android.example.com.aplikasirempah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.agug.aplikasirempah.R;

public class MainActivity extends AppCompatActivity {

    //edited by agung riansyah
    //ini project terbaru

        Button GoToNewActivity;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            GoToNewActivity = (Button)findViewById(R.id.button2);

            GoToNewActivity.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    // Intent code for open new activity through intent.

                    Intent intent = new Intent(MainActivity.this, registrasi.class);
                    startActivity(intent);

                }
            });
        }
    }

