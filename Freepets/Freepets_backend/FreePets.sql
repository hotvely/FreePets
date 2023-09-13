------------------------------------- SEQENCE 삭제 코드..
--- 사라질 예정인.... SEQUENCE들..
DROP SEQUENCE SEQ_SALESHOP;
DROP SEQUENCE SEQ_HOSPITAL;

----- 주연
DROP SEQUENCE SEQ_EVENT;
DROP SEQUENCE SEQ_NOTICE;


----- 준우
DROP SEQUENCE SEQ_SITTER_REVIEW;
DROP SEQUENCE SEQ_FREEMARKET_REVIEW;
DROP SEQUENCE SEQ_SITTER;
DROP SEQUENCE SEQ_FREEMARKET;

----- 도경
DROP SEQUENCE SEQ_PRODUCT_REVIEW;
DROP SEQUENCE SEQ_PR_COMMENT;
DROP SEQUENCE SEQ_VIDEO_INFO;
DROP SEQUENCE SEQ_VI_COMMENT;
DROP SEQUENCE SEQ_HOSPITAL_REVIEW;
DROP SEQUENCE SEQ_HR_COMMENT;

----- 예진 지우

DROP SEQUENCE SEQ_LOST;
DROP SEQUENCE SEQ_LOST_LIKE;
DROP SEQUENCE SEQ_LOST_COMMENT;

DROP SEQUENCE SEQ_COMMON_COMMENT;
DROP SEQUENCE SEQ_COMMON;
DROP SEQUENCE SEQ_MEDIA_COMMENT;
DROP SEQUENCE SEQ_MEDIA;

----- 승환
DROP SEQUENCE SEQ_BOOKMARK;


------------------------------------- SEQENCE 삭제 코드..



------------------------------------- TABLE 삭제 코드..
-- 주연
DROP TABLE NOTICE;
DROP TABLE EVENT;


-- 준우
DROP TABLE SITTER_REVIEW;
DROP TABLE SITTER;

DROP TABLE FREEMARKET_REVIEW;
DROP TABLE FREEMARKET;

-- 예진 지우
DROP TABLE MEDIA_COMMENT;
DROP TABLE MEDIA_LIKE;
DROP TABLE MEDIA;

DROP TABLE COMMON_COMMENT;
DROP TABLE COMMON_LIKE;
DROP TABLE COMMON;

DROP TABLE LOST_LIKE;
DROP TABLE LOST_COMMENT;
DROP TABLE LOST;



-- 도경
DROP TABLE HR_COMMENT;
DROP TABLE HOSPITAL_REVIEW;
DROP TABLE HOSPITAL;

DROP TABLE PR_COMMENT;
DROP TABLE PRODUCT_REVIEW;

DROP TABLE SALESHOP;

DROP TABLE VI_COMMENT;
DROP TABLE VIDEO_INFO;


-- 승환
DROP TABLE BOOKMARK;
DROP TABLE MEMBER;
------------------------------------- TABLE 삭제 코드..






------------------------------------------- 승환 유저 테이블 생성코드 
CREATE TABLE MEMBER
(
    ID VARCHAR2(30) ,
    PASSWORD VARCHAR2(50) NOT NULL,
    NAME VARCHAR2(30) NOT NULL,
    BIRTH DATE,
    GENDER CHAR,
    PHONE VARCHAR2(30),
    ADDRESS VARCHAR2(50),
    NICKNAME VARCHAR2(20) NOT NULL,
    EMAIL VARCHAR2(30),
    CREATE_ACCOUNT_DATE DATE DEFAULT SYSDATE,
    DELETE_ACCOUNT_YN CHAR DEFAULT 'N' CHECK(DELETE_ACCOUNT_YN IN ('Y','N')) NOT NULL,
    AUTHORITY VARCHAR2(10) DEFAULT 'USER' CHECK(AUTHORITY IN ('ADMIN','USER')),
    MEMBER_IMG VARCHAR2(500),
    MEMBER_INFO VARCHAR2(1000),
    
    CONSTRAINT ID_PK PRIMARY KEY(ID)
);  
INSERT INTO MEMBER(id,password,name,birth,gender,phone,address,nickname,email, member_img, member_info) 
VALUES('test','test','testName',sysdate, 'm', '010-0000-0000','test Address','test','test@naver.com',NULL,NULL);
INSERT INTO MEMBER(id,password,name,birth,gender,phone,address,nickname,email,  authority, member_img, member_info) 
VALUES('admin','admin','admin',sysdate, 'f', '010-1111-1111','admin Address','admin','admin@naver.com','ADMIN',NULL,NULL);

