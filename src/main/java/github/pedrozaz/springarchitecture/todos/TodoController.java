package github.pedrozaz.springarchitecture.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todoEntity) {
        return this.service.save(todoEntity);
    }

    @PutMapping("{id}")
    public void updateStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todoEntity) {
        todoEntity.setId(id);
        service.updateStatus(todoEntity);
    }

    @GetMapping("{id}")
    public TodoEntity find(@PathVariable("id") Integer id) {
        return service.searchById(id);
    }
}
