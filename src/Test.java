import javax.sound.midi.Soundbank;
import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        int i=0;
        boolean bool=true;
        while (true) {
            System.out.printf("请输入用户名：");
            Scanner sc = new Scanner(System.in);
            String username = sc.next();

            System.out.printf("\n请输入密码:");
            String password = sc.next();

            InputStream in=Class.forName("Test").getResourceAsStream("ueser.xlsx");
            ReadExcel readExcel = new ReadExcel();
            User users[] =  ReadExcel.readExcel(in);
            if (username.equals(users[i].getUsername()) && password.equals(users[i].getPassword())) {
                System.out.printf("登陆成功！");
                bool=false;
                break;
            } else
                System.out.printf("登录失败！");
            i++;
        }
    }
}