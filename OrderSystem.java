import java.util.ArrayList;
import java.util.*;
class CPU {
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
class Memory {
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
class MotherBoard {
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
class Customer {
private final String ID;
private String name;
private String gender;
private String address;
private long mobileNumber;
public Customer(String ID, String name, String gender, String address,
long mobileNumber) {
Random r = new Random(System.currentTimeMillis());
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
class Order {
private CPU cpu;
private String id;
private Memory memory;
private Monitor monitor;
private double totalPrice;
private MotherBoard motherBoard;
private GraphicsCard graphicsCard;
private final Customer customerInfo;
public Order(Customer customerInfo) {
Random r = new Random(System.currentTimeMillis());
this.id = "O" + 0 + ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
this.totalPrice = 0.0;
this.customerInfo = customerInfo;
}
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public double getTotalPrice() {
return totalPrice;
}
public void setTotalPrice(double totalPrice) {
this.totalPrice = totalPrice;
}
public CPU getCpu() {
return cpu;
}
public void setCpu(CPU cpu) {
this.cpu = cpu;
}
public Memory getMemory() {
return memory;
}
public void setMemory(Memory memory) {
this.memory = memory;
}
public Monitor getMonitor() {
return monitor;
}
public void setMonitor(Monitor monitor) {
this.monitor = monitor;
}
public MotherBoard getMotherBoard() {
return motherBoard;
}
public void setMotherBoard(MotherBoard motherBoard) {
this.motherBoard = motherBoard;
}
public GraphicsCard getGraphicsCard() {
return graphicsCard;
}
public void setGraphicsCard(GraphicsCard graphicsCard) {
this.graphicsCard = graphicsCard;
}
public Customer getCustomerInfo() {
return customerInfo;
}
public String toString() {
StringBuilder builder = new StringBuilder();
builder.append("Order ID: ").append(id).append("\n");
if (cpu != null) {
builder.append("CPU \t: ").append(cpu.toString()).append("\n");
//totalPrice += cpu.getPrice();
}
if (motherBoard != null) {
builder.append("MotherBoard \t:").append(motherBoard.toString()).append("\n");
//totalPrice += motherBoard.getPrice();
}
if (memory != null) {
builder.append("Memory \t: ").append(memory.toString()).append("\n");
//totalPrice += memory.getPrice();
}
if (graphicsCard != null) {
builder.append("Graphic Card\t:").append(graphicsCard.toString()).append("\n");
//totalPrice += graphicsCard.getPrice();
}
if (monitor != null) {
builder.append("Monitor \t: ").append(monitor.toString()).append("\n");
//totalPrice += monitor.getPrice();
}
builder.append("Total Price \t: ").append(totalPrice);
return builder.toString();
}
}
class OrderingSystem {
private Order currentOrder;
private Customer currentCustomer;
private ArrayList<Order> orderList;
private final Scanner subMenuScanner;
private final ArrayList<CPU> cpuList;
private ArrayList<Memory> memoryList;
private ArrayList<Monitor> monitorList;
private final ArrayList<Customer> customersList;
private ArrayList<MotherBoard> motherBoardList;
private ArrayList<GraphicsCard> graphicsCardList;
public OrderingSystem() {
subMenuScanner = new Scanner(System.in);
this.orderList = new ArrayList<>();
this.customersList = new ArrayList<>();
this.cpuList = new ArrayList<>();
this.memoryList = new ArrayList<>();
this.monitorList = new ArrayList<>();
this.motherBoardList = new ArrayList<>();
this.graphicsCardList = new ArrayList<>();
populateAllLists();
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
OrderingSystem ob = new OrderingSystem();
System.out.println(" \n-------------------- Welcome to the Shop --------------------\n");
System.out.print("Enter your customer ID(If Returning Customer): ");
String id = scanner.nextLine();
if (!ob.isCustomerPresent(id))
ob.addCustomer(id);
else
ob.currentOrder = ob.getOrderList();
// Display the Main Menu
Label:
while (true) {
switch (displayMenu()) {
case 1:
ob.addCPU();
break;
case 2:
ob.addMemory();
break;
case 3:
ob.addMonitor();
break;
case 4:
ob.addMotherBoard();
break;
case 5:
ob.addGraphicCard();
break;
case 6:
ob.showOrderList(true);
break;
case 7:
ob.addToOrderList(ob);
break Label;
case 8:
System.out.println("Thankyou For Your Purchase.");
break Label;
default:
System.out.println("Invalid input! Please try again.");
break;
}
}
}
private void addToOrderList(OrderingSystem ob) {
if (currentOrder.getTotalPrice() > 0) {
orderList.add(currentOrder);
System.out.println("Your product list added into the Order list.");
ob.showOrderList(false);
}
System.out.println("Thank you For Your Purchase.");
}
private void addCPU() {
Label:
while (true) {
int selectedCPU = displayCPUTable();
switch (selectedCPU) {
case 0:
break Label;
case 1:
case 2:
case 3:
case 4:
case 5:
case 6:
case 7:
case 8:
CPU cpu = cpuList.get(selectedCPU - 1);
currentOrder.setCpu(cpu);
currentOrder.setTotalPrice(currentOrder.getTotalPrice() +
cpu.getPrice());
System.out.printf("\n%s CPU with model Number %s successfully added to cart.\n",cpu.getBrand(), cpu.getModelNo());
break Label;
default:
System.out.println("Invalid input! Please try again.");
break;
}
}
}
private void addMemory() {
Label:
while (true) {
int selectedMemory = displayMemoryTable();
switch (selectedMemory) {
case 0:
break Label;
case 1:
case 2:
case 3:
case 4:
case 5:
case 6:
case 7:
case 8:
Memory memory = memoryList.get(selectedMemory - 1);
currentOrder.setMemory(memory);
currentOrder.setTotalPrice(currentOrder.getTotalPrice() +
memory.getPrice());
System.out.printf("\n%s Memory with model Number %s successfully added to your cart.\n",memory.getSocket(), memory.getModelNo());
break Label;
default:
System.out.println("Invalid input! Please try again.");
break;
}
}
}
private void addMonitor() {
Label:
while (true) {
int selectedMonitor = displayMonitorTable();
switch (selectedMonitor) {
case 0:
break Label;
case 1:
case 2:
case 3:
case 4:
case 5:
case 6:
case 7:
case 8:
Monitor monitor = monitorList.get(selectedMonitor - 1);
currentOrder.setMonitor(monitor);
currentOrder.setTotalPrice(currentOrder.getTotalPrice() + monitor.getPrice());
System.out.printf("\n%s Monitor with model Number %s successfully added to your cart.\n",monitor.getBrand(), monitor.getModelNo());
break Label;
default:
System.out.println("Invalid input! Please try again.");
break;
}
}
}
private void addMotherBoard() {
Label:
while (true) {
int selectedIndex = displayMotherBoardTable();
switch (selectedIndex) {
case 0:
break Label;
case 1:
case 2:
case 3:
case 4:
case 5:
case 6:
case 7:
case 8:
MotherBoard motherBoard = motherBoardList.get(selectedIndex -
1);
currentOrder.setMotherBoard(motherBoard);
currentOrder.setTotalPrice(currentOrder.getTotalPrice() +motherBoard.getPrice());
System.out.printf("\n%s Motherboard with model Number %s successfully added to your cart.\n",motherBoard.getBrand(),motherBoard.getModelNo());
break Label;
default:
System.out.println("Invalid input! Please try again.");
break;
}
}
}
private void addGraphicCard() {
Label:
while (true) {
int selectedIndex = dispGraphicTable();
switch (selectedIndex) {
case 0:
break Label;
case 1:
case 2:
case 3:
case 4:
case 5:
case 6:
case 7:
case 8:
GraphicsCard graphicsCard = graphicsCardList.get(selectedIndex - 1);
currentOrder.setGraphicsCard(graphicsCard);
currentOrder.setTotalPrice(currentOrder.getTotalPrice() +
graphicsCard.getPrice());
System.out.printf("\n%s Graphics card with model Number %s successfully added to your cart.\n",graphicsCard.getBrand(),graphicsCard.getModelNo());
break Label;
default:
System.out.println("Invalid input! Please try again.");
break;
}
}
}
private int dispGraphicTable() {
System.out.println("Available Graphics cards: ");
System.out.println("\tSocket\t\tBrand\t\tModel\t\tPrice");
System.out.println("----------------------------------------------");
for (int i = 0; i < graphicsCardList.size(); i++) {
GraphicsCard graphicsCard = graphicsCardList.get(i);
System.out.println((i + 1) + "\t" + graphicsCard.toString());
}
System.out.print("Select a graphics card (0 for main menu) : ");
return subMenuScanner.nextInt();
}
private int displayCPUTable() {
System.out.println("Available CPUs: ");
System.out.println("\tBrand\t\tCore\t\tModel\t\tPrice");
System.out.println("-----------------------------------------");
for (int i = 0; i < cpuList.size(); i++) {
CPU cpu = cpuList.get(i);
System.out.println((i + 1) + "\t" + cpu.toString());
}
System.out.print("Select a CPU (0 for main menu) : ");
return subMenuScanner.nextInt();
}
private int displayMemoryTable() {
System.out.println("Available Memory: ");
System.out.println("\tSocket\t\tBrand\t\tSize\t\tModel\t\tPrice");
System.out.println("---------------------------------------------------");
for (int i = 0; i < memoryList.size(); i++) {
Memory memory = memoryList.get(i);
System.out.println((i + 1) + "\t" + memory.toString());
}
System.out.print("Select a memory (0 for main menu) : ");
return subMenuScanner.nextInt();
}
private int displayMonitorTable() {
System.out.println("Available Monitors: ");
System.out.println("\tBrand\t\tSize\t\tModel\t\tPrice");
System.out.println("----------------------------------------------");
for (int i = 0; i < monitorList.size(); i++) {
Monitor monitor = monitorList.get(i);
System.out.println((i + 1) + "\t" + monitor.toString());
}
System.out.print("Select a monitor (0 for main menu) : ");
return subMenuScanner.nextInt();
}
private int displayMotherBoardTable() {
System.out.println("Available Motherboards: ");
System.out.println("\tSocket\t\tBrand\t\tModel\t\tPrice");
System.out.println("----------------------------------------------");
for (int i = 0; i < motherBoardList.size(); i++) {
MotherBoard motherBoard = motherBoardList.get(i);
System.out.println((i + 1) + "\t" + motherBoard.toString());
}
System.out.print("Select a motherboard (0 for main menu) : ");
return subMenuScanner.nextInt();
}
private void showOrderList(boolean modifyOption) {
System.out.println("\nYour Order List: ");
System.out.println(currentOrder.toString());
System.out.println();
System.out.println(currentCustomer.toString());
if(modifyOption){
modifyOrder();
}
}
//this method to modify the order
private void modifyOrder() {
subMenuScanner.nextLine();
System.out.println("\nDo you want to modify your order? (Y/N)");
String modify = subMenuScanner.nextLine();
if("Y".equals(modify.toUpperCase())) {
System.out.println("Select computer component to remove: ");
System.out.println("1. CPU");
System.out.println("2. Memory");
System.out.println("3. Monitor");
System.out.println("4. Motherboard");
System.out.println("5. Graphics Card");
int componentToRemove = subMenuScanner.nextInt();
switch(componentToRemove) {
case 1:
if(currentOrder.getCpu() == null) {
System.out.println("No CPU in the current order list");
} else {
currentOrder.setTotalPrice(currentOrder.getTotalPrice() - currentOrder.getCpu().getPrice());
currentOrder.setCpu(null);
System.out.println("CPU removed from the current order list");
}
break;
case 2:
if(currentOrder.getMemory() == null) {
System.out.println("No Memory in the currentorder list");
} else {
currentOrder.setTotalPrice(currentOrder.getTotalPrice() -
currentOrder.getMemory().getPrice());
currentOrder.setMemory(null);
System.out.println("Memory removed from the current order list");
}
break;
case 3:
if(currentOrder.getMonitor() == null) {
System.out.println("No Monitor in the current order list");
} else {
currentOrder.setTotalPrice(currentOrder.getTotalPrice() -
currentOrder.getMonitor().getPrice());
currentOrder.setMonitor(null);
System.out.println("Monitor removed from the current order list");
}
break;
case 4:
if(currentOrder.getMotherBoard() == null) {
System.out.println("No Motherboard in the current order list");
} else {
currentOrder.setTotalPrice(currentOrder.getTotalPrice() -
currentOrder.getMotherBoard().getPrice());
currentOrder.setMotherBoard(null);
System.out.println("Motherboard removed from the current order list");
}
break;
case 5:
if(currentOrder.getMonitor() == null) {
System.out.println("No Monitor in the current order list");} 
else {
currentOrder.setTotalPrice(currentOrder.getTotalPrice() -
currentOrder.getMonitor().getPrice());
currentOrder.setMonitor(null);
System.out.println("Monitor removed from the current order list");
}
break;
default:
System.out.println("Invalid selection");
break;
}
}
}
private void populateAllLists() {
// Adding CPUs
cpuList.add(new CPU("Intel","i5", "9600K ",323));
cpuList.add(new CPU("Intel","i7", "9700K ",462));
cpuList.add(new CPU("Intel","i7", "9700F ",396));
cpuList.add(new CPU("Intel", "i9", "9900K ",591));
cpuList.add(new CPU("AMD", "4", "Ryzen 2200",200));
cpuList.add(new CPU("AMD", "6", "Ryzen 3600",310));
cpuList.add(new CPU("AMD", "8", "Ryzen 3700",489));
cpuList.add(new CPU("AMD", "8", "Ryzen 5800",669));
// Adding MotherBoards
motherBoardList.add(new MotherBoard("Intel","Gigabyte","H81M-DS2",129));
motherBoardList.add(new MotherBoard("Intel","Asus","J40051-C",169));
motherBoardList.add(new MotherBoard("Intel","MSI","Mpg-2390 ",225));
motherBoardList.add(new MotherBoard("Intel","Gigabyte","Z490 ",471));
motherBoardList.add(new MotherBoard("AMD","Gigabyte","B-450 ",117));
motherBoardList.add(new MotherBoard("AMD","Asus","A320I ",128));
motherBoardList.add(new MotherBoard("AMD","MSI","B450",232));
motherBoardList.add(new MotherBoard("AMD","Gigabyte","X570S",679));
// Adding Memories
memoryList.add(new Memory("DDR3","Kingston","8G ","KCP316ND8", 116));
memoryList.add(new Memory("DDR3","ADATA ", "16G","AX4U360038G18",189));
memoryList.add(new Memory("DDR3","G.Skill ","8G ","F3-10666CL9D", 96));
memoryList.add(new Memory("DDR4","Kingston","8G ","KCP426SS8", 93));
memoryList.add(new Memory("DDR4","G.Skill ","16G","F4-266C18S", 158));
memoryList.add(new Memory("DDR4","Crucial", "32G","CT32G4SFD832", 159));
// Adding Monitors
monitorList.add(new Monitor("Acer ", "K242HYLB ",24,194));
monitorList.add(new Monitor("LG ", "32QN600 ", 32,506));
monitorList.add(new Monitor("Asus ", "MB16ACZ ", 16,429));
monitorList.add(new Monitor("MSI ", "MP271QP ", 27,399));
monitorList.add(new Monitor("BenQ ", "PD3200Q ", 32,653));
monitorList.add(new Monitor("Philips","272M8CZ", 27,289));
// Adding Graphic Cards
graphicsCardList.add(new GraphicsCard("NVIDIA","Gigabyte","GeForce RTX 3070",1999));
graphicsCardList.add(new GraphicsCard("NVIDIA","Asus", "GeForce RTX 3070",1899));
graphicsCardList.add(new GraphicsCard("NVIDIA","MSI","GeForce RTX 3080",3099));
graphicsCardList.add(new GraphicsCard("AMD", "Gigabyte","Radeon RX 6900",3699));
graphicsCardList.add(new GraphicsCard("AMD", "Asus","Radeon RX 6900 ",3199));
graphicsCardList.add(new GraphicsCard("AMD", "MSI","Radeon RX 6900 ",2699));
}
private Order getOrderList() {
for (Order order : orderList) {
if (order.getCustomerInfo().getID().equals(currentCustomer.getID())) {
return order;
}
}
return null;
}
private static int displayMenu() {
System.out.println("\n1. Add a CPU");
System.out.println("2. Add a Memory");
System.out.println("3. Add a Monitor");
System.out.println("4. Add a Motherboard");
System.out.println("5. Add a Graphics card");
System.out.println("6. View/Modify the Order");
System.out.println("7. Submit the Order and exit");
System.out.println("8. Exit without the purchase");
System.out.print("\nEnter your choice (1-8): ");
return new Scanner(System.in).nextInt();
}
private boolean isCustomerPresent(String id) {
for (Customer customer : customersList) {
if (customer.getID().equals(id)) {
currentCustomer = customer;
return true;
}
}
return false;
}
private void addCustomer(String id) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = sc.nextLine();
System.out.print("Enter your gender: ");
String gender = sc.nextLine();
System.out.print("Enter your address: ");
String address = sc.nextLine();
System.out.print("Enter your mobile number: ");
long number = sc.nextLong();
currentCustomer = new Customer(id, name, gender, address, number);
customersList.add(currentCustomer);
currentOrder = new Order(currentCustomer);
}
}