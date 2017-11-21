package model;

import services.CmdLineGetInfo;

public class Client {

    private String clientName;
    private String clientSurname;
    private int clientId;
    private int clientAge;
    private int clientMoney;
    private String clientMobPhone;

    public Client() {
        System.out.println("Введите имя нового клиента:");
        this.clientName = CmdLineGetInfo.cmdLineGetString();
        System.out.println("Введите фамилию нового клиента:");
        this.clientSurname = CmdLineGetInfo.cmdLineGetString();
        this.clientId = this.hashCode();
        System.out.println("Сколько клиенту полных лет:");
        this.clientAge = CmdLineGetInfo.cmdLineGetInt();
        System.out.println("Количество наличных у клиента в грн.:");
        this.clientMoney = CmdLineGetInfo.cmdLineGetInt();
        System.out.println("Введите номер мобильного телефона:");
        this.clientMobPhone = CmdLineGetInfo.cmdLineGetString();

        System.out.println("Вы добавили в базу следующего клиента: \n");
        System.out.println("Имя: " + this.clientName);
        System.out.println("Фамилия: " + this.clientSurname);
        System.out.println("ID клиента в базе магазина: " + this.clientId );
        System.out.println("Возраст клиента: " + this.clientAge + " лет");
        System.out.println("Доступные наличные в грн.: " + this.clientMoney + " грн.");
        System.out.println("Телефон для связи: " + this.clientMobPhone);
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

    public int getClientMoney() {
        return clientMoney;
    }

    public void setClientMoney(int clientMoney) {
        this.clientMoney = clientMoney;
    }

    public String  getClientMobPhone() {
        return clientMobPhone;
    }

    public void setClientMobPhone(String clientMobPhone) {
        this.clientMobPhone = clientMobPhone;
    }
}
