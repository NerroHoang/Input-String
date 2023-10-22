import checkInput.Check;

public class Main {
    public static void main(String[] args) {
        Check check = new Check(); 
        System.out.print("Phone number: ");
        String phone = check.checkInputPhone(); 
        System.out.print("Date: ");
        String date = check.checkInputDate();
        System.out.print("Email: ");
        String email = check.checkInputEmail();
    }
}
