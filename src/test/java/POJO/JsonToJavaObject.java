package POJO;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonToJavaObject  {

   public  void readJson() throws JsonProcessingException {

       ObjectMapper mapper = new ObjectMapper();
       try {

           Student user = mapper.readValue(new File("Data/simple.json"), Student.class);
         //  Employee user = mapper.readValue(new File("Data/simple1.json"), Employee.class);


          // System.out.println(user.getAge());
           System.out.println(user.getPage());
       } catch (IOException e) {
           e.printStackTrace();
       }
       // UserDetailsPojo user =mapper.readValue(json,UserDetailsPojo.class);

    //  System.out.println(user.getDatas().getFirst_name());
     //   user.getDatas().getFirst_name();

   }
    }

