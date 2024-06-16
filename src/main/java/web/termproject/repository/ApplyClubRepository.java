package web.termproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.termproject.domain.entity.ApplyClub;

import java.util.Optional;

public interface ApplyClubRepository extends JpaRepository<ApplyClub, Long> {
    Optional<ApplyClub> findById(Long id);
    boolean existsByClubName(String clubName);
}
