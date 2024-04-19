package assignment2;
public class A2Q6 {
    public static void main(String[] args) {
        // Create objects of the Animal class
        Animal dog = new Animal("Dog", "Brown", "Pet");
        Animal lion = new Animal("Lion", "Golden", "Wild");

        // Print the hash code of each object
        System.out.println("Hash code of dog: " + dog.hashCode());
        System.out.println("Hash code of lion: " + lion.hashCode());
    }
}

class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        // Generate a unique ID for the object based on its attributes
        int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }
}
