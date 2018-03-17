package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by ASUS on 17/03/2018.
 */

public class VisorImagen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visor_activity);

        ImageView img = (ImageView) findViewById(R.id.imageView);

        Intent intent = getIntent();
        Bundle b= intent.getExtras();

        if(b != null){
            img.setImageResource(b.getInt("IMG"));
        }
    }
}
