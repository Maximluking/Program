package model;

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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

}
