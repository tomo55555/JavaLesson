import java.util.*;
public class test04{
	public static void main(String[] args){
		System.out.print("正の整数a：");
		int num1=new Scanner(System.in).nextInt();
		System.out.print("正の整数b：");
		int num2=new Scanner(System.in).nextInt();
		echo(num1,num2);
	}
	public static void echo(int x,int y){
		int max=y-x+1;
		int ans=new Random().nextInt(max)+x;
		System.out.printf("生成したランダムな値は%dです。",ans);
	}
}
