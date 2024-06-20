package org.example.springdb.tiggle.program;


import org.example.springdb.tiggle.program.model.ProgramCreateReq;
import org.example.springdb.tiggle.program.model.ProgramCreateRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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






}
