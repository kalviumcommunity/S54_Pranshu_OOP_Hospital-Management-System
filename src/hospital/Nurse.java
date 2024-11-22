package hospital;

public class Nurse extends Staff {
    private String shift;

    // Constructor
    public Nurse(String name, int id, String shift) {
        super(name, id); // Calling the constructor of the abstract class
        this.shift = shift;
    }

    // Overriding the abstract method
    @Override
    public void displayDetails() {
        System.out.println("Nurse Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Shift: " + shift);
    }
}