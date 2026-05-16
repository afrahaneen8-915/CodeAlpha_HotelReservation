package code;
import java.util.ArrayList;
import java.util.Scanner;

class Room {
    int roomNo;
    String type;
    double price;
    boolean available = true;

    Room(int roomNo, String type, double price) {
        this.roomNo = roomNo;
        this.type = type;
        this.price = price;
    }
}

public class HotelReservation {
	

	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Room> rooms = new ArrayList<>();

	        // Room details
	        rooms.add(new Room(101, "Standard", 1500));
	        rooms.add(new Room(102, "Deluxe", 3000));
	        rooms.add(new Room(103, "Suite", 5000));

	        int choice;

	        do {
	            System.out.println("\n--- HOTEL RESERVATION SYSTEM ---");
	            System.out.println("1. View Rooms");
	            System.out.println("2. Book Room");
	            System.out.println("3. Cancel Booking");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.println("\nAvailable Rooms:");
	                    for (Room r : rooms) {
	                        if (r.available) {
	                            System.out.println(r.roomNo + " - " + r.type +
	                                    " - ₹" + r.price);
	                        }
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter room number: ");
	                    int bookNo = sc.nextInt();

	                    for (Room r : rooms) {
	                        if (r.roomNo == bookNo && r.available) {

	                            System.out.println("Payment Successful!");
	                            r.available = false;

	                            System.out.println("Room Booked Successfully");
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter room number to cancel: ");
	                    int cancelNo = sc.nextInt();

	                    for (Room r : rooms) {
	                        if (r.roomNo == cancelNo && !r.available) {

	                            r.available = true;

	                            System.out.println("Booking Cancelled");
	                        }
	                    }
	                    break;

	                case 4:
	                    System.out.println("Thank You!");
	                    break;

	                default:
	                    System.out.println("Invalid Choice");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}
