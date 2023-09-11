package com.kh.Freepets.controller.board.information;

import com.kh.Freepets.domain.board.information.HRComment;
import com.kh.Freepets.service.board.information.HRCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/info/*")
public class CommentController {

    @Autowired
    private HRCommentService hrService;

    @GetMapping("/hr/comment/{hospitalReviewCode}")
    public ResponseEntity<List<HRComment>> hrShowAll(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.showBoardAll(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("hr/comment")
    public ResponseEntity<HRComment> hrCreate(@RequestBody HRComment hrComment) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.create(hrComment));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("hr/comment")
    public ResponseEntity<HRComment> hrUpdate(@RequestBody HRComment hrComment) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.update(hrComment));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
