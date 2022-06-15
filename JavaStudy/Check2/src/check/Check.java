package check;
import constants.Constants;
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
    Pet pet = new Pet(Constants.CHECK_CLASS_JAVA , Constants.CHECK_CLASS_HOGE); 
        RobotPet robot = new RobotPet(Constants.CHECK_CLASS_R2D2 ,Constants.CHECK_CLASS_LUKE );
      pet.introduce();
     robot.introduce();
    }
}