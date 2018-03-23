package com.lush.core.models;

import org.springframework.stereotype.Component;
import com.lush.core.exceptions.CoreException;


/**
 * Response
 *
 * Response object to user requests.
 *
 * @author Is
 * @author Jelly
 */
@Component
public class Response {

  /**
   * Response status.
   */
  private String status;

  /**
   * Response message.
   */
  private String message;

  /**
   * Response code;
   */
  private int code;

  /**
   * Response data.
   */
  private Object data;

  /**
   * Description : Default constructor.
   */
  public Response() {
    this.status = "ok";
    this.code = 200;
    this.message = "";
    this.data = "";
  }

  /**
   * Description : Constructor.
   *
   * @param status
   * @param code
   * @param message
   */
  public Response(String status, int code, String message) {
    this.status = status;
    this.code = code;
    this.message = message;
    this.data = "";
  }

  /**
   * Description : Exception constructor.
   * 
   * @param status
   * @param code
   */
  public Response(CoreException code) {
    this.status = "fail";
    this.code = code.getCode();
    this.message = code.getMassage();
  }

  // Getter and Setter
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

}
