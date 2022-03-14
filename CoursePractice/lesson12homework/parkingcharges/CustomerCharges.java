package lesson12homework.parkingcharges;

public class CustomerCharges {
    private String name;
    private int parkingTime;
    private static final float MIN_PRICE = 2;
    private static final float HOUR_PRICE = 0.50f;
    private static final float MAX_PRICE = 10;
    public static final int MIN_TIME = 3;
    public static final int MAX_TIME = 24;

    public CustomerCharges(String name, int parkingTime) {
        this.name = name;
        this.parkingTime = parkingTime;
    }

    float calculateCharges() {
        if (parkingTime <= MIN_TIME) {
            return MIN_PRICE;
        } else {
            if (MIN_PRICE + ((float)(parkingTime - MIN_TIME) * HOUR_PRICE) <= MAX_PRICE) {
                return MIN_PRICE + ((float)(parkingTime - MIN_TIME) * HOUR_PRICE);
            } else {
                return MAX_PRICE;
            }
        }
    }

    void displayParkingCharge() {
        System.out.println(name);
        System.out.println("Parking Time: " + parkingTime);
        System.out.println("Parking charge: " + calculateCharges() + " $");
    }
}
