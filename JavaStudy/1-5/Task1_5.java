public class Task1_5 {

    public static void main(String[] args) {

String[] fruits = new String[4];

//①
fruits[0] = "みかん";
fruits[1] = "りんご";
fruits[2] = "ぶどう";
fruits[3] = "めろん";


//②
for (int i = 0; i < fruits . length; i++) { 
    System.out.println(fruits[i]);
}



//③
int w = 1;
     while(w <= 100) {
   System.out.print(w);
    w++;
     }
System.out.println();


//④
for (int i = 1; i <= 9; i++) { 
    System.out.print(i+"||");
   
   for (int j = 1; j <= 9; j++) { 
      System.out.print((i * j)+"|" + " "); 
   } 

   System.out.println(); 
}



    }
}