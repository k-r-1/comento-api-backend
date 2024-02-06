package com.devfun.settingweb_boot.test;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.service.StatisticService;
 
 
 
@Controller
public class settingTest {
    
 
    @Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping("/sqlyear-statistic")
    public Map<String, Object> sqltest(String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    @ResponseBody 
    @RequestMapping("/sqlmonth-statistic")
    public Map<String, Object> sqlmonthtest(String year, String month) throws Exception { 
        return service.monthloginNum(year, month);
    }
    
    @ResponseBody 
    @RequestMapping("/sqlday-statistic")
    public Map<String, Object> sqldaytest(String year, String month, String day) throws Exception { 
        return service.dayloginNum(year, month, day);
    }
    
    @ResponseBody 
    @RequestMapping("/sqldepartment-month-statistic")
    public Map<String, Object> sqlDepartmentMonthStatistic(String department, String year, String month) throws Exception { 
        return service.departmentMonthLoginNum(department, year, month);
    }
    
    @ResponseBody 
    @RequestMapping("/sqlnonholiday-monthly-statistic")
    public Map<String, Object> sqlNonHolidayMonthlyStatistic(String year, String month) throws Exception { 
        return service.nonHolidayLoginNum(year, month);
    }
    
    @ResponseBody 
    @RequestMapping("/sqlaverage-day-statistic")
    public Map<String, Object> sqlAverageDayStatistic(String year, String month, String day) throws Exception { 
        return service.averageDayLoginNum(year, month, day);
    }

    

    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}