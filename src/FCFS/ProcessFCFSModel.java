package FCFS;

/**
 * FCFS的进程对象拥有的属性
 */

public class ProcessFCFSModel{

    private String processId; // 进程标识
    private long runTime; // 进程完整执行预计的时间
    private long comingTime; // 到达时间
    private long startRunTime; // 开始执行时间
    private long finishTime; // 完成时间
    private long turnaroundTime; // 周转时间

    public ProcessFCFSModel(String processId, long runTime, long comingTime) {
        this.processId = processId;
        this.runTime = runTime;
        this.comingTime = comingTime;
    }

    /**getter and setter*/
    public long getComingTime() {
        return comingTime;
    }

    public long getStartRunTime() {
        return startRunTime;
    }

    public void setStartRunTime(long startRunTime) {
        this.startRunTime = startRunTime;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public long getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(long turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }

    public String getProcessId() {
        return processId;
    }

    public long getRunTime() {
        return runTime;
    }

}
