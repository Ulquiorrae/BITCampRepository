package DefendTheVillage;

public interface GameObject {

	boolean isAlive();
	
	void attack(GameObject other);
	
	void handleAttack(int attackStrength);
}
