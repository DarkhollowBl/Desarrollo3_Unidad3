package edmt.dev.androidgridlayout;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ASUS on 17/03/2018.
 */

public class Adapter extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context context;
    String [] datos;
    int[] datosImg;

    public Adapter(Context context, String[] datos, int[] image) {
        this.context = context;
        this.datos = datos;
        this.datosImg = image;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       final View view1 = inflater.inflate(R.layout.activity_element, null);
        TextView name = (TextView) view1.findViewById(R.id.txv_name);
        TextView location = (TextView) view1.findViewById(R.id.txv_location);
        TextView more = (TextView) view1.findViewById(R.id.txv_more);
        ImageView image = (ImageView) view1.findViewById(R.id.imv_photo);
        name.setText(datos[1]);
        location.setText(datos[2]);
        more.setText(datos[3]);
        image.setImageResource(datosImg[1]);
        image.setTag(i);
        image.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent visorImagen = new Intent(context, VisorImagen.class);
                visorImagen.putExtra("IMG", datosImg[(Integer)view.getTag()]);
                context.startActivity(visorImagen);
            }
        });
       return view1;
    }

    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

}
