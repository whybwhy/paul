package org.paul.core.thread;

public class ThreadTest {


    class RamenCook implements  Runnable {

        private int ramenCount;
        private String[] burners = {"", "_", "_", "_"};

        public RamenCook(int count) {
            ramenCount = count;
        }

        @Override
        public void run() {
            while (ramenCount > 0) {

                synchronized (this) {
                    ramenCount --;
                    System.out.println(
                        Thread.currentThread().getName() + ": " + ramenCount + "개 남음"
                    );
                }

                for (int i = 0; i < burners.length; i++) {

                    if (!burners[i].equals("_")) continue;

                    synchronized (this) {
                        System.out.println(
                                Thread.currentThread().getName() + ": " + (i + 1) + " 번 배너 ON"
                        );
                    }

                    showBurners();
                }

                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized (this) {

                }
            }
        }

        private void showBurners() {

            StringBuilder stringToPrint = new StringBuilder();

            for (int i = 0 ; i < burners.length; i++) {
                stringToPrint.append(burners[i]);
            }

            System.out.println(stringToPrint);
        }


    }
}
