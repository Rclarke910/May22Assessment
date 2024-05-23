public class Main {

    public static void main(String[] args){

        SocialHandler twitter = new SocialHandler();

        twitter.createHandle("abcdefghijklmnop");

        twitter.removeHandle("abcdefghi");

        twitter.updateHandle("rashawnclarke");


        System.out.println(twitter.getUsername());
        System.out.println("============");
        twitter.printUsernamesInFile();
    }
}
