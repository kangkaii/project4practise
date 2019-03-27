package kk.practice.多线程;import java.util.concurrent.CountDownLatch;import java.util.concurrent.ExecutorService;import java.util.concurrent.Executors;/** * @author kangkai on 2018/12/29. */public class CountDownLatchDemo02 {    private static int count = 5;    public static void main(String[] args) {        CountDownLatch begin = new CountDownLatch(1);        CountDownLatch end = new CountDownLatch(count);;        Player[] players = new Player[count];        for (int i = 0; i < count; i++) {            players[i] = new Player(i+1,begin,end);        }        ExecutorService es = Executors.newCachedThreadPool();        for(Player p : players) {            es.execute(p);        }        System.out.println("start --");        begin.countDown();        try {            end.await();        } catch (InterruptedException e) {            e.printStackTrace();        }finally {            System.out.println("end --");            es.shutdown();        }    }    static class Player implements Runnable{        private int id;        private CountDownLatch begin;        private CountDownLatch end;        public Player(int id, CountDownLatch begin, CountDownLatch end) {            this.id = id;            this.begin = begin;            this.end = end;        }        @Override        public void run() {            try {                begin.await();                Thread.sleep(1000);                System.out.println("PLAYER"+id+" finish");            } catch (InterruptedException e) {                e.printStackTrace();            }finally {                end.countDown();            }        }    }}