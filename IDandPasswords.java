import java.util.HashMap;

public class IDandPasswords {
    //hash map that will store key value names
    HashMap<String,String> logininfo = new HashMap<String, String>();
    //create a constructor for id and passswords class
    IDandPasswords(){
        logininfo.put("Sara","hello");
        logininfo.put("Elena","hi");
        logininfo.put("Bri","welcome");
        logininfo.put("Cam","bye");
    }

        //getter method in case any class requests it
       protected  HashMap getLoginInfo(){
            return logininfo; //we return the hash map and we send the login info
        }

    
    
}
