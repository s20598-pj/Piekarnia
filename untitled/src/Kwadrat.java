public class Kwadrat {

    private int x;
    private int y;

    public Kwadrat (){



    }

    public Kwadrat (int zmienna1, int zmienna2){

        this.x = zmienna1;
        this.y = zmienna2;


    }

    public void setX (int zmienna1){
        this.x = zmienna1;
    }
    public void setY (int zmienna1) {
        this.y = zmienna1;
    }

    public int getX () {
        return this.x;
    }

    public int getY (){
        return this.y;
    }
    {

        Kwadrat kwa = new Kwadrat();
        kwa.setX(5);
        kwa.setY(10);
        System.out.println(kwa.calculate());
    }
}
