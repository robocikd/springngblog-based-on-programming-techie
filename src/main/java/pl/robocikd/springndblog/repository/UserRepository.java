package pl.robocikd.springndblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.robocikd.springndblog.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
