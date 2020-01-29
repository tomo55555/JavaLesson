import java.util.*;
public class test02{
	public static void main(String[] args){
		System.out.print("文字列：");
		String word=new Scanner(System.in).nextLine();
		System.out.print("実行回数：");
		int num=new Scanner(System.in).nextInt();
		echo(word,num);
	}
	public static void echo(String x,int y){
		for(int i=0;i<y;i++){
		System.out.println(x);
		}
	}
}
