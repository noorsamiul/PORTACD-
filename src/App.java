public class App {
    public static void main(String[] args) throws Exception {

        CD c = new CD("Gianni", "Morandi", 10, 64);
        System.out.println(c.toString());

        CD c1 = new CD("Morinia", "Pienimi", 23, 650);
        System.out.println(c1.toString());

        CD c2 = new CD("Vasti", "Tiponi", 67, 786);
        System.out.println(c2.toString());

        CD c3 = new CD("Casti", "Teponi", 66, 76);
        System.out.println(c3.toString());

        //creazione di array di 10 elementi o caselle o librerie 
        PortaCD p = new PortaCD(10);

        //impostiamo i c, c1, c2, c3 in array 
        p.setCD(c,0);

        p.setCD(c1,1);

        p.setCD(c2,4);

        p.setCD(c3,5);


        System.out.println(c1.compareDurata(c2));

        System.out.println(p.getN());

        p.killCD(5);

        System.out.println(p.getN());

        System.out.println("Inserisci cerca titolo: "+p.cercaCDPerTitolo("Gianni"));

        System.out.println(p);

        System.out.println(c.confrontaCollezione(c2)); 

    }
}