public class Task1_4 {


 
 //①
private static final String USER_NAME= "Souls_Lucifer" ;
private static final String USER_PASSWORD = "Lucifel2010" ;


private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";



public static void main(String[] args){

String name = "Souls_Lucifer";
String pass = "Lucifel2010";

//②
if (name == USER_NAME && pass == USER_PASSWORD){
System.out.println(CONST_MSG_SUCCESS);

//③
}else if (name == USER_NAME){
System.out.println(CONST_MSG_ERROR_PASS);

//④
}else if (pass == USER_PASSWORD){
System.out.println(CONST_MSG_ERROR_NAME);

//⑤
}else {
System.out.println(CONST_MSG_ERROR_INPUT);

}
       }
}