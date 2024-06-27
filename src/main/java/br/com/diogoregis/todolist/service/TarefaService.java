package br.com.diogoregis.todolist.service;

import br.com.diogoregis.todolist.entity.TarefaEntity;
import br.com.diogoregis.todolist.repositoy.TarefaRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<TarefaEntity> create(TarefaEntity tarefaEntity){
        tarefaRepository.save(tarefaEntity);
        return list();
    }

    public List<TarefaEntity> list(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return tarefaRepository.findAll(sort);
    }

    public List<TarefaEntity> update(TarefaEntity tarefaEntity){
        tarefaRepository.save(tarefaEntity);
        return list();
    }

    public List<TarefaEntity> delete(Long id){
        tarefaRepository.deleteById(id);
        return list();
    }
}
