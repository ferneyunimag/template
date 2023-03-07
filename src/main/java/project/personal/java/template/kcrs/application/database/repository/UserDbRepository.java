package project.personal.java.template.kcrs.application.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.personal.java.template.kcrs.domain.entity.UserBasic;

@Repository
public interface UserDbRepository extends JpaRepository<UserBasic, Integer> {
}
