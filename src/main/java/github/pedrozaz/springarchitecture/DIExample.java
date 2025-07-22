package github.pedrozaz.springarchitecture;

import github.pedrozaz.springarchitecture.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;

public class DIExample {
    public static void main(String[] args) throws Exception {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("pass");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;

        TodoRepository repository = new SimpleJpaRepository<TodoEntity, Integer>();

        TodoValidator validator = new TodoValidator(repository);
        EmailSender sender = new EmailSender();
        TodoService todoService = new TodoService(repository, validator, sender);

    }
}
