public class Main {
    public static void main(String[] args) {
        int[][] matris1 = {
                {1,2,3},
                {4,5,6}};

        int[][] matris2 = new int[matris1[0].length][matris1.length];
        for (int i = 0; i<matris1.length; i++){
            for (int j = 0; j<matris1[0].length; j++){

                matris2[j][i] = matris1[i][j];
            }
        }
        System.out.println("Verilen matrisin transpozu: ");
        for (int[] row : matris2){
            for (int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}