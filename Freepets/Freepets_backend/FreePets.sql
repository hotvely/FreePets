------------------------------------- SEQENCE 삭제 코드..
DROP SEQUENCE SEQ_SITTER_REVIEW;
DROP SEQUENCE SEQ_FREEMARKET_REVIEW;
DROP SEQUENCE SEQ_SITTER;
DROP SEQUENCE SEQ_FREEMARKET;
DROP SEQUENCE SEQ_PRODUCT_REVIEW;
DROP SEQUENCE SEQ_PR_COMMENT;
DROP SEQUENCE SEQ_VIDEO_INFO;
DROP SEQUENCE SEQ_VI_COMMENT;
DROP SEQUENCE SEQ_HOSPITAL_REVIEW;
DROP SEQUENCE SEQ_HR_COMMENT;
DROP SEQUENCE SEQ_LOST_COMMENT;
DROP SEQUENCE SEQ_LOST;
DROP SEQUENCE SEQ_COMMON_COMMENT;
DROP SEQUENCE SEQ_COMMON;
DROP SEQUENCE SEQ_MEDIA_COMMENT;
DROP SEQUENCE SEQ_MEDIA;
------------------------------------- SEQENCE 삭제 코드..



------------------------------------- TABLE 삭제 코드..
DROP TABLE SITTER_REVIEW;
DROP TABLE SITTER;

DROP TABLE FREEMARKET_REVIEW;
DROP TABLE FREEMARKET;

DROP TABLE MEDIA_COMMENT;
DROP TABLE MEDIA;

DROP TABLE COMMON_COMMENT;
DROP TABLE COMMON;

DROP TABLE LOST_COMMENT;
DROP TABLE LOST;

DROP TABLE HR_COMMENT;
DROP TABLE HOSPITAL_REVIEW;

DROP TABLE PR_COMMENT;
DROP TABLE PRODUCT_REVIEW;

DROP TABLE VI_COMMENT;
DROP TABLE VIDEO_INFO;

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
------------------------------------------- 승환 유저 테이블 생성코드



CREATE TABLE SITTER(
    SITTER_CODE NUMBER PRIMARY KEY,
    SITTER_TITLE VARCHAR2(200) NOT NULL,
    SITTER_LOC VARCHAR2(200) NOT NULL,
    SITTER_PRICE INT NOT NULL,
    SITTER_DESC VARCHAR2(500),
    SITTER_IMG VARCHAR2(300),
    MEMBER_ID VARCHAR2(100)
);

CREATE TABLE SITTER_REVIEW(
    SITTER_REVIEW_CODE NUMBER PRIMARY KEY,
    SITTER_REVIEW_DESC VARCHAR(300),
    SITTER_REVIEW_RATINGS INT,
    MEMBER_ID VARCHAR2(100),
    SITTER_CODE NUMBER
);

CREATE TABLE FREEMARKET(
    FREEMARKET_CODE NUMBER PRIMARY KEY,
    FREEMARKET_TITLE VARCHAR2(200) NOT NULL,
    FREEMARKET_LOC VARCHAR2(200) NOT NULL,
    FREEMARKET_PRICE INT NOT NULL,
    FREEMARKET_DESC VARCHAR2(500),
    FREEMARKET_IMG VARCHAR2(300),
    MEMBER_ID VARCHAR2(100)
);

CREATE TABLE FREEMARKET_REVIEW(
    FREEMARKET_REVIEW_CODE NUMBER PRIMARY KEY,
    FREEMARKET_REVIEW_DESC VARCHAR(300),
    FREEMARKET_REVIEW_RATINGS INT,
    MEMBER_ID VARCHAR2(100),
    FREEMARKET_CODE NUMBER
);

CREATE SEQUENCE SEQ_SITTER;
CREATE SEQUENCE SEQ_SITTER_REVIEW;
CREATE SEQUENCE SEQ_FREEMARKET;
CREATE SEQUENCE SEQ_FREEMARKET_REVIEW;

ALTER TABLE SITTER_REVIEW ADD CONSTRAINT SITTER_REVIEW_SITTER_CODE_FK FOREIGN KEY(SITTER_CODE) REFERENCES SITTER;
ALTER TABLE FREEMARKET_REVIEW ADD CONSTRAINT FREEMARKET_CODE_FK FOREIGN KEY(FREEMARKET_CODE) REFERENCES FREEMARKET;


