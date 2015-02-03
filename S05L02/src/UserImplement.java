import java.util.Scanner;
public class UserImplement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		User[] korisnik = new User[2];
		korisnik[0] = getUser();
		korisnik[1] = getUser();

		starijiPrint(korisnik);
	}

	/**
	 * Funkcija uspoređuje godine 2 korisnika i isprinta starijeg.
	 * @param korisnik
	 */
	private static void starijiPrint(User[] korisnik) {

		if (korisnik[0].age > korisnik[1].age) {
			System.out.printf("Stariji je korisnik %s %s i on ima %d godina!",korisnik[0].firstName, korisnik[0].lastName, korisnik[0].age);
		}
		else{
			System.out.printf("Stariji je korisnik %s %s i on ima %d godina!",korisnik[1].firstName, korisnik[1].lastName, korisnik[1].age);
		}
	}

	/**
	 * Funkcija  ispisuje podatke o korisniku.
	 * @param user
	 */
	private static void printUser(User user) {
		System.out.printf("Korisnik %s %s ima %d godina.\n", user.firstName, user.lastName, user.age);
	}

	/**
	 * Funkcija od korisnika traži da unese podatke i smješta ih u klasu User.
	 * @return
	 */
	private static User getUser() {
		Scanner in = new Scanner(System.in);
		
		User user = new User();
		
		System.out.println("Name: ");
		user.firstName=in.nextLine();
		System.out.println("Last name: ");
		user.lastName=in.nextLine();
		System.out.println("Age: ");
		user.age=in.nextInt();
		
		return user;
	}

}
