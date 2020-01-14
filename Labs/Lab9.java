package Labs; 
public class Lab9{ 

    public static void sumLowDiog(int Y[][]){
        int sum=0;
        for (int i=1; i<Y.length;i++){
            for (int j=0; j<i;j++)
                sum += Y[i][j];
        }
        System.out.println("Сумма элементов под главной диагональю: "+sum);
    }

    public static void sumMatrixOnB(int Y[][],int X[][], int m){
        int[][] sum = new int [3][4];
        System.out.println("Матрица (A+B)m: ");
        for (int i=0;i<Y.length ;i++) {
            for (int j=0;j<Y[i].length ;j++) {
                sum[i][j]=(Y[i][j]+X[i][j])*m ;
                System.out.printf("% 5d",sum[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] MinInLines (int Y[][]){ 
        int X[]=new int[Y.length];  
        for (int i=0; i<Y.length; i++) { 
            int min=Y[i][0];  
            for (int j=1; j<Y[0].length; j++) 
                if (Y[i][j]<min) min=Y[i][j]; 
            X[i]=min;     
        } 
        return X; 
    } 

    public static void putMatr (int Y[][]){ 
        for (int i=0; i<Y.length; i++) { 
            for (int j=0; j<Y[0].length; j++) 
                System.out.printf ("% 5d",Y[i][j]); 
            System.out.println(); 
        } 
    } 

    public static void printArray(int[] Y){
        for (int i : Y){ 
            System.out.printf("% -5d",+i);
        } 
        System.out.println();
    }    

    public static void main (String args []){ 
        int B [ ] [ ] = { 
                {3, 72, -5, -4}, 
                {8, 6, -2, -15}, 
                {95, 36, 0,-11} 
            }; 
        int A [ ] [ ] = { 
                {1, 2, -3, 4}, 
                {5, 6, 7, 8}, 
                {9, 10, 11, 12} 
            }; 
        System.out.println("Матрица B:"); 
        putMatr(B); 
        System.out.println("Матрица A:"); 
        putMatr(A); 
        System.out.println("Вектор меньших элементов строк матрицы A:"); 
        printArray(MinInLines(A)); 
        sumLowDiog(A);
        sumMatrixOnB(A,B,3);
    } 
} 