CREATE TABLE BOOKMARK
(
    BOOKMARK_CODE NUMBER PRIMARY KEY,    
    BOARD_NAME VARCHAR2(100),
    BOARD_CODE NUMBER,    
    BOOKMARK_DATE DATE DEFAULT SYSDATE,
    ID VARCHAR2(100)
);

CREATE SEQUENCE SEQ_BOOKMARK;


------------------------------------------- 준우 유저 테이블 생성코드
CREATE TABLE SITTER(
    SITTER_CODE NUMBER PRIMARY KEY,
    SITTER_TITLE VARCHAR2(200) NOT NULL,
    SITTER_LOC VARCHAR2(200) NOT NULL,
    SITTER_PRICE INT NOT NULL,
    SITTER_DESC VARCHAR2(500),
    SITTER_IMG VARCHAR2(300),
    ID VARCHAR2(100)
);

CREATE TABLE SITTER_REVIEW(
    SITTER_REVIEW_CODE NUMBER PRIMARY KEY,
    SITTER_REVIEW_DESC VARCHAR(300),
    SITTER_REVIEW_RATINGS INT,
    ID VARCHAR2(100),
    SITTER_CODE NUMBER
);

CREATE TABLE FREEMARKET(
    FREEMARKET_CODE NUMBER PRIMARY KEY,
    FREEMARKET_TITLE VARCHAR2(200) NOT NULL,
    FREEMARKET_LOC VARCHAR2(200) NOT NULL,
    FREEMARKET_PRICE INT NOT NULL,
    FREEMARKET_DESC VARCHAR2(500),
    FREEMARKET_IMG VARCHAR2(300),
    ID VARCHAR2(100)
);

CREATE TABLE FREEMARKET_REVIEW(
    FREEMARKET_REVIEW_CODE NUMBER PRIMARY KEY,
    FREEMARKET_REVIEW_DESC VARCHAR(300),
    FREEMARKET_REVIEW_RATINGS INT,
    ID VARCHAR2(100),
    FREEMARKET_CODE NUMBER
);

CREATE SEQUENCE SEQ_SITTER;
CREATE SEQUENCE SEQ_SITTER_REVIEW;
CREATE SEQUENCE SEQ_FREEMARKET;
CREATE SEQUENCE SEQ_FREEMARKET_REVIEW;

ALTER TABLE SITTER_REVIEW ADD CONSTRAINT SITTER_REVIEW_SITTER_CODE_FK FOREIGN KEY(SITTER_CODE) REFERENCES SITTER;
ALTER TABLE FREEMARKET_REVIEW ADD CONSTRAINT FREEMARKET_CODE_FK FOREIGN KEY(FREEMARKET_CODE) REFERENCES FREEMARKET;


-----------------------------------------------------------------------------------------------------------------------
--------------------------------------------- 지우&예진 테이블 ----------------------------------------------------------
CREATE TABLE MEDIA(
 MEDIA_CODE NUMBER PRIMARY KEY,
 MEDIA_TITLE VARCHAR2(300) NOT NULL,
 MEDIA_DATE DATE DEFAULT SYSDATE,
 MEDIA_VIEWS NUMBER DEFAULT 0,
 MEDIA_ADD_FILE_URL VARCHAR2(500) NOT NULL,
 MEDIA_YOUTUBE_URL VARCHAR2(500),
 MEDIA_DESC VARCHAR2(1000),
 MEDIA_PHOTO VARCHAR2(500),
 --MEDIA_REPORT_YN CHAR DEFAULT 'N' CHECK(MEDIA_REPORT_YN IN ('Y','N')) NOT NULL  ,
 MEDIA_CATEGORY VARCHAR2(200),
 ID VARCHAR2(100)
);
ALTER TABLE MEDIA ADD CONSTRAINT MEDIA_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

