package Project_2;

public class Main
{
    public static void bubbleSort(BookWithPrice[] array){
        boolean flag;
        for(int m = array.length - 1; m > 0; m--){
            flag = true;
            for (int i = 0; i < m; i++){
                if(array[i].compareTo(array[i + 1]) > 0){
                    BookWithPrice temp = array[i];
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
            System.out.printf("%s, Hash Code: %d\n",BookWithPrice, BookWithPrice.hashCode());
    }
    public static void main(String[] args)
    {
        BookWithPrice bookWithPrice1 =  new  BookWithPrice(623, "text", "Anon", "XZkto", 199, 4, 2, 1, 15000f);
        BookWithPrice bookWithPrice2 =  bookWithPrice1;
        BookWithPrice bookWithPrice3 =  new  BookWithPrice();
        BookWithPrice bookWithPrice4 =  new  BookWithPrice(144, "leg", "Dar", "hop", 2212, 23, 3, 66, 13987.987f);
        BookWithPrice bookWithPrice5 = null;

        System.out.printf("Книга №1\n%s\n",bookWithPrice1.toString());
        System.out.printf("Книга №2\n%s\n",bookWithPrice2.toString());
        System.out.printf("Книга №3\n%s\n",bookWithPrice3.toString());
        System.out.printf("Книга №4\n%s\n",bookWithPrice4.toString());
        System.out.println("bwp5=" + bookWithPrice5);

        System.out.println("bwp1==bwp2: " + bookWithPrice1.equals(bookWithPrice2));
        System.out.println("bwp1==bwp3: " + bookWithPrice1.equals(bookWithPrice3));
        System.out.println("bwp1==bwp4: " + bookWithPrice1.equals(bookWithPrice4));
        System.out.println("bwp2==bwp3: " + bookWithPrice2.equals(bookWithPrice3));
        System.out.println("bwp2==bwp4: " + bookWithPrice2.equals(bookWithPrice4));
        System.out.println("bwp3==bwp4: " + bookWithPrice3.equals(bookWithPrice4));
        System.out.println("bwp3==bwp5: " + bookWithPrice3.equals(bookWithPrice5));
        
        Book book = bookWithPrice1;
        System.out.println("Выполнен оператор Book book = bookWithPrice1;");
        System.out.printf("book == bookWithPrice3: %s\n", book.equals(bookWithPrice3));
        
        BookWithPrice[] array = new BookWithPrice[6];
        array[0] = new BookWithPrice(21, "My life", "I", "Our World", 2002, (18 * 365), 2, 1, 500f);
        array[1] = new BookWithPrice(21, "Your life", "You", "Our Mars", 2005, (19 * 365), 9, 2, 100f);
        array[2] = new BookWithPrice(21, "His life", "He", "Our Jupeter", 2098, (11 * 365), 4, 8, 250f);
        array[3] = new BookWithPrice(21, "Her life", "She", "Our Pluto", 1794, (26 * 365), 3, 9, 150f);
        array[4] = new BookWithPrice(21, "Its life", "It", "Our Neptun", 222, (39 * 365), 15, 4, 900);
        array[5] = new BookWithPrice(21, "Them life", "They", "Our Mercury", 242, (49 * 365), 7, 20, 850);
        
        System.out.println("\nArray of BookWithPrices before sorting");
        printArray(array);
        bubbleSort(array);
        System.out.println("Array of BookWithPrices after sorting");
        printArray(array);
    }
}
