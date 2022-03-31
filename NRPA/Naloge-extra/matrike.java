import java.util.Scanner;
public class matrike{
    public static void main(String[] args){
        int[][] matrika = {{0,1,2,3,4,5},{0,1,2,3,4,5},{0,1,2,3,4,5},{0,1,2,3,4,5},{0,1,2,3,4,5},{0,1,2,3,4,5}};

        Scanner bralnik = new Scanner(System.in);
        System.out.printf("Vnesite stevilko: %n");
        int N = bralnik.nextInt();
        System.out.println();

        //metode
        System.out.printf("Vsota diagonale: %d%n", vsotaDiagonala(matrika));
        System.out.printf("Vsota pod diagonalo: %d%n", vsotaPodDiagonalo(matrika));
        System.out.printf("Vsota nad diagonalo: %d%n", vsotaNadDiagonalo(matrika));
        System.out.printf("Vsota 3. stolpca: %d%n", vsota3Stolpca(matrika));
        System.out.printf("Vsota 4. vrstice: %d%n", vsota4Vrstice(matrika));
        System.out.printf("Vsota %d stolpca: %d%n",N,vsotaNStolpca(matrika,N));
        System.out.printf("Najmanjsi element matrike: %d%n", minEle(matrika));
        System.out.printf("Najvecji element matrike: %d%n", maxEle(matrika));
        System.out.printf("Vsoti diagonal 4x4 matrike: %d %d%n", Matrika4x4(matrika)[0],Matrika4x4(matrika)[1]);

        
    }
    public static int vsotaDiagonala(int[][] tabela){
        int vsota = 0;
        for(int i = 0; i < tabela.length; i++){
            for(int j = 0; j <tabela[i].length ; j++){
                if(i==j)
                vsota = vsota + tabela[i][j];
            }

        }
        return vsota;
    }
    public static int vsotaPodDiagonalo(int[][] tabela){
        int vsota = 0;
        for(int i = 0; i<tabela.length; i++){
            for(int j = 0; j < tabela[i].length; j++){
                if(j<i){
                    vsota=vsota+tabela[i][j];
                }
            }
        }
        return vsota;
    }
    public static int vsotaNadDiagonalo(int[][] tabela){
        int vsota = 0;
        for(int i = 0; i<tabela.length; i++){
            for(int j = 0; j < tabela[i].length; j++){
                if(j>i){
                    vsota=vsota+tabela[i][j];
                }
            }
        }
        return vsota;
    }
    public static int vsota3Stolpca(int[][] tabela){
        int vsota = 0;
        for(int i = 0; i<tabela.length; i++){
            for(int j = 0; j < tabela[i].length; j++){
                if(j==2){
                    vsota=vsota+tabela[i][j];
                }
            }
        }
        return vsota;
    }
    public static int vsota4Vrstice(int[][] tabela){
        int vsota = 0;
        for(int i = 0; i<tabela.length; i++){
            for(int j = 0; j < tabela[i].length; j++){
                if(i==3){
                    vsota=vsota+tabela[i][j];
                }
            }
        }
        return vsota;
    }
    public static int vsotaNStolpca(int[][] tabela, int N){
        int vsota = 0;
        for(int i = 0; i<tabela.length; i++){
            for(int j = 0; j < tabela[i].length; j++){
                if(j==N){
                    vsota=vsota+tabela[i][j];
                }
            }
        }
        return vsota;
    }
    public static int minEle(int[][] tabela){
        int minEle = 0;
        for(int i = 0; i<tabela.length; i++){
            for(int j = 0; j < tabela[i].length; j++){
                if(tabela[i][j]<minEle){
                    minEle = tabela[i][j];
                }
            }
        }
        return minEle;
    }
    public static int maxEle(int[][] tabela){
        int maxEle = 0;
        for(int i = 0; i<tabela.length; i++){
            for(int j = 0; j < tabela[i].length; j++){
                if(tabela[i][j]>maxEle){
                    maxEle = tabela[i][j];
                }
            }
        }
        return maxEle;
    }
    public static int[] Matrika4x4(int[][] tabela){
        int vsotaLeft = 0;
        int vsotaRight = 0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j < 4; j++){
                if(j==i){
                    vsotaLeft=vsotaLeft+tabela[i][j];
                }
            }
        }
        vsotaRight = vsotaLeft;
        return new int[] {vsotaLeft, vsotaRight};
    }
}