CREATE TABLE MEDIA_COMMENT(
 M_COMMENT_CODE NUMBER PRIMARY KEY,
 M_COMMENT_DESC VARCHAR2(500),
 M_COMMENT_DATE DATE DEFAULT SYSDATE,
 M_COMMENT_CODE_SUPER NUMBER,
 M_COMMENT_ADD_FILE_URL VARCHAR(500),
 --M_COMMENT_REPORT_YN CHAR DEFAULT 'N' CHECK(M_COMMENT_REPORT_YN IN ('Y','N')) NOT NULL,
 MEDIA_CODE NUMBER,
 ID VARCHAR2(100)
);
ALTER TABLE MEDIA_COMMENT ADD CONSTRAINT MEDIA_COMMENT_CODE_FK FOREIGN KEY(MEDIA_CODE)REFERENCES MEDIA;
ALTER TABLE MEDIA_COMMENT ADD CONSTRAINT MEDIA_COMMENT_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;


CREATE TABLE MEDIA_LIKE(
 M_LIKE_CODE NUMBER  PRIMARY KEY,
 MEDIA_CODE NUMBER,
 ID VARCHAR2(100)
);
ALTER TABLE MEDIA_LIKE ADD CONSTRAINT MEDIA_LIKE_CODE_FK FOREIGN KEY(MEDIA_CODE) REFERENCES MEDIA;
ALTER TABLE MEDIA_LIKE ADD CONSTRAINT MEDIA_LIKE_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

CREATE TABLE COMMON(
 COMMON_CODE NUMBER PRIMARY KEY,
 COMMON_DATE DATE DEFAULT SYSDATE,
 COMMON_VIEWS NUMBER DEFAULT 0,
 COMMON_TITLE VARCHAR2(300)NOT NULL,
 COMMON_DESC VARCHAR2(1000),
 COMMON_ADD_FILE_URL VARCHAR2(500),
 COMMON_YOUTUBE_URL VARCHAR2(500),
 --COMMON_REPORT_YN CHAR DEFAULT 'N' CHECK(COMMON_REPORT_YN IN ('Y','N')) NOT NULL,
 ID VARCHAR2(100)
);
ALTER TABLE COMMON ADD CONSTRAINT COMMON_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;


CREATE TABLE COMMON_COMMENT(
 C_COMMENT_CODE NUMBER PRIMARY KEY,
 C_COMMENT_DESC VARCHAR2(500),
 C_COMMENT_DATE DATE DEFAULT SYSDATE,
 C_COMMENT_CODE_SUPER NUMBER,
 C_COMMENT_ADD_FILE_URL VARCHAR2(500),
 --C_COMMENT_REPORT_YN CHAR DEFAULT 'N' CHECK(C_COMMENT_REPORT_YN IN ('Y','N')) NOT NULL,
 COMMON_CODE NUMBER,
 ID VARCHAR2(100)
);
ALTER TABLE COMMON_COMMENT ADD CONSTRAINT COMMON_COMMENT_CODE_FK FOREIGN KEY(COMMON_CODE)REFERENCES COMMON;
ALTER TABLE COMMON_COMMENT ADD CONSTRAINT COMMON_COMMENT_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

CREATE TABLE COMMON_LIKE(
 C_LIKE_CODE NUMBER PRIMARY KEY,
 COMMON_CODE NUMBER,
 ID VARCHAR2(100)
);
ALTER TABLE COMMON_LIKE ADD CONSTRAINT COMMON_LIKE_CODE_FK FOREIGN KEY(COMMON_CODE) REFERENCES COMMON;
ALTER TABLE COMMON_LIKE ADD CONSTRAINT COMMON_LIKE_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

