package edmt.dev.androidgridlayout;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by ASUS on 12/03/2018.
 */

public class ImagePlace extends PagerAdapter{
    private Context mContext;
    private int[] mImageIds = new int [] {R.drawable.fiveplace, R.drawable.fiveplace,R.drawable.eightplace};
    ImagePlace (Context context){
        mContext = context;
    }

    public int getCount() {
        return mImageIds.length;
    }

    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }


    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView)object);
    }
}
