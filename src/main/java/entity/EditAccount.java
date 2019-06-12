package entity;

public class EditAccount {
    private String account;
    private String password;
    private String confirmPassword;
    private String email;
    private String phone;
    private String address;

    public EditAccount() {
    }

    public EditAccount(String account, String password, String confirmPassword, String email, String phone, String address) {
        this.account = account;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getUsername() {
        return account;
    }

    public void setUsername(String username) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
