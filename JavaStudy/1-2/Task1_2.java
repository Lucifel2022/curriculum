public class Task1_2 {

    public static void main(String[] args) {
//①        
String[] country = new String[3];
 country[0] = "JAPAN";
 country[1] = "AMERICA";
 country[2] = "KOREA";
//②　要素数3

//③
 String[] strArray = new String[3];
 strArray[0] = "りんご";
 strArray[1] = "もも";
 strArray[2] = "ぶどう";
//④
System.out.println(strArray[1]);

//⑤
//10,20,30,40,50を要素の値とする要素数5の
//intArrayという名前のint型配列を宣言。
int[] intArray = {10,20,30,40,50};


//⑥
//intArrayの中の2番目の要素と5番目の要素を
//合わせて出力。
System.out.println(intArray[1]+intArray[4]);
    }
}