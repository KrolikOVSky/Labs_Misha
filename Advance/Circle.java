package Advance;
public class Circle{
    private final static String CIRCLE_STRING_FORMAT =
        "Радиус: %s\nДлина: %.3f\nПлощадь: %.3f\n";

    private double radius, length, square;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    } 

    public void setRadius(double radius){this.radius=radius;}

    public double getLength(){
        return radius * 2.0 * Math.PI;
    } 

    public void setLength(double length){this.length=length;}

    public double getSquare(){
        return Math.pow(radius,2) * Math.PI;
    }

    public void setSquare(double square){this.square=square;}

    public String toString(){
        return String.format (CIRCLE_STRING_FORMAT, radius, getLength(), getSquare()); 
    }

    public boolean equals (Circle obj) { 
        if (this == obj) return true; 
        if (obj == null) return false;
        if (radius==obj.radius && length==obj.length && square==obj.square ) 
            return true;
        return false;
    }
}
