package signin;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {
    @Test
    public void testUser(){
        SignIn signIn = PageFactory.initElements(driver, SignIn.class);
        signIn.userSignIn("momenun.akhi@gmail.com", "04251970");
    }
}
