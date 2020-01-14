package Project_2;

public class BookWithPrice extends Book{
    private final static String BookWithPrice_FORMAT_STRING =
        "%s цена: %f"; 
    
    private float price;
    
    public BookWithPrice(){
        super();
        price = 0.0f;
    }
    
    public BookWithPrice(int code, String titel, String writer, String publication, int year, int pages, int type, int count, float price){
        super(code, titel, writer, publication, year, pages, type, count);
        this.price = price;    
    }
    
    public float getPrice(){
        return price;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public String toString(){return String.format(BookWithPrice_FORMAT_STRING, super.toString(), price);}
    
    public int hashCode(BookWithPrice bookWithPrice){
        return super.hashCode() + 19 * (new Float(price)).hashCode();
    }
    
    public boolean equals (Object object){
        if(!super.equals(object))return false;
        BookWithPrice bookWithPrice = (BookWithPrice) object;
        return (price == bookWithPrice.price);
    }
    
    public int compareTo(Book book){
        int compare = super.compareTo(book);
        if(compare < 0) return -1;
        BookWithPrice bookWithPrice = (BookWithPrice) book;
        if((compare == 0) && (price < bookWithPrice.price))return -1;
        if((compare == 0) && (price == bookWithPrice.price))return 0;
        return 1;
    }
    
}