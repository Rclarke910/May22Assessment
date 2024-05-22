import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class SocialHandlerTest {

    @Test
    @DisplayName("checking if handle was created succesfully")
    public void testCreateHandle(){
        SocialHandler twitter = new SocialHandler();

        twitter.createHandle("12345678910");

        assertEquals("@123456789", twitter.getUsername());
    }

    @Test
    @DisplayName("check if handle has 9 characters not including @")
    public void testHandle9OrLess(){
        SocialHandler twitter = new SocialHandler();
        twitter.createHandle("12345678910");
        assertEquals(9, twitter.getUsername().length() - 1);
    }

    @Test
    @DisplayName("check if handle is null")
    public void testHandleNull(){
        SocialHandler twitter = new SocialHandler();
        twitter.createHandle("Mike Jones");
        assertNull(twitter.getUsername());
    }

    @Test
    @DisplayName("check if handle was added despite multiple attempts")
    public void testAddhandle(){
        SocialHandler twitter = new SocialHandler();
        twitter.createHandle("Mike Jones");
        twitter.createHandle("mike Jones");
        twitter.createHandle("mikejones");

        assertEquals("@mikejones",twitter.getUsername());
    }

    @Test
    @DisplayName("Test if name was added to original names")
    public void testOriginalNames(){
        SocialHandler twitter = new SocialHandler();
        twitter.createHandle("mikejones");

        assertTrue(twitter.getOriginalNames().contains(twitter.getUsername()));
    }

}