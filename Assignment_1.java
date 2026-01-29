
import java.util.Scanner;
class Books {
    String title;
    String author;
   double price;
    String ISBN;
    int stock;

    void Display() {
        
        System.out.println("Book's Name : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("ISBN : " + ISBN);
        System.out.println();
    }
    
    void Availability(){
        if (stock >0) {
    System.out.println("The Book :" + title + " is Available");
} else {
    System.out.println("The Book :" + title + " Not available");
}
    }
    
    
    void restock( int amt) {
        stock = stock+amt;
        System.out.println("The Book : " + title + " has been added in stock by : " + stock);
        System.out.println();
        
    }
    
    void Add_discount(double per){
        price=price-price*(per/100);
        System.out.println("The discount applied to book : "+title+" . The final price of the book is : $" +price);
        
    }
}





public class ASS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Books b1 = new Books();
        b1.title = "Animal Farm";
        b1.author = " George Orwell";
        b1.price = 500;
        b1.ISBN = "tfftuyuyty6";
        b1.stock = 0;

        Books b4 = new Books();
        b4.title = "A Tale of two cities";
        b4.author = " Charles Dickens";
        b4.price = 900;
        b4.ISBN = "kok89890hh";
        b4.stock = 18;
        
        Books b5 = new Books();
        b5.title = "Geetanjali";
        b5.author = "Rabindranath Tagore";
        b5.price = 754;
        b5.ISBN = "hh898hn";
        b5.stock = 8;
        
        Books b2 = new Books();
        b2.title = "Harry Potter";
	    b2.author = " J.K. Rowling";
        b2.price = 450;
        b2.ISBN = "98jjj87";
        b2.stock = 11;
        String target;
     int choice;
	do { 
    	 
    	 
            System.out.println("\nMenu:");
            System.out.println("1. Display Books");
            System.out.println("2. Check Availability");
            System.out.println("3. Restock Book");
            System.out.println("4. Apply Discount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            

            switch (choice) {
                case 1:
                    b1.Display();
                    b2.Display();
                    b4.Display();
                    b5.Display();
                    break;
                    
                case 2:
                    b1.Availability();
                    b4.Availability();
                    b2.Availability();
                    b5.Availability();
                    break;
                    
                case 3:
                    System.out.print("Enter restock amount for b1: ");
                    int amt = sc.nextInt();
                    b1.restock(amt);
                    break;
                    
                case 4:
                	 System.out.print("Enter discount percentage for b1: ");
                     double percent = sc.nextDouble();
                     b1.Add_discount(percent);
                    
                   break;
                   
                case 5:
                    System.out.println("Thank you!");
                    break;
                    
                default:
                    System.out.println("Invalid choice");
                    break;
            }
}
while(choice!=5);
       
        sc.close();
    }
}
