package Day5;



import java.util.Iterator;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Create_JSON_Object_Jackson_API 
{
	// uri=https://reqres.in/api/users
         @Test
          void createuser()
          {
        	 // create object mapper class instance
        	 
        	 ObjectMapper objMap=new ObjectMapper();
        	 ObjectNode userdeatils=objMap.createObjectNode();
        	 userdeatils.put("firstname", "Rinki");
        	 userdeatils.put("lastname", "Kumari");
        	 userdeatils.put("age", 22);
        	 userdeatils.put("salary", 50000);
        	 userdeatils.put("Ismarried",false);
        	 
        	 
        	 ObjectNode techdeatils=objMap.createObjectNode();
        	 techdeatils.put("programming language", "JAVA");
        	 techdeatils.put("Web Automation", "Selenium");
        	 techdeatils.put("API Testing", "Rest Assured");
        	 
        	 userdeatils.set("TechSkill", techdeatils);
        	 
        	 // print uswerdetails Json object
        	 
        	 try {
				String userdeatilsAsString=objMap.writerWithDefaultPrettyPrinter().writeValueAsString(userdeatils);
				
				System.out.println("created Json Node is:" + userdeatilsAsString );
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
        	 
        		// reterive field value 
        	 
        String firstname=userdeatils.get("firstname").asText();
        System.out.println(firstname);
        
      Boolean b= userdeatils.get("Ismarried").asBoolean();
      System.out.println( b);
      
      // reterive value of webautomation
      String WebAuto= userdeatils.get("TechSkill").get("Web Automation").asText();
      System.out.println(  WebAuto);
      
      
      System.out.println("==============================Print All Fields ========================\n");
     
          Iterator <String> fieldname=userdeatils.fieldNames();
          
          while(fieldname.hasNext()) 
          {
        	  System.out.println(fieldname.next() );
          }
          
          System.out.println("==============================Print All Fields ========================\n");
          
          Iterator <JsonNode> fieldvalue=userdeatils.elements();
          
          while(fieldvalue.hasNext()) 
          {
        	  System.out.println(fieldvalue.next() );
          }
        	 
         System.out.println("==============================Print All Fieldswith value ========================\n");
          
          Iterator<Entry<String, JsonNode>> KeyValueEnteries=userdeatils.fields();
          
          while(KeyValueEnteries.hasNext()) 
          {
        	  Entry<String, JsonNode> node= KeyValueEnteries.next();
        	  System.out.println("key" + node.getKey() +"," + "value" + node.getValue() );

        	
        	  
        	  // remove field "first name"from json object  or objectnode
        	  
             
        	  

          }
          }
}
