package org.example.springdb.tiggle.program.model;

public class ProgramCreateRes {
    private String programName;
    private String sallerInfo;

    public ProgramCreateRes() {
    }

    public ProgramCreateRes(String programName, String sallerInfo) {
        this.programName = programName;
        this.sallerInfo = sallerInfo;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getSallerInfo() {
        return sallerInfo;
    }

    public void setSallerInfo(String sallerInfo) {
        this.sallerInfo = sallerInfo;
    }
}
