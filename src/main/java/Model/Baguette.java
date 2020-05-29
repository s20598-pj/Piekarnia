package Model;

public class Baguette extends Breadstuff {

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int length;

    public Baguette(int id, String name, int price) {
        super(id, name, price);
    }

    public Baguette(int id, String name, int price, int length) {
        super(id, name, price);
        this.length = length;
    }

    @Override
    public void crunchy() {
        System.out.println("*chrupie*");
    }
}
