import java.util.*;
public class PairPro{
	public static void main(String[] args){
		String[] members=new String[args.length];
		String[] teacher={"先生"};
		for(int i=0;i<args.length;i++){
			members[i]=args[i];
		}
		//for(int i=0;i<args.length;i++){
		//	String member=new Random().nextLine(members[args.length]);
		//	System.out.println(members);
		for(int i=0;i<members.length;i++){
			if(members.length%2==0){
				System.out.print("{");
				for(int j=0;j<members.length/2;j+=2){
					System.out.printf("N.%d,D.%d",members[i],members[i+1]);
				}
				System.out.print("}");
			}else{
				Merge(members,teacher);
			}
			if(args.length !=1){
				System.out.println("引数にメンバーを入れてもう一度実行してください。");
				System.exit(1);
			}
		}
	}
	public static String[] Merge(String[] members,String[] teacher){
		String[] retArr=new String[members.length+teacher.length];
		for(int i=0;i<retArr.length-1;i++){
		retArr[i]=members[i]+teacher[i];
		}
		return retArr;
	}	
}
