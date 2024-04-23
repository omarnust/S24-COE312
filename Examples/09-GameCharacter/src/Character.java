public class Character {
	private int healthPoints = 40;
    private Strategy strategy;

    public void setHealthPoints(int healthPoints) {
    	this.healthPoints = healthPoints;
    }
	
	public void meditate() {
		if (healthPoints <= 50) {
			setStrategy(new DefensiveStrategy());
		}else {
			setStrategy(new OffensiveStrategy());
		}
	}
	
	public void setStrategy(Strategy strategy) {
	    this.strategy = strategy;
	}
	
	public void executeStrategy() {
	    String action = strategy.performAction();
	    System.out.println("Performed " + action);    
	}
	
	
	


}