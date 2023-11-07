package com.tdd.membership.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MembershipType {
    NAVER("네이버"),
    LINE("라인"),
    KAKAO("카카오");

    private final String companyName;
}
