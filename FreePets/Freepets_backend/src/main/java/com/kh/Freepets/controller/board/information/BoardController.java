package com.kh.Freepets.controller.board.information;

import com.kh.Freepets.domain.board.information.HospitalReview;
import com.kh.Freepets.domain.board.information.ProductReview;
import com.kh.Freepets.domain.board.information.VideoInfo;
import com.kh.Freepets.service.board.information.HospitalReviewService;
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
    private ProductReviewService prService;
    @Autowired
    private VideoInfoService viService;


    // hospitalReview

    @GetMapping("/hr")
    public ResponseEntity<List<HospitalReview>> hrShowAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.showAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> hrShow(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.show(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PostMapping("/hr")
    public ResponseEntity<HospitalReview> hrCreate(@RequestBody HospitalReview hospitalReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.create(hospitalReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/hr")
    public ResponseEntity<HospitalReview> hrUpdate(@RequestBody HospitalReview hospitalReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.update(hospitalReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/hr/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> hrDelete(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.delete(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/like/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> hrUpdateLike(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.updateLike(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/orderlike")
    public ResponseEntity<List<HospitalReview>> hrShowLike() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.showLike());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/ordercomment")
    public ResponseEntity<List<HospitalReview>> hrShowComment() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.showComment());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // productReview

    @GetMapping("/pr")
    public ResponseEntity<List<ProductReview>> prShowAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.showAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/pr/{productReviewCode}")
    public ResponseEntity<ProductReview> prShow(@PathVariable int productReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.show(productReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PostMapping("/pr")
    public ResponseEntity<ProductReview> prCreate(@RequestBody ProductReview productReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.create(productReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/pr")
    public ResponseEntity<ProductReview> prUpdate(@RequestBody ProductReview productReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.update(productReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/pr/{productReviewCode}")
    public ResponseEntity<ProductReview> prDelete(@PathVariable int productReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.delete(productReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/pr/like/{productReviewCode}")
    public ResponseEntity<ProductReview> prUpdateLike(@PathVariable int productReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.updateLike(productReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/pr/orderlike")
    public ResponseEntity<List<ProductReview>> prShowLike() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.showLike());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/pr/ordercomment")
    public ResponseEntity<List<ProductReview>> prShowComment() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prService.showComment());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // videoInfo

    @GetMapping("/vi")
    public ResponseEntity<List<VideoInfo>> viShowAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.showAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/vi/{videoInfoCode}")
    public ResponseEntity<VideoInfo> viShow(@PathVariable int videoInfoCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.show(videoInfoCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PostMapping("/vi")
    public ResponseEntity<VideoInfo> viCreate(@RequestBody VideoInfo videoInfo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.create(videoInfo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/vi")
    public ResponseEntity<VideoInfo> viUpdate(@RequestBody VideoInfo videoInfo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.update(videoInfo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/vi/{videoInfoCode}")
    public ResponseEntity<VideoInfo> viDelete(@PathVariable int videoInfoCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.delete(videoInfoCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/vi/like/{videoInfoCode}")
    public ResponseEntity<VideoInfo> viUpdateLike(@PathVariable int videoInfoCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.updateLike(videoInfoCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/vi/orderlike")
    public ResponseEntity<List<VideoInfo>> viShowLike() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.showLike());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/vi/ordercomment")
    public ResponseEntity<List<VideoInfo>> viShowComment() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(viService.showComment());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }




}
