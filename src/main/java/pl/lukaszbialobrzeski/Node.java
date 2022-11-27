package pl.lukaszbialobrzeski;

public class Node {

    private String address;
    private String port;

    public void setAdress(Object adress) {
        this.address = adress.toString();
    }

    public void setPort(Object port) {
        this.port = port.toString();
    }

    public String getAdress() {
        return this.address;
    }

    public String getPort() {
        return this.port;
    }
}
