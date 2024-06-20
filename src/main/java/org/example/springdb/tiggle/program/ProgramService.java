package org.example.springdb.tiggle.program;

import org.example.springdb.tiggle.program.model.ProgramCreateReq;
import org.example.springdb.tiggle.program.model.ProgramCreateRes;
import org.springframework.stereotype.Service;

@Service
public class ProgramService {
    private ProgramRepository programRepository;

    public ProgramService(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    public ProgramCreateRes create(ProgramCreateReq dto) {
        programRepository.save(dto);
        return new ProgramCreateRes(dto.getProgramName(),dto.getSallerInfo() + "사에서 요청한 해당 공연 등록이 완료 되었습니다.");
    }



}
