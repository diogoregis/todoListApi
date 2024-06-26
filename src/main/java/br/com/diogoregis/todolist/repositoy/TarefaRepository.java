package br.com.diogoregis.todolist.repositoy;

import br.com.diogoregis.todolist.entity.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {
}
