package com.lush.core.models;

import org.springframework.stereotype.Component;

@Component
public class Paginateion {

  /**
   * entity total count
   */
  private int total;

  /**
   * 
   */
  private int pre_page;

  private int current_page;

  private int last_page;

  private int next_page;

  private int prev_page;

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getPre_page() {
    return pre_page;
  }

  public void setPre_page(int pre_page) {
    this.pre_page = pre_page;
  }

  public int getCurrent_page() {
    return current_page;
  }

  public void setCurrent_page(int current_page) {
    this.current_page = current_page;
  }

  public int getLast_page() {
    return last_page;
  }

  public void setLast_page(int last_page) {
    this.last_page = last_page;
  }

  public int getNext_page() {
    return next_page;
  }

  public void setNext_page(int next_page) {
    this.next_page = next_page;
  }

  public int getPrev_page() {
    return prev_page;
  }

  public void setPrev_page(int prev_page) {
    this.prev_page = prev_page;
  }

}
