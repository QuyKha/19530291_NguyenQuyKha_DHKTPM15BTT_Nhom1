package com.example._NguyenQuyKha_KTTKPM_GK.service;
import java.util.List;

import com.example._NguyenQuyKha_KTTKPM_GK.entity.Subject;

public interface SubjectService {
    public List<Subject> getAllSubjects();
    public Subject getSubject(int id);
    public Subject addSubject(Subject Subject);
}
