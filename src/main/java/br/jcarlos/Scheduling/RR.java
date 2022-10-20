package br.jcarlos.Scheduling;

public class RR {

    private PCB pcb;

    private int quantum;

    private int count = 0;

    public RR(PCB pcb, int quantum){
        this.pcb = pcb;
        this.quantum =  quantum;
    }

    public void run() throws InterruptedException{

        System.out.print("\t\tQuantum: " + quantum + "\n\t\tProcessos:" );
        System.out.println(pcb.processList.toString());
        System.out.println("-----------------------------------------------------------");

        if(pcb.processList.isEmpty()){
            System.out.println("A lista esta vazia!!!");
        }else {
            while (pcb.processList.size() != 0) {

                if(pcb.processList.get(count).getBurstTime() > 0){
                    pcb.processList.get(count).setBurstTime(pcb.processList.get(count).getBurstTime() - quantum);
                    if (pcb.processList.get(count).getBurstTime() < 0){
                        pcb.processList.get(count).setBurstTime(0);
                    }
                    System.out.println(pcb.processList.get(count).toString());
                    Thread.sleep(1000);
                    count++;


                }
                else if(pcb.processList.get(count).getBurstTime() == 0){
                    pcb.processList.remove(count);
                }
                if(count > pcb.processList.size() -1){
                    count = 0;
                }

            }
        }

    }


}
