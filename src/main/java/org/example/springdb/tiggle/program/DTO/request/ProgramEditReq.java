package org.example.springdb.tiggle.program.DTO.request;

public class ProgramEditReq {
    Integer programId;
    String colName;
    String colData;

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getColData() {
        return colData;
    }

    public void setColData(String colData) {
        this.colData = colData;
    }
}

