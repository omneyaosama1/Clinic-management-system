/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgui;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Testgui extends Application
{
  Doctor d=new Doctor();
    Appointment appointment = new Appointment();
    private TextField patient_name;
    private TextField patient_age;
    private TextField datee;
    // Helper method to check if a string is a valid integer
                                    private boolean isInteger(String str) 
                                    {
                                        try 
                                        {
                                            Integer.parseInt(str);
                                            return true;
                                        } catch (NumberFormatException e)
                                        {
                                            return false;
                                        }
                                    }
  
    public static void main(String[] args) 
    {
//        
//              Admin a = new Admin();
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
        
//        Scanner in = new Scanner(System.in);
//        System.out.println("Choose:");
//        System.out.println("1)Admin." + "\n" + "2)Doctor." + "\n" + "3)Patient.");
//        int choice = in.nextInt();
//        if (choice == 1) {
//
//            System.out.println("Enter your ID:");
//            int adID = in.nextInt();
//            in.skip("\n");
//            System.out.println("Enter your name:");
//            String adName = in.nextLine();
//            Admin admin = new Admin();
//
//            boolean allowAdmin = admin.login(adID, adName);
//            if (allowAdmin) {
//                System.out.println("Access Granted! Welcome admin.");
//                int x;
//
//                do {
//                    System.out.println();
//                    System.out.println(
//                            "1)Add Doctor.\n"
//                            + "2)Add Patient.\n"
//                            + "3)Add Department.\n"
//                            + "\n"
//                            + "4)Edit Doctor.\n"
//                            + "5)Edit Patient.\n"
//                            + "6)Edit Department.\n"
//                            + "\n"
//                            + "7)Remove Doctor.\n"
//                            + "8)Remove Patient.\n"
//                            + "9)Remove Department.\n"
//                            + "\n"
//                            + "10)Display list of Doctors.\n"
//                            + "11)Display list of Patients.\n"
//                            + "12)Display list of Departments.\n"
//                            + "\n"
//                            + "13)Search for a Doctor.\n"
//                            + "14)Search for a Patient.\n"
//                            + "15)Search for a Department.\n"
//                            + "Type (0) to exit.");
//
//                    x = in.nextInt();
//                    if (x == 1) {
//                        System.out.println("Enter Doctor's ID:");
//                        int docID = in.nextInt();
//                        in.skip("\n");
//                        System.out.println("Enter Doctor's name:");
//                        String docName = in.nextLine();
//                        System.out.println("Enter the department:");
//                        String depName = in.nextLine();
//                        Doctor newDoc = new Doctor(docID, docName, depName);
//                        admin.addStaff(newDoc);
//                        admin.viewStaff();
//
//                    } else if (x == 2) {
//                        System.out.println("Enter patient's ID:");
//                        int patID = in.nextInt();
//                        in.skip("\n");
//                        System.out.println("Enter patient's Name:");
//                        String patName = in.nextLine();
//                        System.out.println("Enter patient's Age:");
//                        int patAge = in.nextInt();
//                        Patient newPatient = new Patient(patID, patName, patAge);
//                        admin.addPatient(newPatient);
//                        admin.viewPatients();
//
//                    } else if (x == 3) {
//                        System.out.println("Enter Department name:");
//                        in.skip("\n");
//                        String depName = in.nextLine();
//                        Department newDep = new Department(depName);
//                        admin.addDepartment(newDep);
//                        admin.viewDepartment();
//                    } else if (x == 4) {
//                        System.out.println("Enter Doctor's ID:");
//                        int dID = in.nextInt();
//                        boolean found = admin.locatDoctor(dID);
//                        if (found) {
//                            in.skip("\n");
//                            System.out.println("Enter the new data:");
//                            String newData1 = in.nextLine();
//                            String newData2 = in.nextLine();
//                            Doctor edit = new Doctor(dID, newData1, newData2);
//                            admin.editStaff(edit);
//                        } else {
//                            System.out.println("Doctor not found in the system.");
//                        }
//
//                    } else if (x == 5) {
//                        System.out.println("Enter the patient's ID; ");
//                        int patID = in.nextInt();
//                        boolean found = admin.locatPatient(patID);
//                        if (found) {
//                            System.out.println("Enter new name: ");
//                            String newName = in.next();
//                            System.out.println("Enter new Age: ");
//                            int newAge = in.nextInt();
//                            Patient edited = new Patient(patID, newName, newAge);
//                            admin.editPatient(edited);
//                        } else {
//                            System.out.println("Patient not found.");
//                        }
//
//                    } else if (x == 6) {
//                        admin.viewDepartment();
//                        in.skip("\n");
//                        System.out.println("Enter the old data:");
//                        String oldDep = in.nextLine();
//                        System.out.println("Enter the new data:");
//                        String newDep = in.nextLine();
//                        Department newDepp = new Department(newDep);
//                        Department oldDepp = new Department(oldDep);
//                        admin.editDepartment(oldDepp, newDepp);
//                        System.out.println("After editing:");
//                        admin.viewDepartment();
//
//                    } else if (x == 7) {
//                        System.out.println("Enter Doctors ID to remove:");
//                        int docID = in.nextInt();
//                        admin.removeStaff(docID);
//                        admin.viewStaff();
//
//                    } else if (x == 8) {
//                        System.out.println("Enter patient's ID to remove:");
//                        int patID = in.nextInt();
//                        admin.removePatient(patID);
//                        admin.viewPatients();
//                    } else if (x == 9) {
//                        in.skip("\n");
//                        System.out.println("Enter the department name to remove:");
//                        String remove = in.nextLine();
//                        Department remDep = new Department(remove);
//                        admin.removeDepartment(remDep);
//                        admin.viewDepartment();
//
//                    } else if (x == 10) {
//                        admin.viewStaff();
//                    } else if (x == 11) {
//                        admin.viewPatients();
//                    } else if (x == 12) {
//                        admin.viewDepartment();
//
//                    } else if (x == 13) {
//                        System.out.println("Enter doctor's ID:");
//                        int docID = in.nextInt();
//                        admin.searchStaff(docID);
//
//                    } else if (x == 14) {
//                        System.out.println("Enter patient's ID: ");
//                        int patientID = in.nextInt();
//                        admin.searchPatient(patientID);
//                    } else if (x == 15) {
//                        in.skip("\n");
//                        System.out.println("Enter department name:");
//                        String depName = in.nextLine();
//                        Department dep = new Department(depName);
//                        admin.searchDepartment(dep);
//
//                    }
//
//                } while (x != 0);
//            } else {
//                System.out.println("Access Denied!");
//            }
//
//        } 
//        else if (choice == 2) {
//            System.out.println("Enter your ID:");
//            int docID = in.nextInt();
//            in.skip("\n");
//            System.out.println("Enter your name:");
//            String docName = in.nextLine();
//            Doctor doctor = new Doctor(docID, docName);
//            doctor.loadData();
//            boolean allowDoctor = doctor.login(docID, docName);
//
//            if (allowDoctor) {
//                System.out.println("Access Granted! Welcome dr." + docName);
//                int y;
//                do {
//                    System.out.println("1)View Medical Report\n"
//                            + "2)Write Medical Report\n"
//                            + "3)Remove Medical Report\n"
//                            + "4)View Schedule\n"
//                            + "Type (0) to exit.");
//                    y = in.nextInt();
//                    if (y == 1) {
//                        System.out.println("Enter patient ID:");
//                        int patID = in.nextInt();
//                        MedicalReport medicalReport = new MedicalReport();
//                        medicalReport.loadData();
//                        medicalReport.viewMedicalReport(patID);
//                        medicalReport.saveData();
//                    } else if (y == 2) {
//                        System.out.println("Enter patient ID:");
//                        int patID = in.nextInt();
//                        MedicalReport md = new MedicalReport();
//                        md.loadData();
//                        boolean found = md.findMedicalReport(patID);
//                        if (!found) {
//                            in.skip("\n");
//                            System.out.println("Enter the patient name:");
//                            String patName = in.nextLine();
//                            System.out.println("Enter patient age:");
//                            int patAge = in.nextInt();
//                            in.skip("\n");
//                            System.out.println("Enter the diagnosis:");
//                            String diagnosis = in.nextLine();
//                            System.out.println("Enter the prescription:");
//                            String prescription = in.nextLine();
//                            MedicalReport newMed = new MedicalReport(patID, patName, patAge, diagnosis, prescription);
//                            md.writeMedicalReport(newMed);
//                            md.saveData();
//                        } else if (found) {
//                            System.out.println("Medical report already written in the system.");
//                            md.viewMedicalReport(patID);
//                        }
//
//                    } else if (y == 3) {
//                        MedicalReport md = new MedicalReport();
//                        System.out.println("Enter patient ID to remove medical report:");
//                        int patID = in.nextInt();
//                        md.loadData();
//                        md.removeMedicalReport(patID);
//                        md.saveData();
//
//                    } else if (y == 4) {
//                        System.out.println("Your schedules:");
//                        doctor.viewSchedule(docID);
//                    }
//                } while (y != 0);
//
//            } else {
//                System.out.println("Access Denied!");
//            }
//        }
//        else if (choice == 3) {
//            System.out.println("Enter your ID: ");
//            int PID = in.nextInt();
//            System.out.println("Enter your Name: ");
//            String Pname = in.next();
//            Patient pat = new Patient();
//            boolean allowAccess = pat.login(PID, Pname);
//            if (allowAccess) {
//                System.out.println("Access Granted! Welcome " + Pname);
//                int z;
//                do {
//                    System.out.println(
//                            "1)Request appointment\n"
//                            + "2)View medical record\n"
//                            + "3)Appointment status\n"
//                            + "Type (0) to exit");
//                    z = in.nextInt();
//                    if (z == 1) {
//                        in.skip("\n");
//                        System.out.println("Enter the doctor's name:");
//                        String docname = in.nextLine();
//                        System.out.println("Enter the department:");
//                        String depname = in.nextLine();
//                        Doctor doc = new Doctor();
//                        Doctor doctor = doc.FindDoctor(docname, depname);
//                        Patient patient = pat.FindPatient(PID, Pname);
//                        if (doctor != null && patient != null) {
//                            pat.requestAppointment(doctor, patient);
//                            System.out.println("Your request has been submitted.");
//                            
//                        } else {
//                            System.out.println("Error happened while requesting the appointment!");
//                        }
//
//                    } else if (z == 2) {
//
//                        MedicalReport mp = new MedicalReport();
//                        mp.loadData();
//                        mp.viewMedicalReport(PID);
//                        mp.saveData();
//
//                    } else if (z == 3) {
//                        System.out.println("Your appointment status:");
//                        pat.appointmentStatus(PID);
//                    }
//                } while (z != 0);
//
//            }
//
//        }
//
//    
//        
//        
   launch(args);
    
    

    }
    
    
    //---------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void start(Stage stageee) throws Exception
    {
        stageee.initStyle(StageStyle.UNDECORATED);
        ProgressBar progressBar = new ProgressBar();
        progressBar.setProgress(ProgressBar.INDETERMINATE_PROGRESS);

        StackPane root = new StackPane();
        root.getChildren().add(progressBar);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 450, 300);

        stageee.setTitle("CLINIC SYSTEM");
        stageee.setScene(scene);

        // Simulate some task that takes time (e.g., loading resources)
        Task<Void> loadingTask = createLoadingTask();
        new Thread(loadingTask).start();

        loadingTask.setOnSucceeded(e -> {
            // When the task is done, hide the loading animation
          
           
             //main page
             stageee.hide();
             Stage stage=new Stage();
        Label welcome =new Label("Welcome To The Clinic");
        welcome.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
        GridPane g=new GridPane();
        g.add(welcome, 0, 0);
       
        g.setAlignment(Pos.TOP_CENTER);
      
        Button loginasadmin=new Button("LOGIN AS ADMIN");
        loginasadmin.setPrefWidth(250);
        loginasadmin.setPrefHeight(30);
        Button loginasdoctor=new Button("LOGIN AS DOCTOR");
        loginasdoctor.setPrefWidth(250);
        loginasdoctor.setPrefHeight(30);
        Button loginaspatient=new Button("LOGIN AS PATIENT");
         loginaspatient.setPrefWidth(250);
        loginaspatient.setPrefHeight(30);
    
         VBox root11=new VBox(30);
     root11.setPadding(new Insets(50,80,0,300)); //elsize 7walen el stage

      VBox.setMargin(g, new Insets(0, 0, 60, 0));

        root11.setAlignment(Pos.TOP_CENTER);
        root11.getChildren().addAll(g, loginasadmin, loginasdoctor, loginaspatient);

      
          Scene s = new Scene(root11,600,500);
          
          
          
          
 //-----------------------------------------------------------------------------------------------------------------------------
//       ## LOGIN AS ADMIN ##   \\done
//----------------------------------------------------------------------------------------------------------------------------
          loginasadmin.setOnAction(e2->
          {
              stage.hide();
           Stage newStage = new Stage();
           
                Admin ad = new Admin();
                Label labelA = new Label("ID: ");
                labelA.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                TextField IDField = new TextField();
                Label labelA2 = new Label("Name: ");
                 labelA2.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                TextField nameField = new TextField();
                Button Login = new Button("LOGIN");
                Button back=new Button("Back");
                
                GridPane gp = new GridPane();
                gp.add(labelA, 0, 0);
                gp.add(IDField, 1, 0);
                gp.add(labelA2, 0, 1);
                gp.add(nameField, 1, 1);
                gp.add(Login, 1, 2);
                gp.add(back, 2, 2);
                gp.setVgap(20);
                gp.setHgap(10);
                gp.setAlignment(Pos.CENTER_LEFT);
                Insets in = new Insets(20,10,1,20);
                gp.setPadding(in);
                
                back.setOnAction(hh->{
                newStage.hide();
                stage.show();
                });

                //AFTER CLICKING BUTON LOGIN 
                Login.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent t) 
                    {
                        
                        try 
                        {
                            //CHANGE THE ID FROM STRING (FROM TEXTFIELD) TO INTEGER
                            int id = Integer.parseInt(IDField.getText());
                            boolean exist = ad.login(id, nameField.getText());
                            
                            //IF FOUND
                            if (exist == true)
                            {
                               Stage stage1=new Stage();
                                        stage1.show();
                                        stage.hide();
                                        newStage.hide();
                                        stage1.setTitle("Admin Page");

                                         // Create menu items
                                 MenuItem o1 = new MenuItem("ADD PATIENT");
                                 MenuItem o2 = new MenuItem("ADD DEPARTMENT");
                                 MenuItem o3 = new MenuItem("ADD STAFF");
                                 MenuItem o4 = new MenuItem("REMOVE PATIENT");
                                 MenuItem o5 = new MenuItem("REMOVE STAFF");
                                 MenuItem o6 = new MenuItem("REMOVE DEPARTMENT");
                                 MenuItem o7 = new MenuItem("SEARCH FOR PATIENT");
                                 MenuItem o8 = new MenuItem("SEARCH FOR DEPARTMENT");
                                 MenuItem o9 = new MenuItem("SEARCH FOR STAFF");
                                 MenuItem o10 = new MenuItem("EDIT PATIENT");
                                
                                 MenuItem o12 = new MenuItem("EDIT STAFF");
                                 MenuItem o13 = new MenuItem("VIEW PATIENT");
                                 MenuItem o14 = new MenuItem("VIEW DEPARTMENT");
                                 MenuItem o15 = new MenuItem("VIEW STAFF");
                                


                                 // Create a MenuButton and set the menu
                                 MenuButton menuButton = new MenuButton("PATIENT", null, o1, o4, o7,o10,o13);

                                  MenuButton menuButton1 = new MenuButton("DOCTOR", null, o3, o5, o9,o12,o15);

                                   MenuButton menuButton2 = new MenuButton("DEPARTMENT", null,o2, o6, o8,o14);

                                   // FIRST ---->> ADD PATIENT  //done
                                      o1.setOnAction(O1->
                                      {
                                          stage1.hide();
                                          Stage addpatient=new Stage();
                                          stage1.hide();
                                          Label patientN=new Label("Patient Name:");
                                           patientN.setStyle("-fx-font-size: 20;");
                                           TextField tname=new TextField();
                                           Label patientID=new Label("Patient ID:");
                                            patientID.setStyle("-fx-font-size: 20;");
                                            TextField tID=new TextField();
                                          Label patientAGE=new Label("Patient Age:");
                                           patientAGE.setStyle("-fx-font-size: 20;");
                                           TextField tage=new TextField();
                                           Button patientadd=new Button("ADD");
                                            Button backd=new Button("back");
                                           
                                             BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     patientadd.setBackground(background);
                                     patientadd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");    
                                     
                                           GridPane pane=new GridPane();
                                           pane.add(patientN, 0, 0);
                                           pane.add(tname, 1, 0);
                                           pane.add(patientID, 0, 1);
                                           pane.add(backd, 1, 3);
                                           pane.add(tID, 1, 1);
                                           pane.add(patientAGE, 0, 2);
                                             pane.add(tage, 1, 2);
                                           pane.add(patientadd, 0, 3);
                                           pane.setVgap(20);
                                           pane.setHgap(10);
                                          // pane.setAlignment(Pos.CENTER);
                                           Insets in1 = new Insets(30);
                                             pane.setPadding(in1);
                                             
                                             backd.setOnAction(a->{
                                             stage1.show();
                                             addpatient.hide();
                                             });
                                             
                                        // click on add patient button
                                             patientadd.setOnAction(addp->
                                             {
                                                  Admin a1 = new Admin();

                                                String patientname = tname.getText();
                                                int patientid;
                                                int patientage;
                                                try {
                                                    patientid = Integer.parseInt(tID.getText());
                                                    patientage = Integer.parseInt(tage.getText());
                                                } catch (NumberFormatException e) {
                                                    //showErrorAlert("Invalid input. Please enter numeric values for ID and Age.");
                                                    return;
                                                }

                                                Patient p1 = new Patient(patientid, patientname, patientage);


                                                if (a1.locatPatient(patientid)) 
                                                {
                                                    // Patient already exists
                                                    Alert ad1 = new Alert(Alert.AlertType.ERROR);
                                                    ad1.setTitle("ADD PATIENT");
                                                    ad1.setHeaderText("ERROR");
                                                    ad1.setContentText("Patient already exists.");
                                                    ad1.show();
                                                } else {
                                                    // Patient added successfully
                                                    a1.addPatient(p1);
                                                    Alert ad = new Alert(Alert.AlertType.INFORMATION);
                                                    ad.setTitle("ADD PATIENT");
                                                    ad.setHeaderText("DONE");
                                                    ad.setContentText("Patient added successfully.");
                                                    ad.show();
                                                }
                                              
                                             });
                                             
                                          
                                          Scene patient=new Scene(pane,500,300);
                                          addpatient.setScene(patient);
                                          addpatient.setTitle("ADD PATIENT");
                                          
                                           //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        pane.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                          
                                          addpatient.show();
                                      });
                                      
                      //------------------------------------------------------------------------------------------------------------       
                      
                      
                                    // SECOND --->>ADD DEPARTMENT  //done
                                   o2.setOnAction(O2->
                                   {
                                    stage1.hide();
                                       Stage departmentadd=new Stage();
//                                       stage1.hide();
                                       departmentadd.setTitle("ADD DEPARTMENT");
                                       
                                       Label dep=new Label(" Department Name ");
                                        dep.setStyle("-fx-font-size: 20;");
                                        TextField dept=new TextField();
                                        Button depb=new Button("ADD");
                                          Button backd=new Button("back");
                                        
                                        GridPane depg=new GridPane();
                                        depg.add(dep, 0, 0);
                                        depg.add(dept, 1, 0);
                                        depg.add(backd, 1, 3);
                                        depg.add(depb, 0, 3);
                                       depg.setVgap(40);
                                       depg.setHgap(20);
                                      // depg.setAlignment(Pos.CENTER);
                                       Insets inn = new Insets(30);
                                             depg.setPadding(inn);
                                             
                                              BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     depb.setBackground(background);
                                     depb.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");   
                                             
                                             backd.setOnAction(bb->{
                                             stage1.show();
                                             departmentadd.hide();
                                             });
                                             
                                             //click on add button
                                             depb.setOnAction(depB->
                                             {
                                              Admin a1=new Admin();
                                              String depname=dept.getText();
                                              Department d=new Department(depname);
                                              
                                              if(a1.locatDepartment(depname))
                                              {
                                                   Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                                                    errorAlert.setTitle("ADD DEPARTMENT");
                                                    errorAlert.setHeaderText("ERROR");
                                                    errorAlert.setContentText("Department already exists.");
                                                    errorAlert.show();
                                              }
                                              else
                                              {
                                                  a1.addDepartment(d);
                                                  Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                                                    successAlert.setTitle("ADD DEPARTMENT");
                                                    successAlert.setHeaderText("DONE");
                                                    successAlert.setContentText("Department added successfully.");
                                                    successAlert.show();
                                                  
                                              }
                                              
                                              
                                                 
                                             });
                                             
                                                       
                                   //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        depg.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                          
                                             
                                       
                                       Scene Adep=new Scene(depg,550,300);
                                       departmentadd.setScene(Adep);
                                       departmentadd.show();
                                   
                                   });
                                   
                     //----------------------------------------------------------------------------------------------------------
                     
                                   // THIRD --->>ADD STAFF   //done
                                   o3.setOnAction(O3->
                                   {
                                       stage1.hide();
                                   Stage staff=new Stage();
                                   staff.setTitle("ADD STAFF");
                                   Label doc=new Label("Enter Doctor's ID:");
                                    doc.setStyle("-fx-font-size: 20;");
                                   TextField docc=new TextField(); 
                                   Label doc1=new Label("Enter Doctor's Name:");
                                      doc1.setStyle("-fx-font-size: 20;");
                                      TextField docc1=new TextField(); 
                                   Label doc2=new Label("Enter Doctor's Department:");
                                    doc2.setStyle("-fx-font-size: 20;");
                                   TextField docc2=new TextField(); 
                                   Button docA=new Button("ADD");
                                   Button backd=new Button("back");
                                   
                                   BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     docA.setBackground(background);
                                     docA.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");    
                                     
                                   
                                   GridPane d=new GridPane();
                                   d.add(doc, 0, 0);
                                   d.add(docc, 1, 0);
                                   d.add(doc1, 0, 1);
                                   d.add(docc1, 1, 1);
                                   d.add(backd, 1, 4);
                                   d.add(doc2, 0, 2);
                                   d.add(docc2, 1, 2);
                                   d.add(docA, 0, 4);
                                   d.setVgap(15);
                                   d.setHgap(10);
                                  // d.setAlignment(Pos.CENTER);
                                   Insets ind = new Insets(20);
                                    d.setPadding(ind);
                                    
                                    backd.setOnAction(ddd->{
                                    stage1.show();
                                    staff.hide();
                                    });
                                   
                                    //click on add
                                    docA.setOnAction(doca->
                                    {
                                     Admin a=new Admin();
                                      String docname = docc1.getText();
                                      String depname= docc2.getText();
                                       int docID;
                                      
                                     try
                                     {
                                         docID = Integer.parseInt(docc.getText());
                                        
                                     } 
                                     catch (NumberFormatException e) 
                                            {
                                                   System.out.println("error");
                                              return;
                                         }
                                     Doctor d1=new Doctor(docID,docname,depname);
                                      
                                     if(a.locatDoctor(docID))
                                     {
                                         // DOCTOR already exists
                                                    Alert ad2 = new Alert(Alert.AlertType.ERROR);
                                                    ad2.setTitle("ADD DOCTOR");
                                                    ad2.setHeaderText("ERROR");
                                                    ad2.setContentText("DOCTOR already exists.");
                                                    ad2.show();
                                     }
                                     else
                                     {
                                        a.addStaff(d1);
                                         Alert ad2 = new Alert(Alert.AlertType.INFORMATION);
                                         ad2.setTitle("ADD DOCTOR");
                                        ad2.setHeaderText("DONE");
                                         ad2.setContentText("DOCTOR added successfully.");
                                         ad2.show();
                                        
                                     }
                                     
                                        
                                    });
                                   
                                    
                                                   //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        d.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                    
                                   
                                   Scene staff1=new Scene(d,600,300);
                                   staff.setScene(staff1);
                                   staff.show();
                                       
                                   });
                     //----------------------------------------------------------------------------------------------------------
                     
                                   // FORTH -->> remove patient //done
                                   o4.setOnAction(O4->
                                   {
                                       stage1.hide();
                                       Stage remp=new Stage();
                                       remp.setTitle("Remove patient");
                                       
                                        TextField remove = new TextField();
                                            Label patientid = new Label("Enter Patient ID:  ");
                                             patientid.setStyle("-fx-font-size: 20;");
                                            Button removep = new Button("Remove");
                                             Button backd=new Button("Back");
                                            GridPane root = new GridPane();
                                            root.add(patientid, 0, 0);
                                            root.add(remove, 1, 0);
                                            root.add(removep, 0, 3);
                                            root.add(backd, 1, 3);
                                           root.setVgap(30);
                                           root.setHgap(15);
                                           root.setAlignment(Pos.CENTER);
                                             Insets in2 = new Insets(20);
                                             root.setPadding(in2);
                                             
                                             BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     removep.setBackground(background);
                                     removep.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                             
                                             backd.setOnAction(re->{
                                             remp.hide();
                                             stage1.show();
                                             });
                                             
                                             Patient patient=new Patient();
                                             removep.setOnAction(rep -> {
                                            int patID = Integer.parseInt(remove.getText());
                                            Patient p2 = patient.FindPatient(patID);
                                            if (p2 != null) {
                                                boolean found = false;
                                                patient.loadData();
                                                for (Patient removee : patient.getPatList()) {
                                                    if (removee.getID() == patID) {
                                                        found = true;
                                                        break;
                                                    }
                                                }

                                                if (found) {
                                                    Alert confirmation = new Alert(Alert.AlertType.INFORMATION);
                                                    confirmation.setTitle(null);
                                                    confirmation.setHeaderText("Are you sure you want to delete this Patient?");
                                                    confirmation.setContentText(null);
                                                    ButtonType deleteType = new ButtonType("Delete");
                                                    ButtonType cancelType = ButtonType.CANCEL;
                                                    confirmation.getButtonTypes().setAll(deleteType, cancelType);
                                                    confirmation.showAndWait().ifPresent(action -> {
                                                        if (action == deleteType) {
                                                            patient.getPatList().removeIf(r -> r.getID() == patID);
                                                            patient.saveData();
                                                            Alert deleted = new Alert(Alert.AlertType.CONFIRMATION);
                                                            deleted.setTitle(null);
                                                            deleted.setHeaderText("Data removed successfully.");
                                                            deleted.setContentText(null);
                                                            deleted.show();
                                                        }
                                                    });
                                                } else {
                                                    Alert notFound = new Alert(Alert.AlertType.ERROR);
                                                    notFound.setTitle("Not Found");
                                                    notFound.setHeaderText("Patient not found");
                                                    notFound.setContentText("Patient ID not found in the system");
                                                    notFound.show();
                                                }
                                            } else {
                                                Alert notfound = new Alert(Alert.AlertType.ERROR);
                                                notfound.setHeaderText("Patient is not registered in the system.");
                                                notfound.show();
                                            }
                                        });
                                             
                                             //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        root.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                       
                                   Scene add=new Scene(root,450,270);
                                   remp.setScene(add);
                                       remp.show();
                                   });
                                   
                     //----------------------------------------------------------------------------------------------------------
                     
                                   //fifth -->>remove staff  //done
                                   o5.setOnAction(O5->
                                   {
                                       stage1.hide();
                                    Stage removedr=new Stage();
                                    removedr.setTitle("Remove Doctor");
                                    
                                    
                                     TextField remove = new TextField();
                                        Label drID = new Label("Enter Doctor ID:  ");
                                       drID.setStyle("-fx-font-size: 20;");
                                        
                                            Button removep = new Button("Remove");
                                             Button backd=new Button("Back");
                                            GridPane root = new GridPane();
                                            root.add(drID, 0, 0);
                                            
                                            root.add(remove, 1, 0);
                                            root.add(removep, 0, 3);
                                            root.add(backd, 1, 3);
                                           root.setVgap(30);
                                           root.setHgap(15);
                                            root.setAlignment(Pos.CENTER);
                                             Insets in2 = new Insets(10);
                                             root.setPadding(in2);
                                             
                                              BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     removep.setBackground(background);
                                     removep.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                             
                                             backd.setOnAction(re->{
                                             removedr.hide();
                                             stage1.show();
                                             });
                                             
                                             Doctor dd=new Doctor();
                                             
                                             removep.setOnAction(r->
                                             {
                                             
                                                 int drid1=Integer.parseInt(remove.getText());
                                                 boolean found=false;
                                               dd.loadData();
                                               for(Doctor rem:dd.getDocList())
                                               {
                                                    if(rem.getID()==drid1)
                                                    {
                                                    found=true;
                                                    break;
                                                    }
                                               }
                                               if(found)
                                               {
                                                  
                                                    Alert confirmation = new Alert(Alert.AlertType.INFORMATION);
                                                    confirmation.setTitle(null);
                                                    confirmation.setHeaderText("Are you sure you want to delete this Doctor?");
                                                    confirmation.setContentText(null);
                                                    ButtonType deleteType = new ButtonType("Delete");
                                                    ButtonType cancelType = ButtonType.CANCEL;
                                                    confirmation.getButtonTypes().setAll(deleteType, cancelType);
                                                    confirmation.showAndWait().ifPresent(action -> 
                                                    {
                                                        if (action == deleteType)
                                                        {
                                                         dd.getDocList().removeIf(r1->r1.getID()==drid1);
                                                            
                                                            dd.saveData();
                                                            Alert deleted = new Alert(Alert.AlertType.CONFIRMATION);
                                                            deleted.setTitle(null);
                                                            deleted.setHeaderText("Data removed successfully.");
                                                            deleted.setContentText(null);
                                                            deleted.show();
                                                        }
                                                    }); 
                                                    
                                               }
                                               else
                                               {
                                                Alert notfound = new Alert(Alert.AlertType.ERROR);
                                                notfound.setHeaderText("Patient is not registered in the system.");
                                                notfound.show();
                                               
                                               }
                                             
                                             });
                                    
                                             //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        root.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                    
                                    Scene removedr1=new Scene(root,450,270);
                                    removedr.setScene(removedr1);
                                    removedr.show();
                                       
                                   });
                                   
                     //----------------------------------------------------------------------------------------------------------               
                                   
                                   // sex -->>remove department  //done
                                   o6.setOnAction(O6->
                                   {
                                       stage1.hide();
                                     Stage remdep=new Stage();
                                     remdep.setTitle("Remove Department");
                                     
                                      TextField remove = new TextField();
                                        Label drID = new Label("Enter Department Name:  ");
                                       drID.setStyle("-fx-font-size: 20;");
                                        
                                            Button removep = new Button("Remove");
                                             Button backd=new Button("Back");
                                            GridPane root = new GridPane();
                                            root.add(drID, 0, 0);
                                            
                                            root.add(remove, 1, 0);
                                            root.add(removep, 0, 3);
                                            root.add(backd, 1, 3);
                                           root.setVgap(30);
                                           root.setHgap(15);
                                            root.setAlignment(Pos.CENTER);
                                             Insets in2 = new Insets(10);
                                             root.setPadding(in2);
                                             
                                              BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     removep.setBackground(background);
                                     removep.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                             
                                             backd.setOnAction(re->{
                                             remdep.hide();
                                             stage1.show();
                                             });
                                             
                                              Department depp = new Department();
                                             removep.setOnAction(dep->
                                             {
                                                depp.loadData();
                                                String remt=remove.getText();
                                                 boolean found = false;
                                                 for (Department rem : depp.getDepList())
                                                 {
                                                    if (rem.getDepName().equals(remt))
                                                    {
                                                            found = true;
                                                            break;
                                                 }
                                                 }
                                                 if(found)
                                                 {
                                                  Alert confirmation = new Alert(Alert.AlertType.INFORMATION);
                                                    confirmation.setTitle(null);
                                                    confirmation.setHeaderText("Are you sure you want to delete this Department?");
                                                    confirmation.setContentText(null);
                                                    ButtonType deleteType = new ButtonType("Delete");
                                                    ButtonType cancelType = ButtonType.CANCEL;
                                                    confirmation.getButtonTypes().setAll(deleteType, cancelType);
                                                    confirmation.showAndWait().ifPresent(action -> 
                                                    {
                                                        if (action == deleteType)
                                                        {
                                                        
                                                            depp.getDepList().removeIf(r2->r2.getDepName().equals(remt));
                                                            depp.saveData();
                                                            Alert deleted = new Alert(Alert.AlertType.CONFIRMATION);
                                                            deleted.setTitle(null);
                                                            deleted.setHeaderText("Department removed successfully.");
                                                            deleted.setContentText(null);
                                                            deleted.show();
                                                        }
                                                    }); 
                                                 
                                                 }
                                                 else
                                                 {
                                                  Alert notfound = new Alert(Alert.AlertType.ERROR);
                                                notfound.setHeaderText("Department is not registered in the system.");
                                                notfound.show();
                                                 }
                                             
                                             });
                                             
                                             //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        root.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                     
                                     
                                     Scene remdep1=new Scene(root,450,270);
                                     remdep.setScene(remdep1);
                                     remdep.show();
                                       
                                   });
                      
                     //----------------------------------------------------------------------------------------------------------          
                                   
                                   //seven -->> search for patient //done
                                   o7.setOnAction(O7->
                                   {
                                       stage1.hide();
                                     Stage search=new Stage();
                                     search.setTitle("Search Patient");
                                     
                                      TextField searchpatientf = new TextField();
                                      Label patientidlabel = new Label("Enter Patient's ID");
                                      patientidlabel.setStyle("-fx-font-size: 20;");
                                      Button searchparentbt = new Button("Search");
                                       Button backd=new Button("Back");
                                       GridPane searchh=new GridPane();
                                       
                                       BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     searchparentbt.setBackground(background);
                                     searchparentbt.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                       
                                       searchh.add(patientidlabel, 0, 0);
                                      searchh.add(searchpatientf, 1, 0);
                                       searchh.add(searchparentbt, 0, 3);
                                       searchh.add(backd, 1, 3);
                                      searchh.setVgap(30);
                                       searchh.setHgap(15);
                                       searchh.setAlignment(Pos.CENTER);
                                       Insets in2 = new Insets(10);
                                       searchh.setPadding(in2);
                                             
                                         Alert notfoundpatient = new Alert(Alert.AlertType.ERROR);
                                        notfoundpatient.setHeaderText(null);
                                        notfoundpatient.setContentText("Patient Not Found");
                                        Alert foundpatient = new Alert(Alert.AlertType.CONFIRMATION);
                                        foundpatient.setHeaderText("Patient Found");
                                        
                                        backd.setOnAction(k->
                                        {
                                        stage1.show();
                                        search.hide();
                                        });
                                        
                                        
                                           Admin admin = new Admin();
                                            Patient patient=new Patient();

                                            searchparentbt .setOnAction(e ->
                                            {
                                                String PatientIDText = searchpatientf.getText();

                                                if (isInteger(PatientIDText))
                                                {
                                                    int patientID = Integer.parseInt(PatientIDText);
                                                    boolean found = admin.locatPatient(patientID);
                                                    if (found) 
                                                    {
                                                        patient.loadData();
                                                       for (Patient searchpatient : patient.getPatList())
                                                       {
                                                           if(patientID==searchpatient.getID())
                                                           {
                                                           foundpatient.setContentText("Patient's ID: "+searchpatient.getID()+ "\nPatient's Name: "+searchpatient.getName()+"\nPatient's Age: "+searchpatient.getAge());

                                                           }

                                                       }
                                                        foundpatient.show();
                                                    } 
                                                    else 
                                                    {
                                                        notfoundpatient.setContentText("Patient with ID: "+patientID+" not found");

                                                           notfoundpatient.show();
                                                    }
                                                  searchpatientf.clear();

                                                }

                                                else 
                                                {
                                                    notfoundpatient.setContentText("Invalid ID");
                                                    notfoundpatient.show();
                                                }
                                            });
                                        
                                             //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        searchh.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                        
                                             
                                     
                                     Scene search1=new Scene(searchh,450,270);
                                     search.setScene(search1);
                                     search.show();
                                   });
                                   
                      //----------------------------------------------------------------------------------------------------------              
                                   
                                //eight --->> search department //done
                                   o8.setOnAction(O8->
                                   {
                                       stage1.hide();
                                             Stage primaryStage=new Stage();
                                            TextField searchDepartmenttf = new TextField();
                                            Label DepartmentNamelabel = new Label("Enter Department Name:");
                                             DepartmentNamelabel.setStyle("-fx-font-size: 17;");
                                            Button searchDepartmentbt = new Button("Search");
                                             Button backd=new Button("Back");
                                             BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     searchDepartmentbt.setBackground(background);
                                     searchDepartmentbt.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                            GridPane root = new GridPane();
                                            root.add(DepartmentNamelabel, 0, 0);
                                            root.add(searchDepartmenttf, 1, 0);
                                            root.add(searchDepartmentbt, 0, 3);
                                            root.add(backd, 1, 3);
                                           root.setVgap(30);
                                           root.setHgap(12);
                                            root.setAlignment(Pos.CENTER);
                                             Insets in2 = new Insets(10);
                                             root.setPadding(in2);
                                            Alert notfounddepartment = new Alert(Alert.AlertType.ERROR);
                                            notfounddepartment.setHeaderText(null);
                                            notfounddepartment.setContentText("Department Not Found");
                                            Alert foundd = new Alert(Alert.AlertType.CONFIRMATION);
                                            foundd.getButtonTypes().setAll(ButtonType.CLOSE);
                                            notfounddepartment.getButtonTypes().setAll(ButtonType.CLOSE);
                                            foundd.setHeaderText("Department Found");
                                           
                                            Admin admin = new Admin();
                                            Department dep = new Department();
                                            
                                             backd.setOnAction(dd->{
                                             stage1.show();
                                             primaryStage.hide();
                                             
                                             });

                                            searchDepartmentbt.setOnAction(e -> 
                                            {
                                                String depname=searchDepartmenttf.getText();
                                                 boolean found = admin.locatDepartment(depname);
                                                 
                                                  if (found) 
                                                {
                                                   for (Department search : dep.getDepList())
                                                   {
                                                      if(depname==search.getDepName())
                                                      {

                                                     foundd.setContentText( "\nDepartment: " + search.getDepName());

                                                      }
                                                   }
                                                    foundd.show();

                                                } 
                                                else 
                                                {
                                                    notfounddepartment.setContentText("Department "+depname+" not found");

                                                       notfounddepartment.show();
                                                }
                                                searchDepartmenttf.clear();
                                            
                                             });
                                                
                                             
                                             //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        root.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                             Scene scene = new Scene(root, 450, 270);
                                              primaryStage.setTitle("SEARCH FOR DOCTOR");
                                                primaryStage.setScene(scene);
                                                primaryStage.show();
                                   });
                                   
                                   
                         //--------------------------------------------------------------------------------------------------
                         
                                   //nine --->>serach for doctor //done
                                    o9.setOnAction(O9->
                                    {
                                        stage1.hide();
                                        Stage primaryStage1=new Stage();
                                      TextField searchdoctortf = new TextField();
                                        Label DoctorIDlabel = new Label("Enter Doctor's ID");
                                           DoctorIDlabel.setStyle("-fx-font-size: 17;");
                                        Button searchdoctorbt = new Button("Search");
                                        Button backd=new Button("Back");
                                        
                                          BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     searchdoctorbt.setBackground(background);
                                     searchdoctorbt.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                        
                                       GridPane root3 = new GridPane();
                                            root3.add(DoctorIDlabel, 0, 0);
                                            root3.add(searchdoctortf, 1, 0);
                                            root3.add(searchdoctorbt, 0, 3);
                                            root3.add(backd, 1, 3);
                                           root3.setVgap(20);
                                           root3.setHgap(17);
                                            root3.setAlignment(Pos.CENTER);
                                             Insets in3 = new Insets(10);
                                             root3.setPadding(in3);
                                        Alert notfound = new Alert(Alert.AlertType.ERROR);
                                        notfound.setHeaderText(null);
                                        notfound.setContentText("Doctor Not Found");
                                        Alert foundd = new Alert(Alert.AlertType.CONFIRMATION);
                                        foundd.getButtonTypes().setAll(ButtonType.CLOSE);
                                        foundd.setHeaderText("Doctor Found");
                                        
                                        backd.setOnAction(d->{
                                        primaryStage1.hide();
                                        stage1.show();
                                        });
                                        
                                        Admin admin = new Admin();
                                        Doctor doc = new Doctor();
                                        
                                        searchdoctorbt.setOnAction(e ->
                                        {
                                            String docIDText = searchdoctortf.getText();

                                            if (isInteger(docIDText))
                                            {
                                                int docID = Integer.parseInt(docIDText);
                                                boolean found = admin.locatDoctor(docID);
                                                if (found) 
                                                {
                                                   for (Doctor search : doc.getDocList())
                                                   {
                                                      if(docID==search.getID())
                                                      {

                                                     foundd.setContentText("Doctor's ID: " + search.getID() + "\nDoctor's Name: " + search.getName() + "\nDepartment: " + search.getProffession());

                                                      }
                                                   }
                                                    foundd.show();

                                                } 
                                                else 
                                                {
                                                    notfound.setContentText("Doctor with ID: "+docID+" not found");

                                                       notfound.show();
                                                }
                                                searchdoctortf.clear();

                                            }

                                            else 
                                            {
                                                notfound.setContentText("Invalid ID");
                                                notfound.show();
                                            }
                                        });
                                        
                                                //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        root3.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                            

                                        Scene scene = new Scene(root3, 450, 270);

                                        primaryStage1.setTitle("SEARCH FOR DOCTOR");
                                        primaryStage1.setScene(scene);
                                        primaryStage1.show();
                                  
                                   });
                                    
                     //------------------------------------------------------------------------------------------------
                                   
                                   // ten -->> edit patient //done
                                   o10.setOnAction(O10->
                                   {
                                     Stage edit=new Stage();
                                     stage1.hide();
                                     edit.setTitle("Edit Patient");
                                      
                                     Label e1=new Label("Enter Patient ID ");
                                      e1.setStyle("-fx-font-size: 17;");
                                     TextField e=new TextField();
                                     Button done=new Button("Done");
                                     Button backd=new Button("Back");
                                     
                                     backd.setOnAction(ll->{
                                     stage1.show();
                                     edit.hide();
                                     });
                                     
                                      BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     done.setBackground(background);
                                     done.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     
                                     GridPane ee=new GridPane();
                                     ee.add(e1, 0, 0);
                                     ee.add(e, 1, 0);
                                     ee.add(done,0,3);
                                     ee.add(backd, 1, 3);
                                    ee.setVgap(20);
                                    ee.setHgap(20);
                                     ee.setAlignment(Pos.CENTER);
                                     Insets in3 = new Insets(10);
                                      ee.setPadding(in3);
                                      
                                       Alert notfoundpatient = new Alert(Alert.AlertType.ERROR);
                                        notfoundpatient.setHeaderText(null);
                                        notfoundpatient.setContentText("Patient Not Found");
                                         Alert foundpatient = new Alert(Alert.AlertType.CONFIRMATION);
                                        foundpatient.setHeaderText("EDIT successfully");
                                      
                                      done.setOnAction(dd->
                                      {
                                        
                                           Admin admin = new Admin();
                                            Patient patient=new Patient();
                                            
                                        int patientID = Integer.parseInt(e.getText());
                                        
                                        boolean found = admin.locatPatient(patientID);
                                 if (found)      
                                    {
                                          edit.hide();
                                          Stage editp=new Stage();
                                          editp.setTitle("EDIT");
                                          
                                          Label idd=new Label(" ID: "+e.getText());
                                          idd.setStyle("-fx-font-size: 20;");
                                          Label name=new Label("Edit Name");
                                           name.setStyle("-fx-font-size: 17;");
                                          TextField name1=new TextField();
                                          Label age=new Label("Edit Age");
                                           age.setStyle("-fx-font-size: 17;");
                                          TextField age1=new TextField();
                                          Button editt=new Button("Edit");
                                          Button back1=new Button("Back");
                                          
                                          BackgroundFill backgroundFill1 = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background1 = new Background(backgroundFill1);
                                     editt.setBackground(background1);
                                     editt.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                          back1.setBackground(background1);
                                     back1.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                          
                                     GridPane edit1=new GridPane();
                                      edit1.add(idd, 0, 0);
                                     edit1.add(name, 0, 1);
                                     edit1.add(name1, 1, 1);
                                     edit1.add(age,0 , 2);
                                     edit1.add(back1, 1, 4);
                                     edit1.add(age1, 1, 2);
                                     edit1.add(editt,0,4);
                                    edit1.setVgap(20);
                                    edit1.setHgap(20);
                                    // edit1.setAlignment(Pos.CENTER);
                                     Insets in4 = new Insets(20);
                                      edit1.setPadding(in4);
                                      
                                      back1.setOnAction(ll->{
                                      editp.hide();
                                      edit.show();
                                      e.clear();
                                      });
                                      
                                      editt.setOnAction(l->
                                      {
                                          
                                        int agee = Integer.parseInt(age1.getText());
                                        Patient patientt = new Patient();
                                        patientt.loadData();
                                        boolean foundp = false;

                                        for (Patient pat : patientt.getPatList()) {
                                            if (pat.getID() == patientID) {
                                                pat.setName(name1.getText());
                                                pat.setAge(agee);
                                                foundp = true;
                                                break;
                                            }
                                        }

                                        if (foundp) 
                                        {
                                            patientt.saveData();
                                            foundpatient.setContentText("Patient ID: " + e.getText() + "\nPatient Name: " + name1.getText() + "\nPatient Age: " + agee);
                                            foundpatient.showAndWait();
                                            stage1.show();
                                            editp.hide();
                                        }
                                         else 
                                          {
                                            Alert notfoundpatient1 = new Alert(Alert.AlertType.ERROR);
                                            notfoundpatient1.setHeaderText(null);
                                            notfoundpatient1.setContentText("Failed to Edit");
                                            notfoundpatient1.show();
                                            }
                                      
                                      });
                                      
                                      //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        edit1.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                          
                                          
                                          Scene ed=new Scene(edit1,450,300);
                                          editp.setScene(ed);
                                      editp.show();
                                   }
                                        else
                                        {
                                        notfoundpatient.setContentText("Invalid ID");
                                                    notfoundpatient.show();
                                        }
                                      });
                                      
                                       //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        ee.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                      
                                     
                                     Scene edit1=new Scene(ee,450,300);
                                     edit.setScene(edit1);
                                     edit.show();
                                   });
                                   
                        //----------------------------------------------------------------------------------------------------------            
                                   
                                           
                                   
                                   //twelef -->> edit Staff //done
                                   o12.setOnAction(O12->
                                   {
                                       stage1.hide();
                                    Stage edits=new Stage();
                                    edits.setTitle("Edit Staff");
                                    
                                     Label e1=new Label("Enter Doctor ID ");
                                     e1.setStyle("-fx-font-size: 17;");
                                     TextField e=new TextField();
                                     Button done=new Button("Done");
                                     Button backd=new Button("Back");
                                     
                                     BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     done.setBackground(background);
                                     done.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd.setBackground(background);
                                     backd.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");

                                     
                                     GridPane ee=new GridPane();
                                     ee.add(e1, 0, 0);
                                     ee.add(e, 1, 0);
                                     ee.add(done,0,3);
                                     ee.add(backd, 1, 3);
                                    ee.setVgap(20);
                                    ee.setHgap(20);
                                     ee.setAlignment(Pos.CENTER);
                                     Insets in3 = new Insets(10);
                                      ee.setPadding(in3);
                                      
                                       Alert notfoundpatient = new Alert(Alert.AlertType.ERROR);
                                        notfoundpatient.setHeaderText(null);
                                        notfoundpatient.setContentText("Doctor Not Found");
                                         Alert foundpatient = new Alert(Alert.AlertType.CONFIRMATION);
                                        foundpatient.setHeaderText("EDIT successfully");
                                        
                                        backd.setOnAction(pp->{
                                        stage1.show();
                                        edits.hide();
                                        });
                                      
                                      done.setOnAction(dd->
                                      {
                                         
                                          Doctor doc=new Doctor();
                                          int ID = Integer.parseInt(e.getText());
                                          doc.loadData();
                                           boolean found = false;
                                           for(Doctor docc:doc.getDocList())
                                           {
                                              if(docc.getID()==ID) 
                                              {
                                                  found=true;
                                                  break;
                                              }
                                           }
                                           if(found)
                                           {
                                             edits.hide();
                                             Stage editt=new Stage();
                                             editt.setTitle("Edit");
                                             
                                              Label idd=new Label(" ID: "+e.getText());
                                              idd.setStyle("-fx-font-size: 20;");
                                          Label name=new Label("Edit Dr Name");
                                          name.setStyle("-fx-font-size: 17;");
                                          TextField name1=new TextField();
                                          Label age=new Label("Edit Department");
                                          age.setStyle("-fx-font-size: 17;");
                                          TextField age1=new TextField();
                                          Button edittb=new Button("Edit");
                                          Button backd1=new Button("Back");
                                           BackgroundFill backgroundFill0 = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background0 = new Background(backgroundFill0);
                                     edittb.setBackground(background0);
                                     edittb.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backd1.setBackground(background0);
                                     backd1.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");

                                          
                                          GridPane edit1=new GridPane();
                                      edit1.add(idd, 0, 0);
                                     edit1.add(name, 0, 1);
                                     edit1.add(name1, 1, 1);
                                     edit1.add(backd1, 1, 4);
                                     edit1.add(age,0 , 2);
                                     edit1.add(age1, 1, 2);
                                     edit1.add(edittb,0,4);
                                    edit1.setVgap(20);
                                    edit1.setHgap(20);
                                    // edit1.setAlignment(Pos.CENTER);
                                     Insets in4 = new Insets(20);
                                      edit1.setPadding(in4);
                                      
                                      backd1.setOnAction(w->{
                                      editt.hide();
                                      edits.show();
                                      e.clear();
                                      });
                                      
                                      edittb.setOnAction(edit->{
                                          
                                         Doctor doc1=new Doctor();
                                         
                                          doc1.loadData();
                                           boolean foundd = false;
                                           for(Doctor docc:doc1.getDocList())
                                           {
                                              if(docc.getID()==ID) 
                                              {
                                                  docc.setName(name1.getText());
                                                  docc.setProffession(age1.getText());
                                                  foundd=true;
                                                  break;
                                              }
                                           }
                                           if(foundd)
                                           {
                                               doc1.saveData();
                                                Alert founddoc = new Alert(Alert.AlertType.CONFIRMATION);
                                        founddoc.setHeaderText("EDIT successfully");
                                        founddoc.showAndWait();
                                        stage1.show();
                                        editt.hide();
                                           }
                                           else
                                           {
                                               Alert notfound = new Alert(Alert.AlertType.ERROR);
                                        notfound.setHeaderText(null);
                                        notfound.setContentText("Doctor Not Found");
                                        notfound.show();
                                           }
                                        
                                      
                                      
                                      });
                                      
                                      //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        edit1.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                             
                                             
                                             Scene editt1=new Scene(edit1,450,300);
                                             editt.setScene(editt1);
                                             editt.show();
                                               
                                           }
                                           else
                                           {
                                           notfoundpatient.setContentText("Invalid ID");
                                                    notfoundpatient.show();
                                           }
                                           
                                     
                                           
                                      
                                      });
                                    
                                      //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        ee.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                       
                                    Scene edits1=new Scene(ee,450,300);
                                    edits.setScene(edits1);
                                    edits.show();
                                   });
                                   
                         //----------------------------------------------------------------------------------------------------------
                         
                                   //thirteen -->>view patient
                                   o13.setOnAction(O13->
                                   {
                                       stage1.hide();
                                       Stage viewpat=new Stage();
                                       viewpat.setTitle("View Patient");
                                    Label view=new Label("View Patient");
                                    view.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                                    Button viewp=new Button("View");
                                     Button backv=new Button("back");
                                    TextArea text=new TextArea();
                                    
                                     BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     viewp.setBackground(background);
                                     viewp.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backv.setBackground(background);
                                     backv.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     
                                    GridPane g=new GridPane();
                                    g.add(view, 0, 0);
                                    g.add(viewp, 1, 0);
                                    g.add(backv, 1, 1);
                                    g.add(text, 0,3,3,2);
                                    //g.setAlignment(Pos.CENTER);
                                    g.setVgap(15);
                                    g.setHgap(20);
                                     Insets in3 = new Insets(15);
                                      g.setPadding(in3);
                                    Patient pat=new Patient();
                                    Admin ad=new Admin();
                                    
                                    backv.setOnAction(ba->{
                                    viewpat.hide();
                                    stage1.show();
                                        
                                    });
                                    
                                    viewp.setOnAction(v->
                                    {
                                    pat.loadData();
                                     for (Patient viewpat1:pat.getPatList())
                                     {
                                        
                                            text.appendText("Patient's ID: " +viewpat1.getID() + "\n");
                                            text.appendText("Patient's Name: " + viewpat1.getName() + "\n");
                                            text.appendText("Patient's Age: " + viewpat1.getAge() + "\n");
                                            text.appendText("-----------------------------------------"+"\n");
                                        }
                                      
                                    });
                                    
                                        //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        g.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                    
                                    Scene viewsc=new Scene(g,600,300);
                                    viewpat.setScene(viewsc);
                                       viewpat.show();
                                   });
                                   
                           //------------------------------------------------------------------------------------
                                
                                //fourteen-->>view department
                                   o14.setOnAction(O14->
                                   {
                                       stage1.hide();
                                   Stage dep=new Stage();
                                   dep.setTitle("View Department");
                                   Button edit=new Button("Edit");
                                   Label view=new Label("View Department");
                                    view.setStyle("-fx-font-size: 17; -fx-font-weight: bold;");
                                    Button viewp=new Button("View");
                                     Button backv=new Button("back");
                                    TextArea text=new TextArea();
                                    BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     viewp.setBackground(background);
                                     viewp.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backv.setBackground(background);
                                     backv.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     edit.setBackground(background);
                                     edit.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                    
                                    GridPane g1=new GridPane();
                                    g1.add(view, 0, 0);
                                    g1.add(viewp, 0, 1);
                                    g1.add(backv, 2, 1);
                                    g1.add(edit, 1, 1);
                                    g1.add(text, 0,3,3,2);
                                    //g1.setAlignment(Pos.CENTER);
                                    g1.setVgap(15);
                                    g1.setHgap(20);
                                     Insets in3 = new Insets(15);
                                      g1.setPadding(in3);
                                      
                                    // edit department
                                    edit.setOnAction(edi->
                                    {
                                        dep.hide();
                                     Stage editd=new Stage();
                                     editd.setTitle("Edit Department");
                                     Label dd=new Label("Enter Old Name");
                                     dd.setStyle("-fx-font-size: 15;");
                                     Label d=new Label("Enter New Name");
                                     d.setStyle("-fx-font-size: 15;");
                                     TextField d1=new TextField();
                                     TextField d2=new TextField();
                                     Button done=new Button("Done");
                                     
                                     BackgroundFill backgroundFill1 = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background1 = new Background(backgroundFill1);
                                     done.setBackground(background1);
                                     done.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     
                                     GridPane g2=new GridPane();
                                    g2.add(dd, 0, 0);
                                    g2.add(d1, 1, 0);
                                    g2.add(d, 0, 1);
                                    g2.add(d2, 1, 1);
                                    g2.add(done, 1, 3);
                                    g2.setVgap(20);
                                    g2.setHgap(15);
                                    // g2.setAlignment(Pos.CENTER);
                                     Insets in4 = new Insets(40);
                                      g2.setPadding(in4);
                                    
                                    done.setOnAction(don->{
                                        Department ddd=new Department();
                                        ddd.loadData();
                                        boolean foundd=false;
                                        for(Department d3:ddd.getDepList())
                                        {
                                            if(d3.getDepName().equalsIgnoreCase(d1.getText()))
                                            {
                                                d3.setDepName(d2.getText());
                                                foundd=true;
                                                break;
                                            }
                                        
                                        }
                                        if(foundd)
                                        {
                                        ddd.saveData();
                                         Alert foundpatient = new Alert(Alert.AlertType.CONFIRMATION);
                                        foundpatient.setHeaderText("EDIT successfully");
                                        foundpatient.showAndWait();
                                        dep.show();
                                        editd.hide();
                                        }
                                        else
                                        {
                                         Alert notfoundpatient = new Alert(Alert.AlertType.ERROR);
                                        notfoundpatient.setHeaderText(null);
                                        notfoundpatient.setContentText("Department Not Found");
                                        notfoundpatient.show();
                                        }
                                    
                                    });
                                    
                                     //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        g2.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                     
                                     Scene editd1=new Scene(g2,450,250);
                                    editd.setScene(editd1);
                                     editd.show();
                                    });
                                    
                                    backv.setOnAction(dd->{
                                    stage1.show();
                                    dep.hide();
                                    });
                                    
                                    viewp.setOnAction(vv->
                                    {
                                    Department d1=new Department();
                                   
                                    d1.loadData();
                                     for (Department d2:d1.getDepList())
                                     {
                                        
                                            text.appendText("Department Name:  " +d2.getDepName()+"\n");
                                          
//                                            text.appendText("-----------------------------------------"+"\n");
                                        }
                                    
                                    });
                                   
                                      
                                    //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        g1.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                   
                                   
                                   Scene dep1=new Scene(g1,400,300);
                                   dep.setScene(dep1);
                                   dep.show();
                                   });
                                   
                                   
                          //----------------------------------------------------------------------------------------------------------          
                                   //fifteen -->> view staff
                                   o15.setOnAction(O15->
                                   {
                                       stage1.hide();
                                   Stage dr=new Stage();
                                   dr.setTitle("View Dr");
                                   
                                     Label view=new Label("View Doctor");
                                    view.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                                    Button viewp=new Button("View");
                                     Button backv=new Button("back");
                                    TextArea text=new TextArea();
                                    
                                      BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     viewp.setBackground(background);
                                     viewp.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                     backv.setBackground(background);
                                     backv.setStyle("-fx-border-color: black;-fx-font-size: 12; -fx-border-width: 2;-fx-font-weight: bold;");
                                    
                                    GridPane g2=new GridPane();
                                    g2.add(view, 0, 0);
                                    g2.add(viewp, 2, 0);
                                    g2.add(backv, 2, 1);
                                    g2.add(text, 0,3,3,2);
                                   // g2.setAlignment(Pos.CENTER);
                                    g2.setVgap(15);
                                    g2.setHgap(20);
                                    Insets in3 = new Insets(15);
                                      g2.setPadding(in3);
                                    backv.setOnAction(aa->{
                                    stage1.show();
                                    dr.hide();
                                    });
                                   
                                    Doctor d=new Doctor();
                                    viewp.setOnAction(ee->
                                    {
                                     d.loadData();
                                     for(Doctor dd:d.getDocList())
                                     {
                                          text.appendText("Doctor ID: " +dd.getID() + "\n");
                                            text.appendText("Doctor Name: " + dd.getName() + "\n");
                                            text.appendText("Doctor's Department: " + dd.getProffession() + "\n");
                                            text.appendText("-----------------------------------------"+"\n");
                                         
                                     }
                                    
                                    
                                    });
                                       
                                     //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        g2.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                   
                                   Scene dr1=new Scene(g2,500,300);
                                   dr.setScene(dr1);
                                       dr.show();
                                   });
                                   
                              
                                   
                                   
                                   


                                 
                                 HBox root1 = new HBox(40, menuButton,menuButton1,menuButton2);
                                // root1.setAlignment(Pos.CENTER_LEFT);
                                 root1.setPadding(new Insets(40,10,10,40));
                              Label l1=new Label("WELCOME: "+nameField.getText());
                              l1.setStyle("-fx-font-size: 30; -fx-font-weight: bold;");
                              l1.setPadding(new Insets(10,10,10,10));
                              VBox x=new VBox(80,l1,root1);
                              x.setAlignment(Pos.TOP_LEFT);

                              Insets insets = new Insets(20);
                                root.setPadding(insets);
                              Button logout=new Button("LogOut");
                              VBox mainLayout = new VBox(120, x, logout);
                                mainLayout.setAlignment(Pos.TOP_CENTER);
                             
                             BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                                     Background background = new Background(backgroundFill);
                                     logout.setBackground(background);
                                     logout.setStyle("-fx-border-color: black;-fx-font-size: 15; -fx-border-width: 2;-fx-font-weight: bold;");
                                     
                                  logout.setOnAction(e1->{
                                  stage1.hide();
                                  stage.show();
                                  });

                             

                                       Scene s1=new Scene(mainLayout,600,400);
                                           stage1.setScene(s1);
                                     stage1.centerOnScreen();


                                   //set photo
                                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

                                        // Create an ImageView for the background image
                                        ImageView backgroundImageView = new ImageView(backgroundImage);



                                        // Set the background 
                                        mainLayout.setBackground(new Background(new BackgroundImage(
                                                backgroundImage,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundRepeat.NO_REPEAT,
                                                BackgroundPosition.DEFAULT,
                                                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                                        )));
                                
                            } 
                            
                            // NOT FOUND
                            else
                            {
                                Alert warning = new Alert(Alert.AlertType.WARNING);
                                warning.setHeaderText(null);
                                warning.setTitle("INVALID DATA");
                                warning.setContentText("ACCESS DENIED");
                                warning.show();
                                IDField.clear();
                                nameField.clear();
                                

                            }
                        } 
                        
                        catch (NumberFormatException e) {
                            System.out.println("Invalid ID. Please enter a valid integer.");
                        }
                    }
                     
                });
                
                 //set photo
        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM.jpeg");

        // Create an ImageView for the background image
        ImageView backgroundImageView = new ImageView(backgroundImage);

       

        // Set the background 
        gp.setBackground(new Background(new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
        )));
                
        BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
     Background background = new Background(backgroundFill);
        Login.setBackground(background);
         Login.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 10; -fx-font-weight: bold;");
         back.setBackground(background);
      back.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 10; -fx-font-weight: bold;");
        
                Scene newScene = new Scene(gp, 450, 300);
                newStage.setScene(newScene);
                newStage.setTitle("ADMIN LOGIN");
                newStage.show();
            
          });
