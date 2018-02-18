
public interface State {
	public void insertCoin(Coin coin);
	public void ejectCoins();
	public void turnCrank();
	public void dispense();
}