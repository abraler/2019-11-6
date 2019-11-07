public class Exercise1 {
    public static int pnum=500;//票数

    public static class method implements Runnable{
        @Override
        public void run() {
            while (true)
                synchronized ("q") {
                    if (pnum > 0) {
                        System.out.println(Thread.currentThread().getName() + "出售了" + pnum);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        pnum--;
                    } else {
                        System.out.println("卖完了");
                        break;
                    }
                }
        }
    }

    public static void main(String[] args) {
        Thread ma=new Thread(new method());
        Thread me=new Thread(new method());
        Thread mc=new Thread(new method());
        ma.start();
        me.start();
        mc.start();
    }
}
