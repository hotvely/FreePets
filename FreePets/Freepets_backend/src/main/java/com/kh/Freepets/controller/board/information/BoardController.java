package com.kh.Freepets.controller.board.information;

import com.kh.Freepets.domain.board.information.*;
import com.kh.Freepets.service.board.information.HospitalReviewService;
import com.kh.Freepets.service.board.information.HrLikeService;
import com.kh.Freepets.service.board.information.ProductReviewService;
import com.kh.Freepets.service.board.information.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/info/*")
public class BoardController {

    @Autowired
    private HospitalReviewService hrService;
    @Autowired
    private HrLikeService hrLikeService;
    @Autowired
    private ProductReviewService prService;
    @Autowired
    private VideoInfoService viService;


    // hospitalReview
    
    // 게시글 전체 보기
    @GetMapping("/hr")
    public ResponseEntity<List<HospitalReview>> hrShowAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.showAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 한 개 보기
    @GetMapping("/hr/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> hrShow(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.show(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // 게시글 작성
    @PostMapping("/hr")
    public ResponseEntity<HospitalReview> hrCreate(@RequestBody HospitalReview hospitalReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.create(hospitalReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 수정
    @PutMapping("/hr")
    public ResponseEntity<HospitalReview> hrUpdate(@RequestBody HospitalReview hospitalReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.update(hospitalReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 삭제
    @DeleteMapping("/hr/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> hrDelete(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.delete(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // 게시글 좋아요
    @GetMapping("/hr/like/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> hrUpdateLike(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.updateLike(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // 게시글 좋아요 별로 보기
    @GetMapping("/hr/orderlike")
    public ResponseEntity<List<HospitalReview>> hrShowLike() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.showLike());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // 게시글 댓글 수 별로 보기
    @GetMapping("/hr/ordercomment")
    public ResponseEntity<List<HospitalReview>> hrShowComment() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.showComment());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // productReview

    // 게시글 전체 보기
    @GetMapping("/pr")
    public ResponseEntity<List<ProductReview>> prShowAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.showAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // 게시글 한 개 보기
    @GetMapping("/pr/{productReviewCode}")
    public ResponseEntity<ProductReview> prShow(@PathVariable int productReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.show(productReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // 게시글 작성
    @PostMapping("/pr")
    public ResponseEntity<ProductReview> prCreate(@RequestBody ProductReview productReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.create(productReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 수정
    @PutMapping("/pr")
    public ResponseEntity<ProductReview> prUpdate(@RequestBody ProductReview productReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.update(productReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 삭제
    @DeleteMapping("/pr/{productReviewCode}")
    public ResponseEntity<ProductReview> prDelete(@PathVariable int productReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.delete(productReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 좋아요 & 좋아요 개수 처리
//    @PostMapping("/pr/like")
//    public ResponseEntity<PrLike> prUpdateLike(@RequestBody PrLike prLike) {
//        try {
//            return ResponseEntity.status(HttpStatus.OK)
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    }
    
    // 게시글 좋아요 취소 개수 처리
    @GetMapping("/pr/likeDelete/{productReviewCode}")
    public ResponseEntity<ProductReview> prDeleteLike(@PathVariable int productReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.deleteLike(productReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 좋아요 정렬
    @GetMapping("/pr/orderlike")
    public ResponseEntity<List<ProductReview>> prShowLike() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.showLike());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 댓글 수 정렬
    @GetMapping("/pr/ordercomment")
    public ResponseEntity<List<ProductReview>> prShowComment() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.showComment());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // videoInfo
    
    // 게시글 전체 보기
    @GetMapping("/vi")
    public ResponseEntity<List<VideoInfo>> viShowAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.showAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 한 개 보기
    @GetMapping("/vi/{videoInfoCode}")
    public ResponseEntity<VideoInfo> viShow(@PathVariable int videoInfoCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.show(videoInfoCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // 게시글 작성
    @PostMapping("/vi")
    public ResponseEntity<VideoInfo> viCreate(@RequestBody VideoInfo videoInfo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.create(videoInfo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 수정
    @PutMapping("/vi")
    public ResponseEntity<VideoInfo> viUpdate(@RequestBody VideoInfo videoInfo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.update(videoInfo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 삭제
    @DeleteMapping("/vi/{videoInfoCode}")
    public ResponseEntity<VideoInfo> viDelete(@PathVariable int videoInfoCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.delete(videoInfoCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 좋아요
    @GetMapping("/vi/like/{videoInfoCode}")
    public ResponseEntity<VideoInfo> viUpdateLike(@PathVariable int videoInfoCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.updateLike(videoInfoCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 좋아요 정렬
    @GetMapping("/vi/orderlike")
    public ResponseEntity<List<VideoInfo>> viShowLike() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.showLike());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // 게시글 댓글 수 정렬
    @GetMapping("/vi/ordercomment")
    public ResponseEntity<List<VideoInfo>> viShowComment() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.showComment());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }




}
