package site.test.pdfanalysis.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.test.pdfanalysis.db.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
