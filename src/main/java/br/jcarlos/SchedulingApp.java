package br.jcarlos;

import br.jcarlos.Scheduling.FCFS;
import br.jcarlos.Scheduling.PCB;
import br.jcarlos.Scheduling.Process;

public class SchedulingApp {

    public static void main(String[] args) throws InterruptedException {


        Process process1 = new Process("Add ",2);
        Process process2 = new Process("Multi ",10);
        Process process3 = new Process("Sub",4);

        PCB queue = new PCB();
        queue.addProcessToList(process1);
        queue.addProcessToList(process2);
        queue.addProcessToList(process3);

        FCFS fcfs = new FCFS(queue, 100);

        fcfs.run();


    }

}
