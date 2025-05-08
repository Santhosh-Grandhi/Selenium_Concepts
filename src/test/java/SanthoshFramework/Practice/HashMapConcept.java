package SanthoshFramework.Practice;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SanthoshFramework.Data.jsonDataClass;

public class HashMapConcept {
	
	@Test(dataProvider="getDataFromJson")
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
	
//  Passing data from Json
	@DataProvider
	public Object[][] getDataFromJson() throws IOException
	{
		jsonDataClass data = new jsonDataClass();
		List<HashMap<Object, Object>> jsonData = data.getjsonData();
		return new Object[][] {{jsonData.get(0)},{jsonData.get(1)}};
	}
	
	
	
}
