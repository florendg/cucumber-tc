package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.File;

import static org.junit.Assert.assertEquals;

@Testcontainers
public class TestContainerStepDefinitions {

    @Container
    public BrowserWebDriverContainer<?> chrome = new BrowserWebDriverContainer<>()
            .withCapabilities(new ChromeOptions())
            .withRecordingMode(BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL,
                    new File("build"));


    @Given("the Selenium container is started")
    public void theSeleniumContainerIsStarted() {
        chrome.start();
    }

    @When("I go to the Google home page")
    public void iGoToTheGoogleHomePage() {
        chrome.getWebDriver().get("https://www.google.com");
    }

    @Then("The title of the page should be Google")
    public void theTitleOfThePageShouldBeGoogle() {
        String title =  chrome.getWebDriver().getTitle();
        assertEquals("Google",title);
    }


}
