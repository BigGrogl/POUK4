import java.util.Scanner;

public class vaja1{
    public static void main(String[] args){
        
        //deklaracija scannerja, spremenljivk in tabel
        Scanner sc = new Scanner(System.in);
        String[] naselje = {"Banovci", "Vransko", "Trbovlje","Most na Soci","Cemsenik"};
        int[] postnaSt = {9241,3305,1420,5216,1413};
        Double[] povrsina = {2.64,3.1,10.232,1.57,2.28};
        String[] statRegija = {"Pomurska","Savinjska","Zasavska","Goriska","Zasavska"};


        //nal 4.1
        int X = 0;
        Double povr = 0.0;
        System.out.printf("Vnesi X: ");
        X = sc.nextInt();
        System.out.printf("Vnesi povrsino: ");
        povr = sc.nextDouble();
        povrsina[X]=povr;
        System.out.println(X+" "+povr);
        
        //break
        System.out.println();

        //nal 4.2
        System.out.printf("Vnesi postno stevilko in ime naselja: ");
        System.out.println(kratica(sc.nextInt(), sc.next()));

        //nal 4.3
        System.out.printf("Vnesite filter postnih stevilk: ");
        int temp = 0;
        temp = sc.nextInt();
        izborNaselij(temp, naselje, postnaSt);
        sc.nextLine();

        //nal 4.4
        System.out.printf("Vnesite ime regije: ");
        velikostRegije(sc.nextLine(), povrsina, statRegija);

        sc.close();
    }

    //nal 4.2
    public static String kratica(int pStevilka, String imeNaselja){
        String stevilka = Integer.toString(pStevilka);
        String kratica = imeNaselja.substring(1,3);
        String krat = stevilka.concat(kratica);
        return krat;
    }
    //nal 4.3
    public static void izborNaselij(int filter, String[] naselje, int[] postnaSt){
        for(int i = 0; i < postnaSt.length; i++){
            if(postnaSt[i]>filter){
                System.out.printf("%S%n",kratica(postnaSt[i], naselje[i]));
            }
        }
    }
    //nal 4.4
    public static void velikostRegije(String imeRegije, Double[] povrsina, String[] statRegija) {
        for(int j = 0; j < statRegija.length;j++){
            statRegija[j] = statRegija[j].toUpperCase();
            statRegija[j] = statRegija[j].trim();
        }
        imeRegije = imeRegije.toUpperCase();
        imeRegije = imeRegije.trim();

        if(statRegija[2].equals(imeRegije))
        System.out.printf("%S %S %n", statRegija[2], imeRegije);

        Double skupnaPovrsina = 0.0;

        for(int k = 0; k < povrsina.length; k++){
            if(statRegija[k].equals(imeRegije)){
                skupnaPovrsina = skupnaPovrsina + povrsina[k];
            }
        }
        System.out.printf("Velikost regije je: %.2f", skupnaPovrsina);

    }
}