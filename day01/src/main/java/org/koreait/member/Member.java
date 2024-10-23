package org.koreait.member;


import lombok.*;

//@Data
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
//@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
@ToString
public class Member {
private long seq;
private String email;
//@NonNull
//@ToString.Exclude
private String password;
}

