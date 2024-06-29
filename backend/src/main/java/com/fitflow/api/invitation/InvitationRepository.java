package com.fitflow.api.invitation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InvitationRepository extends JpaRepository<Invitation, Long>{


    Optional<Invitation> findByToken(String token);
}
