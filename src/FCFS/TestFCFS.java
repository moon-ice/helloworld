package FCFS;


/**
 * 测试类
 */
public class TestFCFS {

    public static void main(String[] args) {
        TestFCFS schedule = new TestFCFS();

        schedule.testFCFS();
        System.out.println("---------------------------------------------------------------------------------");
    }

    private void testFCFS() {
        /**进行FCFS算法进程调度*/
        FCFS fcfs = new FCFS();
        ProcessFCFSModel[] processArray = ProcessNumber.getFCFSModelArray();//创建进程
        int timeSum = fcfs.execute(processArray);//总运行时间
        int turnaroundSum = 0;//周转时间

        /**打印结果*/
        System.out.println("进程调度过程：\n进程名\t到达时间\t服务时间\t开始时间\t完成时间\t周转时间");
        for (ProcessFCFSModel process : processArray) {
            turnaroundSum += process.getTurnaroundTime();

            System.out.println(process.getProcessId() + "\t\t" +
                    process.getComingTime() + "\t\t" + process.getRunTime() + "\t\t" +
                    process.getStartRunTime() + "\t\t" + process.getFinishTime() + "\t\t" +
                    process.getTurnaroundTime() + "\t\t");
        }
        System.out.println("FCFS总运行时间：" + timeSum + "(ms)");
        System.out.println("平均周转时间：" + String.format("%.2f", 1.0*(turnaroundSum / processArray.length)));
    }
}
