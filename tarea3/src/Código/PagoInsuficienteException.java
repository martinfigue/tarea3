package Código;

public class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(String mensajeError){
        super(mensajeError);
    }
}