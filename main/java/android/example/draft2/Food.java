package android.example.draft2;

public class Food {

    private long id;
    private String name;
    //private String cost;
    //private String description;
    private int imageURL;

//
//    public Food(String name, String cost, String description, int imageURL) {
//        this.name = name;
//        this.cost = cost;
//        this.description = description;
//        this.imageURL = imageURL;
//    }

    public Food(String name, int imageURL) {
        this.name = name;
        this.imageURL = imageURL;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public String getCost() {
//        return cost;
//    }
//
//    public void setCost(String cost) {
//        this.cost = cost;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

    public int getImageURL() {
        return imageURL;
    }

    public void setImageURL(int imageURL) {
        this.imageURL = imageURL;
    }


}
