

public class Switch {

    public static void main(String args[])
    {
//        switch statements are like if else statement but it will execute whenever it matches case no
//        problem is whenever it matches any case it will execute remaining statements
//        no need of break in newer version j12
        int n = 9;

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
//            if neither of the tasks satisfies
            default:
                System.out.println("we have ran out of cases");

        }

//        Switch cases in JAVA 12 newer version changes

        String day = "Monday";
        String result = "";

        switch(day)
        {
            case "Saturday" -> result = "7am";
            case "Sunday"  -> result = "9am";
            default-> result = "10am";
        }
        System.out.println(result);

//        ALso can be done as below

        result = switch(day)
        {
            case "Saturday" , "Monday" -> "7am";
            case "Sunday"  -> "9am";
            default-> "10am";
        };
        System.out.println(result);

    }

        }
