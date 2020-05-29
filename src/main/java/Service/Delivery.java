package Service;

import Model.Breadstuff;

import java.util.List;

public interface Delivery {

    void addBreadstuff(Breadstuff breadstuff);
    void update(int id, String name);
    List<Breadstuff> findAll();
    void addBreadstuff(int id, String name, int size);
    void chooseBreadstuff (int id, String customerName);
    void deleteBreadstuff(int id);

}
