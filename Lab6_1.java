import java.util.Scanner;
public class Lab6_1{
    
    private static void calculat(double x){
        double g, z, y;
        g = x <= 0 ? (3 * Math.pow(x, 2))/(1+Math.pow(x, 2)): Math.sqrt(1+((2*x)/(1+Math.pow(x, 2)))); 
        if(x < 0) z = 3 * x + Math.sqrt(1 + Math.pow(x, 2));
        else if((x >= 0) && (x <= 1)) z =  2 * Math.cos(x) * Math.pow(Math.E,-2 * x);
        else z = 2 * Math.sin(3 * x);
        y = g + z;
        System.out.printf("g = %6.6f z = %6.6f y = %6.6f\n",g, z, y);
    }

    public static void main(String [] args){
        double g, z, y, x;
        for(int i = 0; i < 3; i++) {
        Scanner Scan = new Scanner (System.in);
        System.out.print("x = ");
        x = Scan.nextDouble();
        calculat(x);
        for(int j = 0; j < 45; j++) {
        System.out.print("_");
    }
        System.out.println("");
    }
    }
}

