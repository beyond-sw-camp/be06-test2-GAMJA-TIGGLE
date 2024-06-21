package org.example.springdb.tiggle.user;

import org.example.springdb.tiggle.user.model.request.SignInRequest;
import org.example.springdb.tiggle.user.model.request.SignupRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class UserRepository {


    private final JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int signup(SignupRequest request) {
        int result = jdbcTemplate.update(
                "INSERT INTO " +
                        "user(id, password, name, email)" +
                        " values (?,?,?,?)",
                request.getId(),
                request.getPassword(),
                request.getName(),
                request.getEmail()
                );
        return result;
    }

    public String signIn(SignInRequest request) {
        return jdbcTemplate.queryForObject("select userId from user where id = ? and password = ?",
                (rs, rowNum) ->
                {
                    return rs.getString("userId");
                },
                request.getId(),
                request.getPassword());
    }
}
