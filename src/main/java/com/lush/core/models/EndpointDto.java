package com.lush.core.models;

/**
 * EndpointDto
 *
 * endpoint's methods and uri information.
 *
 * @author Is
 * @author Jelly
 */
public class EndpointDto {

  public static class Info {

    /**
     * Endpoint uri.
     */
    private String uri;

    /**
     * Http protocol method.
     */
    private String method;

    // Getter and Setter
    public String getUri() {
      return uri;
    }

    public void setUri(String uri) {
      this.uri = uri;
    }

    public String getMethod() {
      return method;
    }

    public void setMethod(String method) {
      this.method = method;
    }
  }
}
