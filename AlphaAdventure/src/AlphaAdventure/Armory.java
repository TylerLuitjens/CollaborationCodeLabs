package AlphaAdventure;

public class Armory {
	int cash;
	String type;
	weapon inhand;
public Armory(String weapon,int money)
{
	type=weapon;
	cash=money;
	inhand = new gun();
	
	System.out.println(inhand.health());
}
public weapon Craft(String choice)
{
	return null;
}
}
