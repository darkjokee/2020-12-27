
class Order{
    private String Username;
    private String Password;
    private String Address;
    private User users;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) { this.Password = Password; }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) { this.Address = Address; }

    public User getUser() {
        return users;
    }

    public void setUser(User user) {
        this.users = user;
    }
}
