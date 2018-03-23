package com.lush.core.exceptions;

public class CoreException1 {

  /**
   * Exception Code
   */
  private int code;

  /**
   * Exception Message
   */
  private String message;

  /**
   * The default creator. (using default code and message)
   * 
   * @param coreException
   */
  public CoreException1(CoreException coreException) {
    this.code = coreException.getCode();
    this.message = coreException.getMassage();
  }

  /**
   * The default creator. (User Created)
   * 
   * @param code
   * @param handlerMessage
   */
  public CoreException1(int code, String handlerMessage) {
    this.code = code;
    this.message = handlerMessage;
  }

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
