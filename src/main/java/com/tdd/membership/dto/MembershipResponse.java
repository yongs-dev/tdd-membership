package com.tdd.membership.dto;

import com.tdd.membership.constants.MembershipType;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class MembershipResponse {

    private final Long id;
    private final MembershipType membershipType;
}
