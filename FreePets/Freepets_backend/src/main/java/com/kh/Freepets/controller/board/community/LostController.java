package com.kh.Freepets.controller.board.community;

import com.kh.Freepets.domain.board.community.Lost;
import com.kh.Freepets.domain.board.community.LostLike;
import com.kh.Freepets.service.board.community.LostLikeService;
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

     @Autowired
     private LostLikeService lostlike;

     // 분실신고 게시글 전체보기
     @GetMapping("/lost")
    public ResponseEntity<List<Lost>>showAll(){
         return ResponseEntity.status(HttpStatus.OK).body(service.showAll());
     }

    // 분실신고 게시글 상세보기
    @GetMapping("/lost/{lostCode}")
    public ResponseEntity <Lost>showLost(@PathVariable int lostCode){
        return ResponseEntity.status(HttpStatus.OK).body(service.show(lostCode));
    }

    // 분실신고 게시글 추가하기
    @PostMapping("/lost")
    public ResponseEntity <Lost> createLost(@RequestBody Lost lost){
         return ResponseEntity.status(HttpStatus.OK).body(service.create(lost));
    }

    // 분실신고 게시글 수정하기
    @PutMapping("/lost")
    public ResponseEntity<Lost> updateLost(@RequestBody Lost lost){
         return ResponseEntity.status(HttpStatus.OK).body(service.update(lost));
    }

    // 분실신고 게시글 삭제하기
    @DeleteMapping("/lost/{id}")
    public ResponseEntity<Lost>deleteLost(@PathVariable int lostCode){
         return ResponseEntity.status(HttpStatus.OK).body(service.delete(lostCode));
    }

    // 분실 신고 좋아요 추가 POST - http://localhost:8080/api/lost/like
    @PostMapping("/lost/like")
    public ResponseEntity<LostLike> createLostLike(@RequestBody LostLike lostLike){
         return ResponseEntity.status(HttpStatus.OK).body(lostlike.create(lostLike));
    }
    // 분실 신고 좋아요 삭제 DELETE - http://localhost:8080/api/lost/like/{lostLikeCode}
    @DeleteMapping("lost/like/{id}")
    public ResponseEntity<LostLike> deleteLostLike(@PathVariable int lostLikeCode){
         return ResponseEntity.status(HttpStatus.OK).body(lostlike.delete(lostLikeCode));
    }
    //좋아요 갯수 처리 (쿼리문 update 로 좋아요 카운트가 하나씩 추가  )
    // 좋아요 갯수 취소



}
