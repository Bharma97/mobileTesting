package Appium;

import io.appium.java_client.AppiumBy;
import org.example.App;
import org.testng.annotations.Test;

public class IOSBasics extends IOSBaseTest {

    @Test
    public void iOSBasicsTest() throws InterruptedException {
        // xpath, classname, IOS, iosClassChain, IOSPredicateString, accessibility Id, Id

        driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Text Entry'`]")).click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell")).sendKeys("Hello World");
        driver.findElement(AppiumBy.accessibilityId("OK")).click();

        // use of iospredicatestring

        driver.findElement(AppiumBy.iOSNsPredicateString("type=='XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'confirm'")).click();
        String confirmMessage = driver.findElement(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'")).getText();
        System.err.println(confirmMessage);

        driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Confirm'")).click();
        Thread.sleep(3000);

    }
}
