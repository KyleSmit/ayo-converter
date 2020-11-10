package com.kylesmit.ayoconverterserver.exception;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public class Error {

  private int code;
  private String message;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
