package taskman.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import taskman.dao.TaskRepository;
import taskman.model.Task;

@Service
@Transactional
public class TaskService {
	
	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public List<Task> findAll(){
		List<Task> tasks=new ArrayList<>();
		
		for(Task task: taskRepository.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
		
}
