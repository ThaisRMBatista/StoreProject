package br.com.pattern.store;

public class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }
}
