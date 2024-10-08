public class sudoku {

    public static void main(String[] args) {

            // DECLARACION DE ARRAY
        //int[][] sudoku = new int[3][3];
        //Creamos un array de comprobación de número.
        int opcionesnumero[][] = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9}
        };
            // DECLARACION Y RELLENADO DEL ARRAY  
            

            int sudoku[][] = {
            {0, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 0, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
        
            {2, 3, 4, 5, 6, 7, 0, 9, 1},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
        
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {6, 7, 8, 9, 1, 2, 3, 4, 0},
            {9, 1, 2, 3, 4, 5, 6, 7, 8}
        };
        
        System.out.println("Esta es la tabla que debes rellenar. Busca el número que sustituiría al 0.");
        System.out.println(); 
        System.out.print("  -------------------------------------------------------");

        for(int f=0; f<sudoku.length; f++) {
            System.out.println(); 
            

            for(int c=0; c<sudoku.length; c++) {

                
                System.out.print( "  |  " + sudoku[f][c]);


            } // cierra for columna

            System.out.print( "  | ");

            System.out.println(); // Salto de línea después de imprimir cada fila
            // Añadir línea de separación después de cada 3 filas
            if ((f + 1) % 3 == 0) {
                System.out.print("  -------------------------------------------------------");
                //System.out.println();
            }
        } // cierra for fila

       
        System.out.println(); 
        
        System.out.println("Ahora vamos a buscar los números que corresponden.");
        System.out.println(); 
        System.out.print("  -------------------------------------------------------");

        for(int f=0; f<sudoku.length; f++) {
            System.out.println(); 
            

            for(int c=0; c<sudoku.length; c++) {

                if ((sudoku[f][c]) == 0){
                   int x;
                   int y;
                   for (c=0; c<sudoku.length; c++) {
                       if(opcionesnumero[0][0] != sudoku[f][c]){
                           x = opcionesnumero[0][0];
                           
                       
   
   
   
                   System.out.print( "  |  " + x );
                   }else{
                   System.out.print( "  |  " + sudoku[f][c]);
                }

                
            } // cierra for columna

            System.out.print( "  | ");

            System.out.println(); // Salto de línea después de imprimir cada fila
            // Añadir línea de separación después de cada 3 filas
            if ((f + 1) % 3 == 0) {
                System.out.print("  -------------------------------------------------------");
                //System.out.println();
            }
        } // cierra for fila

        
        System.out.println(); 
        

    }
}    