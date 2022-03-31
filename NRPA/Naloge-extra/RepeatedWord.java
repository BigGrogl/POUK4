import java.util.Scanner;
public class RepeatedWord {
   public static void main(String[] args){
         int count=0;
         int count1=0;
         System.out.println("Enter the Sentence");
         Scanner scan=new Scanner(System.in);
         String s=scan.nextLine(); 
         System.out.println(s);
         String[] arr=s.split(" ");

         String[] srr=new String[arr.length];
         int[] rev=new int[arr.length];
         for(int i=0;i<arr.length; i++)
            { if(arr[i]!="NULL"){
            String temp=arr[i];

         for(int j=i+1;j<arr.length; j++){
         if(temp.equals(arr[j])){
            arr[j]="NULL";
         count++;

         }

            }

         srr[count1]=temp;
         rev[count1]=count;
         count=0;
         count1++;
         }

         }
         for(int i=0;i<count1;i++)
         System.out.println(srr[i]+"  "+rev[i]);
         }
         }