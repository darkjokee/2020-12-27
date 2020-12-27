import java.util.List;

public class User {
    private String Password;
    private String username;
    private String Address;
    private String phone;
    //List<Order> orderList;

    /*
    获取XX的值
     */
    /*
    设置XX的值：赋值
     */
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() { return username; }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getPassword() { return Password; }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getAddress() { return Address; }
    /*
        5分钟后，写代码，保证phone的合理性
         */
    public void setPhone(String phone) {
        //如何判断phone的内容全部都是数字
        String errorMessage="";
        try
        {
            long phoneNumber=Long.parseLong(phone);
        }
        catch(NumberFormatException e){
            errorMessage="数字格式不正确";
        }
        if(!errorMessage.equals("")){
            return;
        }

        this.phone = phone;//真正的赋值语句
    }

}


