package org.example.springdb.tiggle.program;


import org.example.springdb.tiggle.program.model.ProgramCreateReq;
import org.example.springdb.tiggle.program.model.ProgramCreateRes;
import org.example.springdb.tiggle.program.model.ProgramReadRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/program")
public class ProgramController {
    private ProgramService programService;

    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public ResponseEntity<ProgramCreateRes> create(@RequestBody ProgramCreateReq dto){
        ProgramCreateRes programCreateRes = programService.create(dto);
        return ResponseEntity.ok(programCreateRes);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/readAll")
    public ResponseEntity<List<ProgramReadRes>> readAll(){
        List<ProgramReadRes> programReadRes = programService.readAll();
        return ResponseEntity.ok(programReadRes);

    }






}
