package com.company;

public class Gamer {
    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private int citizenshipId;
    private String birthDate;


    public Gamer(int id, String firstName, String lastName, int citizenshipId, String birthDate,String userName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.citizenshipId = citizenshipId;
        this.birthDate = birthDate;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCitizenshipId() {
        return citizenshipId;
    }

    public void setCitizenshipId(int citizenshipId) {
        this.citizenshipId = citizenshipId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
