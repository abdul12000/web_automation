package Step_definitions;

import base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Hook extends BaseUtil {
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void setup() {
        String chromeDriverLocation = "src/main/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        base.driver = new ChromeDriver();
    }

    @After
    public void cleanup() throws Exception {
        takeScreenshot();
        Thread.sleep(2000);
        base.driver.quit();
    }

    public void takeScreenshot() throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) base.driver);
        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("target/screesnhots" + System.currentTimeMillis() + ".png"));
        FileUtils.copyFile(scrFile, new File("C:/AutomationProjects/TestResults/" + System.currentTimeMillis() + ".png"));
    }


}
