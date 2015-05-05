//AUTHOR=====================================================================
//CAUP DORIAN B3B============================================================
//PACKAGE====================================================================
package Client;
//IMPORT=====================================================================
import org.json.JSONException;
import org.json.JSONObject;

public class JSON_Communication {
	private JSONObject Json = new JSONObject();
	public void Create_Request(String Message){
		try {
			Json.put("Command", Message);
		} catch (JSONException e) { System.out.println(e.getMessage());}		
	}
	//GET/SET=====================================================================
	public JSONObject getJson() {
		return Json;
	}
}
