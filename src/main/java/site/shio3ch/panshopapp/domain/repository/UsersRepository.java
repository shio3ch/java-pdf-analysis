package site.shio3ch.panshopapp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.shio3ch.panshopapp.domain.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
