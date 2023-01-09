package Classes;

public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public String getType() {
        return this.type;
    }
}

class Cat extends Animal {
    private String breed;

    public Cat(String name, String type, String breed) {
        super(name, type);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}

class Dog extends Animal {
    private int size;

    public Dog(String name, String type, int size) {
        super(name, type);
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

