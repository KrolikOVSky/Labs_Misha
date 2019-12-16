public class MetodsLibrary{ 
    public static void printArr (int[] A){ 
        if (A == null) return; 
        for (int i : A){ 
            System.out.printf("%-5d",+i);
        } 
        System.out.println();
    }

    public static int SumElementMoreNumberRec (int i, int[] A, int number){ 
        int SumElements = 0;
        if (i <= (A.length-1)){
            if (i == (A.length-1)){ if (A[i] > 22 ) SumElements = A[i];}
            else {
                SumElements = SumElementMoreNumberRec(i+1,A,number);
                if (A[i] > 22 ){SumElements += A[i];}
            }
        }
        return SumElements;
    } 

    public static int AmountElemntsOfZeroIter ( int[] A){ 
        int res = 0;
        for (int i=0; i<A.length; i++){ 
            if (A[i] == 0) {res += 1;} 
        } 
        return res; 
    } 
} 