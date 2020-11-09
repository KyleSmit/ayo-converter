package com.kylesmit.ayoconverterweb.domain;

import com.kylesmit.ayoconverterweb.exception.Error;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public class RestResponse {

  private boolean success;
  private Error error;
  private Object data;

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
