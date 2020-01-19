public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Run app");

        workOne(1,2,3,4);

        System.out.println("Check interval result: " + checkIntInterval(11, 5));

        checkIntPrint(-3);

        System.out.println("Is negative int: " + isNegativeInt(3));

        printWelcome("Petya");

        System.out.println("is leap year: " + isLeapYear(803));
    }

    static void workOne(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        System.out.println("One task. Result: " + result);
    }

    static Boolean checkIntInterval(int a, int b) {
        Boolean isValid = false;
        int summParams = a + b;

        if (summParams >= 10 && summParams <= 20) isValid = true;
        return isValid;
    }

    static void checkIntPrint(int a) {
        System.out.println("checkInt run, target value: " + a);
        if (a >= 0) {
            System.out.println(a + " > 0");
        } else {
            System.out.println(a + " < 0");
        }
    }

    static Boolean isNegativeInt(int a) {
        if (a < 0) return true;
        return false;
    }

    static void printWelcome(String name) {
        System.out.println("Hello " + name + "!");
    }

    static Boolean isLeapYear(int year) {
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) return true;
        return false;
    }
}
