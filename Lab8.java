import java.util.*;
class Lab8{
    public static int sumArray(int B[]) { 
        int s = 0; 
        for (int i = 0; i < B.length; i++) {
            if (B[i]>0) {
                s += B[i];
            }
        }
        System.out.println("Сумма элементов > 0 : "+s);
        return s;
    }

    public static void sortBubble (int[] A) {
        boolean flag;
        for (int m = A.length-1; m > 0; m--){ 
            flag=true;
            for (int j = 0; j < m; j++) 
                if (A[j]>A[j+1]) {
                    int b=A[j];
                    A[j]=A[j+1];
                    A[j+1]=b;
                    flag=false;
                }
            if (flag) break;
        } 
        System.out.println("После сортировки : ");
        printArray(A);      
    }

    public static void printArray(int[] D){
        for (int i : D){ 
            System.out.printf("%-3d",+i);
        } 
        System.out.println();
    }

    public static void evenPlusA (int[] C,int g){
        for (int i = 0; i < C.length; i++){
            if (i % 2 == 0) C[i]+=g;
        }
        System.out.println("После прибавления A : ");
        printArray(C);
    }

    public static void main(String args[]) {
        int [ ] arr = {2,7,6,4,-10,5,1,5};
        printArray(arr);
        sumArray(arr);
        sortBubble(arr);
        evenPlusA(arr,5);
    }
}