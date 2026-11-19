public class Main {
    public static void main(String[] args){
        int wheelCount= 6;
        boolean enabled=false;
        System.out.println(wheelCount);
        System.out.println(enabled);
        if (wheelCount >=6 ) {
            System.out.println("Big robot");
          }  else if (wheelCount >=3 ) {
            System.out.println("Small robot");
          }
          double speed= 0.5;
          boolean moving= true;
          System.out.println(speed);
          System.out.println(moving);
          if (speed > 0) {
            System.out.println("moving");
          } else {
            System.out.println("Not moving");
          }

    }
}
