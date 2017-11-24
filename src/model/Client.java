package model;

import services.CmdLineService;

public class Client {

    private int clientId;
    private String clientName;
    private String clientSurname;
    private int clientAge;

    public Client(int clientId, String clientName, String clientSurname, int clientAge) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientAge = clientAge;
    }

    /*public Client() {
        System.out.println("Вы добавили в базу следующего клиента: \n");
        System.out.println("Имя: " + this.clientName);
        System.out.println("Фамилия: " + this.clientSurname);
        System.out.println("ID клиента в базе магазина: " + this.clientId );
        System.out.println("Возраст клиента: " + this.clientAge + " лет");
        System.out.println("Доступные наличные в грн.: " + this.clientMoney + " грн.");
        System.out.println("Телефон для связи: " + this.clientMobPhone);
    }*/

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

}
