package com.frg0.caviar.toolkits.upload.exception;


public class FileStorageException extends RuntimeException {
    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause){
        super(message, cause);
    }
}