CREATE TABLE LOST(
 LOST_CODE NUMBER PRIMARY KEY,
 LOST_TITLE VARCHAR2(300)NOT NULL,
 LOST_ADDFILE_URL VARCHAR2(1000),
 LOST_URL VARCHAR2(1000),
 LOST_DATE DATE DEFAULT SYSDATE,
 LOST_VIEWS NUMBER DEFAULT 0,
 LOST_DESC VARCHAR2(1000),
 LOST_REPORT_YN CHAR DEFAULT 'N' CHECK(LOST_REPORT_YN IN ('Y','N')) NOT NULL,
 LOST_LIKE NUMBER,
 ID VARCHAR2(100)
);

CREATE TABLE LOST_LIKE(
    LOST_LIKE_CODE NUMBER PRIMARY KEY,
    LOST_LIKE_DATE DATE DEFAULT SYSDATE,
    LOST_CODE NUMBER,
    ID VARCHAR2(200)
);

CREATE TABLE LOST_COMMENT(
 L_COMMENT_CODE NUMBER PRIMARY KEY,
 L_COMMENT_DESC VARCHAR2(500),
 L_COMMENT_DATE DATE DEFAULT SYSDATE,
 L_COMMENT_CODE_SUPER NUMBER,
 L_COMMENT_IMG VARCHAR2(1000),
 L_COMMENT_REPORT_YN CHAR DEFAULT 'N' CHECK(L_COMMENT_REPORT_YN IN ('Y','N')) NOT NULL,
 LOST_CODE NUMBER,
 ID VARCHAR2(100)
);


ALTER TABLE LOST ADD CONSTRAINT LOST_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;
ALTER TABLE LOST_LIKE ADD CONSTRAINT LOST_LIKE_CODE_FK FOREIGN KEY (LOST_CODE)REFERENCES LOST;
ALTER TABLE LOST_LIKE ADD CONSTRAINT LOST_LIKE_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;
ALTER TABLE LOST_COMMENT ADD CONSTRAINT LOST_COMMENT_CODE_FK FOREIGN KEY (LOST_CODE)REFERENCES LOST;
ALTER TABLE LOST_COMMENT ADD CONSTRAINT LOST_COMMENT_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

CREATE SEQUENCE SEQ_LOST;
CREATE SEQUENCE SEQ_LOST_LIKE;
CREATE SEQUENCE SEQ_LOST_COMMENT;


CREATE SEQUENCE SEQ_MEDIA;
CREATE SEQUENCE SEQ_MEDIA_COMMENT;
CREATE SEQUENCE SEQ_COMMON;
CREATE SEQUENCE SEQ_COMMON_COMMENT;
-----------------------------------------------------------------------------------------------------------------------
--------------------------------------------- 예진&지우 테이블 ----------------------------------------------------------



--------------------------------------------------------------------------------------- 도경 테이블 및 제약조건
CREATE TABLE SALESHOP (
    SALESHOP_CODE NUMBER PRIMARY KEY,
    SALESHOP_NAME VARCHAR2(30) NOT NULL,
    SALESHOP_URL VARCHAR2(100)
);

CREATE TABLE HOSPITAL (
    HOSPITAL_CODE NUMBER PRIMARY KEY,
    HOSPITAL_NAME VARCHAR2(30) NOT NULL,
    HOSPITAL_ADDRESS VARCHAR2(100)
);

