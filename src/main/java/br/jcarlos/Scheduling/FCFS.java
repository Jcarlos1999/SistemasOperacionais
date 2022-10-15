package br.jcarlos.Scheduling;

public class FCFS {

    private PCB pcb;
    private int count = 0;

    private int timeOfCycle;

    public FCFS(PCB processList){
        this.pcb = processList;
    }

    public FCFS(PCB processList, int timeOfCycle){
        this.pcb = processList;
        this.timeOfCycle = timeOfCycle;
    }



    public void run() throws InterruptedException {

        // Start Algorithm

        if(this.pcb.processList.isEmpty()){
            System.out.println("A lista está vazia");
        }else{
            while(pcb.processList.size() != 0 && count < pcb.processList.size()){
                if(pcb.processList.get(0).getBurstTime() > 0){
                    pcb.processList.get(0).setBurstTime(pcb.processList.get(0).getBurstTime() - 1);
                    System.out.print(pcb.processList.get(0).toString());
                    Thread.sleep(timeOfCycle);
                }else{
                    pcb.processList.remove(0);
                }
            }
        }
    }
}
