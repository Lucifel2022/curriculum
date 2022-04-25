package check;

public class Check {
   private static String firstName = "片野" ;
   private static String lastName =  "司" ;
   public static void printName(String[] args) {
   }
   private static String getName(String firstName , String lastName) {
   
       return firstName + lastName ;
   }
    public static void main(String[] args) {
        System.out.println("printNameメソッド　→　"+getName(firstName , lastName));
    Pet pet = new Pet("java吉" , "hoge"); 
        RobotPet robot = new RobotPet("R2D2" , "ルーク");
      pet.introduce();
     robot.introduce();
    }
}