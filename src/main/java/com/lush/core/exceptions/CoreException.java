package com.lush.core.exceptions;

import com.lush.core.models.Response;

/**
 * Core Exception(Common)
 * 
 * @author Jelly
 *
 */
public class CoreException extends RuntimeException {


  /**
   * The default creator. (using default code and message)
   * 
   * @param exceptionType
   */
  public CoreException(ExceptionType exceptionType) {
    Response response = new Response();
    response.setStatus("fail");
    response.setMessage(exceptionType.getMassage());
    response.setData(null);
    ExceptionRespose(response);
  }

  /**
   * The default creator. (User Created)
   * 
   * @param code
   * @param handlerMessage
   */
  public CoreException(int code, String handlerMessage) {
    Response response = new Response();
    response.setStatus("fail");
    response.setMessage(handlerMessage);
    response.setData(null);

    ExceptionRespose(response);
  }

  public Response ExceptionRespose(Response response) {
    return response;
  }
}
