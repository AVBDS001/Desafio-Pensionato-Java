package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];
		
		System.out.println("How many rooms will be rented: ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.printf("Rent #%d: ",i);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.next();
			System.out.print("Room: ");
			int roomNumber = scan.nextInt();
			rooms[roomNumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		
		
		
		scan.close();
	}

}
