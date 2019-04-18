public class MessagePost extends Posts{

    private String message;

    public MessagePost(String author, String text){

        super(author);
        message = text;

    }

}
