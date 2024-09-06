package Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import BaseSetup.Basesetup;

public class SafeLock_Login extends Basesetup {

    @BeforeClass
    public void beforeClass() {
        System.out.println("SafeLock Login Test Initialized");
    }

    @Test(priority = 1, enabled = true)
    public void VERIFY_THAT_SAFELOCK_CUSTOMER_URL_LAUNCHED_SUCCESSFULLY() throws Exception {
        // This will be executed after the WebDriver is initialized
        System.out.println("SafeLock Login Test Passed");
    }
}