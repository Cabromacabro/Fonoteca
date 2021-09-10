
package Proyecto.modelo;

/**
 *
 * @author Oscar Pedraza <Oscar.Pedraza at Saturno.org>
 */
public class FonotecaE {
    
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FonotecaE(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public String toString(){
        return this.id + " - " + this.nombre;
    }
}