//--------------------------------------------------------------------------------------------------------------------------------------


    
  //------------------------------------------------------------------------------------------------------------------------------------   
  
        // ### LOGIN AS DOCTOR ###    //done

//--------------------------------------------------------------------------------------------------------------------------------------

  loginasdoctor.setOnAction(e3->
  {
   Stage stage1 = new Stage();
   stage.hide();
            Doctor doc = new Doctor();
            Label lbl1 = new Label("Enter your ID: ");
             lbl1.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
            Label lbl2 = new Label("Enter your Name: ");
             lbl2.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
            TextField idTF = new TextField();
            TextField nameTF = new TextField();
            Button loginButton = new Button("LOGIN");
            Button back4=new Button("Back");
            
             BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
     Background background = new Background(backgroundFill);
        loginButton.setBackground(background);
         loginButton.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 10; -fx-font-weight: bold;");
         back4.setBackground(background);
          back4.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 10; -fx-font-weight: bold;");

            
            GridPane root1 = new GridPane();
            root1.add(lbl1, 0, 0);
            root1.add(lbl2, 0, 1);
            root1.add(idTF, 1, 0);
            root1.add(nameTF, 1, 1);
            root1.add(back4, 1, 3);
            root1.add(loginButton, 0, 3);
            root1.setVgap(20);
            root1.setHgap(10);
            root1.setAlignment(Pos.CENTER);
            Insets space = new Insets(20);
            root.setPadding(space);
            
            back4.setOnAction(cc->{
            stage.show();
            stage1.hide();
                
            });
            
            
            loginButton.setOnAction(actionEvent2 -> 
            {
              
                int docID = Integer.parseInt(idTF.getText());
                boolean accessDoc = doc.login(docID, nameTF.getText());
                if (accessDoc)
                {
                    stage1.hide();
                    Stage drpage=new Stage();
                    drpage.setTitle("DOCTOR PAGE");
                    
                       MedicalReport medical = new MedicalReport();
                Patient patient = new Patient();
                
                Label drname=new Label("Welcome Dr. "+nameTF.getText());
                 drname.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");

               
                Button viewMedical = new Button("View medical report");
                Button removeMedical = new Button("Remove medical report");
                Button writeMedical = new Button("Write medical report");
                Button viewScheduele=new Button("View Scheduele");
                 Button logoutdr = new Button("LogOut");
                 
                    BackgroundFill backgroundFill1 = new BackgroundFill(Color.TRANSPARENT, null, null);
        Background background1 = new Background(backgroundFill1);
        viewMedical.setBackground(background1);
         viewMedical.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 12; -fx-font-weight: bold;");
        removeMedical.setBackground(background1);
         removeMedical.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 12; -fx-font-weight: bold;");
        writeMedical.setBackground(background1);
         writeMedical.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 12; -fx-font-weight: bold;");
        viewScheduele.setBackground(background1);
         viewScheduele.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 12; -fx-font-weight: bold;");
    logoutdr.setBackground(background1);
         logoutdr.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 12; -fx-font-weight: bold;");

        
                 
              GridPane neww=new GridPane();    
                neww.add( viewScheduele , 0, 1);
               neww.add(removeMedical, 0, 2);
                 neww.add(writeMedical, 0, 3);
                 neww.add(viewMedical, 0, 4);
                 neww.add(logoutdr, 0, 5);
                 neww.setVgap(20);
                 Insets in = new Insets(20,10,1,20);
                   neww.setPadding(in);
                 
                  VBox vv=new VBox();
         vv.getChildren().addAll(drname,neww);
         Insets in1= new Insets(20);
              vv.setPadding(in1);
    
                
                logoutdr.setOnAction(o->{
                stage.show();
                drpage.hide();
                });
                
                //view scheduele button    //done
                viewScheduele.setOnAction(sc->
                {
  
                          drpage.hide();
                         Stage stage3 = new Stage();
                            int DOCID = Integer.parseInt(idTF.getText());
                            Appointment appointment = new Appointment();
                            appointment.loadData();
                            Label enter =new Label("Enter Patient ID ");
                            enter.setStyle(" -fx-font-size: 15; -fx-font-weight: bold;");
                            TextArea schedule = new TextArea();
                            schedule.setPadding(new Insets(40));
                            TextField EnterPatID = new TextField();
                            Button confirm = new Button("CONFIRM");
                            Button cancel = new Button("CANCEL");
                            Button back =new Button("Back");
                            
                            BackgroundFill backgroundFil = new BackgroundFill(Color.TRANSPARENT, null, null);
        Background background2 = new Background(backgroundFil);
        confirm.setBackground(background2);
         confirm.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 10; -fx-font-weight: bold;");
        cancel.setBackground(background2);
         cancel.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 10; -fx-font-weight: bold;");
        back.setBackground(background2);
         back.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
                            
                            GridPane grid = new GridPane();
                            
                            grid.add(schedule, 0, 4, 2, 4);
                            grid.add(enter, 0, 0);
                            grid.add(EnterPatID, 1, 0);
                            grid.add(confirm, 0, 1);
                            grid.add(cancel, 1, 1);
                            grid.add(back, 1, 10);
                            grid.setVgap(15);
                            grid.setHgap(5);
                            grid.setPadding(new Insets(10));
                          //  grid.setAlignment(Pos.CENTER);
                            
                            back.setOnAction(bb->{
                            stage3.hide();
                            drpage.show();
                            });
                            
                            for (Appointment app : appointment.getAppointments()) 
                            {
                                if(app.getDoctor().getID()==DOCID)
                                     {
                                schedule.appendText("Patient's ID: " + app.getPatient().getID() + "\n");
                                schedule.appendText("Patient's name: " + app.getPatient().getName() + "\n");
                                schedule.appendText("Patient's Age: " + app.getPatient().getAge() + "\n");
                                schedule.appendText("Date: " + app.getDate() + "\n");
                                schedule.appendText(" \n");
                                }
                            }

                            confirm.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent t) {
                                    Alert message = new Alert(Alert.AlertType.INFORMATION);
                                    message.setHeaderText(null);
                                    message.setContentText("THE APPOINTMENT CONFIRMED SUCCESSFULLY.");
                                    message.show();
                                }
                            });

                            cancel.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent t) {
                                    Alert confirmation = new Alert(Alert.AlertType.CONFIRMATION);
                                    confirmation.setHeaderText(null);
                                    confirmation.setContentText("ARE YOU SURE?");
                                    confirmation.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
                                    Optional<ButtonType> button = confirmation.showAndWait();
                                    if (button.get() == ButtonType.YES) {
                                        int intPatID = Integer.parseInt(EnterPatID.getText());
                                        appointment.loadData();
                                        Iterator<Appointment> iterator = appointment.getAppointments().iterator();

                                        while (iterator.hasNext()) {
                                            Appointment app = iterator.next();
                                            if (app.getPatient().getID() == intPatID) {
                                                iterator.remove();
                                                break;
                                            }
                                        }
                                        appointment.saveData();
                                        Alert message2 = new Alert(Alert.AlertType.INFORMATION);
                                        message2.setHeaderText(null);
                                        message2.setContentText("APPOINTMENT CANCELED.");
                                        message2.show();;
                                    }

                                    confirmation.show();

                                }
                            });
                            
                             Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM (1).jpeg");

            // Create an ImageView for the background image
            ImageView backgroundImageView = new ImageView(backgroundImage);



            // Set the background 
            grid.setBackground(new Background(new BackgroundImage(
                    backgroundImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
            )));


                            Scene scene3 = new Scene(grid, 600, 400);
                            stage3.setTitle("VIEWING SCHEDULE");

                            stage3.setScene(scene3);
                            stage3.show();

             
                });
                

                // view medical button  //done
                viewMedical.setOnAction(actionEvent3 ->
                {
            Stage medicalStage1 = new Stage();
            drpage.hide();
            medical.loadData();
            Label label1 = new Label("Enter ID: ");
             label1.setStyle("-fx-font-size: 15; -fx-font-weight: bold;");
            TextField id1 = new TextField();
            Button viewButton = new Button("View");
            Button back=new Button("Back");
            TextArea result = new TextArea();
            
            BackgroundFill backgroundFill2 = new BackgroundFill(Color.TRANSPARENT, null, null);
        Background background12 = new Background(backgroundFill2);
        viewButton.setBackground(background12);
         viewButton.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 12; -fx-font-weight: bold;");
        back.setBackground(background12);
         back.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 12; -fx-font-weight: bold;");

            GridPane layout = new GridPane();
            layout.add(label1, 0, 0);
            layout.add(id1, 1, 0);
            layout.add(back, 1, 9);
            layout.add(viewButton, 1, 1);
            layout.add(result, 0, 4, 2, 4);
            layout.setVgap(10);
            layout.setHgap(10);
           // layout.setAlignment(Pos.CENTER);
            Insets spacee = new Insets(10);
            layout.setPadding(space);
            
            back.setOnAction(backk->
            {
            drpage.show();
            medicalStage1.hide();
                
            });

            viewButton.setOnAction(actionEvent4 -> 
            {

                int patID1 = Integer.parseInt(id1.getText());
                Patient p1 = patient.FindPatient(patID1);
                if (p1 != null) {
                    boolean found = false;
                    try {
                        for (MedicalReport view : medical.getMedList())
                        {
                            if (view.getPatient().getID() == patID1) {
                                result.appendText("Patient's ID: " + view.getPatient().getID() + "\n");
                                result.appendText("Patient's Name: " + view.getPatient().getName() + "\n");
                                result.appendText("Patient's Age: " + view.getPatient().getAge() + "\n");
                                result.appendText("Diagnosis: " + view.getDiagnosis() + "\n");
                                result.appendText("Prescription: " + view.getPrescription() + "\n");
                                result.appendText("--------------------------------\n");
                                found = true;
                                break;

                            }
                        }
                        if (!found) {
                            result.setText("Medical report not found.");
                        }
                    } catch (NumberFormatException e1) {
                        result.setText("Invalid input. Please enter a valid number for Patient ID.");
                    }
                } else {
                    Alert notfound = new Alert(Alert.AlertType.ERROR);
                    notfound.setHeaderText("Patient is not registered in the system.");
                    notfound.showAndWait();
                }
       

            });
            
             Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM (1).jpeg");

            // Create an ImageView for the background image
            ImageView backgroundImageView = new ImageView(backgroundImage);



            // Set the background 
            layout.setBackground(new Background(new BackgroundImage(
                    backgroundImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
            )));

            
            Scene scene4 = new Scene(layout, 600, 400);
            medicalStage1.setScene(scene4);
            medicalStage1.setTitle("View medical report");
            medicalStage1.show();

        });

                //remove medical     //done
                
        removeMedical.setOnAction(actionEvent5 -> 
        {
            drpage.hide();
            Stage medicalStage2 = new Stage();
            Label label2 = new Label("Enter ID:");
            label2.setStyle("-fx-font-size: 17; -fx-font-weight: bold;");
            TextField id2 = new TextField();
            Button removeButton = new Button("Delete");
            Button back=new Button("Back");

             BackgroundFill backgroundFil = new BackgroundFill(Color.TRANSPARENT, null, null);
        Background background2 = new Background(backgroundFil);
        back.setBackground(background2);
         back.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 10; -fx-font-weight: bold;");
        removeButton.setBackground(background2);
         removeButton.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 10; -fx-font-weight: bold;");
            
            GridPane layout = new GridPane();
            layout.add(label2, 0, 0);
            layout.add(back, 1,8);
            layout.add(id2, 1, 0);
            layout.add(removeButton, 0, 8);

            layout.setVgap(10);
            layout.setHgap(10);
            layout.setAlignment(Pos.CENTER_LEFT);
            Insets spacee = new Insets(20);
            layout.setPadding(space);
            
            back.setOnAction(b->{
            
                drpage.show();
                medicalStage2.hide();
            });
            
            removeButton.setOnAction(actionEvent6 -> 
            {

                int patID = Integer.parseInt(id2.getText());
                Patient p2 = patient.FindPatient(patID);
                if (p2 != null) {
                    boolean found = false;
                    medical.loadData();
                    for (MedicalReport remove : medical.getMedList()) {
                        if (remove.getPatient().getID() == patID) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        Alert confirmation = new Alert(Alert.AlertType.INFORMATION);
                        confirmation.setTitle(null);
                        confirmation.setHeaderText("Are you sure you want to delete this data?");
                        confirmation.setContentText(null);
                        ButtonType deleteType = new ButtonType("Delete");
                        ButtonType cancelType = ButtonType.CANCEL;
                        confirmation.getButtonTypes().setAll(deleteType, cancelType);
                        confirmation.showAndWait().ifPresent(action -> {
                            if (action == deleteType) {
                                medical.getMedList().removeIf(r -> r.getPatient().getID() == patID);
                                medical.saveData();
                                Alert deleted = new Alert(Alert.AlertType.CONFIRMATION);
                                deleted.setTitle(null);
                                deleted.setHeaderText("Data removed successsfully.");
                                deleted.setContentText(null);
                                deleted.show();

                            }

                        });

                    } else if (!found) {
                        Alert notFound = new Alert(Alert.AlertType.WARNING);
                        notFound.setTitle("Not Found");
                        notFound.setHeaderText("Medical report not found");
                        notFound.setContentText("The medical report for the specified ID was not found.");
                        notFound.showAndWait();

                    }
                } else {
                    Alert notfound = new Alert(Alert.AlertType.ERROR);
                    notfound.setHeaderText("Patient is not registered in the system.");
                    notfound.showAndWait();
                }

            });
            
             Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM (1).jpeg");

            // Create an ImageView for the background image
            ImageView backgroundImageView = new ImageView(backgroundImage);



            // Set the background 
            layout.setBackground(new Background(new BackgroundImage(
                    backgroundImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
            )));
            
            Scene scene5 = new Scene(layout, 400, 270);
            medicalStage2.setScene(scene5);
            medicalStage2.setTitle("Remove medical report");
            medicalStage2.show();

        });

        //write medical //done
        
        writeMedical.setOnAction(actionEvent7 ->
        {
            Stage medicalStage3 = new Stage();
            drpage.hide();
            medical.loadData();

            Label label3 = new Label("Enter ID:");
             label3.setStyle("-fx-font-size: 17; -fx-font-weight: bold;");
            TextField id3 = new TextField();
            Button writeButton = new Button("Write");
            Button back=new Button("Back");
            
              BackgroundFill backgroundFil = new BackgroundFill(Color.TRANSPARENT, null, null);
        Background background2 = new Background(backgroundFil);
        back.setBackground(background2);
         back.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 13; -fx-font-weight: bold;");
        writeButton.setBackground(background2);
         writeButton.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 13; -fx-font-weight: bold;");

            GridPane layout = new GridPane();
            layout.add(label3, 0, 0);
            layout.add(id3, 1, 0);
            layout.add(writeButton, 0, 5);
            layout.add(back, 1, 5);
            layout.setHgap(10);
            layout.setVgap(15);
            layout.setAlignment(Pos.CENTER_LEFT);
            Insets spacee = new Insets(10);
            layout.setPadding(space);

            back.setOnAction(bb->{
            drpage.show();
            medicalStage3.hide();
            });
            
            writeButton.setOnAction(actionEvent8 -> 
            {
                int patID3 = Integer.parseInt(id3.getText());
                Patient p3 = patient.FindPatient(patID3);
                if (p3 != null) {
                    boolean found = medical.findMedicalReport(patID3);
                    if (!found) {
                        medicalStage3.hide();
                        Stage writingStage = new Stage();
                        Label label4 = new Label("Enter the diagnosis: ");
                         label4.setStyle("-fx-font-size: 17; -fx-font-weight: bold;");
                        Label label5 = new Label("Enter the prescription: ");
                         label5.setStyle("-fx-font-size: 17; -fx-font-weight: bold;");
                        TextField diagnosis = new TextField();
                        TextField prescription = new TextField();
                        Button saveButton = new Button("Save");
                         Button backButton = new Button("back");

                           BackgroundFill backgroundFill4 = new BackgroundFill(Color.TRANSPARENT, null, null);
        Background background3 = new Background(backgroundFill4);
        saveButton.setBackground(background3);
         saveButton.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 13; -fx-font-weight: bold;");
        backButton.setBackground(background3);
         backButton.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 13; -fx-font-weight: bold;");
                         
                        GridPane frame = new GridPane();
                        frame.add(label4, 0, 0);
                        frame.add(diagnosis, 1, 0);
                        frame.add(backButton, 1, 2);
                        frame.add(label5, 0, 1);
                        frame.add(prescription, 1, 1);
                        frame.add(saveButton, 0, 2);
                        frame.setVgap(15);
                        frame.setHgap(10);
                        frame.setPadding(space);
                        frame.setAlignment(Pos.CENTER_LEFT);
                        
                        backButton.setOnAction(b->{
                        medicalStage3.show();
                        writingStage.hide();
                        });

                        saveButton.setOnAction(actionEvent9 -> {
                            String symptoms = diagnosis.getText();
                            String medication = prescription.getText();
                            MedicalReport newMed = new MedicalReport(p3, symptoms, medication);
                            medical.writeMedicalReport(newMed);
                            medical.saveData();
                            Alert savedtofile = new Alert(Alert.AlertType.CONFIRMATION);
                            savedtofile.setHeaderText("Data written successfully!");
                            savedtofile.show();
                        });
                        
                        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM (1).jpeg");

            // Create an ImageView for the background image
            ImageView backgroundImageView = new ImageView(backgroundImage);



            // Set the background 
            frame.setBackground(new Background(new BackgroundImage(
                    backgroundImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
            )));
                        
                        Scene scene8 = new Scene(frame, 500, 300);
                        writingStage.setScene(scene8);
                        writingStage.show();

                    } else {
                        //display that it is already written and display the report
                        Stage written = new Stage();
                        TextArea showing = new TextArea();
                        GridPane gp = new GridPane();
                        gp.add(showing, 0, 3, 3, 2);

                        gp.setPadding(space);
                        for (MedicalReport view : medical.getMedList()) {
                            if (view.getPatient().getID() == patID3) {
                                showing.appendText("Patient's ID: " + view.getPatient().getID() + "\n");
                                showing.appendText("Patient's Name: " + view.getPatient().getName() + "\n");
                                showing.appendText("Patient's Age: " + view.getPatient().getAge() + "\n");
                                showing.appendText("Diagnosis: " + view.getDiagnosis() + "\n");
                                showing.appendText("Prescription: " + view.getPrescription() + "\n");
                                found = true;
                                break;
                            }
                        }
                        Button backButton = new Button("Back");
                        BackgroundFill backgroundFill4 = new BackgroundFill(Color.TRANSPARENT, null, null);
        Background background3 = new Background(backgroundFill4);
        backButton.setBackground(background3);
         backButton.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 13; -fx-font-weight: bold;");
        
                        
                        backButton.setOnAction(event -> {
                            written.close();
                            medicalStage3.show();
                        });
                        gp.add(backButton, 2, 8);
                        gp.setVgap(10);
                        
                         Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM (1).jpeg");

            // Create an ImageView for the background image
            ImageView backgroundImageView = new ImageView(backgroundImage);



            // Set the background 
            gp.setBackground(new Background(new BackgroundImage(
                    backgroundImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
            )));
                        
                        
                        
                        
                        Scene scene6 = new Scene(gp, 450, 300);
                        written.setScene(scene6);
                        written.setTitle("Already written");
                        written.show();
                    }
                } else {
                    //alert the the patient isnt registered
                    Alert notfound = new Alert(Alert.AlertType.ERROR);
                    notfound.setHeaderText("Patient is not registered in the system.");
                    notfound.showAndWait();

                }
            });
            
             Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM (1).jpeg");

            // Create an ImageView for the background image
            ImageView backgroundImageView = new ImageView(backgroundImage);



            // Set the background 
            layout.setBackground(new Background(new BackgroundImage(
                    backgroundImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
            )));
            
            Scene scene7 = new Scene(layout, 400, 300);
            medicalStage3.setScene(scene7);
            medicalStage3.setTitle(null);
            medicalStage3.show();

        });
                    
                    
                   
            Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM (1).jpeg");

            // Create an ImageView for the background image
            ImageView backgroundImageView = new ImageView(backgroundImage);



            // Set the background 
            vv.setBackground(new Background(new BackgroundImage(
                    backgroundImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
            )));

                    
                    Scene dr1=new Scene(vv,600,350);
                    drpage.setScene(dr1);
                    drpage.show();
                } 
                else
                {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setHeaderText("Access Denied!");
                    alert.setContentText("Incorrect Credentials!");
                    alert.showAndWait();
                    idTF.clear();
                    nameTF.clear();

                }

            });
            
                     //set photo
        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-12 at 2.29.49 AM (1).jpeg");

        // Create an ImageView for the background image
        ImageView backgroundImageView = new ImageView(backgroundImage);

       

        // Set the background image to the StackPane
        root1.setBackground(new Background(new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
        )));
                
        
            
            
            
            
            Scene scene2 = new Scene(root1, 400, 300);
            stage1.setScene(scene2);
            stage1.setTitle("Doctor Login");
            stage1.show();
      
      
      
  });
