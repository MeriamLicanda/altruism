package javacode;
/**
* Name: Meriam G. Licanda
* Section: IT Dept
* Year: 4th Year
*/
import java.util.Scanner;

public class Order{

  public static void main(String[]args) {
  
  Scanner sc = new Scanner(System.in);
  
  
  String order = "Your orders are the following: \n";
  int x, orderCategory;
  float totalPayment = 0, customerCash;
  
  System.out.println("================ WELCOME TO DINER ================");
  System.out.println("| DO YOU WANT TO ORDER? [1-YES, 2-NO]            |");
  System.out.println("| Enter the number for your choice below         |");
  System.out.println("==================================================");
  System.out.print  ("Choice:");
  x = sc.nextInt(); 
  
  do {

  if (x == 1) {
  
	  System.out.println("======================== WELCOME TO DINER ==========================");
	  System.out.println("|WHAT TO ORDER? [1 - MEAL, 2 - DRINKS, 3 - HARD DRINKS, 4 - ADD-ONS|");
	  System.out.println("| Enter the number for your choice below       		         |");
	  System.out.println("====================================================================");
	  System.out.print  ("Choice:");
	  orderCategory = sc.nextInt();
	  
	  if(orderCategory == 1) {
	    System.out.println("=============== WELCOME TO DINER ===================");
	    System.out.println("||***************ORDER MEAl***********************||");
	    System.out.println("|| [1] Unli-Seafoods + Unli-Rice      : P299.00   ||");
	    System.out.println("|| [2] Unli-Samgyupsal + Rice         : P349.00   ||");
	    System.out.println("|| [3] Bacon-Strips + Unli-Rice       : P499.00   ||");
	    System.out.println("|| [4] Pork Ribs + Unli-Rice          : P499.00   ||");
	    System.out.println("|| [5] Lechon + Unli-Rice             : P599.00   ||");
	    System.out.println("|| Enter the number for your choice below         ||");
	    System.out.println("====================================================");
	    System.out.print  ("Choice:");
	    float unliSeafoods = 299 , unliSamgyupsal = 349, baconStrips = 499, porkRibs = 499, lechon = 599;
	    int orderChoice = sc.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Unli-Seafoods + Unli-Rice: P299.00 added to cart");
		  totalPayment+=unliSeafoods;
		  String order1 = "Unli-Seafoods + Unli-Rice: P299.00 \n";
		  order+=order1;
		  
		break;
		
		case 2: 
		  System.out.println("Unli-Samgyupsal + Rice  : P349.00  added to cart");
		  totalPayment+=unliSamgyupsal;
		  String order2 = "Unli-Samgyupsal + Rice          : P349.00  \n";
		  order+=order2;
		break;
		
		case 3: 
		  System.out.println("Bacon-Strips + Unli-Rice      : P499.00 added to cart");
		  totalPayment+=baconStrips;
		  String order3 = "Bacon-Strips + Unli-Rice      : P499.00 \n";
		  order+=order3;
		  
		break;
		case 4: 
		  System.out.println("Pork Ribs + Unli-Rice      : P499.00 added to cart");
		  totalPayment+=porkRibs;
		  String order4 = "Pork Ribs + Unli-Rice      : P499.00 \n";
		  order+=order4;
		  
		break;
	      
		case 5: 
		  System.out.println("Lechon + Unli-Rice      : P599.00 added to cart");
		  totalPayment+=lechon;
		  String order5 = "Lechon + Unli-Rice      : P599.00 \n";
		  order+=order5;
		  
		break;
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    

	  } else if(orderCategory == 2) {
	    System.out.println("================== WELCOME TO DINER ===============");
	    System.out.println("||******************ORDER DRINKS*****************||");
	    System.out.println("|| [1] Coca Cola	             : P30.00    ||");
	    System.out.println("|| [2] Sprite			     : P30.00    ||");
	    System.out.println("|| [3] Orange Juice		     : P40.00    ||");
	    System.out.println("|| [4] Cucumber Juice		     : P40.00   ||");
	    System.out.println("|| Enter the number for your choice below        ||");
	    System.out.println("===================================================");
	    System.out.print  ("Choice:");
	    
	    float cocaCola = 310 , sprite = 280, orangeJuice = 40, cucumberJuice = 40;
	    int orderChoice = sc.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Coca Cola : P30.00 added to cart");
		  totalPayment+=cocaCola;
		  String order1 = "Coca Cola : P30.00 \n";
		  order+=order1;
		  
		  
		  
		  
		break;
		
		case 2: 
		  System.out.println("Sprite : P30.00 added to cart");
		  totalPayment+=sprite;
		  String order2 = "Sprite : P30.00 \n";
		  order+=order2;
		  
		  
		  
		break;
		
		case 3: 
		  System.out.println("Orange Juice: P40.00  added to cart");
		  totalPayment+=orangeJuice;
		  String order3 = "Orange Juice: P40.00 \n";
		  order+=order3;
		  
		  
		break;
		
		case 4: 
		  System.out.println("Cucumber Juice: P40.00  added to cart");
		  totalPayment+=cucumberJuice;
		  String order4 = "Cucumber Juice: P40.00 \n";
		  order+=order4;
		  
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
	       break;  
		}
	      
	    }
	    else if(orderCategory == 3) {
	    System.out.println("================= WELCOME TO DINER =================");
	    System.out.println("||***************ORDER HARD DRINKS****************||");
	    System.out.println("|| [1] Red Horse         	    : P140.00     ||");
	    System.out.println("|| [2] Mojitos           	    : P160.00     ||");
	    System.out.println("|| [3] GSM Blue		  	    : P160.00     ||");
	    System.out.println("|| Enter the number for your choice below         ||");
	    System.out.println("====================================================");
	    System.out.print  ("Choice:");
	    
	    float redHorse = 140 , mojitos = 160, gsmBlue = 160;
	    int orderChoice = sc.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Red Horse      : P100.00 added to cart");
		  totalPayment+=redHorse;
		  String order1 = "Red Horse      : P100.00 \n";
		  order+=order1;
		break;
		
		case 2: 
		  System.out.println("Mojitos          : P120.00 added to cart");
		  totalPayment+=mojitos;
		  String order2 = "Mojitos            : P120.00 \n";
		  order+=order2;
		break;
		
		case 3: 
		  System.out.println("GSM Blue     : P160.00  added to cart");
		  totalPayment+=gsmBlue;
		   String order3 = "GSM Blue     : P160.00 \n";
		   order+=order3;
		  
		  
		break;
		
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    
	    
	    }else if(orderCategory == 4) {
	    System.out.println("================= WELCOME TO DINER =================");
	    System.out.println("||*****************ORDER ADD-ONS******************||");
	    System.out.println("|| [1] French Fries         	    : P100.00     ||");
	    System.out.println("|| [2] Ice Cream           	    : P120.00     ||");
	    System.out.println("|| [3] Pizza		  	    : P160.00     ||");
	    System.out.println("|| Enter the number for your choice below         ||");
	    System.out.println("====================================================");
	    System.out.print  ("Choice:");
	    
	    float frenchFries = 100 , iceCream = 120, pizza = 160;
	    int orderChoice = sc.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("French Fries      : P100.00 added to cart");
		  totalPayment+=frenchFries;
		  String order1 = "French Fries       : P100.00 \n";
		  order+=order1;
		break;
		
		case 2: 
		  System.out.println("Ice Cream           : P120.00 added to cart");
		  totalPayment+=iceCream;
		  String order2 = "Ice Cream            : P120.00 \n";
		  order+=order2;
		break;
		
		case 3: 
		  System.out.println("Pizza     : P160.00  added to cart");
		  totalPayment+=pizza;
		   String order3 = "Pizza     : P160.00 \n";
		   order+=order3;
		  
		  
		break;
		
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    
	    }

   }
   
   else {
   
   System.out.println("Okay! Have a nice day!~ ;)");
   System.exit(0);
   
   
   }
   
   
   
   
   System.out.println("Order again?");
   System.out.println("[1] - Yes");
   System.out.println("[2] - No");
   x = sc.nextInt();
   
    
  } while(x == 1);
  
    System.out.println("Amount to pay: "+totalPayment);
    System.out.print("Enter cash payment: ");
    customerCash = sc.nextFloat();
  
    System.out.println("==========R E C E I P T ========");
    System.out.println(order);
    System.out.printf("TOTAL: %.2f\n",totalPayment);
    System.out.println("Change: " + (customerCash - totalPayment));
    System.out.println("================================");
     System.out.println("Thank you come again!");
  
  
  
  
  

  }


}
