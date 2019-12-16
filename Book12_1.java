class Book12_1 extends Book12 {
    private int cost ;
    public Book12_1() {
        super();
        this.cost = 0;
    }
    
    public Book12_1(int cod, String tit, String writ,String pub,int year,int pag, int typ, int exem, int cost){
        super(cod, tit, writ, pub, year, pag, typ, exem);
        this.cost=cost;
    }
    
    public int isCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean equals(Object object) {
        return this == object;
    }
    
    public int hashCode() {
        int result = 0;
        for (int i = 0; i < this.getTit().length(); i++) {
            result += 37 * 17 + (int)this.getTit().charAt(i);
        }
        for (int i = 0; i < this.getWrit().length(); i++) {
            result += 37 * 17 + (int)this.getWrit().charAt(i);
        }
        for (int i = 0; i < this.getPub().length(); i++) {
            result += 37 * 17 + (int)this.getPub().charAt(i);
        }
        result = this.cost;
        return result + getPag() + getExem();
    }
    
    public String toString() {
        return String.format("Идентификационный код: %s\n Название: %s\n Автор: %s\n издательство: %s\n год выпуска %s\n количество страниц %s\n тип %s\n количество экземпляров %s\n цена %s\n",
                getCod(), getTit(), getWrit(), getPub(), getYear(), getPag(), getTyp(), getExem(),this.cost);
    }
}
