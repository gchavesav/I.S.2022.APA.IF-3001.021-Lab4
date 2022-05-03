/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class Student implements Person {
    private String id;
    private String name;
    private int age;
    private String address;

    //Constructor
    public Student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public boolean equals(Person other) {
        if(!(other instanceof Person)) return false;
        Student st = (Student) other;
        return this.id.equals(st.id);
        //return st.id.equals(this.id);
    }

    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getAddress() {
        return this.getAddress();
    }
    
    private double studyHours(){
        return age/2;
    }

    @Override
    public String toString() {
        return "Student {" + "id=" + id + ", name=" + name + ", age=" + age + ", study hours="+studyHours()+", address="+address+'}';
    }
    
    
}
