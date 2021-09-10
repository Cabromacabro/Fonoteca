package Proyecto;

import java.util.ArrayList;

public class Fonoteca {

    //Atributos
    public static ArrayList<Material> discos;
    private static int cantidadDiscos = 0;
    private static int secuenciaID = 0;
    
    public static void setSecuenciaID (int secuenciaID){
        Fonoteca.secuenciaID = secuenciaID;
    }

    //Constructor
    public Fonoteca() {
        discos = new ArrayList<Material>();
        //Material m1 = new Material(secuenciaID, "God Hates Us All", "314-586-332-2", "Slayer", 2001);
        discos.add(new Material(secuenciaID, "God Hates Us All", "Slayer", 2001, "USA", "American Records", "314-586-332-2"));
        secuenciaID++;
        cantidadDiscos++;

    }

    public void agregar(String t, String b, int year, String p, String s, String c) {
        Material m = new Material(secuenciaID, t, b, year, p, s, c);
        discos.add(m);
        secuenciaID++;
        cantidadDiscos++;
    }

    public static Object[][] listar() {
        Object[][] tabla = new Object[discos.size()][7];
        int contador = 0;
        for (Material i : discos) {
            tabla[contador][0] = i.getId();
            tabla[contador][1] = i.getTitulo();
            tabla[contador][2] = i.getBanda();
            tabla[contador][3] = i.getYear();
            tabla[contador][4] = i.getPais();
            tabla[contador][5] = i.getSello();
            tabla[contador][6] = i.getCodigo();
            contador++;
        }
        return tabla;
    }

    public Object[][] obtenerPorId(int id) {
        Object[][] tabla = new Object[1][7];
        for (Material i : discos) {
            if (i.getId() == id) {
                tabla[0][0] = i.getId();
                tabla[0][1] = i.getTitulo();
                tabla[0][2] = i.getBanda();
                tabla[0][3] = i.getYear();
                tabla[0][4] = i.getPais();
                tabla[0][5] = i.getSello();
                tabla[0][6] = i.getCodigo();
            }
        }
        return tabla;
    }

    public void modificar(int id, String t, String b, int year, String p, String s, String c) {
        for (Material i : discos) {
            if (i.getId() == id) {
                i.setTitulo(t);
                i.setBanda(b);
                i.setYear(year);
                i.setPais(p);
                i.setSello(s);
                i.setCodigo(c);
            }
        }
    }

    public void eliminar(int id) {
        for (Material i : discos) {
            if (i.getId() == id) {
                discos.remove(i);
                cantidadDiscos--;
                break;
            }
        }
    }
}
