/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic2;
import java.io.*;
import java.util.*;


public class Department implements Serializable {

    protected ArrayList<Department> depList = new ArrayList<>();
    private String depName;

    public Department(String depName) {
        this.depName = depName;
    }

    public ArrayList<Department> getDepList() {
        return depList;
    }

    public void setDepList(ArrayList<Department> depList) {
        this.depList = depList;
    }

    public Department() {
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public void createDepFile() {
        try (ObjectOutputStream depfile = new ObjectOutputStream(new FileOutputStream("Departments.dat"))) {
            Department dep1=new Department("radiology");
            Department dep2=new Department("dermatology");
            Department dep3=new Department("dentistry");
            Department dep4=new Department("neurology");
            Department dep5=new Department("psychiatry");
            depList.add(dep1);
            depList.add(dep2);
            depList.add(dep3);
            depList.add(dep4);
            depList.add(dep5);
            

            depfile.writeObject(depList);
            System.out.println("File created ");
        } catch (IOException e) {
            System.out.println("Error creating the file: " + e.getMessage());
        }
    }

    public void loadData() {
        try (ObjectInputStream load = new ObjectInputStream(new FileInputStream("Departments.dat"))) {
            depList = (ArrayList<Department>) load.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

  

    public void saveData() {
        try (ObjectOutputStream myfile = new ObjectOutputStream(new FileOutputStream("Departments.dat"))) {
            myfile.writeObject(depList);
        } catch (IOException e) {
            System.out.println("Error saving the data: " + e.getMessage());
        }
    }

}