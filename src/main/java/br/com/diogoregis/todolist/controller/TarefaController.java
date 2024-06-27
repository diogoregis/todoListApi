package br.com.diogoregis.todolist.controller;

import br.com.diogoregis.todolist.entity.TarefaEntity;
import br.com.diogoregis.todolist.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private TarefaService tarefaService;

    @PostMapping
    List<TarefaEntity> create(@RequestBody TarefaEntity tarefaEntity){
        return tarefaService.create(tarefaEntity);
    }

    @GetMapping
    List<TarefaEntity> list(){
        return tarefaService.list();
    }

    @PutMapping
    List<TarefaEntity> update(@RequestBody TarefaEntity tarefaEntity){
        return tarefaService.update(tarefaEntity);
    }

    @DeleteMapping("{id}")
    List<TarefaEntity> delete(@PathVariable("id") Long id){
        return tarefaService.delete(id);
    }

}
