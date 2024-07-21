/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic2;
import java.io.*;
import java.util.*;


public class Admin extends User implements Serializable {

    public Admin(int ID, String name) {
        super(ID, name);
    }

    public Admin() {
    }

    public void createAdminfile() {
        try {
            FileOutputStream adminfile = new FileOutputStream("Admin's information.dat");
            ObjectOutputStream myfile = new ObjectOutputStream(adminfile);
            Admin a1 = new Admin(1001, "admin1");
            Admin a2 = new Admin(2002, "admin2");
            Admin a3 = new Admin(3003, "admin3");
            Admin a4 = new Admin(4004, "admin4");
            Admin a5 = new Admin(5005, "admin5");

            adminList.add(a1);
            adminList.add(a2);
            adminList.add(a3);
            adminList.add(a4);
            adminList.add(a5);
            myfile.writeObject(adminList);
        } catch (Exception e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    public void addStaff(Doctor newDoctor) {
        Doctor d = new Doctor();
        d.loadData();
        boolean docExists = false;
        for (Doctor add : d.getDocList()) {
            if (add.getID() == newDoctor.getID()) {
                System.out.println("Doctor already exists!");
                docExists = true;
                break;
            }
        }
        if (!docExists) {
            d.getDocList().add(newDoctor);
            System.out.println("Doctor added to the system");
            d.saveData();
        }
    }

    public void addPatient(Patient newPatient) {
        Patient pat = new Patient();
        pat.loadData();
        boolean exist = false;
        for (Patient p : patList) {
            if (p.getID() == newPatient.getID()) {
                System.out.println("Patient already exist.");
                exist = true;
                break;
            }
        }
        if (!exist) {
            pat.getPatList().add(newPatient);
            System.out.println("Patient added to the system.");
            pat.saveData();
        }

    }

    public void addDepartment(Department newDep) {
        Department dep = new Department();
        dep.loadData();
        boolean depExists = false;
        for (Department add : dep.getDepList()) {
            if (add.getDepName() == newDep.getDepName()) {
                System.out.println("Department already exists!");
                depExists = true;
                break;
            }
        }
        if (!depExists) {
            dep.getDepList().add(newDep);
            System.out.println("Department added successfully!");
            dep.saveData();
        }
    }

    public void removeStaff(int docID) {
        Doctor d = new Doctor();
        d.loadData();
        Doctor doc2remove = null;
        for (Doctor rem : docList) {
            if (rem.getID() == docID) {
                doc2remove = rem;
                break;
            }
        }
        if (doc2remove != null) {
            d.getDocList().remove(doc2remove);
            System.out.println("Doctor with ID: " + docID + " removed from the system.");
            d.saveData();
        } else {
            System.out.println("Doctor not found!");
        }
    }

    public void removePatient(int patientID) {

        Patient pat = new Patient();
        pat.loadData();
        Patient toRemove = null;
        for (Patient p : pat.getPatList()) {
            if (p.getID() == patientID) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            pat.getPatList().remove(toRemove);
            System.out.println("Patient with ID " + patientID + " is removed.");
            pat.saveData();

        } else {
            System.out.println("Patient not found.");
        }

    }

    public void removeDepartment(Department remDep) {
        Department dep = new Department();
        dep.loadData();
        boolean found = false;
        for (Department remove : dep.getDepList()) {
            if (remove.getDepName().equalsIgnoreCase(remDep.getDepName())) {
                dep.getDepList().remove(remove);
                System.out.println("Department removed from the system successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Department not found in the system.");
        }
        dep.saveData();
    }

    public void viewStaff() {
        Doctor doctor = new Doctor();
        doctor.loadData();
        if (doctor.getDocList().isEmpty()) {
            System.out.println("No doctors in the system to view.");
            return;

        }
        System.out.println("List of Doctors in the system:");
        for (Doctor view : doctor.getDocList()) {
            System.out.println("Doctor ID: " + view.getID());
            System.out.println("Doctor name: " + view.getName());
            System.out.println("Department: " + view.getProffession());
            System.out.println();
        }
        doctor.saveData();
    }

    public void viewPatients() {
        Patient patient = new Patient();
        patient.loadData();
        System.out.println("Patients List:");
        for (Patient p : patient.getPatList()) {
            System.out.println("Patient's ID: " + p.getID());
            System.out.println("Patient's Name: " + p.getName());
            System.out.println("Patient's age: " + p.getAge());
            System.out.println();
        }
        patient.saveData();
    }

    public void viewDepartment() {
        Department dep = new Department();
        dep.loadData();
        if (dep.getDepList().isEmpty()) {
            System.out.println("No departments in the system to view.");
            return;
        }
        System.out.println("List of departments:");
        for (Department view : dep.getDepList()) {
            System.out.println("Department " + view.getDepName());
            System.out.println();
        }
        dep.saveData();
    }

    public boolean locatDoctor(int docID) {
        Doctor d = new Doctor();
        d.loadData();

        for (Doctor doc : d.getDocList()) {
            if (doc.getID() == docID) {
                return true;
            }
        }
        return false;
    }

    public boolean locatPatient(int patientID) {
        Patient pat = new Patient();
        pat.loadData();
        for (Patient p : pat.getPatList()) {
            if (patientID == p.getID()) {
                return true;
            }
        }
        return false;
    }

    public void editStaff(Doctor eDoc) {
        Doctor d = new Doctor();
        boolean found = false;

        d.loadData();

        for (Doctor detect : d.getDocList()) {
            if (detect.getID() == eDoc.getID()) {
                detect.setName(eDoc.getName());
                detect.setProffession(eDoc.getProffession());

                break;

            }
        }
        d.saveData();

    }

    public void editPatient(Patient newPinfo) {
        Patient patient = new Patient();
        patient.loadData();
        boolean foundP = false;
        for (Patient pat : patient.getPatList()) {
            if (pat.getID() == newPinfo.getID()) {
                foundP = true;
                pat.setName(newPinfo.getName());
                pat.setAge(newPinfo.getAge());
            }
        }
        if (!foundP) {
            System.out.println("Patient not found!");
        }
        patient.saveData();
    }

    public void editDepartment(Department oldDep, Department newDep) {
        Department dep = new Department();
        dep.loadData();
        boolean foundDep = false;

        for (Department edit : dep.getDepList()) {
            if (edit.getDepName().equalsIgnoreCase(oldDep.getDepName())) {
                foundDep = true;
                if (!edit.getDepName().equalsIgnoreCase(newDep.getDepName())) {
                    int index = dep.getDepList().indexOf(edit);
                    dep.getDepList().set(index, newDep);
                    System.out.println("Deparmtent edited successfully.");
                    break;
                } else {
                    System.out.println("Department already exists");
                    break;
                }
            }
        }
        if (!foundDep) {
            System.out.println("Department not found!");
        }
        dep.saveData();

    }

    public void searchStaff(int docID) {
        boolean found = false;
        Doctor doc = new Doctor();
        doc.loadData();

        for (Doctor search : doc.getDocList()) {
            if (search.getID() == docID) {

                System.out.println("ID: " + search.getID());
                System.out.println("Name: " + search.getName());
                System.out.println("Department: " + search.getProffession());
                found = true;
                break;
            }
        }
        if (!found) {

            System.out.println("Doctor not found");
        }
        doc.saveData();
    }

    public void searchPatient(int patientID) {
        Patient p = new Patient();
        p.loadData();
        boolean found = false;
        for (Patient pp : p.getPatList()) {
            if (pp.getID() == patientID) {
                System.out.println("Patient found.");
                System.out.println("Patient's ID: " + pp.getID());
                System.out.println("Patient's name: " + pp.getName());
                System.out.println("Patient's age: "+pp.getAge());
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Patient not found.");
        }

    }

    public void searchDepartment(Department department) {
        Department dep = new Department();
        dep.loadData();
        boolean found = false;
        for (Department search : dep.getDepList()) {
            if (search.getDepName().equalsIgnoreCase(department.getDepName())) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Department " + department.getDepName() + " found.");
        } else {
            System.out.println("Department not found in the system.");
        }

    }

    public boolean locatDepartment(String departmentName) {
        Department dep = new Department();
        dep.loadData();

        for (Department search : dep.getDepList()) {
            if (search.getDepName().equalsIgnoreCase(departmentName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean login(int ID, String Name) {

        try {
            ObjectInputStream adminfile = new ObjectInputStream(new FileInputStream("Admin's information.dat"));
            adminList = (ArrayList<Admin>) adminfile.readObject();
            for (Admin admin : adminList) {
                if (ID == admin.getID() && Name.equalsIgnoreCase(admin.getName())) {

                    return true;
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;

    }

}