package edmt.dev.androidgridlayout;

import android.net.Uri;

/**
 * Created by ASUS on 16/03/2018.
 */

public class Package {
        String name;
        String description;
        String price;
        String imageUri;

    public Package(String name, String description, String price, String imageUri) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUri = imageUri;
    }
    public Package(String NAME, String DESCRIPTION, String PRICE, Uri downloadUrl){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
