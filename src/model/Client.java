package model;

import services.CmdLineGetInfo;

public class Client {

    private String clientName;
    private String clientSurname;
    private int clientId;
    private int clientAge;
    private double clientMoney;
    private double clientDiscount;
    private String clientMobPhone;

    public Client() {
        //String clientName, String clientSurname, int clientId, int clientAge, double clientMoney, double clientDiscount, long clientMobPhone
        System.out.println("Введите имя нового клиента:");
        this.clientName = CmdLineGetInfo.cmdLineGetString();//clientName;
        System.out.println("Введите фамилию нового клиента:");
        this.clientSurname = CmdLineGetInfo.cmdLineGetString();//clientSurname;
        this.clientId = this.hashCode();//clientId;
        System.out.println("Сколько клиенту полных лет:");
        this.clientAge = CmdLineGetInfo.cmdLineGetInt();//clientAge;
        System.out.println("Количество наличных у клиента:");
        this.clientMoney = CmdLineGetInfo.cmdLineGetDouble();//clientMoney;
        System.out.println("На какую скидку при покупке товара может расчитывать клиент(скидка вводится в пределах от 0.00 до 1.00):");
        this.clientDiscount = CmdLineGetInfo.cmdLineGetDouble();//clientDiscount;
        System.out.println("Введите номер мобильного телефона:");
        this.clientMobPhone = CmdLineGetInfo.cmdLineGetString();//clientMobPhone;
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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

    public String  getClientMobPhone() {
        return clientMobPhone;
    }

    public void setClientMobPhone(String clientMobPhone) {
        this.clientMobPhone = clientMobPhone;
    }
}
