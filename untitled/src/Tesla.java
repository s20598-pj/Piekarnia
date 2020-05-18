public class Tesla extends Samochód {

    private int ładowarka;
    private int radio;

    public Tesla (int moc, int zasięg, int cal, int sekwencyjna, int otwierane_do_góry){
        super(cal, sekwencyjna, otwierane_do_góry);
        this.ładowarka = moc;
        this.radio = zasięg;
    }
    public void setŁadowarka (int moc){
        this.ładowarka = moc;
    }
    public void setRadio (int zasięg) {
        this.radio = zasięg;
    }
    public int getŁadowarka () {
        return this.ładowarka;
    }
    public int getRadio () {
        return this.radio;
    }
}
