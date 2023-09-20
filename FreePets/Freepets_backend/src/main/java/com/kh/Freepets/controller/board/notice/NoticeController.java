package com.kh.Freepets.controller.board.notice;

import com.kh.Freepets.domain.board.notice.Notice;
import com.kh.Freepets.service.board.notice.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/*")
public class NoticeController
{
    @Autowired
    public NoticeService service;

    @GetMapping("/notice")
    public ResponseEntity<List<Notice>> showNoticeAll(){
        return ResponseEntity.status((HttpStatus.OK).body(service.showNoticeAll());

    }

    @GetMapping("/notice")
    public ResponseEntity<Notice>show(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(service)
    }
}
