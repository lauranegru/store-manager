package sportex.storemanager.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sportex.storemanager.components.Context;

public class StepDefinitions {

    private final Context context;

    public StepDefinitions(Context context) {
        this.context = context;
    }

    @Given("scenario {string} is prepared")
    public void scenario_is_prepared(final String scenario) {
        context.prepare(scenario);
    }

    @When("scenario {string} is executed")
    public void scenario_is_executed(String scenario) {
        context.execute(scenario);
    }

    @Then("scenario {string} succeeds")
    public void scenario_succeeds(String scenario) {
        context.finish(scenario);
    }

}
