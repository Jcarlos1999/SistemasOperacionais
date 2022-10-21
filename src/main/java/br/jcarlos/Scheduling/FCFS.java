package br.jcarlos.Scheduling;

public class FCFS {

    private final PCB pcb;
    private int timeOfCycle = 0;

    public FCFS(PCB processList){
        this.pcb = processList;
    }

    public FCFS(PCB processList, int timeOfCycle){
        this.pcb = processList;
        this.timeOfCycle = timeOfCycle;
    }



    public int run() throws InterruptedException {

        // Start Algorithm

        if(this.pcb.processList.isEmpty()){
            System.out.println("A lista está vazia");
            return 0;
        }else{
            while(pcb.processList.size() != 0){
                if(pcb.processList.get(0).getBurstTime() > 0){
                    pcb.processList.get(0).setBurstTime(pcb.processList.get(0).getBurstTime() - 1);
                    System.out.print(pcb.processList.get(0).toString());
                    Thread.sleep(timeOfCycle);
                }else{
                    pcb.processList.remove(0);
                }
            }
            return 1;
        }
    }
}
