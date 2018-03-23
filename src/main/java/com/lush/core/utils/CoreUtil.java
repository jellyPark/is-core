package com.lush.core.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

/**
 * Common Utils
 * 
 * @author Is
 *
 */
@Component
public class CoreUtil {

  /**
   * Method name : getResponseHeaders. Description : Get http headers.
   *
   * @return HttpHeaders
   */
  public HttpHeaders getResponseHeaders() {
    HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.setContentType(MediaType.APPLICATION_JSON);
    return responseHeaders;
  }
}
