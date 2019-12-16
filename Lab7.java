public class Lab7{
    
  public static double function(double x){
    double y = 1.0 / Math.sqrt(x);                
    return y;
  }

  public static double recurentFunction(double x, int n){
    double y = x;
    for (int i = 1; i <= n; i++){
      y = 0.5 * y *  (3.0- (x * Math.pow(y, 2)));
    }  
    return y;
  }

  public static void tabulat(double startX, double endX, double deltaX){
     double x = startX, yt, yn ,e;
     int n = 12;
     while (x <= endX){
        yt = function(x);
        yn = recurentFunction(x, n);
        e = Math.abs(yt - yn);
        System.out.printf ("x=%10.6f, yt=%10.6f, yn=%10.6f, e=%10.6f\n", x,yt,yn,e);
        x += deltaX;
     }
  }

  public static void main(String [] args){
     System.out.println ("Начало табулирования");
     tabulat(0.4, 1.4, 0.1);
     System.out.println("Табулирование окончено");
  }
}

/*
int n = 12;
double minX = 0.4;
double maxX = 1.4;
double deltaX = 0.1;

выч корня for
табулир   while

 */