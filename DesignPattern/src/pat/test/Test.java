package pat.test;

import pat.decorator.*;
import pat.factory.*;
import pat.observer.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Decorator pattern
		Computer com = new Computer();
		
		com = new Disc(com);			//add disc to com
		com = new Monitor(com);			//add monitor to com
		com = new LiquidCooling(com);	//add liquid cooling to com
		com = new LiquidCooling(com);	//add liquid cooling to com
		
		System.out.println("You have purchased " + com.description() + ".");
		
		//Factory pattern
		FirstFactory factory = new FirstFactory("Oracle");
		Connection con = factory.createConnection();
		System.out.println("You are connected to : " + con.description());
		FirstFactory factory2 = new FirstFactory("sql server");
		con = factory2.createConnection();
		System.out.println("You are connected to : " + con.description());
		
		//Observer pattern
		Database database = new Database();
		Archiver archiver = new Archiver();
		Client client = new Client();
		Boss boss = new Boss();
		database.registerObserver(archiver);
		database.registerObserver(client);
		database.registerObserver(boss);
		database.editRecord("delete", "record 1");
	}

}