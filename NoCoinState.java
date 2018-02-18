public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(Coin coin) {
		System.out.println("You inserted a coin.");
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}
 
	public void ejectCoins() {
		System.out.println("You haven't inserted a coin.");
	}
 
    public void turnCrank() 
    {

        switch ( this.gumballMachine.model ) {
            case TYPE25:
                System.out.println("You turned, but no quarter.") ;
                break;
            case TYPE50:
                System.out.println("You turned, but no quarters.") ;
                break;
            default:
                System.out.println("You turned, but no coins.") ;
                break;
        }
		
	 }
 
	public void dispense() {
		System.out.println("You need to pay first.");
	} 
 
	public String toString() {
		return "Waiting for coin.";
	}
}
