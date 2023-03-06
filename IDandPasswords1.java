import java.util.HashMap;

public class IDandPasswords1 {
    //hash map that will store key value names
    HashMap<String,String> logininfo = new HashMap<String, String>();
    //create a constructor for id and passswords class
    IDandPasswords1(){
        logininfo.put("Sara","Dziobak");
        logininfo.put("Elena","Nicko");
        logininfo.put("Bri","welcome");
        logininfo.put("Cam","bye");
    }

        //getter method in case any class requests it
       public HashMap getLoginInfo(){
            return logininfo; //we return the hash map and we send the login info
        }

    
    
}
