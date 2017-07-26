package steps;

import java.net.MalformedURLException;
import java.net.URL;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by satish on 25/07/17.
 */
public class CucumberSteps
{


    WebDriver driver;
//   For MAC
//   For MAc System.setProperty("webdriver.gecko.driver", "/Users/username/Downloads/geckodriver");
//    WebDriver driver = new FirefoxDriver();

//    For Windows
//    System.setProperty("webdriver.gecko.driver","path of geckodriver.exe");
//    WebDriver driver = new FirefoxDriver();




    @Given("^I navigate to \"([^\"]*)\"")
    public void i_navigate_to(String page) throws Throwable {
        System.setProperty("webdriver.gecko.driver", "/Users/satish/Downloads/geckodriver");
        DesiredCapabilities capabilities= DesiredCapabilities.firefox();
        driver = new FirefoxDriver(capabilities);
        driver.get(page);
    }

    @When("^I take a look at the Docs")
    public void i_take_a_look_at_the_docs() throws Throwable {
        WebElement element = driver.findElement(By.linkText("Docs"));
        element.click();
    }

    @Then("^I see a browser title containing \"([^\"]*)\"")
    public void i_see_a_browser_title_containing(String text) throws Throwable {
        assertTrue(driver.getTitle().contains(text));
//        driver.quit();
    }





}


