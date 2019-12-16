public class Book12 implements Comparable<Book12> {
    private final static String BOOK_FORMAT_STRING =
        " Идентификационный код: %s\n Название: %s\n Автор: %s\n издательство: %s\n год выпуска %s\n количество страниц %s\n тип %s\n количество экземпляров %s\n"; 
    private String tit, writ, pub; 
    private int cod, year, pag, typ, exem;
    
    public Book12(){
        this.cod=0; this.tit="";  this.writ="";  this.pub="";  
        this.year=0; this.pag=0; this.typ=0; this.exem=0;
    }
    
    public Book12(int cod, String tit, String writ,String pub,int year,int pag, int typ, int exem){
        this.cod=cod; this.tit=tit; this.writ=writ; this.pub=pub; 
        this.year=year; this.pag=pag; this.typ=typ; this.exem=exem;
    }

    public int getCod(){
        return cod;
    } 

    public String getTit(){
        return tit;
    } 

    public String getWrit(){
        return writ;
    }

    public String getPub(){
        return pub;
    }

    public int getYear(){
        return year;
    }

    public int getPag(){
        return pag;
    }

    public int getTyp(){
        return typ;
    }

    public int getExem(){
        return exem;
    }

    public void setCod(int cod){
        this.cod=cod;
    }

    public void setTit(String tit){
        this.tit=tit;
    }

    public void setWrit(String writ){
        this.writ=writ;
    }

    public void setPub(String pub){
        this.pub=pub;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void setPag(int pag){
        this.pag=pag;
    } 

    public void setTyp(int typ){
        this.typ=typ;
    }

    public void setExem(int exem){
        this.exem=exem;
    }

    public String toString () { 
        return String.format (BOOK_FORMAT_STRING, cod, tit, writ, pub, year, pag, typ, exem);
    }
    
    public boolean equals(Object object) {
        return this == object;
    }

    public int compareTo(Book12 object) {
        if (this.year == object.year) { return 0; }
        else if (this.year > object.year) { return 1; }
        else { return -1; }
    }

    public int hashCode() {
        int result = 0;
        for (int i = 0; i < this.tit.length(); i++) {
            result += 37 * 17 + (int)this.tit.charAt(i);
        }
        for (int i = 0; i < this.writ.length(); i++) {
            result += 37 * 17 + (int)this.writ.charAt(i);
        }
        for (int i = 0; i < this.pub.length(); i++) {
            result += 37 * 17 + (int)this.pub.charAt(i);
        }
        return result + pag + exem;
    }

    public double TotaiPages() {
      return (pag + exem);
    }
}
