package entity;

public class Account {

    private String account = "thanhhoa123";
    private String password = "123";
    private String confirmPassword;
    private String email;
    private String phone;
    private String address;
    private int balance = 20000;

    public Account() {
    }

    public Account(String account, String password, String confirmPassword,
                   String email, String phone, String address, int balance) {
        this.account = account;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
        this. phone = phone;
        this.address = address;
        this.balance = balance;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
