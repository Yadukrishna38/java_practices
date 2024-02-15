public class Loops {

    public static void main(String args[])
    {
        // based on finite times or based on condtion loops r there
        int i =1;
//        int j = 1;

        while(i<=5)
        {
            System.out.println("HI " + i );
            int j = 1;
            while(j<=3)
            {
                System.out.println("hello 3 times");
                j++;
            }

            i++;
        }
        int a = 6;
        do {
            System.out.println("Will runs once even if while cond is false: ");
            a++;
        } while(a<=5);

//        Calender using for loop
        for(int k=1;k<=5;k++){
            System.out.println("DAY " + k);
            for(int l =0;l<=9;l++)
            {
                System.out.println(" "+ (l+9) +" - " + (l+10) +":" + (" Your reminder: "));
            }
        }
//        Also works in for LOOP as
//            for(;i<=5;),
//        { Block i++}
    }
}