CREATE TABLE PRODUCT_REVIEW (
    PRODUCT_REVIEW_CODE NUMBER PRIMARY KEY,
    ID VARCHAR2(30),
    PRODUCT_REVIEW_DATE DATE DEFAULT SYSDATE,
    SALESHOP_CODE NUMBER,
    PRODUCT_REVIEW_THUM VARCHAR2(100),
    PRODUCT_REVIEW_TITLE VARCHAR2(50) NOT NULL,
    PRODUCT_REVIEW_VIEWS NUMBER DEFAULT 0,
    PRODUCT_REVIEW_DESC VARCHAR2(1000),
    PRODUCT_REVIEW_IMG VARCHAR2(100),
    PRODUCT_REVIEW_LIKE NUMBER DEFAULT 0,
    PRODUCT_REVIEW_REPORT_YN CHAR(1) DEFAULT 'N' CHECK(PRODUCT_REVIEW_REPORT_YN IN ('Y', 'N')) NOT NULL
);

CREATE TABLE PR_COMMENT (
    PR_COMMENT_CODE NUMBER PRIMARY KEY,
    PRODUCT_REVIEW_CODE NUMBER,
    ID VARCHAR2(30),
    PR_COMMENT_DATE DATE DEFAULT SYSDATE,
    PR_COMMENT_DESC VARCHAR2(500) NOT NULL,
    PR_COMMENT_IMG VARCHAR2(100),
    SUPER_PR_COMMENT_CODE NUMBER,
    PR_COMMENT_REPORT_YN CHAR(1) DEFAULT 'N' CHECK(PR_COMMENT_REPORT_YN IN ('Y', 'N')) NOT NULL
);

CREATE TABLE VIDEO_INFO (
    VIDEO_INFO_CODE NUMBER PRIMARY KEY,
    ID VARCHAR2(30),
    VIDEO_INFO_TITLE VARCHAR2(50) NOT NULL,
    VIDEO_INFO_VIEWS NUMBER DEFAULT 0,
    VIDEO_INFO_DATE DATE DEFAULT SYSDATE,
    VIDEO_INFO_URL VARCHAR2(100),
    VIDEO_INFO_KIND VARCHAR2(30),
    VIDEO_INFO_LIKE NUMBER DEFAULT 0,
    VIDEO_INFO_REPORT_YN CHAR(1) DEFAULT 'N' CHECK(VIDEO_INFO_REPORT_YN IN ('Y', 'N')) NOT NULL
);

CREATE TABLE VI_COMMENT (
    VI_COMMENT_CODE NUMBER PRIMARY KEY,
    VIDEO_INFO_CODE NUMBER,
    ID VARCHAR2(30),
    VI_COMMENT_DATE DATE DEFAULT SYSDATE,
    VI_COMMENT_DESC VARCHAR2(500) NOT NULL,
    VI_COMMENT_IMG VARCHAR2(100),
    SUPER_VI_COMMENT_CODE NUMBER,
    VI_COMMENT_REPORT_YN CHAR(1) DEFAULT 'N' CHECK(VI_COMMENT_REPORT_YN IN ('Y', 'N')) NOT NULL
);

CREATE TABLE HOSPITAL_REVIEW (
    HOSPITAL_REVIEW_CODE NUMBER PRIMARY KEY,
    ID VARCHAR2(30),
    HOSPITAL_CODE NUMBER,
    HOSPITAL_REVIEW_VIEWS NUMBER DEFAULT 0,
    HOSPITAL_REVIEW_DATE DATE DEFAULT SYSDATE,
    HOSPITAL_REVIEW_TITLE VARCHAR2(50) NOT NULL,
    HOSPITAL_REVIEW_DESC VARCHAR2(1000),
    HOSPITAL_REVIEW_IMG VARCHAR2(100),
    HOSPITAL_REVIEW_LIKE NUMBER DEFAULT 0,
    HOSPITAL_REVIEW_REPORT_YN CHAR(1) DEFAULT 'N' CHECK(HOSPITAL_REVIEW_REPORT_YN IN ('Y', 'N')) NOT NULL
);

