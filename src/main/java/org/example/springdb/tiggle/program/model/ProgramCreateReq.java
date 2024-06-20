package org.example.springdb.tiggle.program.model;

public class ProgramCreateReq {
    // 이따 datetime으로 바꿔주기

    private String programName;
    private String programInfo;
    private String resvationOpenDate;
    private String resvationCloseDate;
    private String imgUrl;
    private int age;
    private int runtime;
    private String sallerInfo;
    private String ProgramStartDate;
    private String ProgramEndDate;

    public ProgramCreateReq() {
    }

    public ProgramCreateReq(String programName, String programInfo, String resvationOpenDate, String resvationCloseDate, String imgUrl, int age, int runtime, String sallerInfo, String programStartDate, String programEndDate) {
        this.programName = programName;
        this.programInfo = programInfo;
        this.resvationOpenDate = resvationOpenDate;
        this.resvationCloseDate = resvationCloseDate;
        this.imgUrl = imgUrl;
        this.age = age;
        this.runtime = runtime;
        this.sallerInfo = sallerInfo;
        ProgramStartDate = programStartDate;
        ProgramEndDate = programEndDate;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramInfo() {
        return programInfo;
    }

    public void setProgramInfo(String programInfo) {
        this.programInfo = programInfo;
    }

    public String getResvationOpenDate() {
        return resvationOpenDate;
    }

    public void setResvationOpenDate(String resvationOpenDate) {
        this.resvationOpenDate = resvationOpenDate;
    }

    public String getResvationCloseDate() {
        return resvationCloseDate;
    }

    public void setResvationCloseDate(String resvationCloseDate) {
        this.resvationCloseDate = resvationCloseDate;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getProgramStartDate() {
        return ProgramStartDate;
    }

    public void setProgramStartDate(String programStartDate) {
        ProgramStartDate = programStartDate;
    }

    public String getSallerInfo() {
        return sallerInfo;
    }

    public void setSallerInfo(String sallerInfo) {
        this.sallerInfo = sallerInfo;
    }

    public String getProgramEndDate() {
        return ProgramEndDate;
    }

    public void setProgramEndDate(String programEndDate) {
        ProgramEndDate = programEndDate;
    }


}
