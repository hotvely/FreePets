package com.kh.Freepets.domain.member;

//admin, user 통합 관리 멤버;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member
{
    @Id
    private String id;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String auth;
    @Column
    private int enabled;
}
