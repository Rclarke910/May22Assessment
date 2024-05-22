public class Main {

    public static void main(String[] args){

        SocialHandler twitter = new SocialHandler();

        twitter.createHandle("abcdEfghijklmnop");

        System.out.println(twitter.getUsername());
    }
}
