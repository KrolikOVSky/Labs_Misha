public class Lab10{ 
    public static void main (String args []){ 
        int[] B = {0,21,10,5,200,11,12};
        int[] C = {1,21,10,5,200,11,12,125}; 
        int[] D = {1,3,5,7,9};
        int[] E = {0,30,0,70,90}; 

        System.out.println("Массив В:"); 
        MetodsLibrary.printArr(B); 
        System.out.println("\nСумма элементов которые больше A: " + MetodsLibrary.SumElementMoreNumberRec(0,B,22));
        System.out.println("Количество нулевых элементов в массиве: " + MetodsLibrary.AmountElemntsOfZeroIter(B)); 

        System.out.println("Массив C:\n"); 
        MetodsLibrary.printArr(C); 
        System.out.println("\nСумма элементов которые больше A: " + MetodsLibrary.SumElementMoreNumberRec(0,C,22));
        System.out.println("Количество нулевых элементов в массиве: " + MetodsLibrary.AmountElemntsOfZeroIter(C)); 

        System.out.println("Массив D:\n"); 
        MetodsLibrary.printArr(D); 
        System.out.println("\nСумма элементов которые больше A: " +  MetodsLibrary.SumElementMoreNumberRec(0,D,22));
        System.out.println("Количество нулевых элементов в массиве: " + MetodsLibrary.AmountElemntsOfZeroIter(D));

        System.out.println("Массив E:\n"); 
        MetodsLibrary.printArr(E); 
        System.out.println("\nСумма элементов которые больше A: " + MetodsLibrary.SumElementMoreNumberRec(0,E,22));
        System.out.println("Количество нулевых элементов в массиве: " + MetodsLibrary.AmountElemntsOfZeroIter(E));
    } 
}
