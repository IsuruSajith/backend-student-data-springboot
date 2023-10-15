package com.example.backendengineerdata.service.custom.serviceImpl;

import com.example.backendengineerdata.entity.Student;
import com.example.backendengineerdata.repository.StudentRepo;
import com.example.backendengineerdata.service.custom.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final ModelMapper mapper;

    public StudentServiceImpl(StudentRepo studentRepo, ModelMapper mapper) {
        this.studentRepo = studentRepo;
        this.mapper = mapper;
    }

    @Override
    public long count() throws Exception {
        return 0;
    }

    @Override
    public String save(Object entity) throws Exception {
        Student student = mapper.map(entity, Student.class);
        studentRepo.save(student);
        return "saved successfully";
    }

    @Override
    public void update(Object entity) throws Exception {

    }

    @Override
    public void deleteById(Object pk) throws Exception {

    }

    @Override
    public Optional findById(Object pk) throws Exception {
        return Optional.empty();
    }

    @Override
    public List findAll() throws Exception {
        return null;
    }

    @Override
    public boolean existsById(Object pk) throws Exception {
        return false;
    }
}