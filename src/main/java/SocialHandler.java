import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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


        for (int i = 0; i < name.length() && i < 9; i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                System.out.println("All letters must be lower case");
                return;
            } else {
                str.append(name.charAt(i));
            }
        }
        this.username=str.toString();

        if(!originalNames.contains(str.toString())){
            originalNames.add(str.toString());
            writeUsernameToFile(str.toString());
        }
    }

    public void removeHandle(String name){
        StringBuilder string = new StringBuilder("@");
        if(Objects.equals(this.username, string.append(name).toString())){
            this.username = "";
        }
    }

    public void updateHandle(String name){
        createHandle(name);
    }

    public void writeUsernameToFile(String username) {
        try (FileWriter myWriter = new FileWriter("usernames.txt", true)) {
            myWriter.write(username + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printUsernamesInFile(){
        try (BufferedReader br = new BufferedReader(new FileReader("usernames.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }







}
