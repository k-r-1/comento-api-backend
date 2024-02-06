package com.devfun.settingweb_boot.service;
 
import java.util.HashMap;
 
public interface StatisticService {
    public HashMap<String,Object> yearloginNum (String year);
    public HashMap<String, Object> monthloginNum(String year, String month);
    public HashMap<String, Object> dayloginNum(String year, String month, String day);
    public HashMap<String, Object> departmentMonthLoginNum(String department, String year, String month);
    public HashMap<String, Object> nonHolidayLoginNum(String year, String month);
    public HashMap<String, Object> averageDayLoginNum(String year, String month, String day);

    
}