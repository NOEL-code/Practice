package org.example.jpa.domain.exception;

public class NotEnoughStockException extends RuntimeException {

    public NotEnoughStockException(){

    }

    public NotEnoughStockException(String s) {
        super(s);
    }

    public NotEnoughStockException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public NotEnoughStockException(Throwable throwable) {
        super(throwable);
    }

    public NotEnoughStockException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
