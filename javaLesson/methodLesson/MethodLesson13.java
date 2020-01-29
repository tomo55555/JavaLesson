import java.util.*;
class MethodLesson13{
	//Mainメソッドにて以下の処理を実現する。なお、最初に作る配列は-10~10の乱数で埋め尽くすこと
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("配列の要素数を入力してください>");
		int len=s.nextInt();
		int[] orgArr=new int[len];
		for(int i=0;i<orgArr.length;i++){
			orgArr[i]=rand.nextInt(21)-10;
		}
		System.out.println("配列を生成しました。");
		printArr(orgArr);		
		//作業用配列の生成
		int[] tempArr=cloneArr(orgArr);
		while(true){
			System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了>");
			int select=s.nextInt();
			switch(select){
				case 1:
					printArr(orgArr);//オリジナルアレイを出力
					break;
				case 2:
					sortArr(tempArr);//テンポラリーアレイの配列を昇順にソートし、
					printArr(tempArr);//テンポラリーアレイを出力
					break;
				case 3:
					sortArr(tempArr,true);//テンポラリーアレイを降順にソートし、
					printArr(tempArr);//テンポラリーアレイを出力
					break;
				case 4:
					System.out.println("アプリケーションを終了します");
					s.close();//スキャナークローズ(なくても良いがグッドマナー)
					System.exit(0);//アプリ強制終了(０は正常終了を意味する)
			}	
		}		
	}
	//配列のクローンを返却するメソッドを作成する
	public static int[] cloneArr(int[] arr){
		int[] retArr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			retArr[i]=arr[i];
		}
		return retArr;
	}
	//配列を昇順に並び替えるメソッドを作成する
	public static void sortArr(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//上で作ったメソッドをオーバーロードし、第二引数でtrueを渡されると降順ソートするメソッドを作成する
	//if(isDesc==false){sortarr(arr);}else{とも書ける
	public static void sortArr(int[] arr,boolean isDesc){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(!isDesc && arr[i] > arr[j] || isDesc && arr[i] < arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//配列を以下のフォーマットで出力するメソッドを作成するpublic static void printArr(int[] arr){}printArrで作成した文字列の例{2,9,6,3,8}　※三項演算子を使っている
	public static void printArr(int[] arr){
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+(i==arr.length-1 ? "":","));
		}
		System.out.println("}");
	}
}
