package Classes;

public abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    double   length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    @Override
    public double area(){
        return this.length * this.width;
    }
}

class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
