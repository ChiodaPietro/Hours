package Main;

public class Main {
    public static void main(String[] args) {
        ConvertHourSec convertHourSec= new ConvertHourSec(21, 50, 50);
        System.out.println(new HourSec(21,50,50).compareTo(new HourSec(23, 1, 2)));
        System.out.println(convertHourSec.toString());
    }
}
