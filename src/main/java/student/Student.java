package student;

import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private int age;
    private LocalDate dob;
    private String email;

    Student () {
    }

    Student(long id, String name, int age, LocalDate dob, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }
    Student(String name, int age, LocalDate dob, String email) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }
    

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return LocalDate return the dob
     */
    public LocalDate getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return("Student Id "+ this.id + " " + "name= " + this.name + " " + "age= " + this.age + " " + "dob= " + this.dob + " " + "email= " + this.email); 
    }
}
