package com.pluralsight;

import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Scanner;

//phase 3
public class UserInterface {

    private Dealership dealership;

    //Constructor
    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    boolean run = true;

    public void display() {
        Scanner myScanner = new Scanner(System.in);
        init();  // Call init method
        do {
            showMenu();
            System.out.println("Choice: ");
            String choice = myScanner.nextLine();

            switch(choice) {
                case "1":
                    processGetByPriceRequest();
                case "2":
                    processGetByMAkeModelRequest();
                case "3":
                    processGetByYearRequest();
                case "4":
                    processGetByColorRequest();
                case "5":
                    processGetByMileageRequest();
                case "6":
                    processGetByVehicleTypeRequest();
                case "7":
                    processGetAllVehiclesRequest();
                case "8":
                    //TODO System.out.println("adding vehicle");
                    System.out.println("adding vehicle..");
                case "9":
                    System.out.println("Removing vehicles");
                case "99":
                    System.out.println("Goodbye!");
                    run = false;
                default:
                    System.out.println("Choose the right option");
            }


        } while (run);

    }

    public void processGetByPriceRequest() {
    }

    public void processGetByMAkeModelRequest() {
    }

    public void processGetByYearRequest() {
    }

    public void processGetByColorRequest() {
    }

    public void processGetByMileageRequest() {
    }

    public void processGetByVehicleTypeRequest() {
    }

    public void processGetAllVehiclesRequest() {
        // 1) Call the dealership's getAllVehicles() method
        ArrayList<Vehicle> allVehicles = this.dealership.getAllVehicles();
        // 2) Call the display() helper method

    }

    public void AddVehicleRequest() {
    }

    public void RemoveVehicleRequest() {
    }

    private void init() {
        //Create a instance(object) od dealershipFileManager Class and initialize it
        DealershipFileManager myDealershipFileManager = new DealershipFileManager();
        this.dealership = myDealershipFileManager.getDealership();
    }

    //Helper method to display menu
    private void showMenu() {
        System.out.println("Welcome to Car Dealership!");
        System.out.println("Type 1 to find vehicles within a price range");
        System.out.println("Type 2 to find Vehicles by make/model");
        System.out.println("Type 3 to find vehicles by year range");
        System.out.println("Type 4 to find vehicles by color");
        System.out.println("Type 5 to find vehicles by mileage range");
        System.out.println("Type 6 to find vehicles by type");
        System.out.println("Type 7 to list all vehicles");
        System.out.println("Type 8 to add a vehicle");
        System.out.println("Type 9 to remove a vehicle");
        System.out.println("Type 99 to quit");
    }

    //Display vehicles helper method
    private void displayVehicles(ArrayList<Vehicle> vehicles) {

    }


}
