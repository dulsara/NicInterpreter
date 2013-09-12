/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.mevan.sample;

import org.joda.time.DateTime;

/**
 *
 * @author Admin
 */
public class NicInterpreter {

    private String nicNumber, year, dates, gender,voter;
    private int date = 0, realdate = 0, realyear = 0, realMonth = 0;
    DateTime day=new DateTime(2000,1,1,0,0);
    DateTime bday;

    public NicInterpreter(String nicNum) throws Exception{
        this.nicNumber = nicNum;
        year = nicNumber.substring(0, 2);
        dates = nicNumber.substring(2, 5);
        realyear = Integer.parseInt("19" + year);
        date = Integer.parseInt(dates);
        
        if(date>500){
            gender="female";
            realdate=date-500;
        }
        else {
            gender="male";
            realdate=date;
        }
        
        day=day.plusDays(realdate-1);
        realMonth=day.getMonthOfYear();
        realdate=day.getDayOfMonth();
        bday=new DateTime(realyear,realMonth,realdate,0,0);
    } 
    
    public String isVoter(){
        if((bday.plusYears(18)).compareTo(new DateTime())<0){
            voter="true";
        }
        else
            voter="false";
        return voter;
    }
    public int getBday(){
        return realdate;
    }

    public int getMonth() {
        return realMonth;
    }

    public int getYear() {
        return realyear;
    }
    
    public String getGender(){
        return gender;
    }
    public int getEnterDate(){
        return date;
    }
  
}
