package org.example.springdb.tiggle.program;


import org.example.springdb.tiggle.program.model.ProgramCreateReq;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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





}
