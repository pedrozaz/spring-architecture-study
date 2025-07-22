package github.pedrozaz.springarchitecture;

import github.pedrozaz.springarchitecture.todos.EmailSender;
import github.pedrozaz.springarchitecture.todos.TodoRepository;
import github.pedrozaz.springarchitecture.todos.TodoService;
import github.pedrozaz.springarchitecture.todos.TodoValidator;
import jakarta.persistence.EntityManager;
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

        TodoRepository repository = null;

        TodoValidator validator = new TodoValidator(repository);
        EmailSender sender = new EmailSender();
        TodoService todoService = new TodoService(repository, validator, sender);

        //optional way
        ManagedBean managedBean = new ManagedBean(null);
        managedBean.setValidator(validator);

        var condiction = true;
        if (condiction == true) {
            managedBean.setValidator(validator);
        } else {
            managedBean.setValidator(null);
        }

    }
}
