package model;

public class Client {

    private String clientName;
    private String clientSurname;
    private int clientAge;

    public Client(String clientName, String clientSurname, int clientAge) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientAge = clientAge;
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
