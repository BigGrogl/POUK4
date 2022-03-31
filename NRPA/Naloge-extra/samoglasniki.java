import java.util.Scanner;
public class samoglasniki {
   public static void main(String args[]){
      int count = 0;
      System.out.println("Vnesi poved:");
      Scanner sc = new Scanner(System.in);
      String poved = sc.nextLine();

      for (int i=0 ; i<poved.length(); i++){
         char ch = poved.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u' || ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
            count ++;
         }
      }
      System.out.println("St. samoglasnikov: "+count);
   }
}