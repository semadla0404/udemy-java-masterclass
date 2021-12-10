public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){

        if(year < 1 || year > 9999){    // out of range
            return false;
        }

        if(((year % 4) == 0) && ((year % 100) != 0)){
            return true;
        } else if(((year % 100) == 0) && ((year % 400) == 0)){
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        
        int retValue;
        
        // Validation
        if(month < 1 || month > 12){
            return -1;
        }

        if(year < 1 || year > 9999){
            return -1;
        }

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                retValue = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                retValue = 30;
                break;
            case 2:
                if(isLeapYear(year)){
                    retValue = 29;
                } else {
                    retValue = 28;
                }
                break;
            default:
                retValue = -1;
                break;
        }

       return retValue;
    }
}
