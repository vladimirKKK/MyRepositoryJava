package ru.relex.education.getInfoFromFile;

import java.util.List;

public class Attendence {
    
    private String name;
    private List<SaveTime>  timeInOut;
   

    public Attendence(String name, List<SaveTime> timeInOut) {
        this.name = name;
        this.timeInOut = timeInOut;
    }
    
    public void setList(List<SaveTime> timeInOutNew){
        this.timeInOut = timeInOutNew;
    }

    public String getName() {
        return name;
    }
    public List<SaveTime>  getTimeInOut() {
        return timeInOut;
    }
 }
