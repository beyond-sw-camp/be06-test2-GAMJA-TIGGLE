package org.example.springdb.tiggle.program;


import org.example.springdb.tiggle.program.model.ProgramCreateReq;
import org.example.springdb.tiggle.program.model.ProgramReadRes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProgramRepository {
    private JdbcTemplate jdbcTemplate;

    public ProgramRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void save(ProgramCreateReq dto){
        jdbcTemplate.update("INSERT INTO program (programName,programInfo,resvationOpenDate,resvationCloseDate,imgUrl, age, runtime, sallerInfo, ProgramStartDate, ProgramEndDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                dto.getProgramName(),
                dto.getProgramInfo(),
                dto.getResvationOpenDate(),
                dto.getResvationCloseDate(),
                dto.getImgUrl(),
                dto.getAge(),
                dto.getRuntime(),
                dto.getSallerInfo(),
                dto.getProgramStartDate(),
                dto.getProgramEndDate());
    }

    public List<ProgramReadRes> finaAll(){
        List<ProgramReadRes> programReadRes = jdbcTemplate.query(
                "SELECT * FROM program",
                (rs, rownum) -> {
                    ProgramReadRes response = new ProgramReadRes(
                            rs.getString("programName"),
                            rs.getString("sallerInfo")
                    );
                    return response;
                });
        return programReadRes;
    }





}
