package sai.learn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sai.learn.entity.TestTable;
import sai.learn.exception.EntityNotCreated;
import sai.learn.exception.UserNotFound;
import sai.learn.repository.TestRepository;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Optional;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/test")
    public ResponseEntity test(@RequestParam("name") String name) {
        try {
            return ResponseEntity.ok(Optional.ofNullable(testRepository.save(new TestTable(name))));
        } catch (DataIntegrityViolationException e) {
            throw new EntityNotCreated("User already exist with name : "+name);
        }
    }

    @GetMapping("/test/{id}")
    public ResponseEntity getTest(@PathVariable(value = "id") Integer id) {
        log.info("Id : {}", id);
        return ResponseEntity.ok(testRepository.findById(id).orElseThrow(() -> new UserNotFound()));
    }
}
