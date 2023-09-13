package com.cpos;

import java.util.Arrays;
import java.util.List;
 
public class Menu {

	
	//declared here are Constant variables, declared final because its value cannot be change during program execution
	//see format for declaring Constant Variables
	
	//menulist
	final static List<String> MENU_LIST = Arrays.asList(new String[] { "1. ADD CPU", "2. ADD MEMORY", "3. ADD MONITOR",
			"4. ADD MOTHER BOARD", "5. ADD GRAPHICS CARD", "6. VIEW MODIFY ORDER", "7. SUBMIT ORDDER AND EXIT",
			"8. EXIT WITHOUT PURCHASE" });

	//for user input choice
	final static String ADD_CPU = "1";
	final static String ADD_MEMORY = "2";
	final static String ADD_MONITOR = "3";
	final static String ADD_MOTHER_BOARD = "4";
	final static String ADD_GRAPHICS_CARD = "5";
	final static String VIEW_MODIFY_ORDER = "6";
	final static String SUBMIT_ORDER_EXIT = "7";
	final static String EXIT_WITHOUT_PURCHASE = "8";
	
	final static String YES = "Y";
	final static String NO = "N";
	
	final static String MALE = "M";
	final static String FEMALE = "F";
	
	final static String CPU_TITLE = "ID\t\t" +"BRAND\t\t" + "CORE NO\t\t"+ "SIZE\t\t" + "MODELNO\t\tPRICE"; 
	final static String GRAPHICS_CARD_TITLE = "ID\t\t" +"SOCKET\t\t" + "BRAND\t\t"+  "MODELNO\t\tPRICE";
	final static String MEMORY_TITLE = "ID\t\t" +"SOCKET\t\t" + "BRAND\t\t"+ "SIZE\t\t" + "MODELNO\t\tPRICE";;
	final static String MOTHER_BOARD_TITLE = "ID\t\t" +"BRAND\t\t" + "MODELNO\t\tPRICE";
	final static String MONITOR_TITLE = "ID\t\t" +"BRAND\t\t" + "SIZE\t\t"+  "MODELNO\t\tPRICE";;
	
	//for auto generated IDs
	static int customerCount = 0;
	static int orderCount = 0;
	
}
package com.cpos;

public class Customer {

	private final String ID;
	private String name;
	private String gender;
	private String address;
	private long mobileNumber;

