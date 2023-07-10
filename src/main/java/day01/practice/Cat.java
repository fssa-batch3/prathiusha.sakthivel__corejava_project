package day01.practice;

public class Cat {
    // Attributes
    private int hasStripes;
    private String color;
    private String setspeaks;

    // Getters and setters
    public int hasStripes() {
        return hasStripes;
    }

    public void setHasStripes(int hasStripes) {
        this.hasStripes = hasStripes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String setspeaks() {
        return setspeaks;
    }

    public void setspeaks(String speaks) {
        this.setspeaks = speaks;
    }
    

    // Main method to create Cat objects
    public static void main(String[] args) {
        // Create two Cat objects
        Cat cat1 = new Cat();
        cat1.setColor("White");
        cat1.setHasStripes(4);
        cat1.setspeaks("Meow!");
        Cat cat2 = new Cat();
        cat2.setColor("Black");
        cat2.setHasStripes(3);
        cat2.setspeaks("Meow!");

        // Print the attributes of each Cat
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.hasStripes());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Speaks: " + cat1.setspeaks());

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.hasStripes());
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Speaks: " + cat2.setspeaks());
    }
}
