public class Main1 {
    public static void main(String[] args) {
        IDandPasswords1 idandPasswords = new IDandPasswords1();

        //creating an instance of the login page
        LoginPage1 loginPage = new LoginPage1(idandPasswords.getLoginInfo()); 

    }
}
