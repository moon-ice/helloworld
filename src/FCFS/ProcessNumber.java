package FCFS;



/**
 *
 */
public class ProcessNumber {

    public static ProcessFCFSModel[] getFCFSModelArray() {

        /**自定义进程数量*/
        int processnumber=6;
        ProcessFCFSModel[] models = new ProcessFCFSModel[processnumber];

        models[0] = new ProcessFCFSModel("A", 4, 0);
        models[1] = new ProcessFCFSModel("B", 3, 1);
        models[2] = new ProcessFCFSModel("C", 5, 100);
        models[3] = new ProcessFCFSModel("D", 2, 3);
        models[4] = new ProcessFCFSModel("E", 4, 4);
        models[5] = new ProcessFCFSModel("F", 3, 4);
        return models;
    }

}
