package oop.labor13;

public class Eszkoz {
    private String oprendszer;
    private int ip = -1;

    public Eszkoz(String oprendszer) {
        this.oprendszer = oprendszer;
    }
    public String getOprendszer() {
        return oprendszer;
    }
    public void setOprendszer(String oprendszer) {
        this.oprendszer = oprendszer;
    }
    public int getIp() {
        return ip;
    }
    public void setIp(int ip) {
        this.ip = ip;
    }
    @Override
    public String toString() {
        return "Eszkoz:" +
                "|oprendszer='" + oprendszer + '\'' +
                "|ip=" + ip +
                '|';
    }
}
