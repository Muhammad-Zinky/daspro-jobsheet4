import java.util.Scanner;

public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayname, daytype;

        System.out.print("Input day name: ");
        dayname = sc.nextLine();

        switch (dayname.toLowerCase()) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                daytype = "weekday";
                break;
            case "6":
            case "7":
            daytype = "weekend";
            break;
            default:
            daytype = "invalid day name";
        }
        System.out.println(dayname + " is a " + daytype);
}

}

