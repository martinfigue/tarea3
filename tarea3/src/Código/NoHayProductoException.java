package Código;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(String mensajeError){
        super(mensajeError);
    }

}