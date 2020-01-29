import java.util.*;
public class test03{
	public static void main(String[] args){
		System.out.print("整数：");
		int num=new Scanner(System.in).nextInt();
		echo(num);
	}
	public static void echo(int x){
		if(x<0){
			System.out.println("実行結果は-1です。");
			}else{
			System.out.println("実行結果は1です。");
			}
	}
}
