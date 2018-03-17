package edmt.dev.androidgridlayout;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ASUS on 12/03/2018.
 */

public class Test extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImagePlace adapter = new ImagePlace(this);
        viewPager.setAdapter(adapter);
    }
}
