package Código;

/**
 * Las monedas del trabajo
 * @author ignaciodiaz
 * @author martinfigueroa
 */

public abstract class Moneda implements Comparable<Moneda>{
    private int serie;
    public Moneda(int serie){
        this.serie=serie;
    }

    /** Retorna la dirección a la moneda y la usaremos como número de serie
     * @return número de serie
     */
    public int getSerie(){
        return serie;
    }

    @Override
    public String toString() {
        return this.getSerie() + " " + this.getValor();
    }

    /** Indica el valor de la moneda
     *  @return el valor de la moneda
     */

    public abstract int getValor();

    @Override
    public int compareTo(Moneda o) {
        if (this.getValor() == o.getValor()){
            return 0;
        }
        else if(this.getValor() > o.getValor()){
            return 1;
        }
        else{
            return -1;
        }
    }
}