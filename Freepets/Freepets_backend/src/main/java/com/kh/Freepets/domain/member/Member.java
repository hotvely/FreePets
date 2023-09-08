package com.kh.Freepets.domain.member;

//admin, user 통합 관리 멤버;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert          //<- orcle에서 default value 사용하기 위함
public class Member
{
    @Id
    private String id;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private Date birth;

    @Column
    private char gender;

    @Column
    private String phone;

    @Column
    private String address;

    @Column
    private String nickname;

    @Column
    private String email;

    @Column
    private Date create_account_date;

    @Column
    private char delete_account_yn;

    @Column
    private String authority;

    @Column
    private String member_img;

    @Column
    private String member_info;

}
