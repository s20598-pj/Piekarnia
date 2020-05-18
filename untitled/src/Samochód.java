public class Samochód {

    private int koła;
    private int kierownica;
    private int drzwi;

    public Samochód (int cal, int sekwencyjna, int otwierane_do_góry){
        this.koła = cal;
        this.kierownica = sekwencyjna;
        this.drzwi = otwierane_do_góry;
    }
    public void setKoła (int cal){
        this.koła = cal;
    }
    public void setKierownica (int sekwencyjna) {
        this.kierownica = sekwencyjna;
    }
    public void setDrzwi (int otwierane_do_góry) {
        this.drzwi = otwierane_do_góry;
    }
    public int getKoła () {
        return this.koła;
    }
    public int getKierownica () {
        return this.kierownica;
    }
    public int getDrzwi () {
        return this.drzwi;
    }
}