-----------------------------------------------------------------------------------------------------------------------
--------------------------------------------- 예진&지우 테이블 ----------------------------------------------------------
CREATE TABLE MEDIA(
 MEDIA_CODE NUMBER,
 NICKNAME VARCHAR2(200),
 MEDIA_TITLE VARCHAR2(300) NOT NULL,
 MEDIA_DATE DATE DEFAULT SYSDATE,
 MEDIA_VIEWS NUMBER DEFAULT 0,
 MEDIA_URL VARCHAR2(300) NOT NULL,
 MEDIA_DESC VARCHAR2(1000),
 MEDIA_REPORT_YN CHAR DEFAULT 'N' CHECK(MEDIA_REPORT_YN IN ('Y','N')) NOT NULL  ,
 MEDIA_CATEGORY VARCHAR2(200) ,
 MEDIA_LIKE NUMBER,
 MEMBER_ID VARCHAR2(100)
);

CREATE TABLE MEDIA_COMMENT(
 M_COMMENT_CODE NUMBER,
 M_COMMENT_DESC VARCHAR2(500),
 M_COMMENT_DATE DATE DEFAULT SYSDATE,
 NICKNAME VARCHAR2(200),
 M_COMMENT_CODE_SUPER NUMBER,
 M_COMMENT_REPORT_YN CHAR DEFAULT 'N' CHECK(M_COMMENT_REPORT_YN IN ('Y','N')) NOT NULL,
 MEDIA_CODE NUMBER,
 MEMBER_ID VARCHAR2(100)
);

CREATE TABLE COMMON(
 COMMON_CODE NUMBER,
 NICKNAME VARCHAR2(200),
 COMMON_DATE DATE DEFAULT SYSDATE,
 COMMON_VIEWS NUMBER DEFAULT 0,
 COMMON_TITLE VARCHAR2(300)NOT NULL,
 COMMON_DESC VARCHAR2(1000),
 COMMON_REPORT_YN CHAR DEFAULT 'N' CHECK(COMMON_REPORT_YN IN ('Y','N')) NOT NULL,
 COMMON_LIKE NUMBER,
 MEMBER_ID VARCHAR2(100)
);

CREATE TABLE COMMON_COMMENT(
 C_COMMENT_CODE NUMBER,
 C_COMMENT_DESC VARCHAR2(500),
 C_COMMENT_DATE DATE DEFAULT SYSDATE,
 NICKNAME VARCHAR2(200),
 C_COMMENT_CODE_SUPER NUMBER,
 C_COMMENT_REPORT_YN CHAR DEFAULT 'N' CHECK(C_COMMENT_REPORT_YN IN ('Y','N')) NOT NULL,
 COMMON_CODE NUMBER,
 MEMBER_ID VARCHAR2(100)
);

CREATE TABLE LOST(
 LOST_CODE NUMBER,
 NICKNAME VARCHAR2(200) ,
 LOST_TITLE VARCHAR2(300)NOT NULL,
 LOST_DATE DATE DEFAULT SYSDATE,
 LOST_VIEWS NUMBER DEFAULT 0,
 LOST_DESC VARCHAR2(1000),
 LOST_REPORT_YN CHAR DEFAULT 'N' CHECK(LOST_REPORT_YN IN ('Y','N')) NOT NULL,
 LOST_LIKE NUMBER,
 MEMBER_ID VARCHAR2(100)
);

CREATE TABLE LOST_COMMENT(
 L_COMMENT_CODE NUMBER,
 L_COMMENT_DESC VARCHAR2(500),
 L_COMMENT_DATE DATE DEFAULT SYSDATE,
 NICKNAME VARCHAR2(200),
 L_COMMENT_CODE_SUPER NUMBER,
 L_COMMENT_REPORT_YN CHAR DEFAULT 'N' CHECK(L_COMMENT_REPORT_YN IN ('Y','N')) NOT NULL,
 LOST_CODE NUMBER,
 MEMBER_ID VARCHAR2(100)
);

ALTER TABLE MEDIA ADD CONSTRAINT MEDIA_CODE_PK PRIMARY KEY(MEDIA_CODE);
ALTER TABLE MEDIA_COMMENT ADD CONSTRAINT M_COMMENT_PK PRIMARY KEY(M_COMMENT_CODE);
ALTER TABLE COMMON ADD CONSTRAINT COMMON_CODE_PK PRIMARY KEY(COMMON_CODE);
ALTER TABLE COMMON_COMMENT ADD CONSTRAINT C_COMMENT_CODE_PK PRIMARY KEY(C_COMMENT_CODE);
ALTER TABLE LOST ADD CONSTRAINT LOST_CODE_PK PRIMARY KEY(LOST_CODE);
ALTER TABLE LOST_COMMENT ADD CONSTRAINT L_COMMENT_CODE_PK PRIMARY KEY(L_COMMENT_CODE);

