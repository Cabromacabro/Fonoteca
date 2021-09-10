package Proyecto;

/**
 *
 * @author Oscar Pedraza <Oscar.Pedraza at Saturno.org>
 */
public class MainMaterial {

    public static void main(String[] args) {
        Fonoteca f1 = new Fonoteca();
        System.out.println(Fonoteca.discos.toString());

        f1.agregar("The Principle Of Evil Made Flesh", "Cradle Of Filth", 1994, "UK", "Cacophonous Records", "NIHIL 1 CD");
        System.out.println(Fonoteca.discos.toString());

        System.out.println(Fonoteca.discos.get(1));

        Object[][] table = f1.listar();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.println(table[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("**************************");
        Object[][] table2 = f1.obtenerPorId(1);
        for (Object[] filas : table2) {
            for (Object value : filas) {
                System.out.println(value);
            }
            System.out.println();
        }
        System.out.println("**************************");
        f1.eliminar(0);
        Object[][] table4 = f1.listar();
        for (Object[] filas : table4) {
            for (Object value : filas) {
                System.out.println(value);
            }
            System.out.println("");
        }
    }
}
