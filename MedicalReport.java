/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic2;
import java.io.*;
import java.util.*;

public class MedicalReport implements Serializable {

    protected ArrayList<MedicalReport> medList = new ArrayList<>();
    private Patient patient;
    private String diagnosis;
    private String prescription;

    public MedicalReport(Patient patient, String diagnosis, String prescription) {
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
    }
    public MedicalReport(){}

    public ArrayList<MedicalReport> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<MedicalReport> medList) {
        this.medList = medList;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }


    public void createMedicalFile() {
        try (ObjectOutputStream medFile = new ObjectOutputStream(new FileOutputStream("Medical report.dat"))) {
            medFile.writeObject(medList);
            System.out.println("File created.");
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    public void loadData() {
        try (ObjectInputStream medFile = new ObjectInputStream(new FileInputStream("Medical report.dat"))) {
            medList = (ArrayList<MedicalReport>) medFile.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    public void writeMedicalReport(MedicalReport writeMedical) {
        boolean found = false;
        for (MedicalReport md : medList) {
            if (md.getPatient().getID() == writeMedical.getPatient().getID()) {
                found = true;
                break;
            }
        }
        if (!found) {
            medList.add(writeMedical);
            System.out.println("Medical report written successfully");
        }
    }



    public void viewMedicalReport(int patID) {
        boolean found = false;

        for (MedicalReport md : medList) {
            if (md.getPatient().getID()== patID) {

                System.out.println("Patient's ID: " + md.getPatient().getID());
                System.out.println("Patient's Name: " + md.getPatient().getName());
                System.out.println("Patient's age: " + md.getPatient().getAge());
                System.out.println("Diagnosis: " + md.getDiagnosis());
                System.out.println("Prescription: " + md.getPrescription());
                System.out.println();
                    System.out.println();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Medical report not found!");
            }
        
    }

    public void removeMedicalReport(int patID) {
        boolean found=false;
        for(MedicalReport md:medList)
        {
            if(md.getPatient().getID()==patID)
            {
                int index=medList.indexOf(md);
                medList.remove(index);
                found=true;
                System.out.println("Medical report removed successfully");
                break;
            }
        }
        if(!found)
        {
            System.out.println("Medical report not found");
        }
    }
    
    public void saveData() {
        try (ObjectOutputStream myfile = new ObjectOutputStream(new FileOutputStream("Medical report.dat"))) {
            myfile.writeObject(medList);
        } catch (IOException e) {
            System.out.println("Error saving the data: " + e.getMessage());
        }
    }

    public boolean findMedicalReport(int patID) {
        for (MedicalReport m : medList) {
            if (m.getPatient().getID() == patID) {

                return true;
            }
        }
        return false;
    }
}