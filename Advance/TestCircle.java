package Advance;
public class TestCircle{
    static public void main(){
        Circle circle1 = new  Circle(2.9);
        Circle circle2 = new  Circle(8.3);
        Circle circle3 = circle2;
        System.out.printf("Окружность № 1 \n%s\n", circle1.toString());
        System.out.printf("Окружность № 2 \n%s\n", circle2.toString());
        System.out.printf("Окружность № 3 \n%s\n", circle3.toString());
        System.out.println("Окружность №1 == Окружность №2 ? " + circle1.equals(circle2));
        System.out.println("Окружность №1 == Окружность №3 ? " + circle1.equals(circle3));
        System.out.println("Окружность №2 == Окружность №3 ? " + circle2.equals(circle3));
    } 
}
