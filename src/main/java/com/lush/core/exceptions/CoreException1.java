package com.lush.core.exceptions;

public class CoreException1 {

  private static final long serialVersionUID = 1L;

  /**
   * target id
   */
  private long id;

  /**
   * exception message
   */
  private String msg;

  public CoreException1(long id, String msg) {
    this.id = id;
    this.msg = msg;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

}
