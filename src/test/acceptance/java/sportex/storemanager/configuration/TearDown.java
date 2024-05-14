package sportex.storemanager.configuration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import sportex.storemanager.components.Context;

public class TearDown {

    private final Context context;

    public TearDown(Context context) {
        this.context = context;
    }

    @Before
    public void setUp() {
        context.setUp();
    }

    @After
    public void tearDown() {
        context.tearDown();
    }

}
