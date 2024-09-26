public class sudoku {

    public static void main(String[] args) {

            // DECLARACION DE ARRAY
        //int[][] sudoku = new int[3][3];

            // DECLARACION Y RELLENADO DEL ARRAY  
        int sudoku[][] = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
        
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
        
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {9, 1, 2, 3, 4, 5, 6, 7, 8}
        };
        

        System.out.println(); 
        System.out.print("  -------------------------------------------------------");

        for(int f=0; f<sudoku.length; f++) {
            System.out.println(); 
            

            for(int c=0; c<sudoku.length; c++) {

                
                System.out.print( "  |  " + sudoku[f][c]);


            } // cierra for columna

            System.out.print( "  | ");

            System.out.println(); // Salto de línea después de imprimir cada fila

        } // cierra for fila

        System.out.print("  -------------------------------------------------------");
        System.out.println(); 
        
    }
}    