CREATE TABLE HR_COMMENT (
    HR_COMMENT_CODE NUMBER PRIMARY KEY,
    HOSPITAL_REVIEW_CODE NUMBER,
    ID VARCHAR2(30),
    HR_COMMENT_DATE DATE DEFAULT SYSDATE,
    HR_COMMENT_DESC VARCHAR2(500) NOT NULL,
    HR_COMMENT_IMG VARCHAR2(100),
    SUPER_HR_COMMENT_CODE NUMBER,
    HR_COMMENT_REPORT_YN CHAR(1) DEFAULT 'N' CHECK(HR_COMMENT_REPORT_YN IN ('Y', 'N')) NOT NULL
);


CREATE SEQUENCE SEQ_PRODUCT_REVIEW;
CREATE SEQUENCE SEQ_PR_COMMENT;
CREATE SEQUENCE SEQ_VIDEO_INFO;
CREATE SEQUENCE SEQ_VI_COMMENT;
CREATE SEQUENCE SEQ_HOSPITAL_REVIEW;
CREATE SEQUENCE SEQ_HR_COMMENT;

ALTER TABLE PRODUCT_REVIEW ADD CONSTRAINT PRODUCT_REVIEW_SALESHOP_CODE_FK FOREIGN KEY(SALESHOP_CODE) REFERENCES SALESHOP;
ALTER TABLE PRODUCT_REVIEW ADD CONSTRAINT PRODUCT_REVIEW_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

ALTER TABLE PR_COMMENT ADD CONSTRAINT PR_COMMENT_PRODUCT_REVIEW_CODE_FK FOREIGN KEY(PRODUCT_REVIEW_CODE) REFERENCES PRODUCT_REVIEW;
ALTER TABLE PR_COMMENT ADD CONSTRAINT PR_COMMENT_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

ALTER TABLE VIDEO_INFO ADD CONSTRAINT VIDEO_INFO_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

ALTER TABLE VI_COMMENT ADD CONSTRAINT VI_COMMENT_VIDEO_INFO_CODE_FK FOREIGN KEY(VIDEO_INFO_CODE) REFERENCES VIDEO_INFO;
ALTER TABLE VI_COMMENT ADD CONSTRAINT VI_COMMENT_VIDEO_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

ALTER TABLE HOSPITAL_REVIEW ADD CONSTRAINT HOSPITAL_REVIEW_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;
ALTER TABLE HOSPITAL_REVIEW ADD CONSTRAINT HOSPITAL_REVIEW_HOSPITAL_CDOE_FK FOREIGN KEY(HOSPITAL_CODE) REFERENCES HOSPITAL;

ALTER TABLE HR_COMMENT ADD CONSTRAINT HR_COMMENT_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;
ALTER TABLE HR_COMMENT ADD CONSTRAINT HR_COMMENT_HOSPITAL_REVIEW_CODE_FK FOREIGN KEY(HOSPITAL_REVIEW_CODE) REFERENCES HOSPITAL_REVIEW;

---------------------------------------------------------------------------- 도경 테이블 및 제약조건



---------------------------------------------------------------------------- 주연 테이블 & 제약조건

CREATE TABLE NOTICE (
NOTICE_CODE NUMBER PRIMARY KEY,
NOTICE_TITLE VARCHAR2(100),
NOTICE_CONTENTS VARCHAR2(500),
NOTICE_VIEWS INT,
NOTICE_DATE VARCHAR2(100) NOT NULL,
ID VARCHAR2(100)
);
CREATE TABLE EVENT(
-- 아마 공공데이터 쪽 배우게 되면 이벤트 정보 같은거 존재 하면 가져다 쓸 것 같긴 함;
 EVENT_CODE NUMBER PRIMARY KEY,
 EVENT_TITLE VARCHAR2(300),
 EVENT_CONTENTS VARCHAR2(500),
 EVENT_DATE VARCHAR2(100) NOT NULL,
 EVENT_LINK_ADDRESS VARCHAR2(500),
 
 ID VARCHAR2(100)
);

CREATE SEQUENCE SEQ_EVENT;
CREATE SEQUENCE SEQ_NOTICE;
---------------------------------------------------------------------------- 주연 테이블 & 제약조건



commit;