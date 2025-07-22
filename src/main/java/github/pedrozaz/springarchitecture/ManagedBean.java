package github.pedrozaz.springarchitecture;

import github.pedrozaz.springarchitecture.todos.TodoEntity;
import github.pedrozaz.springarchitecture.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Scope("singleton") // default scope
// @Scope("request") - web - one for each instance
// @Scope("session") - web - one for each session
// @Scope("application") - web - extends session scope for all users
public class ManagedBean {

    private String idLegacy; // -> session

    // 4 different ways

    @Autowired
    private TodoValidator validator;

    @Autowired
    public ManagedBean(TodoValidator validator) {
        this.validator = validator;
    }

    public void use() {
        var todo = new TodoEntity();
        validator.validate(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }
}

