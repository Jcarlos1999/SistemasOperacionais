package br.jcarlos.Schudeling;

public class Process {

    private String nameProcess;
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

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
