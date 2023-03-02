
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateText {
    public static void main(String[] args) throws ParseException {
        Function function=new Function();
        function.fun();
        Function4 function1=new Function4();
        function1.fun1();
    }
}
class Function{
    public void fun() throws ParseException {
        SimpleDateFormat simple2 = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个日期:");
        String date1=sc.next();
        System.out.println("第二个日期:");
        String date2=sc.next();
        Date t1=simple2.parse(date1);
        Date t2= simple2.parse(date2);
        long time = Math.abs(t1.getTime() - t2.getTime());
        long day = time / (1000 * 24 * 60 * 60);
        System.out.println(day);
    }
}
class Function4{
    public void fun1() throws ParseException {
        SimpleDateFormat simple2 = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期");
        String date=sc.next();
        Date enddate=simple2.parse(date);
        Date startdate=simple2.parse("1990-1-1");
        long time = Math.abs(enddate.getTime() - startdate.getTime());
        long day = time / (1000 * 24 * 60 * 60);
        long t=day/5;
        if(t%5==0){
            System.out.println("这一天为晒网");
        }else{
            long t2=t%5;
            if(t2>=1 && t2<=3){
                System.out.println("这一天为打鱼");
            }else{
                System.out.println("这一天为晒网");
            }
        }
    }
}

