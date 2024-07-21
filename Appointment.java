/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Appointment implements Serializable {

    private Doctor doctor;
    private Patient patient;
    private Date date;
    private int price;

    protected ArrayList<Appointment> appointments = new ArrayList<>();

    public Appointment() {
    }

    public Appointment(Doctor doctor, Patient patient, Date date, int price) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.price = price;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public static Date generateRandomDate() {
        int startYear = 2024;
        int endYear = 2024;
        int month = ThreadLocalRandom.current().nextInt(1, 13);
        int day = ThreadLocalRandom.current().nextInt(1, getDaysInMonth(startYear, month) + 1);
        int hour = ThreadLocalRandom.current().nextInt(0, 24);
        int minute = ThreadLocalRandom.current().nextInt(0, 60);
        Calendar calendar = new GregorianCalendar(startYear, month - 1, day, hour, minute);

        return calendar.getTime();
    }

    private static int getDaysInMonth(int year, int month) {
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public void createFileAppointment() {
        try {
            FileOutputStream out = new FileOutputStream("Appointments.dat");
            ObjectOutputStream obj = new ObjectOutputStream(out);
            Date randDate = generateRandomDate();
            obj.writeObject(appointments);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void loadData() {

        try {
            FileInputStream fis = new FileInputStream("Appointments.dat");
            ObjectInputStream obj = new ObjectInputStream(fis);
            appointments = (ArrayList<Appointment>) obj.readObject();
          
        } catch (Exception e) {
            System.out.println("Error loading from the appointment file.");
        }
    }

    public void saveData() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Appointments.dat"));
            oos.writeObject(appointments);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}