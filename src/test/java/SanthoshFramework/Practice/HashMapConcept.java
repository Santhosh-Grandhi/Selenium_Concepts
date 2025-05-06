package SanthoshFramework.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashMapConcept {
	
	@Test(dataProvider="DataSet")
	public void ActualSet(Object name, Object mail, Object phone)
	{
		System.out.println(name+" "+mail+" "+phone);
		System.out.println("Done");
	}
	
	
	@DataProvider
	public Object[][] DataSet()
	{
		return new Object[][] { {"Santhosh","santhoshgrandhi9@gmail.com","8332977899"},{"Kranthi","santhoshindia999@gmail.com","8919224413"} };
	}

}
