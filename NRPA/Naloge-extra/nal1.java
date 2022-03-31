public class nal1{
    public static void main(String[] args) {
        int[][] tabela = {{1,2,3},{4,5,6},{7,8,9}};

        izpisi2dtabelo(tabela);
    }

    public static void izpisi2dtabelo(int[][] tab) {
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                System.out.printf("%2d", tab[i][j]);
            }
            System.out.println();
        }
    }
}