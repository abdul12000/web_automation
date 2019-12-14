package utilities;

public class Utility {
    private static int randomNumber =0;
    private static String userName= "";


    public static int getRandomNumber() {
        return randomNumber;
    }

    public static void setRandomNumber(int randomNumber) {
        Utility.randomNumber = randomNumber;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Utility.userName = userName;
    }
}
