class bank extends Thread{
    static int a=5000;

    public bank(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true) {
            synchronized ("q") {
                if (a > 0) {
                    System.out.println(Thread.currentThread().getName() + "取走了1000");
                    a -= 1000;
                } else {
                    System.out.println("没钱了");
                    break;
                }
            }
        }
    }
}
public class Exercise2 {
    public static void main(String[] args) {
        bank a=new bank("老公");
        bank b=new bank("老婆");
        a.start();
        b.start();
    }
}
