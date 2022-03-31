import java.util.Scanner;
public class vaja2 {
    public static void main(String[] args) {
        
        //deklaracija scanner, spremenljivk, tabel
        Scanner sc = new Scanner(System.in);
        String[] besede = new String[100];

        //nal 4.1
        for(int i = 0; i < 5; i++){
            System.out.printf("%nVnesi %d besedo: ", i+1);
            besede[i] = sc.nextLine();
        }

        //nal 4.2
        System.out.printf("Vnesi index: ");
        vrniZnak(besede, sc.nextInt());

        //nal 4.4
        najvecSamoglasnikov(besede);

        sc.close();
    }
    //nal 4.2
    public static void vrniZnak(String[] besede, int N){
        System.out.println(besede[N].charAt(besede[N].length()-1));
    }
    //nal 4.3
    public static int steviloSamoglasnikov(String niz) {
        int count = 0;
        for(int i = 0; i < niz.length();i++){
            switch (niz.charAt(i)) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                break;
                case 'o':
                    count++;
                break;
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }
    //nal 4.4
    public static void najvecSamoglasnikov(String[] besede) {
        int max = 0;
        int index = 0;
        for(int i = 0; i < besede.length;i++){
            if(steviloSamoglasnikov(besede[i])>max){
                max = steviloSamoglasnikov(besede[i]);
                index = i;
            }
        }
        System.out.printf("Najvec samoglasnikov ima beseda %S (%d)", besede[index],max);
    }
}
