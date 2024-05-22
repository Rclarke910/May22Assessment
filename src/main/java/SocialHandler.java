import java.util.ArrayList;
import java.util.List;

public class SocialHandler {

    private String username;

    private List<String> originalNames = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public List<String> getOriginalNames() {
        return originalNames;
    }


    public void createHandle(String name) {
        StringBuilder str = new StringBuilder("@");


        for (int i = 0; i < 9; i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                System.out.println("All letters must be lower case");
                return;
            } else {
                str.append(name.charAt(i));
            }
        }
        this.username =str.toString();

        if(!originalNames.contains(str.toString())){
            originalNames.add(str.toString());
        }
    }







}
