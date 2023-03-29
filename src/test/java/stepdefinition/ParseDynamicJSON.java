package stepdefinition;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

public class ParseDynamicJSON {

    public static void getKey(JSONObject json , String key){
        boolean exist = json.has(key);
        Iterator<?> keys;
        String nextKeys = null;

        if(!exist){

            keys=json.keys();
            while (keys.hasNext()){
                nextKeys=keys.next().toString();
            }

            if(json.get(nextKeys) instanceof JSONObject){
                if(exist==false){
                    getKey(json.getJSONObject(nextKeys),key);
                }
                
            } else if (json.get(nextKeys) instanceof JSONArray){

            }

        } else {
            System.out.println(json.get(key));
        }

    }

    public static void main(String[] args) {

        String inputjson = "{\n" +
                "    \"id\": 2,\n" +
                "    \"email\": \"janet.weaver@reqres.in\",\n" +
                "    \"first_name\": \"Janet\",\n" +
                "    \"last_name\": \"Weaver\",\n" +
                "    \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\",\n" +
                "  \"info\" : {\n" +
                "    \"url\" :{\n" +
                "    \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\n" +
                "   }\n" +
                "  }\n" +
                "}";


        JSONObject json = new JSONObject(inputjson);

        getKey(json,"text");
    }


}
