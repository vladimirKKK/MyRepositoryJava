package ru.relex.education.getInfoFromFile;

import java.util.Date;

public class SaveTime {
    private Date input;
    private Date output;

    public SaveTime(Date input, Date output) {
        this.input = input;
        this.output = output;
    }
    public void setInputtTime(Date input) {
        this.input = input;
    }
    public void setOutputTime(Date output) {
        this.output = output;
    } 
    
    public Date getInputTime() {
        return input;
    }
    public Date getOutputTime() {
        return output;
    }
}
