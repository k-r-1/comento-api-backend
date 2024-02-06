package com.devfun.settingweb_boot.dao;
import java.util.HashMap;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    HashMap<String, Object> selectMonthLogin(String year, String month);
    HashMap<String, Object> selectDayLogin(String year, String month, String day);
    HashMap<String, Object> selectDepartmentMonthLogin(String department, String year, String month);
    HashMap<String, Object> selectNonHolidayLogin(String year, String month);
   
}