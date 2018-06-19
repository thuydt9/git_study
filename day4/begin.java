package day4;
/*
    1.	Given a method
            public class Dog(){
                public void bark(){
                    System.out.println("woof");
                }
            }

-	Use override to print “yack” instead of “woof”
-	Use overload, method will have 1 int parameter to set amount of time print to console “yoi yoi” line

     */
public class begin {
    public void print() {
        System.out.println("woof");
    }

}
//override
class beginOverride extends begin {
    public void print() {
        System.out.println("jack");
    }

    public static void main(String args[]) {
        beginOverride obj = new beginOverride();
        obj.print();
    }
}
//overload
class beginOverrLoad {
    public void print(int time) {
        for (int i = 1; i <= time; i++) {
            System.out.println("yoi yoi");
        }
    }

    public static void main(String args[]) {
        {
            beginOverrLoad obj = new beginOverrLoad();
            obj.print(10);
        }
    }
}