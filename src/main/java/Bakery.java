import Model.Breadstuff;
import Service.DeliveryService;

public class Bakery {
    public static void main(String[] args) {

        System.out.println("Bakery");
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.addBreadstuff(new Breadstuff(1, "maka", 150));
        deliveryService.addBreadstuff(new Breadstuff(2, "rogalik", 150));
        deliveryService.addBreadstuff(new Breadstuff(3, "chleb", 150));
        deliveryService.addBreadstuff(new Breadstuff(4, "bulka", 150));
        deliveryService.chooseBreadstuff(1, "Artur");
        System.out.println(deliveryService.findAll());
        deliveryService.update(4, "maslo");
        deliveryService.update(5, "bulka paryska");
        deliveryService.deleteBreadstuff(1);
        deliveryService.deleteBreadstuff(44);

    }
}