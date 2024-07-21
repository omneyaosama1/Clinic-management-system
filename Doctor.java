/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic2;

import java.io.*;
import java.util.*;

public class Doctor extends User implements Serializable {

    private String proffession;

    public Doctor() {
    }


    public Doctor(int ID, String name, String proffession) {
        super(ID, name);
        this.proffession = proffession;
    }

    public String getProffession() {
        return proffession;
    }

    public void setProffession(String proffession) {
        this.proffession = proffession;
    }

    public ArrayList<Doctor> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<Doctor> docList) {
        this.docList = docList;
    }

    public void createDoctorFile() {
        try {
            ObjectOutputStream docFile = new ObjectOutputStream(new FileOutputStream("Doctor's inforamtion.dat"));
            Doctor d1=new Doctor(1111,"ali","radiology");
            Doctor d2=new Doctor(2222,"ezz","dentistry");
            Doctor d3=new Doctor(3333,"omar","neurology");
            Doctor d4=new Doctor(4444,"mona","dermatology");
            Doctor d5=new Doctor(5555,"mai","dermatology");
            docList.add(d1);
            docList.add(d2);
            docList.add(d3);
            docList.add(d4);
            docList.add(d5);
            

            docFile.writeObject(docList);
            System.out.println("File created");

        } catch (IOException e) {
            System.out.println("Error creating the file");
        }
    }

    @Override
    public boolean login(int ID, String Name) {
        loadData();
        for (Doctor doctor : docList) {
            if (ID == doctor.getID() && Name.equalsIgnoreCase(doctor.getName())) {
                saveData();
                return true;
            }
        }
        System.out.println("Access denied!");

        return false;

    }

    public Doctor FindDoctor(String docName, String profession) {
        loadData();
        boolean exist = false;
        for (Doctor doc : docList) {
            if (doc.getName().equalsIgnoreCase(docName) && doc.getProffession().equalsIgnoreCase(profession)) {
                exist = true;
                return doc;

            }
        }
        return null;
    }

    public void loadData() {
        try (ObjectInputStream myfile = new ObjectInputStream(new FileInputStream("Doctor's inforamtion.dat"))) {
            docList = (ArrayList<Doctor>) myfile.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    public void saveData() {
        try (ObjectOutputStream myfile = new ObjectOutputStream(new FileOutputStream("Doctor's inforamtion.dat"))) {
            myfile.writeObject(docList);
        } catch (IOException e) {
            System.out.println("Error saving the data: " + e.getMessage());
        }
    }

    public void viewSchedule(int docID) {
        Scanner scanner = new Scanner(System.in);
        Appointment appointment = new Appointment();
        appointment.loadData();
        boolean check = false;

        Appointment toremove = null;

        for (Appointment locate : appointment.getAppointments()) {
            if (locate.getDoctor().getID() == docID) {
                System.out.println("Patient's name: " + locate.getPatient().getName());
                System.out.println("Patient's age: " + locate.getPatient().getAge());
                System.out.println("Date of the appointment: " + locate.getDate());
                System.out.println();
                check = true;
                System.out.println("Do you want to confirm this appointment? ");
                String reply = scanner.nextLine();
                if (reply.equalsIgnoreCase("yes")) {
                    System.out.println("Confirmed the appointment.");

                } else if (reply.equalsIgnoreCase("no")) {
                    toremove = locate;
                    System.out.println("Deleting...");

                } else {
                    System.out.println("Error!");
                }
                break;

            }
        }
        if (toremove != null) {
            appointment.getAppointments().remove(toremove);
            System.out.println("Cancelled the appointment.");
            appointment.saveData();
        }

        if (!check) {
            System.out.println("There are no appointments with this ID in the system.");
        }
    }

 
}