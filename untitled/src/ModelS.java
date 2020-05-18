public class ModelS extends Tesla {

    private int sprzęgło;
    private int moc;

    public ModelS (int opóźnienie, int szybkość,  int moc, int zasięg, int cal, int sekwencyjna, int otwierane_do_góry){
        super(cal, sekwencyjna, otwierane_do_góry, moc, zasięg);
        this.sprzęgło = opóźnienie;
        this.moc = szybkość;
    }
    public void setSprzęgło (int opóźnienie){
        this.sprzęgło = opóźnienie;
    }
    public void setMoc (int szybkość) {
        this.moc = szybkość;
    }
    public int getSprzęgło () {
        return this.sprzęgło;
    }
    public int getMoc () {
        return this.moc;
    }

}