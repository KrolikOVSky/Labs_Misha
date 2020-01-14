package Project_3;

public class Main
{
    public static void bubbleSort(Comparable[] array){
        boolean flag;
        for(int m = array.length - 1; m > 0; m--){
            flag = true;
            for (int i = 0; i < m; i++){
                if(array[i].compareTo(array[i + 1]) > 0){
                    Comparable temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
                if(flag) break;
            }
        }
    }
    
    public static void printArray(BookWithPrice[] array){
        for(BookWithPrice BookWithPrice : array)
            System.out.printf("%s ,Hash Code: %d\n",BookWithPrice, BookWithPrice.hashCode());
    }
    
    public static void printArray(Book[] array){
        for(Book book : array)
            System.out.printf("%s ,Hash Code: %d\n",book, book.hashCode());
    }
    
    static public void main(String[] args)
    {
        
        Book[] array = new Book[6];
        array[0] = new Book(21, "My life", "I", "Our World", 2002, (18 * 365), 2, 1);
        array[1] = new Book(21, "Your life", "You", "Our Mars", 2005, (19 * 365), 9, 2);
        array[2] = new Book(21, "His life", "He", "Our Jupeter", 2098, (11 * 365), 4, 8);
        array[3] = new Book(21, "Her life", "She", "Our Pluto", 1794, (26 * 365), 3, 9);
        array[4] = new Book(21, "Its life", "It", "Our Neptun", 222, (39 * 365), 15, 4);
        array[5] = new Book(21, "Them life", "They", "Our Mercury", 242, (49 * 365), 7, 20);
                
        BookWithPrice[] array1 = new BookWithPrice[6];
        array1[0] = new BookWithPrice(21, "My life", "I", "Our World", 2002, (18 * 365), 2, 1, 500f);
        array1[1] = new BookWithPrice(21, "Your life", "You", "Our Mars", 2005, (19 * 365), 9, 2, 100f);
        array1[2] = new BookWithPrice(21, "His life", "He", "Our Jupeter", 2098, (11 * 365), 4, 8, 250f);
        array1[3] = new BookWithPrice(21, "Her life", "She", "Our Pluto", 1794, (26 * 365), 3, 9, 150f);
        array1[4] = new BookWithPrice(21, "Its life", "It", "Our Neptun", 222, (39 * 365), 15, 4, 900f);
        array1[5] = new BookWithPrice(21, "Them life", "They", "Our Mercury", 242, (49 * 365), 7, 20, 850f);
        
        System.out.println("\nArray of Book before sorting");
        printArray(array);
        bubbleSort(array);
        System.out.println("Array of Book after sorting");
        printArray(array);
        
        System.out.println("\nArray of BookWithPrices before sorting");
        printArray(array1);
        bubbleSort(array1);
        System.out.println("Array of BookWithPrices after sorting");
        printArray(array1);
    }
}
