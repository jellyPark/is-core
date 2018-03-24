package com.lush.core.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Date Format Util
 * 
 * @author Jelly
 *
 */
public class DateUtil {

  // get now local year
  public int getNowYear() {
    int nowYear = LocalDate.now().getYear();
    return nowYear;
  }

  // get now local month
  public int getNowMonth() {
    int nowMonth = LocalDate.now().getMonthValue();
    return nowMonth;
  }

  // get now local date
  public LocalDate getNowDate() {
    LocalDate nowDate = LocalDate.now();
    System.out.println("nowDate : " + nowDate);
    return nowDate;
  }

  // get now local time
  public LocalDateTime getNowTime() {
    LocalDateTime nowTime = LocalDateTime.now();
    return nowTime;
  }

  // get now time only
  public LocalTime getOnlyNowTime() {
    LocalTime nowOnlyNowTime = LocalTime.now();
    return nowOnlyNowTime;
  }

  // get date format local

}
