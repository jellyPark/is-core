package com.lush.core.exceptions;

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

  private final int code;
  private final String massage;

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
