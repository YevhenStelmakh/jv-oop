package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is started.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator is stopped.");
    }
}