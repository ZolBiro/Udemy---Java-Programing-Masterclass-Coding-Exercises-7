public class TeenNumberChecker {

    public static boolean hasTeen (int number1, int number2, int number3){
        if (number1 <=19 && number1 >=13 || number2 <=19 && number2 >=13 || number3 <=19 && number3 >=13){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int year){
        if (year >= 13 && year <= 19 ) {
            return true;
        } else {
            return false;
        }
    }
}
