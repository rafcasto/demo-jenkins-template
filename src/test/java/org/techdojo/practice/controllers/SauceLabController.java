package org.techdojo.practice.controllers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLabController implements WebDriverController{
    private WebDriver driver;
    public SauceLabController()
    {
        setupController();
    }
    @Override
    public WebDriver getDriver() {
        return driver;
    }

    @Override
    public void setDriver(WebDriver driver) {

    }

    @Override
    public void setupController() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-rafcasto-24a3f");
        sauceOptions.put("accessKey", "f3df37cf-37db-49f0-9eb8-ac464689ce69");
        sauceOptions.put("build", "selenium-build-H6GZD");
        sauceOptions.put("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = null;
        try {
            url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver = new RemoteWebDriver(url, browserOptions);
    }
}
