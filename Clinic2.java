/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinic2;

import java.io.IOException;
import java.util.Scanner;

public class Clinic2 {

    public static void main(String[] args) throws IOException {      
//        Admin a = new Admin();
//        a.createAdminfile();
//        Doctor d = new Doctor();
//        d.createDoctorFile();
//        Department dep = new Department();
//        dep.createDepFile();
//        MedicalReport md = new MedicalReport();
//        md.createMedicalFile();
//        Patient p = new Patient();
//        p.createPatientFile();
//        Appointment ap=new Appointment();
//        ap.createFileAppointment();




        Scanner in = new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("1)Admin." + "\n" + "2)Doctor." + "\n" + "3)Patient.");
        int choice = in.nextInt();
        if (choice == 1) {

            System.out.println("Enter your ID:");
            int adID = in.nextInt();
            in.skip("\n");
            System.out.println("Enter your name:");
            String adName = in.nextLine();
            Admin admin = new Admin();

            boolean allowAdmin = admin.login(adID, adName);
            if (allowAdmin) {
                System.out.println("Access Granted! Welcome admin.");
                int x;

                do {
                    System.out.println();
                    System.out.println(
                            "1)Add Doctor.\n"
                            + "2)Add Patient.\n"
                            + "3)Add Department.\n"
                            + "\n"
                            + "4)Edit Doctor.\n"
                            + "5)Edit Patient.\n"
                            + "6)Edit Department.\n"
                            + "\n"
                            + "7)Remove Doctor.\n"
                            + "8)Remove Patient.\n"
                            + "9)Remove Department.\n"
                            + "\n"
                            + "10)Display list of Doctors.\n"
                            + "11)Display list of Patients.\n"
                            + "12)Display list of Departments.\n"
                            + "\n"
                            + "13)Search for a Doctor.\n"
                            + "14)Search for a Patient.\n"
                            + "15)Search for a Department.\n"
                            + "Type (0) to exit.");

                    x = in.nextInt();
                    if (x == 1) {
                        System.out.println("Enter Doctor's ID:");
                        int docID = in.nextInt();
                        in.skip("\n");
                        System.out.println("Enter Doctor's name:");
                        String docName = in.nextLine();
                        System.out.println("Enter the department:");
                        String depName = in.nextLine();
                        Doctor newDoc = new Doctor(docID, docName, depName);
                        admin.addStaff(newDoc);
                        admin.viewStaff();

                    } else if (x == 2) {
                        System.out.println("Enter patient's ID:");
                        int patID = in.nextInt();
                        in.skip("\n");
                        System.out.println("Enter patient's Name:");
                        String patName = in.nextLine();
                        System.out.println("Enter patient's Age:");
                        int patAge = in.nextInt();
                        Patient newPatient = new Patient(patID, patName, patAge);
                        admin.addPatient(newPatient);
                        admin.viewPatients();

                    } else if (x == 3) {
                        System.out.println("Enter Department name:");
                        in.skip("\n");
                        String depName = in.nextLine();
                        Department newDep = new Department(depName);
                        admin.addDepartment(newDep);
                        admin.viewDepartment();
                    } else if (x == 4) {
                        System.out.println("Enter Doctor's ID:");
                        int dID = in.nextInt();
                        boolean found = admin.locatDoctor(dID);
                        if (found) {
                            in.skip("\n");
                            System.out.println("Enter the new data:");
                            String newData1 = in.nextLine();
                            String newData2 = in.nextLine();
                            Doctor edit = new Doctor(dID, newData1, newData2);
                            admin.editStaff(edit);
                        } else {
                            System.out.println("Doctor not found in the system.");
                        }

                    } else if (x == 5) {
                        System.out.println("Enter the patient's ID; ");
                        int patID = in.nextInt();
                        boolean found = admin.locatPatient(patID);
                        if (found) {
                            System.out.println("Enter new name: ");
                            String newName = in.next();
                            System.out.println("Enter new Age: ");
                            int newAge = in.nextInt();
                            Patient edited = new Patient(patID, newName, newAge);
                            admin.editPatient(edited);
                        } else {
                            System.out.println("Patient not found.");
                        }

                    } else if (x == 6) {
                        admin.viewDepartment();
                        in.skip("\n");
                        System.out.println("Enter the old data:");
                        String oldDep = in.nextLine();
                        System.out.println("Enter the new data:");
                        String newDep = in.nextLine();
                        Department newDepp = new Department(newDep);
                        Department oldDepp = new Department(oldDep);
                        admin.editDepartment(oldDepp, newDepp);
                        System.out.println("After editing:");
                        admin.viewDepartment();

                    } else if (x == 7) {
                        System.out.println("Enter Doctors ID to remove:");
                        int docID = in.nextInt();
                        admin.removeStaff(docID);
                        admin.viewStaff();

                    } else if (x == 8) {
                        System.out.println("Enter patient's ID to remove:");
                        int patID = in.nextInt();
                        admin.removePatient(patID);
                        admin.viewPatients();
                    } else if (x == 9) {
                        in.skip("\n");
                        System.out.println("Enter the department name to remove:");
                        String remove = in.nextLine();
                        Department remDep = new Department(remove);
                        admin.removeDepartment(remDep);
                        admin.viewDepartment();

                    } else if (x == 10) {
                        admin.viewStaff();
                    } else if (x == 11) {
                        admin.viewPatients();
                    } else if (x == 12) {
                        admin.viewDepartment();

                    } else if (x == 13) {
                        System.out.println("Enter doctor's ID:");
                        int docID = in.nextInt();
                        admin.searchStaff(docID);

                    } else if (x == 14) {
                        System.out.println("Enter patient's ID: ");
                        int patientID = in.nextInt();
                        admin.searchPatient(patientID);
                    } else if (x == 15) {
                        in.skip("\n");
                        System.out.println("Enter department name:");
                        String depName = in.nextLine();
                        Department dep = new Department(depName);
                        admin.searchDepartment(dep);

                    }

                } while (x != 0);
            } else {
                System.out.println("Access Denied!");
            }

        } else if (choice == 2) {
            Doctor doctor=new Doctor();
            System.out.println("Enter your ID:");
            int docID = in.nextInt();
            in.skip("\n");
            System.out.println("Enter your name:");
            String docName = in.nextLine();
 
            doctor.loadData();
            boolean allowDoctor = doctor.login(docID, docName);

            if (allowDoctor) {
                System.out.println("Access Granted! Welcome dr." + docName);
                int y;
                do {
                    System.out.println("1)View Medical Report\n"
                            + "2)Write Medical Report\n"
                            + "3)Remove Medical Report\n"
                            + "4)View Schedule\n"
                            + "Type (0) to exit.");
                    y = in.nextInt();
                    if (y == 1) {
                        System.out.println("Enter patient ID:");
                        int patID = in.nextInt();
                        MedicalReport medicalReport = new MedicalReport();
                        medicalReport.loadData();
                        medicalReport.viewMedicalReport(patID);
                        medicalReport.saveData();
                    } else if (y == 2) {
                        System.out.println("Enter patient ID:");
                        int patID = in.nextInt();
                        Patient p = new Patient();
                        p.loadData();
                        Patient find = p.FindPatient(patID);
                        if (find != null) {
                            MedicalReport md = new MedicalReport();
                            md.loadData();
                            boolean found = md.findMedicalReport(patID);
                            if (!found) {
                                Patient patient = new Patient();
                                Patient data = patient.FindPatient(patID);
                                in.skip("\n");

                                System.out.println("Enter the diagnosis:");
                                String diagnosis = in.nextLine();
                                System.out.println("Enter the prescription:");
                                String prescription = in.nextLine();
                                MedicalReport newMed = new MedicalReport(data, diagnosis, prescription);
                                md.writeMedicalReport(newMed);
                                md.saveData();
                            } else if (found) {
                                System.out.println("Medical report already written in the system.");
                                md.viewMedicalReport(patID);
                            }
                        } else {
                            System.out.println("Patient not registered in the system.");
                        }

                    } else if (y == 3) {
                        MedicalReport md = new MedicalReport();
                        System.out.println("Enter patient ID to remove medical report:");
                        int patID = in.nextInt();
                        md.loadData();
                        md.removeMedicalReport(patID);
                        md.saveData();

                    } else if (y == 4) {
                        System.out.println("Your schedules:");
                        doctor.viewSchedule(docID);
                    }
                } while (y != 0);

            } else {
                System.out.println("Access Denied!");
            }
        } else if (choice == 3) {
            System.out.println("Enter your ID: ");
            int PID = in.nextInt();
            System.out.println("Enter your Name: ");
            String Pname = in.next();
            Patient pat = new Patient();
            boolean allowAccess = pat.login(PID, Pname);
            if (allowAccess) {
                System.out.println("Access Granted! Welcome " + Pname);
                int z;
                do {
                    System.out.println(
                            "1)Request appointment\n"
                            + "2)View medical record\n"
                            + "3)Appointment status\n"
                            + "Type (0) to exit");
                    z = in.nextInt();
                    if (z == 1) {
                        in.skip("\n");
                        System.out.println("Enter the doctor's name:");
                        String docname = in.nextLine();
                        System.out.println("Enter the department:");
                        String depname = in.nextLine();
                        Doctor doc = new Doctor();
                        Doctor doctor = doc.FindDoctor(docname, depname);
                        Patient patient = pat.FindPatient(PID);
                        if (doctor != null && patient != null) {
                            pat.requestAppointment(doctor, patient);
                            System.out.println("Your request has been submitted.");

                        } else {
                            System.out.println("Error happened while requesting the appointment!");
                        }

                    } else if (z == 2) {

                        MedicalReport mp = new MedicalReport();
                        mp.loadData();
                        mp.viewMedicalReport(PID);
                        mp.saveData();

                    } else if (z == 3) {
                        System.out.println("Your appointment status:");
                         boolean isAppointmentConfirmed = pat.appointmentStatus(PID);
                         if(isAppointmentConfirmed)
                         {
                          pat.Payment();
                         }
                        
                        
                       
                        
                    }
                } while (z != 0);

            } else {
                System.out.println("Access Denied!");
            }

        }
    }
}
