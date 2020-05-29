package Service;

import Model.Baguette;
import Model.Breadstuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DeliveryService implements Delivery {

    private List<Breadstuff> breadstuffList;

    public DeliveryService() {

        this.breadstuffList = new ArrayList<>();
    }

    public void addBreadstuff(Breadstuff breadstuff) {

        this.breadstuffList.add(breadstuff);
    }

    public void addBreadstuff(int id, String name, int size) {

        Breadstuff breadstuff = new Baguette(id,name,size);
        this.breadstuffList.add(breadstuff);
    }

    public void update(int id, String name){
        Optional<Breadstuff> optionalBreadstuff = findById(id);
        if (optionalBreadstuff.isPresent()) {
            optionalBreadstuff.get().setName(name);
        }
    }

    private Optional<Breadstuff> findById (int id) {
        return breadstuffList.stream().filter(breadstuff -> breadstuff.getId() == id).findFirst(); //
    }

    public List<Breadstuff> findAll(){
        return this.breadstuffList;
    }

    public void chooseBreadstuff (int id, String customerName){
        Optional<Breadstuff> optionalBreadstuff = findById(id);
        if (optionalBreadstuff.isPresent()){
            System.out.println("podaje " + optionalBreadstuff.get() + " dla " + customerName);
        } else {
            System.out.println("nie znaleziono produktu");
        }
    }
    public void deleteBreadstuff(int id) {
        findById(id).ifPresentOrElse(
                breadstuff -> breadstuffList.remove(breadstuff),
                () -> System.out.println("nie znaleziono produktu")
        );
    }
}