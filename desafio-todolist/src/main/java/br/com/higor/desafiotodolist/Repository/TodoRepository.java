package br.com.higor.desafiotodolist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.higor.desafiotodolist.Entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
