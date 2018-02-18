import java.util.Random;

public class HasCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(Coin coin) 
	{

		switch ( this.gumballMachine.model ) {
			case TYPE25:
				System.out.println("You cannot insert another quarter.") ;
				break;

			case TYPE50:
				if ( this.gumballMachine.balance == 25 )
				{
					System.out.println("50 cents fully inserted. Please turn to receive gumball.") ;
					this.gumballMachine.balance += 25 ;
				}
				else
				{
					System.out.println("50 cents are already inserted. You cannot insert more quarters.") ;
				}
				break;

			case TYPE_ALL:
				if ( this.gumballMachine.balance == 25 )
				{
					System.out.println("50 cents fully inserted. Please turn to receive gumball.") ;
					this.gumballMachine.balance += 25 ;
				}
				else
				{
					System.out.println("50 cents are already inserted. You cannot insert more quarters.") ;
				}
				if (this.gumballMachine)
				break;

			default:
				break;
		}
	
	}
 
	public void ejectCoins() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "Waiting for the turn of the crank.";
	}
}
