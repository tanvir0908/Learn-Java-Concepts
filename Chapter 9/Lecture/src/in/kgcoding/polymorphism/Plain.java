package in.kgcoding.polymorphism;

public class Plain extends Vehicle {
    @Override
    public void start() {
        super.start();
        System.out.println("Plain is taking off...");
    }
}
