import Model.Baguette;
import Service.Delivery;
import Service.DeliveryService;

public class Bakery {
    public static void main(String[] args) {

        System.out.println("Bakery");
        Delivery deliveryService = new DeliveryService();
        deliveryService.addBreadstuff(new Baguette(1, "wloska", 15, 4));
        deliveryService.addBreadstuff(2, "rogalik", 15);
        deliveryService.addBreadstuff(new Baguette(3, "paryska", 17, 7));
        deliveryService.addBreadstuff(new Baguette(4, "z czosnkiem", 20, 11));
        deliveryService.chooseBreadstuff(1, "Artur");
        System.out.println(deliveryService.findAll());
        deliveryService.update(4, "maslo");
        deliveryService.update(5, "bulka paryska");
        deliveryService.deleteBreadstuff(1);
        deliveryService.deleteBreadstuff(44);

        Baguette baguette = new Baguette(6,"niemiecka", 16, 6);
        baguette.crunchy();
    }
}