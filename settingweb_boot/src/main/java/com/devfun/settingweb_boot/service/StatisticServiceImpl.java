package com.devfun.settingweb_boot.service;
 
 
import java.awt.List;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> yearloginNum (String year) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> monthloginNum(String year, String month) {
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectMonthLogin(year, month);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> dayloginNum(String year, String month, String day) {
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectDayLogin(year, month, day);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("day", day);
            retVal.put("is_success", true);
        } catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("day", day);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> departmentMonthLoginNum(String department, String year, String month) {
        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            // uMapper가 null인지 확인하고 초기화되었는지 확인
            if (uMapper != null) {
                retVal = uMapper.selectDepartmentMonthLogin(department, year, month);
                if (retVal != null) {
                    // totCnt 값이 없으면 -999로 설정
                    if (!retVal.containsKey("totCnt")) {
                        retVal.put("totCnt", -999);
                    }
                    retVal.put("department", department);
                    retVal.put("year", year);
                    retVal.put("month", month);
                    retVal.put("is_success", true);
                } else {
                    // uMapper가 null이 아니지만 반환값이 null이면 오류 처리
                    retVal = new HashMap<String, Object>();
                    retVal.put("department", department);
                    retVal.put("year", year);
                    retVal.put("month", month);
                    retVal.put("is_success", false);
                    // totCnt 값이 없으면 -999로 설정
                    retVal.put("totCnt", -999);
                }
            } else {
                // uMapper가 null이면 오류 처리
                retVal.put("department", department);
                retVal.put("year", year);
                retVal.put("month", month);
                retVal.put("is_success", false);
                // totCnt 값이 없으면 -999로 설정
                retVal.put("totCnt", -999);
            }
        } catch(Exception e) {
            // 예외 처리
            retVal.put("department", department);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("is_success", false);
            // totCnt 값이 없으면 -999로 설정
            retVal.put("totCnt", -999);
        }

        return retVal;
    }
    
    @Override
    public HashMap<String, Object> nonHolidayLoginNum(String year, String month) {
        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.selectNonHolidayLogin(year, month);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("is_success", true);
        } catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("is_success", false);
        }

        return retVal;
    }
    
    @Override
    public HashMap<String, Object> averageDayLoginNum(String year, String month, String day) {
        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            // 해당 날짜의 총 로그인 수를 가져옴
            HashMap<String, Object> result = uMapper.selectDayLogin(year, month, day);
            int totalLogin = Integer.parseInt(result.get("totCnt").toString());

            // 총 로그인 수를 2로 나눈 값을 계산
            double averageLogin = totalLogin / 2.0;

            // 결과값 설정
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("day", day);
            retVal.put("averageLogin", averageLogin);
            retVal.put("is_success", true);
        } catch(Exception e) {
            // 예외 처리
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("day", day);
            retVal.put("averageLogin", -999); // 에러 표시용 값
            retVal.put("is_success", false);
        }

        return retVal;
    }

    
 
}