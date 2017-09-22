package glide.example.com.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url = "http://localhost:8080/df";
        ImageView imageview = (ImageView) findViewById(R.id.imageView);
        Glide.with(this).load(url).placeholder(android.R.drawable.ic_delete).crossFade().into(imageview);


    }
}
