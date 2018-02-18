public class GumballMachine {
 
	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
 
	State state = soldOutState;

	GumballMachineType model;
	int balance;
	int count = 0;
 
	public GumballMachine(int numberGumballs, GumballMachineType model) {
		this.soldOutState    = new SoldOutState(this) ;
		this.noQuarterState  = new NoCoinState(this) ;
		this.hasQuarterState = new HasCoinState(this) ;
		this.soldState       = new SoldState(this) ;
		this.model           = model ;
		this.balance         = 0 ;
		this.count           = numberGumballs ;

		if (numberGumballs > 0) 
		{
			state = noQuarterState ;
		} 
	}
 
	public void insertCoin(Coin coin) 
	{
		state.insertCoin(coin) ;
	}
 
	public void ejectCoin() 
	{
		state.ejectCoin() ;
	}
 
	public void turnCrank() 
	{
		state.turnCrank() ;
		state.dispense() ;
	}

	void setState(State state) 
	{
		this.state = state ;
	}
 
	void releaseBall() 
	{
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) 
		{
			count -= 1 ;
		}
	}
 
	int getCount() 
	{
		return count ;
	}
 
	void refill(int count) 
	{
		this.count = count;
		state = noCoinState ;
	}

	public State getState() 
	{
        return state ;
    }

	public State getSoldOutState() 
	{
        return soldOutState ;
    }

	public State getNoCoinState() 
	{
        return noCoinState ;
    }

	public State getHasCoinState() 
	{
        return hasQuarterState ;
    }

	public State getSoldState() 
	{
        return soldState ;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
