package oop.labor13;

import java.util.*;

public class Halozat {
    private List<Eszkoz> eszkozok;
    private int maxEszkozok;

    public Halozat() {
        this.eszkozok = null;
    }
    public boolean teleVanE(){
        return eszkozok.size() >= maxEszkozok;
    }
    private int getElsoSzabadIP(){
        for (int ip = 0; ip < 256; ip++){
            boolean ipFoglalt = false;
            for (Eszkoz eszkoz : eszkozok){
                if(eszkoz.getIp() == ip){
                    ipFoglalt = true;
                    break;
                }
            }
            if (!ipFoglalt){
                return ip;
            }
        }
        return -1;
    }
    public void kapcsolodas(Eszkoz eszkoz){
        if (teleVanE()){
            System.out.println("A halozat megtelt!");
            return;
        }
        int szabadIP = getElsoSzabadIP();
        if (szabadIP != -1){
            eszkoz.setIp(szabadIP);
            eszkozok.add(eszkoz);
            System.out.println("Eszkoz csatlakozott a halozathoz, IP cim: "+szabadIP);
        }else {
            System.out.println("Nem talalhato szabad IP cim a halozaton");
        }
    }
    public void levalas(Eszkoz eszkoz){
        if (!eszkozok.contains(eszkoz)){
            System.out.println("Az eszkoz nem csatlakozott a halozathoz");
            return;
        }
        eszkoz.setIp(-1);
        eszkozok.remove(eszkoz);
        System.out.println("Eszkoz levalt a halozatrol.Ip cim torolve.");
    }
    public void listazEszkozok(){
        if (eszkozok.isEmpty()){
            System.out.println("A halozaton nincsenek csatlakoztatott eszkozok.");
        }else{
            for (Eszkoz eszkoz : eszkozok){
                System.out.println(eszkoz);
            }
        }
    }
    public void listazMobil(){
        List<Eszkoz> mobilEszkozok = new ArrayList<>();
        for (Eszkoz eszkoz : eszkozok){
            if (eszkoz instanceof Mobil){
                mobilEszkozok.add(eszkoz);
            }
        }
        if (mobilEszkozok.isEmpty()){
            System.out.println("A halozaton nincsenek csatlakoztatott mobilok.");
        }else{
            for (Eszkoz eszkoz : mobilEszkozok){
                System.out.println(eszkoz);
            }
        }
    }
    public void rendezes(){
        Collections.sort(eszkozok, new Comparator<Eszkoz>() {
            @Override
            public int compare(Eszkoz eszkoz1, Eszkoz eszkoz2) {
                if (eszkoz1 instanceof Mobil && eszkoz2 instanceof Mobil){
                    return eszkoz1.getOprendszer().compareTo(eszkoz2.getOprendszer());
                }else if (eszkoz1 instanceof Mobil){
                    return -1;
                }else if (eszkoz2 instanceof Mobil){
                    return 1;
                }else{
                    Szamitogep szamitogep1 = (Szamitogep) eszkoz1;
                    Szamitogep szamitogep2 = (Szamitogep) eszkoz2;
                    return Integer.compare((int) szamitogep1.getHDmeret(), (int) szamitogep2.getHDmeret());
                }
            }
        });
    }

}
