package day4;

public class test7 {
    /*
    7.	Write a Java Application show all of the odd / even numbers from 1 to 100 ( 2 programs for each odd / even number )
     */
    public static void isOdd(){
        System.out.println("The odd name: ");
    for (int i=1; i<=100; i++){
        if (i%2!=0){
            System.out.println(i);

        }
    }
    }
    public static void issEvent() {
        System.out.println("The event name: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }


    }
    public static void main(String[] Args){
        isOdd();
        issEvent();
    }

}
