package com.andlinks.cloud.provider.reposity;

import com.andlinks.cloud.provider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByIdAndUsername(Long id, String username);
}
