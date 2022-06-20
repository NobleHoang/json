import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("FirstName","Dang");
        employeeDetails.put("LastName","Kim Thi");
        employeeDetails.put("website","codelean.vn");
        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee",employeeDetails);
        //second
        JSONObject employeeDetails2 =new JSONObject();
        employeeDetails2.put("FirstName","Cpde");
        employeeDetails2.put("LastName","Lean");
        employeeDetails2.put("website","codelean.com");

        JSONObject employeeObject2 =new JSONObject();
        employeeObject2.put("employee",employeeDetails2);
        //add employee to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        //write Json file
        try(FileWriter file=new FileWriter("employees.json")) {
            file.write(employeeList.toJSONString());
            file.flush();

        }catch ( IOException e){
            e.printStackTrace();
        }
    }
}
