package sportex.storemanager.components;

import org.springframework.stereotype.Component;

@Component
public class Context {

    public void setUp() {
        System.out.println("Preparing context");
    }

    public void prepare(String scenario) {
        System.out.println("Preparing scenario: " + scenario);
    }

    public void execute(String scenario) {
        System.out.println("Executing scenario: " + scenario);
    }

    public void finish(String scenario) {
        System.out.println("Finishing scenario: " + scenario);
    }

   public void tearDown() {
       System.out.println("Cleaning context");
   }

}
