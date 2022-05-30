package Json;





import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import io.ous.jtoml.ParseException;

//import io.restassured.http.ContentType;
//import io.restassured.internal.assertion.Assertion;

public class ReadJSONExample {

    public ReadJSONExample() {
        // TODO Auto-generated constructor stub
    }

    
        @SuppressWarnings("unchecked")
        public static void main(String[] args) throws org.json.simple.parser.ParseException 
        {
           
            JSONParser jsonParser = new JSONParser();
             
            try {
            FileReader reader = new FileReader("C:\\Users\\saite\\eclipse-workspace\\app\\src\\test\\java\\Json\\employee.json");
            
               
                Object obj = jsonParser.parse(reader);
             
                JSONObject employeeObject = (JSONObject) obj;
              
             System.out.println((String) employeeObject.get("EmployeeID"));
             System.out.println((String) employeeObject.get("EmployeeName"));
             
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
     
        
}
