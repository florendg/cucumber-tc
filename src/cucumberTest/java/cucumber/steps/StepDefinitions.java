package cucumber.steps;
import com.weirdduke.cucumber.demo.Bike;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private Bike sut;

    @Given("A Bike instance is constructed")
    public void startContainer() {
        sut = new Bike();
    }

    @When("I set the color to {string}")
    public void setColor(String color) {
        sut.setColor(color);
    }


    @Then("the color should be {string}")
    public void validateColor(String color) {
        assertEquals(sut.getColor(), color);
    }
}
