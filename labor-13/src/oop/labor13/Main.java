package oop.labor13;

public class Main {
    public static void main(String[] args) {
        Halozat halozat = new Halozat();
        Eszkoz eszkoz1 = new Mobil("Android", true);
        Eszkoz eszkoz2 = new Mobil("iOS", false);
        Eszkoz eszkoz3 = new Szamitogep("Windows", 500);
        Eszkoz eszkoz4 = new Szamitogep("Linux", 1000);
        halozat.kapcsolodas(eszkoz1);
        halozat.kapcsolodas(eszkoz2);
        halozat.kapcsolodas(eszkoz3);
        halozat.kapcsolodas(eszkoz4);
        halozat.listazEszkozok();
        halozat.listazMobil();
        halozat.rendezes();
        halozat.listazEszkozok();
        halozat.levalas(eszkoz3);
        halozat.listazEszkozok();
    }
}
