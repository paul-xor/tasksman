package taskman.dao;

import org.springframework.data.repository.CrudRepository;

import taskman.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{
	
}
