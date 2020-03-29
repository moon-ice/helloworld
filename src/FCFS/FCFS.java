package FCFS;


public class FCFS {

    //TAG是FCFS类的名字
    private final String TAG = FCFS.class.getSimpleName();
    /**FCFS先来先服务算法*/
    public int execute(ProcessFCFSModel[] processList) {
        //如果进程对象为空或其长度为零则出错
        if (processList == null || processList.length == 0) {
            System.out.println(TAG + ">数据为空");
            return -1;
        }

        ProcessFCFSModel[] fcfsModels = processList;
        int runTimeSum = 0;
        //按照到达时间进行排序
        mysort(fcfsModels);
        //将进程对象进行遍历
        for (ProcessFCFSModel model : fcfsModels) {
            //如果总时间小于进程到达的时间,总时间变为该进程到来的时间：
            if (runTimeSum < model.getComingTime()) {
                runTimeSum = (int)model.getComingTime();
            }
            //将总时间设置为进程开始执行的时间
            model.setStartRunTime(runTimeSum);
            //该进程运行后的总时间
            runTimeSum += model.getRunTime();
            //设置该进程结束的时间
            model.setFinishTime(runTimeSum);
            //设置该进程的周转时间
            model.setTurnaroundTime(runTimeSum - model.getComingTime());
        }
        return runTimeSum;
    }

    /**选择排序*/
    public ProcessFCFSModel[] mysort(ProcessFCFSModel[] processList){
        ProcessFCFSModel temp;
        for(int i=0;i<processList.length;i++){
            for(int j=i+1;j<processList.length;j++){
                if(processList[i].getComingTime()>processList[j].getComingTime()){
                    temp = processList[i];
                    processList[i] = processList[j];
                    processList[j] = temp;
                }
            }
        }
        return processList;
    }
}