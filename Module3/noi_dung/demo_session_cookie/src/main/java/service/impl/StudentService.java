package service.impl;

import model.Student;
import reponsitory.IStudentRepository;
import reponsitory.impl.StudentRepository;
import service.IStudentService;

import java.util.List;

//Validate dữ liệu
public class StudentService implements IStudentService {
    private static IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public List<Student> getAllStudent() {
        List<Student> studentList = iStudentRepository.getAllStudent();
        if(studentList.size()==0) {
            return null;
        } else {
            return iStudentRepository.getAllStudent();
        }
    }

    @Override
    public void saveStudent(Student student) {
        if(student.getEmail().matches("")) {

        }
        iStudentRepository.saveStudent(student);
    }

    @Override
    public Student findByCodeStudent(int codeStudent) {
        return iStudentRepository.findByCodeStudent(codeStudent);
    }

    @Override
    public void updateStudent(Student student) {
        iStudentRepository.updateStudent(student);
    }

    @Override
    public List<Student> searchByName(String nameStudent) {
        List<Student> studentList = iStudentRepository.searchByName(nameStudent);
        if(studentList.size()==0) {
            return null;
        } else {
            return studentList;
        }
    }
}
