import java.util.Scanner;

public class vaja1{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String[] naselje = {"Banovci", "Vransko", "Trbovlje","Most na Soči","Čemšenik"};
        int[] postnaSt = {9241,3305,1420,5216,1413};
        Double[] povrsina = {2.64,3.1,10.232,1.57,2.28};
        String[] statRegija = {"Pomurska","Savinjska","Zasavska","Goriška","Zasavska"};

        int X = 0;
        Double povr = 0.0;
        /*System.out.printf("Vnesi X: ");
        X = sc.nextInt();
        System.out.printf("Vnesi povrsino: ");
        povr = sc.nextDouble();
        System.out.println();*/
        System.out.printf("Vnesi postno stevilko in ime naselja: ");
        System.out.println(kratica(sc.nextInt(), sc.next()));
        sc.close();
        System.out.println(X+" "+povr);

        povrsina[X]=povr;
    }

    public static String kratica(int pStevilka, String imeNaselja){
        String stevilka = Integer.toString(pStevilka);
        String kratica = imeNaselja.substring(0,3);
        String krat = stevilka.concat(kratica);
        return krat;
    }



}