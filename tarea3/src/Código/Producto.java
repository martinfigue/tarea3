package Código;

/**
 * Clase producto usada dentro del proyecto
 */
public abstract class Producto {
    private static int serie;

    /**
     *
     * @param numSerie numero de serie del producto
     */
    public Producto(int numSerie){
        serie = numSerie;
    }
    public static int getSerie(){
        return serie;
    }
    public abstract String consumir();
}

