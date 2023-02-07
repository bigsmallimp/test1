


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class aa {

    public String string="hello";
    public static void main(String[] args){
        Date date = new Date();
       DateFormat format3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        SimpleDateFormat df1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String format = df.format(date);
        String format1 = df1.format(date);
        String format2 = df2.format(date);

        System.out.println(date);
        System.out.println(format);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
    }
    private  void hello(){
        System.out.println("hello");
    }
    public   static  void  nihao(){
        System.out.println("你好");
    }
}
