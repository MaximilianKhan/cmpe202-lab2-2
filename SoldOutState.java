

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(Coin coin) {
		System.out.println("Sold out. Cannot insert coin.");
	}
 
	public void ejectCoins() {
		System.out.println("You cannot eject, as no coins in machine.");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are not any gumballs.");
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed.");
	}
 
	public String toString() {
		return "Sold out.";
	}
}
