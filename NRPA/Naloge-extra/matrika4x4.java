public class matrika4x4 {
    public static void main(String[] args) {
        int[][] matrika = {{0,1,2,3,4,5},
                           {0,1,2,3,4,5},
                           {0,1,2,3,4,5},
                           {0,1,2,3,4,5},
                           {0,1,2,3,4,5},
                           {0,1,2,3,4,5}};
        System.out.println(matrika4(matrika));
    }
    public static int matrika4 (int[][] tabela){
        int vsota = 0;
        for(int i = 0; i<3;i++){
            for(int j = 3; j>0; j--){
                if(i!=j)
                vsota=vsota+tabela[i][j];
            }
        }
        return vsota;
    }
}
