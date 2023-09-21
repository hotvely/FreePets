package com.kh.Freepets.controller.board.notice;

import com.kh.Freepets.domain.board.notice.Notice;
import com.kh.Freepets.service.board.notice.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/*")
public class NoticeController
{
    @Autowired
    private NoticeService notice;

    @GetMapping("/notice")
    public ResponseEntity<List<Notice>> showNoticeAll(){

        return ResponseEntity.status(HttpStatus.OK).body(notice.showNoticeAll());

    }

    @PostMapping("/notice/{id}")
    public ResponseEntity<Notice> createNotice(){
        return ResponseEntity.status(HttpStatus.OK).body(notice.)
    }
}

    @DeleteMapping("/notice/{id}")
    public
