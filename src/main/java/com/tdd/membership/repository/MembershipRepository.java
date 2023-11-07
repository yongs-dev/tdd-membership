package com.tdd.membership.repository;

import com.tdd.membership.entity.Membership;
import com.tdd.membership.constants.MembershipType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
    Membership findByUserIdAndMembershipType(final String userId, final MembershipType membershipType);
}
