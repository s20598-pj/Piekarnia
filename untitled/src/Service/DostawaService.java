package Service;


import Model.Pieczywo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DostawaService {

    private List<Pieczywo> pieczywoList = new ArrayList<>();

    public DostawaService() {
    }

    public List<Pieczywo> findAll(){
        return this.pieczywoList;
    }

    public void addPieczywo(int id, String name, int size) {
        pieczywoList.add(new Pieczywo(id, name, size));
    }

    public void pieczywoWybor (int id, String customerName){
        Optional<Pieczywo> optionalPieczywo = findById(id);
        if (optionalPieczywo.isPresent()){
            System.out.println("podaje" + optionalPieczywo.get() + " dla " + customerName);
        } else {
            System.out.println("nie znaleziono produktu");
        }
    }

    public Optional<Pieczywo> findById (int id) {
        return pieczywoList.stream().filter(pieczywo -> pieczywo.get.Id() == id).findFirst();
    }

    public void deletepProdukt(int id) {
        findById(id).ifPresentOrElse(
                pieczywo -> pieczywoList.remove(pieczywo),
                () -> System.out.println("nie znaleziono produktu")
        );
    }

    public void update(int id, String name) {
        Optional<Pieczywo> optionalPieczywo = findById(id);
        if (optionalPieczywo.isPresent()) {
            optionalPieczywo.get().
        }
    }

}
