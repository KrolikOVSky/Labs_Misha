package project_1;

public class Main
{
    public static void bubbleSort(Book[] array){
        boolean flag;
        for(int m = array.length - 1; m > 0; m--){
            flag = true;
            for (int i = 0; i < m; i++){
                if(array[i].compareTo(array[i + 1]) > 0){
                    Book temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
                if(flag) break;
            }
        }
    }
    
    public static void printArray(Book[] array){
        for(Book Book : array)
            System.out.printf("%s, Hash Code: %d\n",Book, Book.hashCode());
    }
    
    static public void main(String[] args)
    {
        Book book1 =  new  Book(623, "text", "Anon", "XZkto", 199, 4, 2, 1);
        Book book2 =  book1;
        Book book3 =  new  Book();
        Book book4 =  new  Book(144, "leg", "Dar", "hop", 2212, 23, 3, 66);
        Book book5 = null;

        System.out.printf("Книга №1\n%s\n",book1.toString());
        System.out.printf("Книга №2\n%s\n",book2.toString());
        System.out.printf("Книга №3\n%s\n",book3.toString());
        System.out.printf("Книга №4\n%s\n",book4.toString());
        System.out.println("b5=" + book5);

        System.out.println("b1==b2: " + book1.equals(book2));
        System.out.println("b1==b3: " + book1.equals(book3));
        System.out.println("b1==b4: " + book1.equals(book4));
        System.out.println("b2==b3: " + book2.equals(book3));
        System.out.println("b2==b4: " + book2.equals(book4));
        System.out.println("b3==b4: " + book3.equals(book4));
        System.out.println("b3==b5: " + book3.equals(book5));
        
        Book[] array = new Book[6];
        array[0] = new Book(21, "My life", "I", "Our World", 2002, (18 * 365), 2, 1);
        array[1] = new Book(21, "Your life", "You", "Our Mars", 2005, (19 * 365), 9, 2);
        array[2] = new Book(21, "His life", "He", "Our Jupeter", 2098, (11 * 365), 4, 8);
        array[3] = new Book(21, "Her life", "She", "Our Pluto", 1794, (26 * 365), 3, 9);
        array[4] = new Book(21, "Its life", "It", "Our Neptun", 222, (39 * 365), 15, 4);
        array[5] = new Book(21, "Them life", "They", "Our Mercury", 242, (49 * 365), 7, 20);
        
        System.out.println("\nArray of Books before sorting");
        printArray(array);
        bubbleSort(array);
        System.out.println("Array of Books after sorting");
        printArray(array);
    }
}
