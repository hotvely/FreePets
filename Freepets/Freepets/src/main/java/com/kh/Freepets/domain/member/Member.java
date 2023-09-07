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
    @Column(name = "id")
    private String id;
    private String password;
    private String name;
    private String address;
    private String auth;
    private int enabled;
}
