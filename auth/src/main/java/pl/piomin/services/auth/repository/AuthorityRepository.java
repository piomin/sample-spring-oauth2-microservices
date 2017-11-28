package pl.piomin.services.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.piomin.services.auth.domain.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

}
