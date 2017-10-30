import org.junit.Before;
import org.junit.Test;
import service.models.User;
import service.models.UserController;

import static org.junit.Assert.assertTrue;

/**
 * Created by Denys_Pastushenko on 10/30/2017.
 */
public class RestTests {

    private UserController userController;

    @Before
    public void setUp() {
        userController = new UserController();
    }

    @Test
    public void testUserInfoResponse() {
        User remoteUser = userController.getUserByUsername("maxkolotilkin");

        assertTrue(remoteUser.getHtml_url().contains("https://github.com/maxkolotilkin"));
    }

    @Test
    public void testFollowers() {
        User[] followers = userController.getFollowersByUser("Mak0");
        assertTrue(followers.length == 7);
    }

}
