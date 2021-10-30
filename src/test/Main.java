package test;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Zegar z = new Zegar(10, 6, 50, "1");
        Zegar z2 = new Zegar(12, 15, 11, "2");
        Zegar z3 = new Zegar(8, 33, 15, "3");
        z.start();
        z2.start();
        z3.start();
    }
}

class Zegar extends Thread {
    int h,m,s;
    String z;
    public Zegar(int h, int m, int s, String z) {
        this.h = h;
        this.m = m;
        this.s = s;
        this.z = z;
    }

    public void run() {
        while(true) {
            System.out.println(this.h + ":" + this.m + ":" + this.s + "Zegarek nr:" + this.z);
            this.s++;
            try {
                Thread.sleep(1000);
            }catch(Exception e) {

            }
            if(this.s == 60) {
                this.s = 0;
                this.m++;
            }
            if(this.m == 60) {
                this.m = 0;
                this.h++;
            }
            if(this.h == 24)
                this.h = 0;
        }
    }

}
