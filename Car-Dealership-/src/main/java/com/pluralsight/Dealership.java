package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

//Constructor
    public Dealership(String address, String name, String phone) {
        this.address = address;
        this.name = name;
        this.phone = phone;
        // instantiate the arrayList<Vehicle> object in the constructor
        this.inventory = new ArrayList<>();

    }

    //getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //End getter and setters

    //Dealership Methods

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYears( int min, int max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String Color) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(double min, double max) {
        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    public ArrayList<Vehicle> getAllVehiclesByType(String vehicleType) {
        return null;
    }

    //Stub method
    public void addVehicle (){

    }

    //Stub method a method declaration with empty body between curly braces
    public void removeVehicle (Vehicle vehicle){
    }















}


