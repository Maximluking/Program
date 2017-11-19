package model;

public class Client {

    private String clientName;
    private String clientSurname;
    private int clientAge;
    private double clientMoney;
    private double clientDiscount;
    private long clientMobPhone;

    public Client(String clientName, String clientSurname, int clientAge, double clientMoney, double clientDiscount, long clientMobPhone) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientAge = clientAge;
        this.clientMoney = clientMoney;
        this.clientDiscount = clientDiscount;
        this.clientMobPhone = clientMobPhone;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public int getClientAge() {
        return clientAge;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

    public double getClientMoney() {
        return clientMoney;
    }

    public void setClientMoney(double clientMoney) {
        this.clientMoney = clientMoney;
    }

    public double getClientDiscount() {
        return clientDiscount;
    }

    public void setClientDiscount(double clientDiscount) {
        this.clientDiscount = clientDiscount;
    }

    public long getClientMobPhone() {
        return clientMobPhone;
    }

    public void setClientMobPhone(long clientMobPhone) {
        this.clientMobPhone = clientMobPhone;
    }
}
