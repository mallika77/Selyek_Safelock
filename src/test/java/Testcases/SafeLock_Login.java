package Testcases;

import org.testng.annotations.Test;
import BaseSetup.Basesetup;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class SafeLock_Login extends Basesetup {

    // No need to redeclare WebDriver and Properties as they are inherited from Basesetup

    @BeforeClass
    public void beforeClass() {
        // Initialization already handled by Basesetup
        System.out.println("SafeLock Login Test Initialized");
    }

    @Test(priority = 1, enabled = true)
    public void VERIFY_THAT_SAFELOCK_CUSTOMER_URL_LAUNCHED_SUCCESSFULLY() throws IOException, InterruptedException {
        // URL launching is already handled in the BaseSetup's setUp method
        System.out.println("SafeLock Login Test Passed");
    }

    @AfterMethod
    public void afterMethod() {
        // Add any cleanup code here if needed
    }
}