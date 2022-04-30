package monikadb;

import java.util.Scanner;
import java.sql.Connection;

public class CityPersonNew {

	

	public static void main(String[] args) {
		MavanjavaCrudeoperations.insertRecord();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		// *********GUIDE A PERSON TO ENTER PLACE AS A PERSON'S WISH*********//
		String choose = sc.next();
		choose = choose.toUpperCase();

		switch (choose) {
		case "HOTEL":
			System.out.println("WISH TO GO THE HOTELS");
			chooseVegnoNveg(sc);
			break;
		case "BEACH":
			System.out.println("WISH TO GO THE ENTERTAINMENT PLACES");
			System.out.println("                1.MARINA BEACH AN RELAXATION PLACE");
			chooseBeach(sc);
			break;
		case "THEATRES":
			System.out.println("                2.THEATRES VISIT  PLACES");
			System.out.println("\n 1.FOR ENGLISH MOVIE AT BLOCK 2 ");
			System.out.println(" 2.FOR TAMIL MOVIE AT BLOSK 3");
			System.out.println(" 3.FOR HINDHI,TELUGHU,MALAYALAM  AT BLOCK 4");
			chooseMovie(sc);
			// chooseBeach11(sc);
			break;
		case "EXIT":
			System.out.println("EXIT THE PLACES ");
			System.out.println("\n\n@@@@@@@@@@ THANK YOU FOR VISITING CITY@@@@@@@@@@");
			break;
		case "RECHOOSE":
			System.out.println("\nWE CAN CHOOSE AGAIN FROM PLACE TO PLACE  ");
			System.out.println("\n\n@@@@@@@@@@ ENJOY TO VISITING CITY@@@@@@@@@@");
		}
	}

	static void chooseVegnoNveg(Scanner sc) {
		System.out.println("ENTER YOUR FOOD TYPE VEG OR NON VEG: ");
		String choose = sc.next();
		choose = choose.toUpperCase();
		switch (choose) {
		case "VEG":
			System.out.println("************MENU CARDS***********");

			System.out.println("1.RICE - 20rps");

			System.out.println("2.TWO CHAPPATY - 50rps ");
			System.out.println("3.THREE DOSA - 100rps ");

			selectedMenu(sc);
			break;
		case "NONVEG":

			System.out.println("1.CHICKEN - 150 rps per plate");
			System.out.println("2.MUTTON BIRIYANI - 200 rps per plate ");
			System.out.println("3.PRAWN BIRIYANI - 350 per plate   ");
			selectedMenu1(sc);
			break;

		}
	}

	public static void selectedMenu(Scanner sc) {
		int chappaty = 50;
		int dosa = 100;
		int rice = 20;
		char chappatymenu = '2';
		char ricemenu = '1';
		char dosamenu = '3';
		int total = 0;
		System.out.print("CHOOSE YOUR MENU : ");

		String choose = sc.next();
		char[] menu = choose.toCharArray();

		for (char m : menu) {
			if (m == chappatymenu) {
				total += chappaty;
			} else if (m == ricemenu) {
				total += rice;
			} else if (m == dosamenu) {
				total += dosa;
			}
		}
		System.out.println("total :" + total);
	}

	public static void selectedMenu1(Scanner sc)

	{
		int chicken = 150;
		int mutton = 200;
		int prawn = 350;
		char chickenmenu = '1';
		char muttonmenu = '2';
		char prawnmenu = '3';
		int total = 0;
		System.out.print("CHOOSE YOUR MENU : ");

		String choose = sc.next();
		char[] menu = choose.toCharArray();

		for (char m : menu) {
			if (m == chickenmenu) {
				total += chicken;
			} else if (m == muttonmenu) {
				total += mutton;
			} else if (m == prawnmenu) {
				total += prawn;
			}
		}
		System.out.println("total :" + total);
	}

