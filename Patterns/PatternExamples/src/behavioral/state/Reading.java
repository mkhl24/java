package behavioral.state;

import java.rmi.activation.ActivationInstantiator;

public class Reading implements Activity {
    @Override
    public void doActivity() {
        System.out.println("Reading book..");
    }
}
