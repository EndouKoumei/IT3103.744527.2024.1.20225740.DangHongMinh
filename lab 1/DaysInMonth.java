import javax.swing.JOptionPane;
public class DaysInMonth {
    public static void main(String[] args) {
        while (true) {
            String monthInput = JOptionPane.showInputDialog("Enter the month:");
            String yearInput = JOptionPane.showInputDialog("Enter the year:");
            //Validate year input
            int year = 0;
            if (!isValidYear(yearInput)) {
                JOptionPane.showMessageDialog(null, "Invalid year.",
                "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            } else {
                year = Integer.parseInt(yearInput);
            }
            //Validate month input
            int month = getMonth(monthInput);
            if (month == -1) {
                JOptionPane.showMessageDialog(null, "Invalid month.",
                "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            //Get the number of days in the month
            int days = getDaysInMonth(month, year);
            String message = "The number of days in the month " + monthInput + "/" + year + " is: " + days;
            JOptionPane.showMessageDialog(null, message,
            "Days in Month", JOptionPane.INFORMATION_MESSAGE);
            break; //Exit the loop after successful input
        }
    }
    private static boolean isValidYear(String yearInput) {
        // Check if the input is a non-negative integer
        return yearInput.matches("\\d{1,4}") && Integer.parseInt(yearInput) >= 0;
    }
    private static int getMonth(String monthInput) {
        // Convert the month input to a standard month number (1-12)
        switch (monthInput.toLowerCase().trim()) {
            case "january":
            case "jan":
            case "jan.":
            case "1":
                return 1;
            case "february":
            case "feb":
            case "feb.":
            case "2":
                return 2;
            case "march":
            case "mar":
            case "mar.":
            case "3":
                return 3;
            case "april":
            case "apr":
            case "apr.":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "jun.":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "jul.":
            case "7":
                return 7;
            case "august":
            case "aug":
            case "aug.":
            case "8":
                return 8;
            case "september":
            case "sep":
            case "sep.":
            case "9":
                return 9;
            case "october":
            case "oct":
            case "oct.":
            case "10":
                return 10;
            case "november":
            case "nov":
            case "nov.":
            case "11":
                return 11;
            case "december":
            case "dec":
            case "dec.":
            case "12":
                return 12;
            default:
                return -1; //Invalid month
        }
    }
    private static int getDaysInMonth(int month, int year) {
        // Determine the number of days in a month considering leap years
        switch (month) {
            case 1: //January
            case 3: //March
            case 5: //May
            case 7: //July
            case 8: //August
            case 10: //October
            case 12: //December
                return 31;
            case 4: //April
            case 6: //June
            case 9: //September
            case 11: //November
                return 30;
            case 2: //February
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; //Invalid month
        }
    }
    private static boolean isLeapYear(int year) {
        //Check if the year is a leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}