import java.util.*;
public class Lab6_2{
    private static void RangInStar(int rang){
      char star;
        switch(rang){
          case 0: case 1: case 2: case 3: case 4: case 5:
          case 6: case 7: case 8: case 9: case 10:
            star = '1';
            break;
          case 11: case 12: case 13: case 14: case 15: case 16:
          case 17: case 18: case 19: case 20:
            star = '2';
            break;
          case 21: case 22: case 23: case 24: case 25: case 26:
          case 27: case 28: case 29: case 30:
            star = '3';
            break;
          case 31: case 32: case 33: case 34: case 35: case 36:
          case 37: case 38: case 39: case 40:
            star = '4';
            break;
          case 41: case 42: case 43: case 44: case 45: case 46:
          case 47: case 48: case 49: case 50:
            star = '5';
            break;
          default: star ='0';
      }
      System.out.printf("%s - %s\n",rang,star);
    }
    public static void main(String [] args){
    char star;
     for(int i = 0; i < 6; i++){
      Scanner Scan = new Scanner(System.in);
      System.out.print("Введите рейтенг: ");
      int rang = Scan.nextInt();
      RangInStar(rang);
      for(int j = 0; j < 26; j++) {
      System.out.print("_");
    }
    System.out.println("");
    }
 }
}
