package for_human;

public class Human {
    private String firstName;
    private String lastName;
    private int year;
    private int weight;
    private char gender;
    private boolean isArmenian;

    public Human(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }

    public void printInfo()
    {
        System.out.printf("FullName is : %s %s,\n Weight is: %d, \n Gender is: %s \n,Year is : %d, Is Armenian: %s",
                firstName,lastName,weight,gender=='m'?"Male":"Female",year,isArmenian?"Yes":"No");
    }




}
