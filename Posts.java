import java.util.ArrayList;

public class Posts {

    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    public Posts(String author){
        username = author;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }



}
