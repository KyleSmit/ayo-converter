package com.kylesmit.ayoconverterserver.exception;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public class ConverterTypeException extends Exception {

  public ConverterTypeException() {
  }

  public ConverterTypeException(String message) {
    super(message);
  }

  public ConverterTypeException(String message, Throwable cause) {
    super(message, cause);
  }

  public ConverterTypeException(Throwable cause) {
    super(cause);
  }

  public ConverterTypeException(String message, Throwable cause, boolean enableSuppression, boolean writeStackTrace) {
    super(message, cause, enableSuppression, writeStackTrace);
  }
}
