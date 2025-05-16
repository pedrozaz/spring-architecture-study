package github.pedrozaz.springarchitecture.todos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_todo")
public class TodoEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "fl_concluded")
    private Boolean concluded;

    public TodoEntity() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getConcluded() {
        return concluded;
    }

    public void setConcluded(Boolean concluded) {
        this.concluded = concluded;
    }

}
