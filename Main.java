public class Main {
    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();

        //creating an instance of the login page
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo()); 

    }
}