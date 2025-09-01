package models;

public class Student {

    //atributos
    private String firstname;
    private String lastname;
    private String mayor;
    private float average;

    //Metodos - Constructor

    public Student() {
    }

    public Student(String firstname, String lastname,String mayor, float average, ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mayor = mayor;
        this.average = average;


    }

    //getter y setter


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mayor='" + mayor + '\'' +
                ", average=" + average +
                '}';
    }
}
