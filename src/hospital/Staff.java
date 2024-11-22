package hospital;

public abstract class Staff {
    private String name;
    private int id;

    // Constructor
    public Staff(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method (virtual function in Java)
    public abstract void displayDetails();

    // Concrete method
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}