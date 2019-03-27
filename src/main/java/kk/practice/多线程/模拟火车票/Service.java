package kk.practice.多线程.模拟火车票;/** * @author kangkai on 2018/11/27. */import java.time.LocalDate;import java.time.LocalTime;/** * 模拟服务器类 */public class Service {    //票名称，票总数，票余量    private String ticketName;    private int totalCount;    private int remaining;    public Service(String ticketName, int totalCount) {        this.ticketName = ticketName;        this.totalCount = totalCount;        this.remaining = totalCount;    }    public String getTicketName() {        return ticketName;    }    public Service setTicketName(String ticketName) {        this.ticketName = ticketName;        return this;    }    public int getTotalCount() {        return totalCount;    }    public Service setTotalCount(int totalCount) {        this.totalCount = totalCount;        return this;    }    public int getRemaining() {        return remaining;    }    public Service setRemaining(int remaining) {        this.remaining = remaining;        return this;    }    public synchronized int saleTicket(int count) throws InterruptedException {        if (remaining > 0) {            remaining -= count;            Thread.sleep(100); //为了模拟后台操作            //再次校验，是否抢到了票            if (remaining >= 0) {                return remaining;            }else {                remaining += count;            }        }        //无票//        System.out.println("抢票失败---无票");        return -1;    }}class TicketSaler implements Runnable{    // 窗口名    private String name;    private Service service;    public TicketSaler(String windowName, Service service) {        this.name = windowName;        this.service = service;    }    @Override    public void run() {        while (service.getRemaining() > 0) {            synchronized (this) {                try {                    int remaining = service.saleTicket(1);                    if (remaining >= 0) {                        System.out.println(Thread.currentThread().getName()+"抢票成功,剩余"+remaining+"张");                    }else {                        System.out.println(Thread.currentThread().getName()+"抢票失败"+remaining+"张"+ LocalTime.now());                    }                } catch (InterruptedException e) {                    e.printStackTrace();                }            }        }    }}/** * 测试类 */class TicketingSystem {    public static void main(String[] args) {        //new service        Service s = new Service("a-b",100);        //模拟8个窗口        Thread[] threads = new Thread[8];        LocalTime localTime = LocalTime.now();        System.out.println("开始时间"+localTime);        for (int i = 0; i < threads.length; i++) {            TicketSaler ticketSaler = new TicketSaler("售票窗",s);            threads[i] = new Thread(ticketSaler, "窗口" + (i + 1));            System.out.println("窗口" + (i + 1) + "开始出售 " + s.getTicketName() + " 的票...");            threads[i].start();        }//        System.out.println("结束"+LocalTime.now());10:38:04.165658400  10:38:14.596012900        // 10:38:42.489770700   10:38:52.575347500        String sa = "";    }}