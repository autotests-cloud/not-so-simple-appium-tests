package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static helpers.BrowserstackHelper.getBrowserstackUrl;
import static helpers.EnvironmentHelper.buildNumber;
import static helpers.EnvironmentHelper.jobBaseName;

public class CustomMobileDriver implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
        capabilities.setCapability("project", "autotests.cloud");
        capabilities.setCapability("build", jobBaseName);
        capabilities.setCapability("name", "Tests - Android - " + buildNumber);
        capabilities.setCapability("autoGrantPermissions", "true");

        capabilities.setCapability("device", "Google Pixel 3");
        capabilities.setCapability("os_version", "9.0");
        capabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

        return new AndroidDriver(getBrowserstackUrl(), capabilities);
    }

}