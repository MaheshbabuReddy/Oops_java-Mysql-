import java.util.*;
public abstract class Bank{
    abstract public int Intrest();
     }
class SBI extends Bank{
    int rate;
    int year;
    int amount;
    public SBI(int rate, int year,int amount){
        this.rate=rate;
        this.year=year;
        this.amount=amount;
    }
    @Override
    public int Intrest(){
        int result= rate*year*amount/100 ;
        return result;
    }
}
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate of interest");
        int rate = sc.nextInt();
        System.out.println("Enter the year");
        int year = sc.nextInt();
        System.out.println("Enter the amount");
        int amount  = sc.nextInt();
        SBI sbi = new SBI(rate, year, amount);
        System.out.println("The intrest is "+sbi.Intrest());
        sc.close();
    
    }
}
