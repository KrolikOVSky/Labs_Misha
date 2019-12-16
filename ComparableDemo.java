public class ComparableDemo {
    public static void main(String[] args) {
        Book12 book2 = new Book12_1(007, "Day 1", "Dimamba", "SevSU", 2001, 236, 1, 2, 700);
        Book12 book1 =  new  Book12(623, "text", "Anon", "XZkto", 199, 4, 2, 1);
        Book12 book4 =  new  Book12(144, "leg", "Dar", "hop", 2212, 23, 3, 66);

        Book12[] book_list = {book2, book1, book4};
        sort(book_list);
        System.out.println("Отсортированный массив объектов: ");
        for (Book12 i: book_list){
            System.out.println(i.toString()+ "\n");
        }
    }
   
    public static void sort(Comparable[] arr) {
        boolean sorted = false;
        Comparable buffer;
        int compare = 0;
        while (!sorted) {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    break;
                }
                compare = arr[i].compareTo(arr[i + 1]);
                if (compare > 0) {
                    sorted = false;
                    buffer = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = buffer;
                } else {
                    sorted = true;
                }
            }
        }
    }
}
