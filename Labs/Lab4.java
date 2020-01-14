package Labs; 
import java.util.*;
public class Lab4
{   
    public static void main (String args []){
        double y,z,b,a;
        a=5.7;
        b=0.08;
        z=Math.abs((b-15.1));
        y=((Math.exp((-a)))+((z+1000)/(Math.sin(z))))/((Math.cos((Math.PI)*z))+(Math.log(b)));
        System.out.printf("a=%8.5f; b=%8.5f; z=%8.5f; y=%8.5f \n",a,b,z,y);
        System.out.println("Значение переменной y в формате IEEE 754: ");
        System.out.println(Long.toBinaryString(Double.doubleToLongBits (y)));
    }
}