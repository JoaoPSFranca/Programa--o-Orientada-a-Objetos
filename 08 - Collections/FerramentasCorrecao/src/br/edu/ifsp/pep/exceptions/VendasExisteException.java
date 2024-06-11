package br.edu.ifsp.pep.exceptions;

public class VendasExisteException extends Exception {

    public VendasExisteException() {
        super("Nao existe uma venda com esse codigo. ");
    }

    public VendasExisteException(String message) {
        super(message);
    }
    
}
