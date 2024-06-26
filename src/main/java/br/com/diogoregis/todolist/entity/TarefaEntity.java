package br.com.diogoregis.todolist.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tarefas")
@Data
public class TarefaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;

}
