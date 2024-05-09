public class CD {

    //attributi
    private String titolo;
    private String autore;
    private int brani;
    private int durata;

    //costruttore default
    //public CD (){}

    //costruttore master
    public CD (String titolo, String autore, int brani, int durata){
        this.titolo = titolo;
        this.autore = autore;
        this.brani = brani;
        this.durata = durata;
    }

    //costruttore di copia
    public CD (CD b){
        // this.titolo = b.titolo;
        // this.autore = b.autore;
        // this.brani = b.brani;
        // this.durata = b.durata;
        this(b.titolo,b.autore,b.durata,b.brani);
    }

    //metodi get e set
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public int getBrani() {
        return brani;
    }
    public void setBrani(int brani) {
        this.brani = brani;
    }
    public int getDurata() {
        return durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }

    //toString
    public String toString() {
        String s="";
        s = "Titolo: " + titolo + "\nAutore: " + autore + "\nBrani: " + brani + "\nDurata: " + durata + "\n";
        return s;
    }

    //Comprare Durata del CD 
    public int compareDurata(CD cd){
        int c=0;
        if (this.getDurata() == cd.getDurata()){
            c=this.getDurata();
        }
        else if(this.getDurata() > cd.getDurata()){
            c=this.getDurata();
        }else{
            c=this.getDurata();
        }
        return c;
        
    }
}
