package com.lush.core.exceptions;

/**
 * Exception Handler
 * 
 * @author Jelly
 * @author Is
 *
 */
public enum CoreException {

  /**
   * Not Found Data Exception
   */
  NotFoundData(404, "no data found"),

  /**
   * Duplicated Data Exception
   */
  DuplicatedData(412, "already duplicated data"),

  /**
   * Don't allow File type Exception
   */
  FileTypeException(415, "don't allow File type");

  /**
   * Exception Code
   */
  private final int code;

  /**
   * Exception Message
   */
  private final String massage;

  /**
   * Default creator
   * 
   * @param code
   * @param massage
   */
  CoreException(int code, String massage) {
    this.code = code;
    this.massage = massage;
  }

  public int getCode() {
    return code;
  }

  public String getMassage() {
    return massage;
  }

}
