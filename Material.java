package Proyecto;

public class Material {

    //Atributos
    private int id;
    private String titulo;
    private String banda;
    private int year;
    private String pais;
    private String sello;
    private String codigo;
    //public static int contador = 1;

    //Constructor
    public Material(int id, String t, String b, int year, String p, String s, String c) {
        this.id = id;
        this.titulo = t;
        this.banda = b;
        this.year = year;
        this.pais = p;
        this.sello = s;
        this.codigo = c;

        //contador++;
    }

    //Métodos
    public int getId() {
        return this.id;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Material: " + this.id + ", " + this.titulo + ", " + this.banda + ", " + this.year + ", " + this.pais + ", " + this.sello + ", " + this.codigo;

    }
}
