package BusRes;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> book = new ArrayList<>();
        
        buses.add(new Bus(1, true, 15));
        buses.add(new Bus(2, false, 20));
        buses.add(new Bus(3, true, 35));
        
        Scanner sc = new Scanner(System.in);
        int user = 1;

        while (user == 1) {
            System.out.println("Enter 1 for booking");
            System.out.println("Enter 2 for exit");
            user = sc.nextInt();

            if (user == 1) {
                for (Bus b : buses) {
                    b.displaybusinfo();
                }

                Booking booking = new Booking(null, user, null);  

                if (booking.Available(book, buses)) { 
                    book.add(booking);
                    System.out.println("Booking confirmed!");
                } else {
                    System.out.println("No available seats on this bus.");
                }

            } else {
                System.out.println("Thanks for coming!");
            }
        }

        
    }
}
