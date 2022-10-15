package br.jcarlos;

import br.jcarlos.Scheduling.PCB;
import br.jcarlos.Scheduling.Process;
import org.junit.Assert;
import org.junit.Test;


public class SchedulingTest
{
    PCB queued = new PCB();
    @Test
    public void shouldHaveSize(){
        Process process1 = new Process("For test1 ",1);
        Process process2 = new Process("For test2 ",1);
        Process process3 = new Process("For test3",1);

        queued.addProcessToList(process1);
        queued.addProcessToList(process2);
        queued.addProcessToList(process3);

        Assert.assertEquals(3, queued.getProcessList().size());
    }

    @Test
    public void shouldBeSort(){

        Process process1 = new Process("For test1 ",22);
        Process process2 = new Process("For test2 ",12);
        Process process3 = new Process("For test3",30);

        queued.addProcessToList(process1);
        queued.addProcessToList(process2);
        queued.addProcessToList(process3);

        queued.sortByBurstTime(process1);

        Assert.assertEquals(12, queued.getProcessList().get(0).getBurstTime());
        Assert.assertEquals(22, queued.getProcessList().get(1).getBurstTime());
        Assert.assertEquals(30, queued.getProcessList().get(2).getBurstTime());



    }

    @Test
    public void shouldReturnCorretInfoProcess(){
        Process process1 = new Process("Add",2);
        Process process2 = new Process("Sub",15, 2);

        Assert.assertEquals("Add", process1.getNameProcess());
        Assert.assertEquals(2, process1.getBurstTime());
        Assert.assertEquals(0,process1.getPriority());

        Assert.assertEquals("Sub", process2.getNameProcess());
        Assert.assertEquals(15, process2.getBurstTime());
        Assert.assertEquals(2,process2.getPriority());

    }
}