	public Customer(String name, String gender, long mobileNumber,  String address) {
		//increment customer count in Menu class
		Menu.customerCount  = Menu.customerCount + 1; 
		
		//generates ID
		this.ID = "C000"+Integer.toString(Menu.customerCount);
		
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
 

 

package com.cpos;

import java.util.ArrayList;
import java.util.*;

public class CPU {

	private final String brand;
	private final String coreNo;
	private final String modelNo;
	private double price;

	public CPU(String brand, String coreNo, String modelNo,

			double price) {

		this.brand = brand;

		this.coreNo = coreNo;

		this.modelNo = modelNo;

		this.price = price;

	}

	public String getBrand() {

		return brand;

	}

	public String getCoreNo() {

		return coreNo;

	}

	public String getModelNo() {

		return modelNo;

	}

	public double getPrice() {

		return price;

	}

	public void setPrice(double price) {

		this.price = price;

	}

	public String toString() {
		return brand + "\t\t" + coreNo + "\t\t" + modelNo + "\t\t" + price;
	}
	
	

}
 

package com.cpos;

class GraphicsCard {

	private final String brand;

	private final String socket;

	private final String modelNo;

	private double price;

	public GraphicsCard(String brand, String socket, String modelNo,

			double price) {

		this.brand = brand;

		this.socket = socket;

		this.modelNo = modelNo;

		this.price = price;

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

	public double getPrice() {

		return price;

	}

	public void setPrice(double price) {

		this.price = price;

	}

	public String toString() {
		return socket + "\t\t" + brand + "\t\t" + modelNo + "\t\t" + price;
	}

	
}
 

 

package com.cpos;

public class Memory {

	private final String brand;

	private final String socket;

	private final String size;

	private final String modelNo;

	private double price;

	public Memory(String brand, String socket, String size, String modelNo,

			double price) {

		this.brand = brand;

		this.socket = socket;

		this.size = size;

		this.modelNo = modelNo;

		this.price = price;

	}

	public String getBrand() {

		return brand;

	}

	public String getSocket() {

		return socket;

	}

	public String getSize() {

		return size;

	}

	public String getModelNo() {

		return modelNo;

	}

	public double getPrice() {

		return price;

	}

	public void setPrice(double price) {

		this.price = price;

	}

	public String toString() {
		return socket + "\t\t" + brand + "\t\t" + size + "\t\t" + modelNo + "\t\t" + price;

	}
		

}
 

package com.cpos;

class Monitor {

	private final String brand;

	private final String modelNo;

	private final int size;

	private double price;

	public Monitor(String brand, String modelNo, int size,

			double price) {

		this.brand = brand;

		this.modelNo = modelNo;

		this.size = size;

		this.price = price;

	}

	public String getBrand() {

		return brand;

	}

	public String getModelNo() {

		return modelNo;

	}

	public int getSize() {

		return size;

	}

	public double getPrice() {

		return price;

	}

	public void setPrice(double price) {

		this.price = price;

	}

	public String toString() {
		return brand + "\t\t" + size + "\t\t" + modelNo + "\t\t" + price;
	}

}
 

 

package com.cpos;

public class MotherBoard {

	private final String brand;

	private final String socket;

	private final String modelNo;

	private double price;

	public MotherBoard(String brand, String socket, String modelNo,

			double price) {

		this.brand = brand;

		this.socket = socket;

		this.modelNo = modelNo;

		this.price = price;

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

	public double getPrice() {

		return price;

	}

	public void setPrice(double price) {

		this.price = price;

	}

	public String toString() {
		return socket + "\t\t" + brand + "\t\t" + modelNo + "\t\t" + price;
	}
	
}
 

 

package com.cpos;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private String ID;
	private Customer customer;
	private List<CPU> cpuList = new ArrayList<>();
	private List<Memory> memoryList = new ArrayList<>();
	private List<Monitor> monitorList = new ArrayList<>();
	private List<MotherBoard> motherBoardList = new ArrayList<>();
	private List<GraphicsCard> graphicsCardList = new ArrayList<>();
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


	public void setID(String iD) {
		ID = iD;
	}

	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public List<CPU> getCpuList() {
		return cpuList;
	}


	public void setCpuList(List<CPU> cpuList) {
		this.cpuList = cpuList;
	}


	public List<Memory> getMemoryList() {
		return memoryList;
	}


	public void setMemoryList(List<Memory> memoryList) {
		this.memoryList = memoryList;
	}


	public List<Monitor> getMonitorList() {
		return monitorList;
	}


	public void setMonitorList(List<Monitor> monitorList) {
		this.monitorList = monitorList;
	}


	public List<MotherBoard> getMotherBoardList() {
		return motherBoardList;
	}


	public void setMotherBoardList(List<MotherBoard> motherBoardList) {
		this.motherBoardList = motherBoardList;
	}


	public List<GraphicsCard> getGraphicsCardList() {
		return graphicsCardList;
	}


	public void setGraphicsCardList(List<GraphicsCard> graphicsCardList) {
		this.graphicsCardList = graphicsCardList;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	@Override
	public String toString() {
		return "Order [ID=" + ID + ", customerInfo=" + customer + ", cpuList=" + cpuList + ", memoryList="
				+ memoryList + ", monitorList=" + monitorList + ", motherBoardList=" + motherBoardList
				+ ", graphicsCardList=" + graphicsCardList + ", totalPrice=" + totalPrice + "]";
	}

	
	
	
	
	

}
 

 

package com.cpos;

import java.util.ArrayList;
import java.util.List;

public class Product {

	public static final List<CPU> CPU_LIST = new ArrayList<>();
	public static final List<MotherBoard> MOTHER_BOARD_LIST = new ArrayList<>();
	public static final List<Memory> MEMORY_LIST = new ArrayList<>();
	public static final List<Monitor> MONITORY_LIST = new ArrayList<>();
	public static final List<GraphicsCard> GRAPHICS_CARD_LIST = new ArrayList<>();
	
	public Product() {
		CPU_LIST.add(new CPU("Intel", "i5", "9600K ", 323));
		CPU_LIST.add(new CPU("Intel", "i7", "9700K ", 462));
		CPU_LIST.add(new CPU("Intel", "i7", "9700F ", 396));
		CPU_LIST.add(new CPU("Intel", "i9", "9900K ", 591));
		CPU_LIST.add(new CPU("AMD", "4", "Ryzen 2200", 200));
		CPU_LIST.add(new CPU("AMD", "6", "Ryzen 3600", 310));
		CPU_LIST.add(new CPU("AMD", "8", "Ryzen 3700", 489));
		CPU_LIST.add(new CPU("AMD", "8", "Ryzen 5800", 669));

		// Adding MotherBoards
		MOTHER_BOARD_LIST.add(new MotherBoard("Intel", "Gigabyte", "H81M-DS2", 129));
		MOTHER_BOARD_LIST.add(new MotherBoard("Intel", "Asus", "J40051-C", 169));
		MOTHER_BOARD_LIST.add(new MotherBoard("Intel", "MSI", "Mpg-2390 ", 225));
		MOTHER_BOARD_LIST.add(new MotherBoard("Intel", "Gigabyte", "Z490 ", 471));
		MOTHER_BOARD_LIST.add(new MotherBoard("AMD", "Gigabyte", "B-450 ", 117));
		MOTHER_BOARD_LIST.add(new MotherBoard("AMD", "Asus", "A320I ", 128));
		MOTHER_BOARD_LIST.add(new MotherBoard("AMD", "MSI", "B450", 232));
		MOTHER_BOARD_LIST.add(new MotherBoard("AMD", "Gigabyte", "X570S", 679));

		// Adding Memories
		MEMORY_LIST.add(new Memory("DDR3", "Kingston", "8G ", "KCP316ND8", 116));
		MEMORY_LIST.add(new Memory("DDR3", "ADATA ", "16G", "AX4U360038G18", 189));
		MEMORY_LIST.add(new Memory("DDR3", "G.Skill ", "8G ", "F3-10666CL9D", 96));
		MEMORY_LIST.add(new Memory("DDR4", "Kingston", "8G ", "KCP426SS8", 93));
		MEMORY_LIST.add(new Memory("DDR4", "G.Skill ", "16G", "F4-266C18S", 158));
		MEMORY_LIST.add(new Memory("DDR4", "Crucial", "32G", "CT32G4SFD832", 159));

		// Adding Monitors

		MONITORY_LIST.add(new Monitor("Acer ", "K242HYLB ", 24, 194));
		MONITORY_LIST.add(new Monitor("LG ", "32QN600 ", 32, 506));
		MONITORY_LIST.add(new Monitor("Asus ", "MB16ACZ ", 16, 429));
		MONITORY_LIST.add(new Monitor("MSI ", "MP271QP ", 27, 399));
		MONITORY_LIST.add(new Monitor("BenQ ", "PD3200Q ", 32, 653));
		MONITORY_LIST.add(new Monitor("Philips", "272M8CZ", 27, 289));

		// Adding Graphic Cards
		GRAPHICS_CARD_LIST.add(new GraphicsCard("NVIDIA", "Gigabyte", "GeForce RTX 3070 ", 1999));
		GRAPHICS_CARD_LIST.add(new GraphicsCard("NVIDIA", "Asus", "GeForce RTX 3070 ", 1899));
		GRAPHICS_CARD_LIST.add(new GraphicsCard("NVIDIA", "MSI", "GeForce RTX 3080 ", 3099));
		GRAPHICS_CARD_LIST.add(new GraphicsCard("AMD", "Gigabyte", "Radeon RX 6900 ", 3699));
		GRAPHICS_CARD_LIST.add(new GraphicsCard("AMD", "Asus", "Radeon RX 6900 ", 3199));
		GRAPHICS_CARD_LIST.add(new GraphicsCard("AMD", "MSI", "Radeon RX 6900 ", 2699));
	}

	
	public static List<CPU> getCpuList() {
		return CPU_LIST;
	}

	public static List<MotherBoard> getMotherBoardList() {
		return MOTHER_BOARD_LIST;
	}

	public static List<Memory> getMemoryList() {
		return MEMORY_LIST;
	}

	public static List<Monitor> getMonitoryList() {
		return MONITORY_LIST;
	}

	public static List<GraphicsCard> getGraphicsCardList() {
		return GRAPHICS_CARD_LIST;
	}
	
}
 

 

package com.cpos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderingSystem {

	//holds all orders
	private static Order currentOrder;
	
	//available products
	private static Product product;
	
	//holds customer user input
	private final static List<Customer> customerList = new ArrayList<>();

	//java util for reading user input
	final static Scanner SCAN = new Scanner(System.in);
	
	static boolean runProgram = true;

	public static void main(String[] args) {
		currentOrder = new Order();
		System.out.println(" \n-------------------- Welcome to the Shop --------------------\n");
		checkCustomer();

		//loop here while runProgram = true
		while (runProgram) {
			displayMenu();
			System.out.print("Enter your choice (1-8): ");
			product = new Product();
			String choice = SCAN.next();
			processChoice(choice);
		}
	}

	//check if customer already exist or not
	public static void checkCustomer() {
		boolean validInput = false;
		while (!validInput) {
			System.out.print("New Customer? Y/N: ");
			String input = SCAN.next();
			validInput = input.equalsIgnoreCase(Menu.YES) || input.equalsIgnoreCase(Menu.NO);
			if (input.equalsIgnoreCase(Menu.YES)) {
				addCustomer();
			} else if (input.equalsIgnoreCase(Menu.NO)) {
				System.out.print("Enter your customer ID: ");
				String custID = SCAN.next();
				validInput = retrieveCustomer(custID);
			} else {
				System.out.println("Invalid Input. Please enter again.");
			}
		}
	}

	//display menu list
	public static void displayMenu() {
		for (String menu : Menu.MENU_LIST) {
			System.out.println(menu);
		}
	}

	///processing users input choice
	public static void processChoice(String choice) {
		if (choice.equals(Menu.ADD_CPU) || choice.equals(Menu.ADD_MEMORY) || choice.equals(Menu.ADD_MONITOR)
				|| choice.equals(Menu.ADD_MOTHER_BOARD) || choice.equals(Menu.ADD_GRAPHICS_CARD)) {
			selectProductOrder(choice);
		} else {
			switch (choice) {
			case Menu.VIEW_MODIFY_ORDER:
				reviewOrders(false);
				break;
			case Menu.SUBMIT_ORDER_EXIT:
				reviewOrders(true);
				break;
			case Menu.EXIT_WITHOUT_PURCHASE:
				exitProgram();
				break;
			default:
				System.out.println("Invalid Input: Please enter your choice again");
			}
		}

	}

	//check if customer ID exist in customer list
	public static boolean retrieveCustomer(String custID) {
		Customer customer = null;
		for (Customer c : customerList) {
			if (c.getID().equals(custID)) {
				customer = c;
			}
		}
		if (customer != null) {
			currentOrder.setCustomer(customer);
			return true;
		} else {
			System.out.println("Customer with ID " + custID + " not found!");
			return false;
		}
	}

	
	//add new customer in customer list and set it in the current Order object
	public static void addCustomer() {
		System.out.println("Enter Customer Info:");
		System.out.print("Name: ");
		String name = SCAN.next();

		String gender = "";
		while (gender.isEmpty()) {
			System.out.print("Enter Gender M/F : ");
			gender = SCAN.next();
			if (!gender.equalsIgnoreCase(Menu.MALE) && !gender.equalsIgnoreCase(Menu.FEMALE)) {
				gender = "";
				System.out.println("Invalid gender input! ");
			}
		}

		String mobile = "";
		while (mobile.isEmpty()) {
			System.out.print("Mobile No: ");
			mobile = SCAN.next();
			if (!isInputNumeric(mobile)) {
				System.out.println("Invalid mobile number!");
				mobile = "";
			}
		}

		System.out.print("Address: ");
		String address = SCAN.next();

		Customer customer = new Customer(name, gender, Long.parseLong(mobile), address);
		System.out.println("New Customer successfully added!");
		System.out.println(customer.toString());
		customerList.add(customer);
		currentOrder.setCustomer(customer);
	}

	//display products available for particular items depending on users choice
	public static void selectProductOrder(String choice) {
		int count = 0;
		int productSize = 0;

		switch (choice) {
		case Menu.ADD_CPU:
			productSize = product.getCpuList().size() - 1;

			System.out.println(Menu.CPU_TITLE);
			for (CPU cpu : product.getCpuList()) {
				System.out.println(count + "\t\t" + cpu.toString());
				count++;
			}

			break;
		case Menu.ADD_MEMORY:
			productSize = product.getMemoryList().size() - 1;

			System.out.println(Menu.MEMORY_TITLE);
			for (Memory memory : product.getMemoryList()) {
				System.out.println(count + "\t\t" + memory.toString());
				count++;
			}
			break;
		case Menu.ADD_MONITOR:
			productSize = product.getMonitoryList().size() - 1;

			System.out.println(Menu.MONITOR_TITLE);
			for (Monitor monitor : product.getMonitoryList()) {
				System.out.println(count + "\t\t" + monitor.toString());
				count++;
			}
			break;
		case Menu.ADD_MOTHER_BOARD:
			productSize = product.getMotherBoardList().size() - 1;

			System.out.println(Menu.MOTHER_BOARD_TITLE);
			for (MotherBoard motherBoard : product.getMotherBoardList()) {
				System.out.println(count + "\t\t" + motherBoard.toString());
				count++;
			}
			break;
		case Menu.ADD_GRAPHICS_CARD:
			productSize = product.getGraphicsCardList().size() - 1;

			System.out.println(Menu.GRAPHICS_CARD_TITLE);
			for (GraphicsCard gc : product.getGraphicsCardList()) {
				System.out.println(count + "\t\t" + gc.toString());
				count++;
			}
			break;
		}

		//ask the user to input the product ID he wants to order
		String selectedID = "";
		while (selectedID.isEmpty()) {
			System.out.print("Enter your Product ID choice: ");
			selectedID = SCAN.next();
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

	//using users input choice and the product id, product order will be added to the current order listings
	public static void addProductInOrderList(String choice, int productID) {
		switch (choice) {
		case Menu.ADD_CPU:
			currentOrder.getCpuList().add(product.getCpuList().get(productID));
			break;
		case Menu.ADD_MEMORY:
			currentOrder.getMemoryList().add(product.getMemoryList().get(productID));
			break;
		case Menu.ADD_MONITOR:
			currentOrder.getMonitorList().add(product.getMonitoryList().get(productID));
			break;
		case Menu.ADD_MOTHER_BOARD:
			currentOrder.getMotherBoardList().add(product.getMotherBoardList().get(productID));
			break;
		case Menu.ADD_GRAPHICS_CARD:
			currentOrder.getGraphicsCardList().add(product.getGraphicsCardList().get(productID));
			break;
		}
	}

	
	//review order with showTotal param, if showTotal = true, display total then exit
	public static void reviewOrders(boolean showTotal) {
		System.out.println("============== ORDERS ================");
		double totalAmount = 0;
		if(currentOrder.getCpuList().size() > 0) {
			System.out.println("----------------------------------- CPU -----------------------------------");
			System.out.println(Menu.CPU_TITLE);
			int count = 0;
			for (CPU cpu : currentOrder.getCpuList()) {
				System.out.println(count +"\t\t"+ cpu.toString());
				totalAmount = totalAmount + cpu.getPrice();
				count++;
			}
		}
		
		if(currentOrder.getMemoryList().size() > 0) {
			System.out.println("----------------------------------- MEMORY -----------------------------------");
			System.out.println(Menu.MEMORY_TITLE);
			int count = 0;
			for (Memory memory : currentOrder.getMemoryList()) {
				System.out.println(count +"\t\t"+ memory.toString());
				totalAmount = totalAmount + memory.getPrice();
				count++;
			}
		}
		
		if(currentOrder.getMonitorList().size() > 0) {
			System.out.println("----------------------------------- MONITOR -----------------------------------");
			System.out.println(Menu.MONITOR_TITLE);
			int count = 0;
			for (Monitor monitor : currentOrder.getMonitorList()) {
				System.out.println(count +"\t\t"+ monitor.toString());
				totalAmount = totalAmount + monitor.getPrice();
				count++;
			}
		}
		
		if(currentOrder.getMotherBoardList().size() > 0) {
			System.out.println("----------------------------------- MOTHERBOARD -----------------------------------");
			System.out.println(Menu.MOTHER_BOARD_TITLE);
			int count = 0;
			for (MotherBoard motherBoard : currentOrder.getMotherBoardList()) {
				System.out.println(count +"\t\t"+ motherBoard.toString());
				totalAmount = totalAmount + motherBoard.getPrice();
				count++;
			}
			
		}
		
		if(currentOrder.getGraphicsCardList().size() > 0) {
			System.out.println("----------------------------------- GRAPHICS CARD -----------------------------------");
			System.out.println(Menu.GRAPHICS_CARD_TITLE);
			int count = 0;
			for (GraphicsCard gc : currentOrder.getGraphicsCardList()) {
				System.out.println(count +"\t\t"+ gc.toString());
				totalAmount = totalAmount + gc.getPrice();
				count++;
			}
		}
		
		if(showTotal) {
			System.out.println("TOTAL AMOUNT OF ORDERS: "+totalAmount);
			exitProgram();
		}
		
	}
	
	
	//exiting the program
	//setting runProgam = false, so it will not go back to the loop in main method
	public static  void exitProgram() {
		System.out.println("Thank you for visiting. Come again.");
		runProgram = false;
	    SCAN.close();
		
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