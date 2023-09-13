import java.util.*;
import java.util.List;
import java.util.Scanner;
 
class Menu {

	
	//declared here are Constant variables, declared final because its value cannot be change during program execution
	//see format for declaring Constant Variables
	
	//menulist
	final static List<String> MENU_LIST = Arrays.asList(new String[] { "1.NEW CUSTOMER", "2.MEMEBER CUSTOMER","3. COMPUTER PARTS", "4. VIEW MODIFY ORDER", "5. SUBMIT ORDER","6. VIEW SUBMITTED/DELETE ORDER",
			"7. EXIT WITHOUT PURCHASE" });

	//for user input choice
	final static String NEW_CUSTOMER = "1";
	final static String MEMBER_CUSTOMER = "2";
	final static String ADD_COMPUTERPARTS = "3";
	final static String VIEW_MODIFY_ORDER = "4";
	final static String SUBMIT_ORDER = "5";
	final static String VIEW_SUBMITTED_DELETE_ORDER = "6";
	final static String EXIT_WITHOUT_PURCHASE = "7";
	



	//for auto generated IDs
	static int customerCount = 0;
	static int orderCount = 0;
	
}

class Customer {
	 final static String YES = "Y";
	 final static String NO = "N";
	
	 final static String MALE = "M";
	 final static String FEMALE = "F";
 
	private final String ID;
	private String name;
	private String gender;
	private String address;
	private long mobileNumber;
	

