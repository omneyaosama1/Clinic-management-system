/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic2;
import java.io.Serializable;
import java.util.*;

abstract public class User implements Serializable {

    private String name;
    private int ID;
    protected ArrayList<Admin> adminList = new ArrayList<>();
    protected ArrayList<Doctor> docList = new ArrayList<>();
    protected ArrayList<Patient> patList = new ArrayList<>();

    public User() {
    }

    public User(int ID, String name) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    abstract public boolean login(int ID, String Name);

}