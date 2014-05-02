package pt.meistre.soft.i18n.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.meistre.soft.i18n.model.User;

public interface UserJPARepository extends JpaRepository<User, String> {
}
