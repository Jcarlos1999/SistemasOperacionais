package br.jcarlos.Schudeling;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class GenProcess {

    List<Process> processList = new ArrayList<>();

    public void addProcessToList(Process p){
        processList.add(p);
    }

    public void sortByPriority(Process p){
        this.processList.sort(new Comparator<Process>() {
            @Override
            public int compare(Process p1, Process p2) {
                return Integer.valueOf(p1.getPriority()).compareTo(p2.getPriority()) ;
            }
        });
    }

    public void sortByBurstTime(Process p){
        this.processList.sort(new Comparator<Process>() {
            @Override
            public int compare(Process p1, Process p2) {
                return Integer.valueOf(p1.getBurstTime()).compareTo(p2.getBurstTime()) ;
            }
        });
    }



}
