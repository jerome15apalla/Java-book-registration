import java.util.Scanner;

public class Apalla_UniversityLibrary {
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		Scanner line = new Scanner(System.in);
		int menu, editMenu;
		String name, isbn, author, publisher;
		boolean loop=true;
		
		//Registering a book
		System.out.println("----------Register Book----------");
		System.out.print("Book Name  : ");
		name = line.nextLine();
		System.out.print("ISBN Number: ");
		isbn = line.nextLine();
		System.out.print("Author Name: ");
		author = line.nextLine();
		System.out.print("Publisher  : ");
		publisher = line.nextLine();
		
		//Object Constructor
		Book book = new Book(name,isbn,author,publisher);
		
		//Switch Loop
		do{	
			
			//Program Menu
			System.out.println("--------University Library--------");
			System.out.println(" [1] Edit Book Information");
			System.out.println(" [2] View Book Information");
			System.out.println(" [3] View Book Name");
			System.out.println(" [4] View ISBN Number");
			System.out.println(" [5] View Author Name");
			System.out.println(" [6] View Publisher");
			System.out.println(" [7] Exit");
			System.out.println("----------------------------------");
			System.out.print("Selection: ");
			menu = input.nextInt();
			
			switch(menu){

			//Edit Object Attributes
			case 1:
				System.out.println("------Edit Book Information-------");
				System.out.println(" [1] Edit All Information");
				System.out.println(" [2] Edit Book Name");
				System.out.println(" [3] Edit ISBN Number");
				System.out.println(" [4] Edit Author Name");
				System.out.println(" [5] Edit Publisher");
				System.out.println(" [6] Cancel");
				System.out.println("----------------------------------");
				System.out.print("Edit: ");
				editMenu = input.nextInt();
				
				switch(editMenu){
				case 1:
					System.out.print("Book Name  : ");
					name = line.nextLine();
					System.out.print("ISBN Number: ");
					isbn = line.nextLine();
					System.out.print("Author Name: ");
					author = line.nextLine();
					System.out.print("Publisher  : ");
					publisher = line.nextLine();
					
					book.setName(name);
					book.setISBN(isbn);
					book.setAuthor(author);
					book.setPub(publisher);
					break;
				case 2:
					System.out.print("Book Name  : ");
					name = line.nextLine();
					book.setName(name);
					break;
				case 3:
					System.out.print("ISBN Number: ");
					isbn = line.nextLine();
					book.setISBN(isbn);
					break;
				case 4:
					System.out.print("Author Name: ");
					author = line.nextLine();
					book.setAuthor(author);
					break;
				case 5:
					System.out.print("Publisher  : ");
					publisher = line.nextLine();
					book.setPub(publisher);
					break;
				default:
					System.out.println("Cancelled ");
				}
				break;
		
			//Display All attributes in one function
			case 2:
				System.out.println("---------Book Information---------");
				System.out.println(book.getBookInfo());
				break;
				
			//Display Individual Attributes Selected
			case 3:
				System.out.println("Book Name  : "+ book.getName());
				break;
			case 4:
				System.out.println("ISBN Number: "+ book.getISBN());
				break;
			case 5:
				System.out.println("Author Name: "+ book.getAuthor());
				break;
			case 6:
				System.out.println("Publisher  : "+ book.getPub());
				break;
			case 7:
				System.out.println("Program Terminated...");
				loop = false;
				break;
			default:
				System.out.println(" Wrong Input Try Again ");
			}
			
		}while(loop);
			
		input.close();
		line.close();
	}
}