//-------------------------------------------------------------------------------------------------------------------------------------   


//   labelA.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
   
   
   //  Insets in = new Insets(20,10,1,20);
    //            gp.setPadding(in);
    
    
//    BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
//     Background background = new Background(backgroundFill);
//        Login.setBackground(background);
//         Login.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 10; -fx-font-weight: bold;");


// //----------------------------------------------------------------------------------------------------------------------------------

        // #### LOGIN AS PATIENT #####
//---------------------------------------------------------------------------------------------------------------------------------------
                loginaspatient.setOnAction(e4->
                {
 
                Stage newStagee = new Stage();
                stage.hide();
                Patient patient = new Patient();
                Label labelP = new Label("Enter your ID:");
                 labelP.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                TextField IDField1 = new TextField();
                Label labelP2 = new Label("Enter your Name:");
                labelP2.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                TextField nameFieldl = new TextField();
                Button Login11 = new Button("LOGIN");
                Button back12=new Button("Back");
                
                  BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                Background background = new Background(backgroundFill);
                   Login11.setBackground(background);
                    Login11.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 12; -fx-font-weight: bold;");

                        back12.setBackground(background);
                    back12.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 12; -fx-font-weight: bold;");
                
                    back12.setOnAction(q->{
                    stage.show();
                    newStagee.hide();
                    
                    });
                    
                GridPane gp2 = new GridPane();
                gp2.add(labelP, 0, 0);
                gp2.add(IDField1, 1, 0);
                gp2.add(labelP2, 0, 1);
                gp2.add(nameFieldl, 1, 1);
                gp2.add(Login11, 0, 3);
                gp2.add(back12, 1, 3);
                gp2.setVgap(20);
                gp2.setHgap(10);
                gp2.setAlignment(Pos.CENTER);
                Insets in = new Insets(20);
                gp2.setPadding(in);

                //AFTER CLICKING LOGIN BUTTON
                Login11.setOnAction(new EventHandler<ActionEvent>() 
                {
                    @Override
                    public void handle(ActionEvent t) {
                        try {
                            //CHANGE THE ID FROM STRING (FROM TEXTFIELD) TO INTEGER
                            int id = Integer.parseInt(IDField1.getText());
                            boolean exist = patient.login(id, nameFieldl.getText());
                            
                            // ###  login successfully ###
                            if (exist == true) 
                            {
                                newStagee.hide();
                               Stage patientpage=new Stage();
                               patientpage.setTitle("PATIENT PAGE");
                               Button bview=new Button("View MedicalReport");
                               Button breq=new Button("Request Appointment");
                               Button bstat =new Button("Appointment Status");
                                Button blog =new Button("LogOut");
                             
                                
                                BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
                Background background = new Background(backgroundFill);
                   bview.setBackground(background);
                    bview.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");

                        breq.setBackground(background);
                    breq.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
                    
                      bstat.setBackground(background);
                    bstat.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
                      blog.setBackground(background);
                    blog.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
                               
    
                               VBox v=new VBox(20);
                               v.setAlignment(Pos.CENTER);
                               v.getChildren().addAll(breq,bstat,bview,blog);
                               
                               
//                            //   click on req appointment button  //done
                            
                               breq.setOnAction(reqq->
                               {
                                  patientpage.hide();
                                   Stage reqpage=new Stage();
                                   reqpage.setTitle("Request Appointment");
                                   
                                   Label rid=new Label("Patient ID:     "+IDField1.getText());
                                   rid.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                                   Label rname=new Label("Patient Name:  "+nameFieldl.getText());
                                   rname.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                                   Label rdep=new Label("Department Name");
                                   rdep.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                                   Label rdr=new Label("Doctor Name");
                                   rdr.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                                   Button pat=new Button("Back");
                                   Button viewd=new Button("View Doctor's List");
                                   
                                    GridPane root = new GridPane();
//                                    TextField nameFieldp = new TextField(nameFieldl.getText());
//                                    TextField IDFieldp = new TextField(IDField1.getText());
                                   TextField doctorNameField = new TextField();
                                   TextField departmentNameField = new TextField();
                                   
                                    root.add(rdr, 0, 2);
                                    root.add(rdep, 0, 3);
                                    root.add(rname, 0, 1);
                                    root.add(rid, 0, 0);
                                    root.add(doctorNameField, 1, 2);
                                    root.add(departmentNameField, 1, 3);
//                                    root.add(nameFieldp, 1, 1);
//                                    root.add(IDFieldp, 1, 0);
                                    Button requestButton = new Button("Request");
                                    root.add(requestButton, 0, 4);
                                    root.add(viewd, 1, 4);
                                    root.add(pat, 2, 4);
                                    Alert confirmrequest=new Alert(Alert.AlertType.CONFIRMATION);
                                    Alert notconfirmrequest=new Alert(Alert.AlertType.ERROR);
                                    notconfirmrequest.setHeaderText("Error in your request");
                                    root.setHgap(5);
                                    root.setVgap(10);
                                    Insets in = new Insets(20);
                                     root.setPadding(in);
                                      BackgroundFill backgroundFill1 = new BackgroundFill(Color.TRANSPARENT, null, null);
                Background background1 = new Background(backgroundFill1);
                   requestButton.setBackground(background1);
                    requestButton.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");

                        viewd.setBackground(background1);
                    viewd.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
                                
                     pat.setBackground(background1);
                    pat.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
                              
                                   // root.setAlignment(Pos.CENTER);
                                    Patient patient = new Patient();
                                    
                                    viewd.setOnAction(vie->
                                    {
                                        reqpage.hide();
                                    Stage dr1=new Stage();
                                   dr1.setTitle("View Dr");
                                   
                                     Label view=new Label("View Doctor's List");
                                    view.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
                                    
                                     Button backv=new Button("back");
                                    TextArea text=new TextArea();
                                    
                                    GridPane g2=new GridPane();
                                    g2.add(view, 0, 0);
                                    g2.add(backv,1, 5);
                                    g2.add(text, 0,3,3,2);
                                      Insets in3 = new Insets(20);
                                         g2.setPadding(in3);
                                   // g2.setAlignment(Pos.CENTER);
                                    g2.setVgap(10);
                                    g2.setHgap(15);
                                    
                                    BackgroundFill backgroundFill11 = new BackgroundFill(Color.TRANSPARENT, null, null);
                Background background11 = new Background(backgroundFill11);
                         backv.setBackground(background11);
                    backv.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
                                
                                    
                                    
                                    backv.setOnAction(aa->{
                                    reqpage.show();
                                    dr1.hide();
                                    });
                                   
                                    Doctor d=new Doctor();

                                     d.loadData();
                                     for(Doctor dd:d.getDocList())
                                     {
                                            text.appendText("Doctor Name: " + dd.getName() + "\n");
                                            text.appendText("Doctor's Department: " + dd.getProffession() + "\n");
                                            text.appendText("-----------------------------------------"+"\n");
                                         
                                     }
                                    
                                    
                                 
                                    
                                      //set photo
                           Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-13 at 4.37.02 AM.jpeg");

                           // Create an ImageView for the background image
                           ImageView backgroundImageView = new ImageView(backgroundImage);



                           // Set the background image to the StackPane
                           g2.setBackground(new Background(new BackgroundImage(
                                   backgroundImage,
                                   BackgroundRepeat.NO_REPEAT,
                                   BackgroundRepeat.NO_REPEAT,
                                   BackgroundPosition.DEFAULT,
                                   new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                           )));
                                        
                                     Scene dr2=new Scene(g2,500,350);
                                   dr1.setScene(dr2);
                                       dr1.show();
                                    });
                                    
                                    
                                    pat.setOnAction(pp->{
                                    patientpage.show();
                                    reqpage.hide();
                                    });
                                   
                                    requestButton.setOnAction(e -> 
                                    {
                                        String docName = doctorNameField.getText();
                                        String depName = departmentNameField.getText();
                                        String patientName = nameFieldl.getText();
                                        int patientID = Integer.parseInt(IDField1.getText());
                                        Appointment requestapp = new Appointment();
                                        Date randDate = requestapp.generateRandomDate();
                                        Doctor doctor = new Doctor();
                                        Doctor foundDoctor = doctor.FindDoctor(docName, depName);
                                        Patient reqpatient=new Patient();
                                        if (foundDoctor != null) {
                                            Patient foundPatient = patient.FindPatient(patientID);
                                            if (foundPatient != null) {
                                                foundPatient.requestAppointment(foundDoctor, foundPatient);
                                                System.out.println("Your request has been submitted.");
                                                confirmrequest.setHeaderText("Your request has been submitted");
                                                confirmrequest.setContentText("Patient ID: "+patientID+"\nPatient Name: "+patientName+"\nDoctor Name: "+foundDoctor.getName()+"\nDepartment: "+foundDoctor.getProffession()+"\nDate: "+randDate+"\nPrice: "+"300");
                                                confirmrequest.show();
                                                confirmrequest.setOnCloseRequest(ok->{
                                                patientpage.show();
                                                reqpage.hide();
                                                    
                                                });
                                            } else 
                                            {

                                                 notconfirmrequest.setContentText("Patient not found!");
                                                 notconfirmrequest.show();
                                            }
                                        } else
                                        {
                                                 notconfirmrequest.setContentText("Doctor not found!");
                                                 notconfirmrequest.show();
                                        }
                                    });
                                   
                                                            //set photo
                           Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-13 at 4.37.02 AM.jpeg");

                           // Create an ImageView for the background image
                           ImageView backgroundImageView = new ImageView(backgroundImage);



                           // Set the background image to the StackPane
                           root.setBackground(new Background(new BackgroundImage(
                                   backgroundImage,
                                   BackgroundRepeat.NO_REPEAT,
                                   BackgroundRepeat.NO_REPEAT,
                                   BackgroundPosition.DEFAULT,
                                   new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                           )));

                                    
                                   Scene req=new Scene(root,530,350);
                                   reqpage.setScene(req);
                               reqpage.show();
                               });

                            //click on view medicalreport  //done
                            
                            MedicalReport medical=new MedicalReport();
                            bview.setOnAction(view->
                            {
                                Stage x = new Stage();
                                
                                 medical.loadData();

                                    int viewID = Integer.parseInt(IDField1.getText());
                                    TextArea medicalReport = new TextArea();
                                    Button med=new Button("Back");
                                    BackgroundFill backgroundFill1 = new BackgroundFill(Color.TRANSPARENT, null, null);
                Background background1 = new Background(backgroundFill1);
                   med.setBackground(background1);
                    med.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");

                                    
                                    GridPane group = new GridPane();
                                    group.add(medicalReport, 0, 3, 3, 2);
                                    group.add(med, 4, 5);
                                    group.setPadding(new Insets(15));
                                    group.setVgap(10);
                                    boolean found = false;
                                    
                                    med.setOnAction(m->{
                                    patientpage.show();
                                    x.hide();
                                    
                                    });
                                    

                                    for (MedicalReport view3 : medical.getMedList())
                                    {
                                        if (view3.getPatient().getID() == viewID) {
                                            medicalReport.appendText("Patient's ID: " + view3.getPatient().getID() + "\n");
                                            medicalReport.appendText("Patient's Name: " + view3.getPatient().getName() + "\n");
                                            medicalReport.appendText("Patient's Age: " + view3.getPatient().getAge() + "\n");
                                            medicalReport.appendText("Diagnosis: " + view3.getDiagnosis() + "\n");
                                            medicalReport.appendText("Prescription: " + view3.getPrescription() + "\n");
                                            found = true;
                                            patientpage.hide();
                                            break;

                                        }
                                    }

                                    if (!found) {
                                        Alert notfound = new Alert(Alert.AlertType.ERROR);
                                        notfound.setHeaderText("Medical report not found");
                                        notfound.showAndWait();
                                    } else {
                                        
                                         //set photo
                           Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-13 at 4.37.02 AM.jpeg");

                           // Create an ImageView for the background image
                           ImageView backgroundImageView = new ImageView(backgroundImage);



                           // Set the background image to the StackPane
                           group.setBackground(new Background(new BackgroundImage(
                                   backgroundImage,
                                   BackgroundRepeat.NO_REPEAT,
                                   BackgroundRepeat.NO_REPEAT,
                                   BackgroundPosition.DEFAULT,
                                   new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                           )));
                                        
                                        Scene sceneX = new Scene(group, 400, 300);
                                        
                                        x.setScene(sceneX);
                                        x.setTitle("View Medical Report");
                                        x.show();
                                    }
                                
                            
                            });
                               
                           //click on appointment status  //done
                           
                           bstat.setOnAction(stat->
                           {
                                Patient paypatient = new Patient();
                             Appointment payapp = new Appointment();
                              try 
                                 {
                               int patientID = Integer.parseInt(IDField1.getText());
                               boolean isAppointmentConfirmed = paypatient.appointmentStatus(patientID);
                                if(isAppointmentConfirmed)
                                {
                                    patientpage.hide();
                                          Stage payment = new Stage();
                           
                           Label confirmlabel = new Label("CONFIRMED SUCCESSFULLY");
                           confirmlabel.setStyle("-fx-font-size: 18; -fx-font-weight: bold; -fx-text-fill: black;");
                           BorderPane.setAlignment(confirmlabel, Pos.CENTER);

                           Label bankLabel = new Label("Choose your Bank");
                           bankLabel.setStyle("-fx-font-size: 18; -fx-font-weight: bold;");
                           BorderPane.setAlignment(bankLabel, Pos.CENTER);

                           ObservableList<String> banks = FXCollections.observableArrayList("NBE", "Alexandria Bank", "QNB");
                           ComboBox<String> bankComboBox = new ComboBox<>(banks);
                           bankComboBox.setStyle("-fx-font-size: 14;");

                                                
                           Button payButton = new Button("Pay");
                           Button back=new Button("Back");
                           
                           BackgroundFill backgroundFill1 = new BackgroundFill(Color.TRANSPARENT, null, null);
                Background background1 = new Background(backgroundFill1);
                   payButton.setBackground(background1);
                    payButton.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
                         back.setBackground(background1);
                    back.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
                          
                    GridPane gg=new GridPane();
                    gg.add(confirmlabel, 0, 0);
                    gg.add(bankLabel, 0, 1);
                    gg.add(bankComboBox, 1, 1);
                    gg.add(back, 0, 2);
                     gg.add(payButton, 1, 2);
                     gg.setVgap(40);
                     gg.setHgap(5);
                     gg.setPadding(new Insets(10));
                    
                           
                        back.setOnAction(ww->{
                        payment.hide();
                        patientpage.show();
                        });
                        
                        
                           payButton.setOnAction(a -> {
                               String selectedBank = bankComboBox.getValue();
                               if (selectedBank != null && !selectedBank.isEmpty()) {
                                   payment.close();
                                   Alert paid = new Alert(Alert.AlertType.CONFIRMATION);
                                   paid.setHeaderText("Paid Successfully");
                                   paid.showAndWait();
                                   payment.hide();
                                   patientpage.show();
                               } else {
                                   Alert notpaid = new Alert(Alert.AlertType.WARNING);
                                   notpaid.setHeaderText("Please choose a bank");
                                   notpaid.show();
                               }
                           });

                           Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-13 at 4.37.02 AM.jpeg");

                           // Create an ImageView for the background image
                           ImageView backgroundImageView = new ImageView(backgroundImage);



                           // Set the background image to the StackPane
                           gg.setBackground(new Background(new BackgroundImage(
                                   backgroundImage,
                                   BackgroundRepeat.NO_REPEAT,
                                   BackgroundRepeat.NO_REPEAT,
                                   BackgroundPosition.DEFAULT,
                                   new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
                           )));

                                    Scene paymentScene = new Scene(gg, 430, 300);
                                    payment.setScene(paymentScene);
                                    payment.setTitle("Payment");
                                    payment.show();
                                }
                                else
                                {
                                     Alert notconfirm= new Alert(Alert.AlertType.ERROR);
                                    notconfirm.setHeaderText("Appointment Cancelled");
                               notconfirm.setContentText("TRY TO REQUEST ANOTHER APPOINTMENT");
                               notconfirm.show();
                                }
                           } catch (NumberFormatException ex) {

                           }

                           
                           });
                           
                        //click on logout
                          
                           blog.setOnAction(log->
                           {
                           patientpage.hide();
                           stage.show();
                           
                           });
                           
                                //set photo
        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-13 at 4.11.09 AM.jpeg");

        // Create an ImageView for the background image
        ImageView backgroundImageView = new ImageView(backgroundImage);

       

        // Set the background image to the StackPane
        v.setBackground(new Background(new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
        )));
                           
                               Scene patient1=new Scene(v,600,400);
                               patientpage.setScene(patient1);
                             patientpage.show();
                            }
                            else
                            {
                                Alert warning = new Alert(Alert.AlertType.WARNING);
                                warning.setHeaderText(null);
                                warning.setTitle("INVALID DATA");
                                warning.setContentText("ACCESS DENIED");
                                warning.showAndWait();
                                IDField1.clear();
                                nameFieldl.clear();

                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid ID. Please enter a valid integer.");
                        }

                    }

                });
                
                            //set photo
        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\WhatsApp Image 2024-01-13 at 4.11.09 AM.jpeg");

        // Create an ImageView for the background image
        ImageView backgroundImageView = new ImageView(backgroundImage);

       

        // Set the background image to the StackPane
        gp2.setBackground(new Background(new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
        )));
                
        

                Scene newScene = new Scene(gp2, 530, 300);
                newStagee.setScene(newScene);
                newStagee.setTitle("PATIENT LOGIN");
                newStagee.show();
            
 
 
 });
 //---------------------------------------------------------------------------------------------------------------------------------
 
 

