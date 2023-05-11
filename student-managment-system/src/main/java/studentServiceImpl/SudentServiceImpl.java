package studentServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Student;
import repository.StudentRepository;
import service.StudentService;

@Service
public class SudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public SudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
