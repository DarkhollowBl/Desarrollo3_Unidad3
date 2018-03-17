package edmt.dev.androidgridlayout;

/**
 * Created by ASUS on 07/03/2018.
 */

public class Places {
    private int imageId;
    private String name;
    private String location;
    private String more;

    public Places(int imageId, String name, String location, String more){
        this.imageId=imageId;
        this.name=name;
        this.location=location;
        this.more=more;
    }
    public Places(){
        this(R.mipmap.ic_launcher_round, "unamed", "unlocated", "untyped");
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getMore() {
        return more;
    }
}