ALTER TABLE MEDIA ADD CONSTRAINT MEDIA_MEMBER_ID_FK FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER;
ALTER TABLE MEDIA_COMMENT ADD CONSTRAINT MEDIA_COMMENT_CODE_FK FOREIGN KEY(MEDIA_CODE)REFERENCES MEDIA;
ALTER TABLE MEDIA_COMMENT ADD CONSTRAINT MEDIA_COMMENT_ID_FK FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER;
ALTER TABLE COMMON ADD CONSTRAINT COMMON_MEMBER_ID_FK FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER;
ALTER TABLE COMMON_COMMENT ADD CONSTRAINT COMMON_COMMENT_CODE_FK FOREIGN KEY(COMMON_CODE)REFERENCES COMMON;
ALTER TABLE COMMON_COMMENT ADD CONSTRAINT COMMON_COMMENT_ID_FK FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER;
ALTER TABLE LOST ADD CONSTRAINT LOST_MEMBER_ID_FK FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER;
ALTER TABLE LOST_COMMENT ADD CONSTRAINT LOST_COMMENT_CODE_FK FOREIGN KEY (LOST_CODE)REFERENCES LOST;
ALTER TABLE LOST_COMMENT ADD CONSTRAINT LOST_COMMENT_ID_FK FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER;


CREATE SEQUENCE SEQ_MEDIA;
CREATE SEQUENCE SEQ_MEDIA_COMMENT;
CREATE SEQUENCE SEQ_COMMON;
CREATE SEQUENCE SEQ_COMMON_COMMENT;
CREATE SEQUENCE SEQ_LOST;
CREATE SEQUENCE SEQ_LOST_COMMENT;




----------------------------------------------------------------------------------------------------------- 도경 테이블 및 제약조건
CREATE TABLE PRODUCT_REVIEW (
    PRODUCT_REVIEW_CODE NUMBER PRIMARY KEY,
    ID VARCHAR2(30),
    PRODUCT_REVIEW_DATE DATE DEFAULT SYSDATE,
    SALESHOP_NAME VARCHAR2(30) NOT NULL,
    SALESHOP_URL VARCHAR2(100),
    PRODUCT_REVIEW_TITLE VARCHAR2(50) NOT NULL,
    PRODUCT_REVIEW_VIEWS NUMBER DEFAULT 0,
    PRODUCT_REVIEW_DESC VARCHAR2(1000),
    PRODUCT_REVIEW_IMG VARCHAR2(100),
    PRODUCT_REVIEW_LIKE NUMBER DEFAULT 0,
    PRODUCT_REVIEW_COMMENT_COUNT NUMBER DEFAULT 0,
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
    VIDEO_INFO_COMMENT_COUNT NUMBER DEFAULT 0,
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
    HOSPITAL_NAME VARCHAR2(30) NOT NULL,
    HOSPITAL_ADDRESS VARCHAR2(100),
    HOSPITAL_REVIEW_VIEWS NUMBER DEFAULT 0,
    HOSPITAL_REVIEW_DATE DATE DEFAULT SYSDATE,
    HOSPITAL_REVIEW_TITLE VARCHAR2(50) NOT NULL,
    HOSPITAL_REVIEW_DESC VARCHAR2(1000),
    HOSPITAL_REVIEW_IMG VARCHAR2(100),
    HOSPITAL_REVIEW_LIKE NUMBER DEFAULT 0,
    HOSPITAL_REVIEW_COMMENT_COUNT NUMBER DEFAULT 0,
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

ALTER TABLE PRODUCT_REVIEW ADD CONSTRAINT PRODUCT_REVIEW_MEMBER_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

ALTER TABLE PR_COMMENT ADD CONSTRAINT PR_COMMENT_PRODUCT_REVIEW_CODE_FK FOREIGN KEY(PRODUCT_REVIEW_CODE) REFERENCES PRODUCT_REVIEW;
ALTER TABLE PR_COMMENT ADD CONSTRAINT PR_COMMENT_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

ALTER TABLE VIDEO_INFO ADD CONSTRAINT VIDEO_INFO_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

ALTER TABLE VI_COMMENT ADD CONSTRAINT VI_COMMENT_VIDEO_INFO_CODE_FK FOREIGN KEY(VIDEO_INFO_CODE) REFERENCES VIDEO_INFO;
ALTER TABLE VI_COMMENT ADD CONSTRAINT VI_COMMENT_VIDEO_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

ALTER TABLE HOSPITAL_REVIEW ADD CONSTRAINT HOSPITAL_REVIEW_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;

ALTER TABLE HR_COMMENT ADD CONSTRAINT HR_COMMENT_ID_FK FOREIGN KEY(ID) REFERENCES MEMBER;
ALTER TABLE HR_COMMENT ADD CONSTRAINT HR_COMMENT_HOSPITAL_REVIEW_CODE_FK FOREIGN KEY(HOSPITAL_REVIEW_CODE) REFERENCES HOSPITAL_REVIEW;

----------------------------------------------------------------------------------------------------------- 도경 테이블 및 제약조건




