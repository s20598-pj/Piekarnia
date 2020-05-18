package Controler;

import Service.DostawaService;

public class Main {
    public static void main(String[] args) {
        DostawaService dostawaService = new DostawaService();
        dostawaService.addPieczywo(1, "maka", 150;
        dostawaService.addPieczywo(2, "rogalik", 150;
        dostawaService.addPieczywo(3, "chleb", 150;
        dostawaService.addPieczywo(4, "bulka", 150;
        dostawaService.pieczywoWybor(1, "Artur");
        System.out.println(dostawaService.findAll());
        dostawaService.update(4, "masło");
    }
}
