package composition;

public class Main {

	public static void main(String[] args) {
		Dimentions dimentions = new Dimentions(10, 20, 5);
		Case theCase = new Case("220B", "Dell", "240", dimentions);
		Monitor monitor = new Monitor("27inch Beast", "HP", 27, new Resolution(2540, 1540));
		
		Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		PersonalComputer computer = new PersonalComputer(theCase, monitor, motherboard);
		computer.getMonitor().drawPixelAt(10, 20, "Red");
	}
}
