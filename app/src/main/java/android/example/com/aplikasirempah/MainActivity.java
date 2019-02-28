package android.example.com.aplikasirempah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.agug.aplikasirempah.R;

public class MainActivity extends AppCompatActivity {
    Button keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tombol keluar
        keluar=(Button) findViewById(R.id.btnKeluar);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //memanggil Allert dialog keluar
                showAlertDialog();
            }
        });
    }

    private void showAlertDialog() {
    }
}
