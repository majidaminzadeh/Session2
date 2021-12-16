public class Session2_3 {
    public static void main(String[] args) {
        int i=10;
        int j=1;
        /*
            || OR
            && AND
            ! NOT
         */
        if(i == 0 && j==1){
            System.out.println("True");
        } else if(i==1 || j!=10){
            System.out.println("i==1");
        } else if(!(i == 2) /* i != 2 */){
            System.out.println("i==2");
        } else {
            System.out.println("Wrong number");
        }

        int count;
        count = 3;
        String str = "True";
        System.out.println(str);
        String str2 = new String("True");
        System.out.println(str2);
        if(str.equals(str2)){
            System.out.println("String is True");
        } else {
            System.out.println("String is not equals");
        }


        int k = 1;
        String tr = k == 0 ? "K is 0" : "K is not 0";
        System.out.println(tr);
//        if( k == 0) {
//            System.out.println("K is 0");
//        } else {
//            System.out.println("K is not 0");
//        }
    }
}
