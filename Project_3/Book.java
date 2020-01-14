package Project_3;

public class Book implements Comparable<Book>{
    private final static String BOOK_FORMAT_STRING =
        "Идентификационный код: %s Название: %s Автор: %s издательство: %s год выпуска %s количество страниц %s тип %s количество экземпляров %s"; 
    private String titel;
    private String writer;
    private String publication;
    private int code;
    private int year;
    private int pages;
    private int type;
    private int count;

    public Book(){
        this.code=007; 
        this.titel="Day 1"; 
        this.writer="Dimamba"; 
        this.publication="SevSU"; 
        this.year=2001; 
        this.pages=236; 
        this.type=1; 
        this.count=2;

    }
    public Book(int code, String titel, String writer, String publication, int year, int pages, int type, int count){
        this.code = code; 
        this.titel = titel; 
        this.writer=writer; 
        this.publication=publication; 
        this.year=year; 
        this.pages=pages; 
        this.type=type; 
        this.count=count;
    }
    public int getCode(){
        return code;
    } 
    public String getTitel(){
        return titel;
    } 
    public String getWriter(){
        return writer;
    }
    public String getPublication(){
        return publication;
    }
    public int getYear(){
        return year;
    }
    public int getPages(){
        return pages;
    }
    public int getType(){
        return type;
    }
    public int getCount(){
        return count;
    }
    public void setCode(int code){
        this.code = code;
    }
    public void setTitel(String titel){
        this.titel = titel;
    }
    public void setWriter(String writer){
        this.writer = writer;
    }
    public void setPublication(String publication){
        this.publication = publication;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setPages(int pages){
        this.pages = pages;
    } 
    public void setType(int type){
        this.type = type;
    }
    public void setCount(int count){
        this.count = count;
    }
    public String toString () { 
        return String.format (BOOK_FORMAT_STRING, code, titel, writer, publication, year, pages, type, count);
    }
    public boolean equals (Book obj) { 
        if (this == obj) return true; 
        if (obj == null) return false;
        if (code == obj.code && titel == obj.titel && writer == obj.writer && publication == obj.publication && year == obj.year && pages == obj.pages && type == obj.type && count == obj.count) 
            return true;
        return false;
    }
    public int compareTo(Book book){
        if(code < book.code) return -1;
        if((code == book.code) && (year < book.year))return -1;
        if((code == book.code) && (year == book.year) && (pages < book.pages)) return -1;
        if((code == book.code) && (year == book.year) && (pages == book.pages) && (type < book.type)) return -1;
        if((code == book.code) && (year == book.year) && (pages == book.pages) && (type == book.type) && (count < book.count)) return -1;
        if((code == book.code) && (year == book.year) && (pages == book.pages) && (type == book.type) && (count == book.count) && (titel.compareTo(book.titel) < 0)) return -1;
        if((code == book.code) && (year == book.year) && (pages == book.pages) && (type == book.type) && (count == book.count) && (titel.compareTo(book.titel) == 0) && (writer.compareTo(book.writer) < 0)) return -1;
        if((code == book.code) && (year == book.year) && (pages == book.pages) && (type == book.type) && (count == book.count) && (titel.compareTo(book.titel) == 0) && (writer.compareTo(book.writer) == 0) && (publication.compareTo(book.publication) < 0)) return -1;
        else return 1;
    }       
    public int hashCode(Book book){
        return 3 * titel.hashCode()
             + 5 * writer.hashCode()
             + 7 * publication.hashCode()
             + 9 * (new Integer(code)).hashCode()
             + 11 * (new Integer(year)).hashCode()
             + 13 * (new Integer(pages)).hashCode()
             + 15 * (new Integer(type)).hashCode()
             + 17 * (new Integer(count)).hashCode();
    }
    
} 
