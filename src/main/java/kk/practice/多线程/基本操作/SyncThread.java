package kk.practice.多线程.基本操作;/** * 此类说明：一个对象是否是线程安全的除了添加synchronized关键字以外 * 更重要的还要看如何进行这个对象的操作 * @author kangkai on 2018/11/21. */public class SyncThread implements Runnable {    private Integer value;    private static Integer NOWVALUE;    public SyncThread(int value) {        this.value = value;    }    /**     * 对这个类的实例化对象进行检查----由于main方法中，创建了两个对象，导致检查的根本不是一个对象     * 因此没有意义     */    private synchronized void dootherthing(long id) {        NOWVALUE = this.value;        System.out.println("当前ID的值：" + id + "  当前NOWVALUE的值：" + NOWVALUE);    }    /**     * 对这个类进行检查     */    private void doOtherthing(long id) {        synchronized (SyncThread.class) {            NOWVALUE = this.value;            System.out.println("当前ID的值：" + id + "  当前NOWVALUE的值：" + NOWVALUE);        }    }    @Override    public void run() {        Thread currentThread = Thread.currentThread();        Long id = currentThread.getId();        this.doOtherthing(id);    }    public static void main(String[] args) {        Thread thread01 = new Thread(new SyncThread(10));        Thread thread02 = new Thread(new SyncThread(100));        thread01.start();        thread02.start();        System.out.println();    }}