//---------------------------------------------------------------------------------------------------------------------------------


          // button color
             BackgroundFill backgroundFill = new BackgroundFill(Color.TRANSPARENT, null, null);
        Background background = new Background(backgroundFill);
        loginasadmin.setBackground(background);
       
        loginasadmin.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
        loginasdoctor.setBackground(background);
        loginasdoctor.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
        loginaspatient.setBackground(background);
        loginaspatient.setStyle(" -fx-border-color: black; -fx-border-width: 1;");
        loginaspatient.setStyle(" -fx-border-color: black; -fx-border-width: 2;-fx-font-size: 15; -fx-font-weight: bold;");
          
          
        //------------------------------------------------------------------------------------
        
        
        
        //set photo
        Image backgroundImage = new Image("file:C:\\Users\\dell\\Downloads\\ll.jpg");

        // Create an ImageView for the background image
        ImageView backgroundImageView = new ImageView(backgroundImage);

       

        // Set the background image to the StackPane
        root11.setBackground(new Background(new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
        )));
        
        //-----------------------------------------------------------------------------
      
        
        stage.setScene(s);
        stage.setTitle("CLINIC SYSTEM");
       
      // stage.show();
            
            
            stage.show();
        });

        //set photo
        Image backgroundImage1 = new Image("file:C:\\Users\\dell\\Downloads\\ll.jpg");

        // Create an ImageView for the background image
        ImageView backgroundImageView1 = new ImageView(backgroundImage1);

       

        // Set the background image to the StackPane
        root.setBackground(new Background(new BackgroundImage(
                backgroundImage1,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
        )));
        
        stageee.show();
    }

    private Task<Void> createLoadingTask() {
        return new Task<>() {
            @Override
            protected Void call() throws Exception {
              
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(40);
                    updateProgress(i, 99);
                }
                return null;
            }
        };
        

        
    }

}

