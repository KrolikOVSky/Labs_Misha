public class Book{
    private final static String BOOK_FORMAT_STRING =
        " Идентификационный код: %s\n Название: %s\n Автор: %s\n издательство: %s\n год выпуска %s\n количество страниц %s\n тип %s\n количество экземпляров %s\n"; 
    private String titel, writer, publication; 
    private int code, year, pages, type, count; 
    public Book(){code=007; titel="Day 1"; writer="Dimamba"; publication="SevSU"; year=2001; pages=236; type=1; count=2;}

    public Book(int code, String titel, String writer,String publication,int year,int pages, int type, int count){
        this.code=code; this.titel=titel; this.writer=writer; this.publication=publication; this.year=year; this.pages=pages; this.type=type; this.count=count;}

    public int getcode(){
        return code;
    } 

    public String gettitel(){
        return titel;
    } 

    public String getwriter(){
        return writer;
    }

    public String getpublication(){
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

    public int getcount(){
        return count;
    }

    public void setcode(int code){
        code=code;
    }

    public void settitel(String titel){
        titel=titel;
    }

    public void setwriter(String writer){
        writer=writer;
    }

    public void setpublication(String publication1){
        publication=publication;
    }

    public void setYear(int year){
        year=year;
    }

    public void setPages(int pages){
        pages=pages;
    } 

    public void setType(int type){
        type=type;
    }

    public void setcount(int count){
        count=count;
    }

    public String toString () { 
        return String.format (BOOK_FORMAT_STRING, code, titel, writer, publication, year, pages, type, count);
    }

    public boolean equals (Book obj) { 
        if (this == obj) return true; 
        if (obj == null) return false;
        if (code==obj.code && titel==obj.titel && writer==obj.writer && publication==obj.publication && year==obj.year && pages==obj.pages && type==obj.type && count==obj.count) 
            return true;
        return false;
    }
} 
