import java.util.*;
public class Lab5 
{   
    public static void main (String args [])
    {
        Scanner myVar= new Scanner(System.in);
        char a,c,d;
        System.out.print("Введите c: ");c = myVar.next().charAt(0);
        System.out.print("Введите d: ");d = myVar.next().charAt(0);
        
        a = ((Character.isDigit(c) && Character.isLetter(d))|| c=='&')? 
        (char)(c+d):(char)(c+2);
        
        System.out.println("c= "+c+",d= "+d+",a= "+a+", код a= "+(int)a);
    }
}

 