package SanthoshFramework.Practice;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashMapConcept {
	
	@Test(dataProvider="getData")
	public void ActualSet(HashMap<Object,Object> input)
	{
		System.out.println(input.get("Name")+" "+input.get("email")+" "+input.get("phone"));
		System.out.println("Done");
	}
	
	
//  #Passing data using object creation
	@DataProvider
	public Object[][] DataSet()
	{
		return new Object[][] { {"Santhosh","santhoshgrandhi9@gmail.com","8332977899"},{"Kranthi","santhoshindia999@gmail.com","8919224413"} };
	}


//  #Passing data using Hashmap
	@DataProvider
	public Object[][] getData()
	{
		HashMap<Object,Object> map = new HashMap<Object,Object>();
		map.put("email", "santhoshgrandhi9@gmail.com");
		map.put("Name", "Santhosh");
		map.put("phone", "8332977899");	
		
		HashMap<Object,Object> map1 = new HashMap<Object,Object>();
		map1.put("email", "santhoshindia999@gmail.com");
		map1.put("Name", "Kranthi");
		map1.put("phone", "8919224413");
		
		return new Object[][] {{map},{map1}};
		
	}
	
	
	
}