	public Customer(String name, String gender, long mobileNumber,  String address) {
		//increment customer count in Menu class
		Menu.customerCount  = Menu.customerCount + 1; 
		Random r = new Random(System.currentTimeMillis());

		//generates ID
		this.ID = "C" + 0 + ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
		
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	public String getID() {

		return ID;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getGender() {

		return gender;

	}

	public void setGender(String gender) {

		this.gender = gender;

	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String address) {

		this.address = address;

	}

	public long getMobileNumber() {

		return mobileNumber;

	}

	public void setMobileNumber(int mobileNumber) {

		this.mobileNumber = mobileNumber;

	}

	public String toString() {

		return "Customer's Info:- " + "\n" +

				"\tID : " + ID + "\n" +

				"\tName : " + name + "\n" +

				"\tGender : " + gender + "\n" +

				"\tMobile No : " + mobileNumber + "\n" +

				"\tAddress : " + address;

	}

}
 

class MemberCustomer{
	private String ID;
	private Customer customer;
	private List<Customer> customerList = new ArrayList<>();
	
	
      public MemberCustomer(){
		 Menu.orderCount = Menu.orderCount + 1;
  	 
	  }
	  
	public String getID() {
		return ID;
	}

	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	 public List<Customer> getcustomerList() {
		return customerList;
	}
		
	public void setcustomerList(List<Customer> customerList) {
	 this.customerList = customerList;
	}

	
	@Override
	public String toString() {
		return "Order ID=" + ID + ", customerInfo=" + customer + ", computerparts=" + customerList;
	}

}	
	

class ComputerParts{
	private final String name;

	private final String brand;

	private final String socket;

	private final String size;

	private final String modelNo;

	private double price;

	public ComputerParts(String name , String brand, String socket, String modelNo, String size, double price) {
       Menu.orderCount = Menu.orderCount + 1; 
		Random r = new Random(System.currentTimeMillis());

		this.name = name + "O" + 0 + ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
		
		this.brand = brand;

		this.socket = socket; 

		this.size = size;

		this.modelNo = modelNo;

		this.price = price;
			
	}
   public String getName(){
	return name;

	}

	public String getBrand() {

		return brand;

	}

	public String getSocket() {

		return socket;

	}

	public String getModelNo() {

		return modelNo;

	}
	
	public String getSize() {

		return size;

	}

	public double getPrice() {

		return price;

	}

	public void setPrice(double price) {

		this.price = price;

	}

	public String toString() {
		return name+"\t\t" + socket + "\t\t" + brand + "\t\t" + "\t\t" + modelNo +  size +"\t\t" + price;

	}
		

}
 

class Order {

	private String ID;
	private Customer customer;
	private List<ComputerParts> computerPartsList = new ArrayList<>();
	private double totalPrice;
	

	public Order() {
		//increment order count in Menu class
		Menu.orderCount = Menu.orderCount + 1;
		
		//auto generated ID for Order
		this.ID = "O000"+Integer.toString(Menu.orderCount);
	}


	public String getID() {
		return ID;
	}


	public void setID(String ID) {
		ID = ID;
	}

	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public List<ComputerParts> getcomputerPartsList() {
		return computerPartsList;
	}


	public void setcomputerPartsList(List<ComputerParts> computerPartsList) {
		this.computerPartsList = computerPartsList;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	@Override
	public String toString() {
		return "Order ID=" + ID + ", customerInfo=" + customer + ", computerparts=" + computerPartsList + totalPrice + "]";
	}

	
	

	
	

}
 

 


 class Product {

	public static final List<ComputerParts> computer_Parts_LIST = new ArrayList<>();

	public Product() {
		
		computer_Parts_LIST.add(new ComputerParts("INTCPU","Intel","","i5","9600K ",323));
		computer_Parts_LIST.add(new ComputerParts("INTCPU","Intel","","i7","9700K ",462));
		computer_Parts_LIST.add(new ComputerParts("INTCPU","Intel","","i7","9700F ",396));
		computer_Parts_LIST.add(new ComputerParts("INTCPU","Intel","","i9","9900K ",591));
		computer_Parts_LIST.add(new ComputerParts("AMDCPU","AMD","","4","Ryzen 2200",200));
		computer_Parts_LIST.add(new ComputerParts("AMDCPU","AMD","","6","Ryzen 3600",310));
		computer_Parts_LIST.add(new ComputerParts("AMDCPU","AMD","","8","Ryzen 3700",489));
		computer_Parts_LIST.add(new ComputerParts("AMDCPU","AMD","","8","Ryzen 5800",669));
		
		computer_Parts_LIST.add(new ComputerParts("INTMOT","Intel","","Gigabyte","H81M-DS2",129));
		computer_Parts_LIST.add(new ComputerParts("INTMOT","Intel","","Asus","J40051-C",169));
		computer_Parts_LIST.add(new ComputerParts("INTMOT","Intel","","MSI","Mpg-2390 ",225));
		computer_Parts_LIST.add(new ComputerParts("INTMOT","Intel","","Gigabyte","Z490 ",471));
		computer_Parts_LIST.add(new ComputerParts("AMDMOT","AMD","","Gigabyte","B-450 ",117));
		computer_Parts_LIST.add(new ComputerParts("AMDMOT","AMD","","Asus","A320I ",128));
		computer_Parts_LIST.add(new ComputerParts("AMDMOT","AMD","","MSI","B450",232));
		computer_Parts_LIST.add(new ComputerParts("AMDMOT","AMD","","Gigabyte","X570S",679));
		
        computer_Parts_LIST.add(new ComputerParts("Mon","Acer","","K242HYLB","24 inch",194));
		computer_Parts_LIST.add(new ComputerParts("Mon","LG","","32QN600","32 inch",506));
		computer_Parts_LIST.add(new ComputerParts("Mon","Asus","","MB16ACZ","16 inch",429));
		computer_Parts_LIST.add(new ComputerParts("Mon","MSI","","MP271QP","27 inch",399));
		computer_Parts_LIST.add(new ComputerParts("Mon","BenQ","","PD3200Q","32 inch",653));
		computer_Parts_LIST.add(new ComputerParts("Mon","Philips","","272M8CZ","27 inch",289));
		
		computer_Parts_LIST.add(new ComputerParts("INTGRA","NVIDIA","","Gigabyte","GeForce RTX 3070",1999));
		computer_Parts_LIST.add(new ComputerParts("INTGRA","NVIDIA","","Asus","GeForce RTX 3070",1899));
		computer_Parts_LIST.add(new ComputerParts("INTGRA","NVIDIA","","MSI","GeForce RTX 3080",3099));
		computer_Parts_LIST.add(new ComputerParts("AMDGRA","AMD","","Gigabyte","Radeon RX 6900",3699));
		computer_Parts_LIST.add(new ComputerParts("AMDGRA","AMD","","Asus", "Radeon RX 6900",3199));
		computer_Parts_LIST.add(new ComputerParts("AMDGRA","AMD","","MSI","Radeon RX 6900",2699));
		
	    computer_Parts_LIST.add(new ComputerParts("MEM","DDR3","Kingston","8G","KCP316ND8",116));
		computer_Parts_LIST.add(new ComputerParts("MEM","DDR3","ADATA ","16G","AX4U360038G18",189));
		computer_Parts_LIST.add(new ComputerParts("MEM","DDR3","G.Skill","8G ","F3-10666CL9D",96));
		computer_Parts_LIST.add(new ComputerParts("MEM","DDR4","Kingston","8G ","KCP426SS8",93));
		computer_Parts_LIST.add(new ComputerParts("MEM","DDR4","G.Skill ","16G","F4-266C18S",158));
		computer_Parts_LIST.add(new ComputerParts("MEM","DDR4","Crucial","32G","CT32G4SFD832",159));
  
	    }
	 
       public static List<ComputerParts> getcomputerPartsList() {
		return computer_Parts_LIST;
		
		
	}

}
 

 
class OrderingSystem {
    private static Scanner subMenuScanner;
	//holds all orders
	private static Order currentOrder;
	
	//available products
	private static Product product;
	
	private static Customer customer;
	
	private static List<Customer> customerList = new ArrayList<>();
	
	private static MemberCustomer memberCustomer;
	

	//java util for reading user input
	
	
	static boolean runProgram = true;

	public static void main(String[] args) {
	    subMenuScanner = new Scanner(System.in);	
		currentOrder = new Order();
		System.out.println(" \n-------------------- Welcome to the Shop --------------------\n");
		

		//loop here while runProgram = true
		while (runProgram) {
			displayMenu();
			System.out.print("Enter your choice (1-7): ");
			product = new Product();
			String choice = subMenuScanner.nextLine();
			processChoice(choice);
		}
	}

	Scanner scanner = new Scanner(System.in);

	//display menu list
	public static void displayMenu() {
		for (String menu : Menu.MENU_LIST) {
			System.out.println(menu);
		}
	}

	///processing users input choice
	public static void processChoice(String choice) {
		if (choice.equals(Menu.ADD_COMPUTERPARTS)) {
			selectProductOrder(choice);
		} else {
			switch (choice) {
			case Menu.NEW_CUSTOMER:
			     newCustomer();
				 break;
			case Menu.MEMBER_CUSTOMER:
			    memberCustomer();
				break;
			case Menu.VIEW_MODIFY_ORDER:
				reviewOrders(false);
				break;
			case Menu.SUBMIT_ORDER:
				reviewOrders(true);
				break;
			case Menu.VIEW_SUBMITTED_DELETE_ORDER:
			     getOrders(true);
				 break;
			case Menu.EXIT_WITHOUT_PURCHASE:
				exitProgram();
				break;
			default:
				System.out.println("Invalid Input: Please enter your choice again");
			}
		}

	}
    
	

	
	//add new customer in customer list and set it in the current Order object
	public static void newCustomer() {
		System.out.println("Enter Customer Info:");
		String ID = "C000"+Integer.toString(Menu.orderCount);
		System.out.println("ID:"+ ID);
	System.out.println("Enter Name:");
	  Scanner sc = new Scanner(System.in);
	  String name = sc.nextLine();
      String[] arr = name.split(" ");
  
	
		String gender = "";
		while (gender.isEmpty()) {
			System.out.print("Enter Gender M/F : ");
			gender = subMenuScanner.nextLine();
			if (!gender.equalsIgnoreCase(Customer.MALE) && !gender.equalsIgnoreCase(Customer.FEMALE)) {
				gender = "";
				System.out.println("Invalid gender input! ");
			}
		}

		String mobile = "";
		while (mobile.isEmpty()) {
			System.out.print("Mobile No: ");
			mobile = subMenuScanner.nextLine();
			if (!isInputNumeric(mobile)) {
				System.out.println("Invalid mobile number!");
				mobile = "";
			}
		}
      System.out.println("Enter Address:");
	  Scanner a = new Scanner(System.in);
	  String address = a.nextLine();
      String[] ar = address.split(" ");
		
	   
		Customer customer = new Customer(name, gender, Long.parseLong(mobile), address);
		System.out.println("New Customer successfully added!");
		customerList.add(customer);
		currentOrder.setCustomer(customer);
		
		
	}
	 public static  void memberCustomer(){
	System.out.println("Customers: ");
 
  
    }
 

  	


	//display products available for particular items depending on users choice
	public static void selectProductOrder(String choice) {
		int count = 0;
		int productSize = 0;

		switch (choice) {
		case Menu.ADD_COMPUTERPARTS:
			productSize = product.getcomputerPartsList().size() - 1;

			
			for (ComputerParts computerparts: product.getcomputerPartsList()) {
				System.out.println(count + "\t\t" + computerparts.toString());
				count++;
			}

		
	       
			String selectedID = "";
		while (selectedID.isEmpty()) {
			System.out.print("Enter your Product ID choice: ");
			selectedID = subMenuScanner.nextLine();
			if (!isInputNumeric(selectedID)) {
				selectedID = "";
				System.out.println("Invalid Input. Please Correct Product ID.");
			} else {
				if (Integer.parseInt(selectedID) < 0 || Integer.parseInt(selectedID) > productSize) {
					selectedID = "";
					System.out.println("Invalid Input. Please Correct Product ID.");
				}
			}
		}
		
			
		//call to add the product in the order
	addProductInOrderList(choice, Integer.parseInt(selectedID));
}
	}
	public static void addProductInOrderList(String choice, int productID) {
		switch (choice) {
		case Menu.ADD_COMPUTERPARTS:
			currentOrder.getcomputerPartsList().add(product.getcomputerPartsList().get(productID));
			break;

		}
		
	}
	//review order with showTotal param, if showTotal = true, display total then exit
	public static void reviewOrders(boolean showTotal) {
		System.out.println("============== ORDERS ================");
		double totalAmount = 0;
		if(currentOrder.getcomputerPartsList().size() > 0) {
			
			int count = 0;
			for (ComputerParts computerparts : currentOrder.getcomputerPartsList()) {
				System.out.println(count +"\t\t"+ computerparts.toString());
				totalAmount = totalAmount + computerparts.getPrice();
				count++;
			}
		}
		
		if(showTotal) {
			System.out.println("TOTAL AMOUNT OF ORDERS: "+totalAmount);
		}
		
	}

   public static void getOrders(boolean showTotal) {
	   System.out.println("============== ORDERS ================");
		double totalAmount = 0;
		if(currentOrder.getcomputerPartsList().size() > 0) {
	   for (ComputerParts computerparts : currentOrder.getcomputerPartsList()) {
				System.out.println("\t\t" + computerparts.toString());
				totalAmount = totalAmount + computerparts.getPrice();
			  
	   }
		}
	if(showTotal) {
			System.out.println("TOTAL AMOUNT OF ORDERS: "+totalAmount);
			
	   }	
    System.out.println("\nDo you want to Delete your submitted order? (Y/N)");
    String modify = subMenuScanner.nextLine();
      if("Y".equals(modify.toUpperCase())) {
      System.out.println("Select order do you want to delete ");
     String selectedID = "";
		while (selectedID.isEmpty()) {
			System.out.print("Enter your Order ID : ");
			selectedID = subMenuScanner.nextLine();
 	}	
	  }
   }
	
	//exiting the program
	//setting runProgam = false, so it will not go back to the loop in main method
	public static  void exitProgram() {
		System.out.println("Thank you for visiting. Come again.");
		runProgram = false;
	    subMenuScanner.nextLine();
	}	
	
	//check if user input is number or not
	public static boolean isInputNumeric(String input) {
		if (input == null || input.isEmpty()) {
			return false;
		}

		for (int x = 0; x < input.length(); x++) {
			char c = input.charAt(x);
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

}
