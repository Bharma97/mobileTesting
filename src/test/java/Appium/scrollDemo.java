package Appium;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class scrollDemo extends BaseTest {
@Test
    public void scrollDemoTest() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
     Thread.sleep(3000);
    }
}
