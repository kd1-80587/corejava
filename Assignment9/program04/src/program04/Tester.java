package program04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static int menu() {

		System.out.println("**************************************************");
		System.out.println("0.EXIT");
		System.out.println("1.Add new book in list");
		System.out.println("2.Display all books in forward order");
		System.out.println("3.Delete at book given index");
		System.out.println("4.Check if book with given isbn is in list or not");
		System.out.println("5.Delete all books in list");
		System.out.println("6.Display number of books in list");
		System.out.println("7.Sort all books by price in desc order");
		System.out.println("**************************************************");
		System.out.print("ENTER YOUR CHOICE=");
		int choice = new Scanner(System.in).nextInt();

		return choice;

	}

	public static void main(String[] args) {
		int choice;
		List<Library> lib = new ArrayList();
		while ((choice = menu()) != 0) {
			switch (choice) {

			case 1:
				Library b = new Library();
				b.acceptData();
				lib.add(b);
				break;
			case 2:
				for (Library ele : lib) {
					System.out.println(ele);

				}

				break;
			case 3:

				System.out.print("enter the index you want to delete=");
				int index = new Scanner(System.in).nextInt();
				lib.remove(index);

				break;
			case 4:
				String isbn;
				Library key = new Library();
				System.out.print("enter the isbn=");
				isbn = new Scanner(System.in).next();
				key.setIsbn(isbn);
				if (lib.contains(key))
					System.out.println("Book is present");
				else
					System.out.println("Book is  not present");
				break;
			case 5:
				lib.clear();
				break;
			case 6:
				System.out.println("No of book in library" + lib.size());
				break;
			case 7:
				class BookPriceComparator implements Comparator<Library> {
					public int compare(Library l1, Library l2) {
						int diff = Double.compare(l1.getPrice(), l1.getPrice());
						return diff;
					}

				}
				BookPriceComparator comparator = new BookPriceComparator();
				lib.sort(comparator);

				break;

			default:
				System.out.println("invalid choice");
				break;
			}

		}

	}

}
