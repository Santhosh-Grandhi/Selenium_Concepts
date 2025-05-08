package SanthoshFramework.Data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonDataClass {
	
	public List<HashMap<Object, Object>> getjsonData() throws IOException
	{

//  Step-1: Convert json data file to string
		String jsonData = FileUtils.readFileToString(new File(System.getProperty("user.dir")+"//src//test//java//SanthoshFramework//Data//data.json"), StandardCharsets.UTF_8);
		
//  Step-2: Convert string to HashMap using jackson databind
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<Object, Object>> data = mapper.readValue(jsonData, new TypeReference<List<HashMap<Object, Object>>>(){
		});
		
		return data;
	}

}
