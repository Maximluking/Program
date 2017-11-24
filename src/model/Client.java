package model;

public class Client {

    private int clientId;
    private String clientName;
    private String clientSurname;
    private int clientAge;

    public Client() {
        System.out.println("Введите имя нового клиента:");
        this.clientName = ;
        System.out.println("Введите фамилию нового клиента:");
        this.clientSurname = ;
        this.clientId = this.hashCode();
        System.out.println("Сколько клиенту полных лет:");
        this.clientAge = ;

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

}
