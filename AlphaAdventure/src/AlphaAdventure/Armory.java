package AlphaAdventure;
import java.util.Scanner;
public class Armory {
	int cash;
	String type;
	weapon inhand;
	Scanner scan=new Scanner(System.in);
public Armory(String weapon,int money)
{
	type=weapon;
	cash=money;
	System.out.println("What type of weapon do you wish to make? ");
	if(scan.next().equalsIgnoreCase("Sword"));
	
	if(money>inhand.cost())
	{
		inhand=new Sword();
	}
	
	
	
}
public weapon Craft(String choice)
{
	return null;
}
}
