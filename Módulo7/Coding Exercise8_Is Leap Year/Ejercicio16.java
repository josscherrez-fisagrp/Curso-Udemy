public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if(year <= 0){
            return false;
        }
        
        if(year % 4 != 0){
            return false;
        }
        
         if(year % 4 == 0 && year % 100 !=0){
            return true;
        }
         if(year % 4 == 0 && year % 100 ==0){
            if(year % 400 ==0){
                return true;
            }else{
                return false;
            }
        }
       return false;
    }
}