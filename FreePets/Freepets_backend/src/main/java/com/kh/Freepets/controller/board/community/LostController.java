package com.kh.Freepets.controller.board.community;

import com.kh.Freepets.domain.board.community.Lost;
import com.kh.Freepets.service.board.community.LostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/*")
public class LostController {

     @Autowired
     private LostService service;

     @GetMapping("/lost")
    public ResponseEntity<List<Lost>>showAll(){
         return ResponseEntity.status(HttpStatus.OK).body(service.showAll());
     }

    @GetMapping("/lost/{lostCode}")
    public ResponseEntity <Lost>show(@PathVariable int lostCode){
        return ResponseEntity.status(HttpStatus.OK).body(service.show(lostCode));
    }

    @PostMapping("/lost")
    public ResponseEntity <Lost> create(@RequestBody Lost lost){
         return ResponseEntity.status(HttpStatus.OK).body(service.create(lost));
    }

    @PutMapping("/lost")
    public ResponseEntity<Lost> update(@RequestBody Lost lost){
         return ResponseEntity.status(HttpStatus.OK).body(service.create(lost));
    }

    @DeleteMapping("/lost/{lostCode}")
    public ResponseEntity<Lost>delete(@PathVariable int lostCode){
         return ResponseEntity.status(HttpStatus.OK).body(service.delete(lostCode));
    }


}
