package kk.practice.多线程.joinTest;import org.apache.commons.logging.Log;import org.apache.commons.logging.LogFactory;/** * @author kangkai on 2018/11/22. */public class JoinThread implements Runnable{    private static Log LOGGER = LogFactory.getLog(JoinThread.class);    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {        /*         * 启动一个子线程 joinThread，然后等待子线程joinThread运行完成后         * 这个线程再继续运行         * */        Thread currentThread = Thread.currentThread();        long id = currentThread.getId();        Thread joinThread = new Thread(new JoinThread());        joinThread.start();        joinThread.join(50);        JoinThread.LOGGER.info("主线程 "+id+" 等待子线程joinThread 完毕");    }    public void run() {        Thread currentThread = Thread.currentThread();        long id = currentThread.getId();        JoinThread.LOGGER.info("子线程 "+id+" 已经开始");        try {            Thread.sleep(500);            JoinThread.LOGGER.info("子线程 "+id+" 消耗一段时间");        } catch (InterruptedException e) {            e.printStackTrace();        }        //执行到这里，说明线程被唤醒了        JoinThread.LOGGER.info("子线程 "+id+" 结束");    }}