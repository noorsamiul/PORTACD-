public class PortaCD {

    private CD[] dischi;
    private int max_num_cd;

    public PortaCD(int n) {
        dischi = new CD[n];
        max_num_cd = n;
    }

    public PortaCD(PortaCD cd) {
        this(cd.dischi.length);
        for (int i = 0; i < cd.dischi.length; i++) {
            if (cd.dischi[i] != null) {
                setCD(cd.dischi[i], i);
            }
        }
    }

    public int setCD(CD cd, int posizione) {
        int r = -1;
        if (posizione >= 0 && posizione < max_num_cd && getCD(posizione) == null) {
            dischi[posizione] = new CD(cd);
            r = posizione;
        } else if (getCD(posizione) != null) {
            r = -2;
        }
        return r;
    }

    public CD getCD(int posizione) {
        return dischi[posizione];
    }

    public int killCD(int posizione) {
        int r = -1;
        if (posizione >= 0 && posizione < dischi.length) {
            if (dischi[posizione] != null) {
                dischi[posizione] = null;
                r = posizione;
            } else {
                r = -2;
            }
        }
        return r;
    }

    public int getNumMaxDischi() {
        return max_num_cd;
    }

    public int getN() {
        int num = 0;
        for (int i = 0; i < max_num_cd; i++) {
            if (dischi[i] != null) {
                num++;
            }
        }
        return num;
    }

    public int cercaCDPerTitolo(String titolo) {
        int r = -1;
        int i = 0;
        while (i < max_num_cd && r == -1) {
            if (dischi[i] != null && dischi[i].getTitolo().toLowerCase().contains(titolo.toLowerCase())) {
                r = i;
            }
            i++;
        }
        return r;
    }

    public int confrontaCollezione(PortaCD m) {
        int r = 0;
        for (int i = 0; i < max_num_cd; i++) {
            for (int j = 0; j < m.max_num_cd; j++) {
                if (dischi[i].equals(m)) {
                    r++;
                }
            }
        }
        return r;
    }

    /*
     * public int confrontaCollezione(CD m) {
     * int pos = 0;
     * int x = 0;
     * boolean trovato = true;
     * while (trovato == true && pos <= max_num_cd) {
     * int i = 0;
     * while (trovato = true && pos <= max_num_cd) {
     * if (dischi[x] != null && dischi[x].equals(i)) {
     * trovato = false;
     * }
     * pos++;
     * }
     * }
     * return pos;
     * }
     */

    public String toString() {
        String s = "Porta CD\n";
        for (int i = 0; i < max_num_cd; i++) {
            if (dischi[i] != null) {
                s += " " + i + ". Titolo: " + dischi[i].getTitolo() + ", Autore: " + dischi[i].getAutore() + ", Brani: "
                        + dischi[i].getBrani() + ", Durata: " + dischi[i].getDurata() + "\n";
            } else {
                s += " " + i + ". Elemento vuoto" + "\n";
            }
        }
        return s;
    }
}