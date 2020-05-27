import Service.DeliveryService;

public class Main {
    public static void main {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.addPieczywo(1, "maka", 150;
        deliveryService.addPieczywo(2, "rogalik", 150;
        deliveryService.addPieczywo(3, "chleb", 150;
        deliveryService.addPieczywo(4, "bulka", 150;
        deliveryService.pieczywoWybor(1, "Artur");
        System.out.println(deliveryService.findAll());
        deliveryService.update(4, "maslo");

    }
}
