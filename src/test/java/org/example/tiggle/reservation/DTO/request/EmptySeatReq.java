package org.example.tiggle.reservation.DTO.request;

public class EmptySeatReq {
    private Integer programId;
    private Integer timesId;

    public EmptySeatReq() {
    }

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    public Integer getTimesId() {
        return timesId;
    }

    public void setTimesId(Integer timesId) {
        this.timesId = timesId;
    }
}
