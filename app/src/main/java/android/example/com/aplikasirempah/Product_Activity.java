package android.example.com.aplikasirempah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Product_Activity extends AppCompatActivity {

    private TextView tvtitle, tvprice, tvaddress;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvprice = (TextView) findViewById(R.id.txtprice);
        tvaddress = (TextView) findViewById(R.id.txtaddress);
        img = (ImageView) findViewById(R.id.product_thumbnail);

        //Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Price = intent.getExtras().getString("Price");
        String Address = intent.getExtras().getString("Address");
        int image = intent.getExtras().getInt("Thumbnail");

        //Setting values
        tvtitle.setText(Title);
        tvprice.setText(Price);
        tvaddress.setText(Address);
        img.setImageResource(image);
    }
}
