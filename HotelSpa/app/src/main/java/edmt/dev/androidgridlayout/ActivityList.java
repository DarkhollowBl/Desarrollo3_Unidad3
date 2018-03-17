package edmt.dev.androidgridlayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by ASUS on 07/03/2018.
 */

public class ActivityList extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private Places[] places = {
            new Places(R.drawable.firstplacestwo, "Templo de la Tercera Orden" , "Puebla 7, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.secondplace, "Parroquia Ntra. Señora de los Dolores", "Plaza Principal s/n, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.thirdplace, "Museo José Alfredo", "Guanajuato 13, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.fourplace, "Museo Desendientes de Hidalgo", "Hidalgo 2, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.fiveplace, "Museo de la Independencia", "Zacatecas 6, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.sixplace, "Museo Bicentenario", "Plaza Principal s/n, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.sevenplace, "Casa de Hidalgo", "Morelos 1, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.eightplace, "Museo del Vino", "Hidalgo 14-16, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.nineplace, "Monumento a los Héroes", "Calzada de los Héroes 119, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.tenplace, "Glorieta de José Alfredo", "Hidalgo 14-16, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.elevenplace, "Mausoleo José Alfredo", "Dolores Hidalgo-Guanajuato s/n, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.twelveplace, "Parador José Alfredo", "Dolores Hidalgo - Guanajuato Km. 4 37800, Francisco I. Madero, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.thirteenplace, "Parroquia de La Asunción", "Puebla 32, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.sixteenplace, "Iglesia el Calvario", " Guanajuato 35B, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.seventeenplace, "Jardín Principal", "Jardín Grande Hidalgo, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.eighteenplace, "La Alameda", "Calle Guerrero 4, Alameda, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.nineteenplace, "Casa de Visitas", "Jardín Grande Hidalgo 25, Centro, Dolores Hidalgo, Gto., 37800", ""),
            new Places(R.drawable.fifteenplace, "Monumento a la Bandera", "Calle Quintana Roo 4, Centro, Dolores Hidalgo, Gto., 37800", "")
    };
    private ListView lsvTuri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lsvTuri = findViewById(R.id.lsv_places);
        RestaurantAdapter adapter = new RestaurantAdapter(
                this, places);
        lsvTuri.setAdapter(adapter);
        lsvTuri.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if(i==0){
            Intent intentGallery = new Intent(view.getContext(),ActivityPlaces.class);
            startActivityForResult(intentGallery,0);
        }
        if(i==1){
            Intent intentGallery = new Intent(view.getContext(),Test.class);
            startActivityForResult(intentGallery,1);
        }
    }


    public class ViewHolder {
        TextView txvName;
        TextView txvLocation;
        TextView txvMore;
        ImageView imvPhoto;
    }

    class RestaurantAdapter extends ArrayAdapter<Places> {
        public RestaurantAdapter(@NonNull Context context, Places[] data) {
            super(context, R.layout.activity_element, data);
        }

        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View cell = convertView;
            ViewHolder holder;
            if (cell == null) {
                LayoutInflater inflater =
                        LayoutInflater.from(getContext());
                cell = inflater.inflate(R.layout.activity_element, null);
                holder = new ViewHolder();
                holder.imvPhoto = cell.findViewById(R.id.imv_photo);
                holder.txvName = cell.findViewById(R.id.txv_name);
                holder.txvLocation = cell.findViewById(R.id.txv_location);
                holder.txvMore = cell.findViewById(R.id.txv_more);
                cell.setTag(holder);
            } else {
                holder = (ViewHolder) cell.getTag();
            }
            holder.imvPhoto.setImageResource(places[position].getImageId());
            holder.txvName.setText(places[position].getName());
            holder.txvLocation.setText(places[position].getLocation());
            holder.txvMore.setText(places[position].getMore());
            return cell;
        }
    }
}
