package bank;
class Account {
    public String name;
    protected String email;
    private String passowrd;

    // getterr & setters 
    public String getPassowrd() {
        return this.passowrd;
    }

    public void setPassword(String pass) {
        this.passowrd = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "John Doe";
        account1.email = "johndoe@example.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassowrd());
    }    
}