	private static void chooseBeach(Scanner sc) {
		System.out.println("                    ENTERS INTO BEACH: ");
		System.out.println("                    WISH TO BUY FOODS  : ");
		String choose = sc.next();
		choose = choose.toUpperCase();
		switch (choose) {

		case "SEAFOODS":
			System.out.println("**********TYPES ARE *************");

			System.out.println("1.FISH FULL PLATE  - 500rps");
			System.out.println("2.FISH HALF PLATE - 250rps ");
			System.out.println("3.PRAWN FRY- 300rps ");
			chooseBeach1(sc);
			break;

		case "KIDSGAMES":
			System.out.println("**********TYPES ARE *************");

			System.out.println("1.GUN SHOOTING BALOONS FOR PER PERSON - 50rps");
			System.out.println("2.HORSE RIDES ALLOWS  THREE PERSONS- 150rps ");
			System.out.println("3.SPONGE JUMPING FOR  1 HOUR  - 80rps ");
			chooseBeach1(sc);
			break;
		}
	}

	static void chooseBeach1(Scanner sc) {

		{

			int fishfull = 500;
			int fishhalf = 250;
			int prawnfry = 300;
			char beachfish = '1';
			char beachhalffish = '2';
			char beachprawn = '3';
			int total = 0;
			System.out.print("SELECT THE MENU : ");

			String choose = sc.next();
			char[] beach = choose.toCharArray();

			for (char m : beach) {
				if (m == beachfish) {
					total += fishfull;
				} else if (m == beachhalffish) {
					total += fishhalf;
				} else if (m == beachprawn) {
					total += prawnfry;
				}
			}
			System.out.println("total :" + total);
		}
	}

	static void chooseBeach11(Scanner sc) {

		int gun = 500;
		int horse = 250;
		int sponge = 300;
		char playgunshoot = '1';
		char playhorse = '2';
		char playspongejump = '3';
		int total = 0;
		System.out.print("SELECT THE MENU : ");

		String choose = sc.next();
		char[] beach = choose.toCharArray();

		for (char m : beach) {
			if (m == playgunshoot) {
				total += gun;
			} else if (m == playhorse) {
				total += horse;
			} else if (m == playspongejump) {
				total += sponge;

				System.out.println("total :" + total);
			}
		}
	}

///////////////////////////////////////////////////////////////////////////////////////
	private static void chooseMovie(Scanner sc) {
		System.out.println("            ENTERS INTO THEATRE: ");

		String choose = sc.next();
		choose = choose.toUpperCase();
		switch (choose) {
		case "ITEMS":
			System.out.println("SCREENING IN BLOCK 2 - 1,150RPS");
			System.out.println("MOVIE OVER ............");
			System.out.println("1. COOLDRINK - 150");
			System.out.println("2. POPCORN- 120");
			System.out.println("3. BUGER - 250");

			chooseMovie11(sc);
			break;
		case "ITEMSMORE":
			System.out.println("SCREENING IN BLOCK 2 - 1,150RPS");
			System.out.println("MOVIE OVER ............");
			System.out.println("1. kfcchicken- 600");
			System.out.println("2. tandoori- 800");
			System.out.println("3. chillychicken- 340");

			chooseMovie21(sc);
			break;

		}
	}

	static void chooseMovie11(Scanner sc) {

		int cooldrink = 150;
		int popcorn = 120;
		int burger = 250;
		char moviecooldrink = '1';
		char moviepopcorn = '2';
		char movieburger = '3';
		int total = 0;
		System.out.print("SELECT THE MENU: ");

		String choose = sc.next();
		char[] movie = choose.toCharArray();

		for (char m : movie) {
			if (m == moviecooldrink) {
				total += cooldrink;
			} else if (m == moviepopcorn) {
				total += popcorn;
			} else if (m == movieburger) {
				total += burger;

			}

		}
		System.out.println("total :" + total);
	}

	static void chooseMovie21(Scanner sc) {

		int kfcchicken = 600;
		int tandoori = 800;
		int chillychicken = 340;
		char moviekfcchicken = '1';
		char movietandoori = '2';
		char moviechillychicken = '3';
		int total = 0;
		System.out.print("SELECT THE MENU : ");

		String choose = sc.next();
		char[] movie = choose.toCharArray();

		for (char m : movie) {
			if (m == moviekfcchicken) {
				total += kfcchicken;
			} else if (m == movietandoori) {
				total += tandoori;
			} else if (m == moviechillychicken) {
				total += chillychicken;

			}
		}
		System.out.println("total :" + total);
	}
}
