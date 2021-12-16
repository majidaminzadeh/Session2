public class Session2 {
    public static void main(String[] args) {
        /*
            start : 1;
            step : +1
            repeat for 10 times
        */
        /*
         1- int i=1
         2- check the condition
            2.1- enter into loop -> if condition is true
            2.2- out of loop -> if condition is false
         4- increase/decrease step
         5- check the condition
            5.1- enter into loop -> if condition is true
            5.2- out of loop -> if condition is false
         6- same as 4
         7- same as 5
         ...
         */

        /*
        == equals
        > greater than
        < less than
        >= greater and equals
        <= less than and equals
        != not equals
         */
        /*
        +
        -
        /
        *
        ++
        --
         */
        for (int i = 1; i < 11; i = i + 2) {
            System.out.println("1");
//            continue;
            System.out.println("Test Continue");
            break;
        }

        // i++ -> i = i + 1
        // i-- -> i = i - 1
        for (int i = 1; i < 11; i++) {
            System.out.println("1");
        }

        for (int i = 0; i < 10; i++) {
            for(int j=0;j<5;j++){
                System.out.println("Nested For");
            }
        }
    }
}
