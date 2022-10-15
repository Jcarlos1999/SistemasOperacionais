package br.jcarlos.Scheduling;

public class Process {

    private final String nameProcess;
    private int burstTime;
    private int priority;

    public Process(String nameProcess, int burstTime){

        this.nameProcess = nameProcess;
        this.burstTime = burstTime;
    }

    public Process(String nameProcess, int burstTime, int priority){
        this.nameProcess = nameProcess;
        this.burstTime = burstTime;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return this.priority != 0 ? "\n\t\t" + nameProcess +
                                    " | busttime = " + burstTime + " | Priority = " + priority:
                                    "\n\t\t" + nameProcess +
                                    " | busttime = " + burstTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public String getNameProcess() {
        return nameProcess;
    }

}
