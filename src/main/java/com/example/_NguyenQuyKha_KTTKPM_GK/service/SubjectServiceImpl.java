package com.example._NguyenQuyKha_KTTKPM_GK.service;


import com.example._NguyenQuyKha_KTTKPM_GK.entity.Subject;
import com.example._NguyenQuyKha_KTTKPM_GK.respository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements  SubjectService{
    @Autowired
    private SubjectRepository SubjectRepository;

    @Override
    public List<Subject> getAllSubjects() {
        return SubjectRepository.findAll();
    }

    @Override
    public Subject getSubject(int id) {
        Optional<Subject> Subject = SubjectRepository.findById(id);
        return Subject.get();
    }

    @Override
    public Subject addSubject(Subject Subject) {
        return SubjectRepository.save((Subject));
    }
}
