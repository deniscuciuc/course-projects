package lesson12homework.parkingcharges;


public class ParkingChargesApp {
    public static void main(String[] args) {

        CustomerCharges customer1 = new CustomerCharges("John", 2);
        CustomerCharges customer2 = new CustomerCharges("Drake", 5);
        CustomerCharges customer3 = new CustomerCharges("Anna", 24);
        System.out.println("Yesterday's charges:");
        customer1.displayParkingCharge();
        customer2.displayParkingCharge();
        customer3.displayParkingCharge();
    }



}
