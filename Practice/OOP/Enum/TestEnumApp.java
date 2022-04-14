package Enum;

public class TestEnumApp {
    public static void main(String[] args) {
        Day[] days = Day.values();
        for (Day s : days) {
            System.out.println(s);
        }
        System.out.println(Color.RED.getCode());
        System.out.println(Color.WHITE.getCode());
    }
}
