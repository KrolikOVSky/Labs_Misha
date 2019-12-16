public class TestBook12 {
    static public void main(String[] args) {
        Book12 book1 =  new  Book12(623, "text", "Anon", "XZkto", 199, 4, 2, 1);
        Book12 book4 =  new  Book12(144, "leg", "Dar", "hop", 2212, 23, 3, 66);
        Book12 book2 =  new  Book12(007, "Day 1", "Dimamba", "SevSU", 2001, 236, 1, 2);
        
        System.out.println("Книга №1 == Книга №4 ? - " + book1.equals(book4));
        System.out.println("Книга №2 > Книга №1? - " + book2.compareTo(book1));
        
        Book12[] book_arr = {book2, book1, book4};
        sort_book(book_arr);
        System.out.println("\nСортированные объекты: ");
        for (Book12 i: book_arr){
            System.out.printf("%s\nХеш-код: %d\n\n", i.toString(), i.hashCode());
        }
    }
    
    public static void sort_book(Book12[] arr) {
        boolean sorted = false;
        Book12 buffer;
        int compare = 0;
        while (!sorted) {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) { break; }
                compare = arr[i].compareTo(arr[i + 1]);
                if (compare > 0) {
                     sorted = false;
                     buffer = arr[i+1];
                     arr[i+1] = arr[i];
                     arr[i] = buffer;
                } else { sorted = true; }
            }
        }
    }
}
