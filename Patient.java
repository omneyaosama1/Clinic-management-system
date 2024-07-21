/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic2;
import java.io.*;
import java.util.*;

public class Patient extends User implements Serializable {

    private int Age;

    public Patient() {

    }

    public Patient(int ID, String name, int Age) {
        super(ID, name);
        this.Age = Age;
    }

    public Patient(int ID, String name) {
        super(ID, name);
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public ArrayList<Patient> getPatList() {
        return patList;
    }

    public void setPatList(ArrayList<Patient> patList) {
        this.patList = patList;
    }

    public void createPatientFile() {
        try {
            ObjectOutputStream patFile = new ObjectOutputStream(new FileOutputStream("Patient's information.dat"));
            Patient p1=new Patient(1010,"omneya",20);
            Patient p2=new Patient(2020,"alaa",20);
            Patient p3=new Patient(3030,"maged",40);
            Patient p4=new Patient(4040,"sama",30);
            Patient p5=new Patient(5050,"marwan",25);
            patList.add(p1);
            patList.add(p2);
            patList.add(p3);
            patList.add(p4);
            patList.add(p5);
            patFile.writeObject(patList);
            System.out.println("File created");

        } catch (IOException e) {
            System.out.println("Error creating the file");
        }
    }

    public void Payment() {
        Scanner x = new Scanner(System.in);
        System.out.println("choose your bank: " + "\n" + "1-NBE" + "\n" + "2-Alexandria bank " + "\n" + "3-QNB");
        try {
            int b = x.nextInt();
            System.out.println("Paid Successfully!");
        } catch (InputMismatchException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void requestAppointment(Doctor doctor, Patient patient) {
        Appointment app = new Appointment();
        app.loadData();
        Date randDate = app.generateRandomDate();
        Appointment newAppointment = new Appointment(doctor, patient, randDate, 300);
        app.getAppointments().add(newAppointment);
        System.out.println("YOUR REQUESTED APPOINTMENT: ");
        System.out.println("Patient's ID: "+patient.getID());
        System.out.println("Patient's Name: "+patient.getName());
        System.out.println("Doctor's Name: "+doctor.getName());
        System.out.println("Profession: "+doctor.getProffession());
        System.out.println("Date: "+randDate);
        System.out.println("Price: "+300);
        app.saveData();
    }
    
    public void viewDocList()
    {
        Doctor doc=new Doctor();
        doc.loadData();
        System.out.println("THE LIST OF DOCTORS:");
        for(Doctor d:doc.getDocList())
        {
            System.out.println("Doctor: "+d.getName());
            System.out.println("Profession: "+d.getProffession());
        }
    }
    
    

public boolean appointmentStatus(int patID) {
    Appointment app = new Appointment();
    app.loadData();
    for (Appointment locate : app.getAppointments()) {
        if (locate.getPatient().getID() == patID) {
            System.out.println("Your appointment has been confirmed!");
            return true;
        }
    }

    System.out.println("Your appointment has been cancelled!");
    return false; 
}


    public Patient FindPatient(int patID) {
        loadData();
        boolean exist = false;
        for (Patient pat : patList) {
            if (pat.getID() == patID ) {
                exist = true;
                return pat;

            }
        }
        return null;
    }

    public void loadData() {
        try (ObjectInputStream myfile = new ObjectInputStream(new FileInputStream("Patient's information.dat"))) {
            patList = (ArrayList<Patient>) myfile.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    public void saveData() {
        try (ObjectOutputStream myfile = new ObjectOutputStream(new FileOutputStream("Patient's information.dat"))) {
            myfile.writeObject(patList);
        } catch (IOException e) {
            System.out.println("Error saving the data: " + e.getMessage());
        }
    }

    @Override
    public boolean login(int ID, String Name) {
        loadData();
        for (Patient patient : patList) {
            if (ID == patient.getID() && Name.equalsIgnoreCase(patient.getName())) {
                System.out.println("Welcome");
                saveData();
                return true;
            }
        }
        System.out.println("Access denied!");
        return false;
    }

}