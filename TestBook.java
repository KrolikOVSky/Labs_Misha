public class TestBook
{
    static public void main(String[] args)
    {
        Book book1 =  new  Book(623, "text", "Anon", "XZkto", 199, 4, 2, 1);
        Book book2 = book1;
        Book book3 =  new  Book();
        Book book4 =  new  Book(144, "leg", "Dar", "hop", 2212, 23, 3, 66);
        Book book5 = null;
        //kigffyuofhyjhgjfhijlh
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
    }
}
