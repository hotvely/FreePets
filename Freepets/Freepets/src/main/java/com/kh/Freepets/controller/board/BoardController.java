package com.kh.Freepets.controller.board;

import com.kh.Freepets.domain.board.Board;
import com.kh.Freepets.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController
{
    @Autowired
    private BoardService service;

    @GetMapping("/board")
    public ResponseEntity<List<Board>> showAll()
    {
        return ResponseEntity.status(HttpStatus.OK).body(service.selectAll());
    }


}
