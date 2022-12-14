package com.example._NguyenQuyKha_KTTKPM_GK.rest;

import com.example._NguyenQuyKha_KTTKPM_GK.entity.Subject;
import com.example._NguyenQuyKha_KTTKPM_GK.service.ListenService;
import com.example._NguyenQuyKha_KTTKPM_GK.service.SendService;
import com.example._NguyenQuyKha_KTTKPM_GK.service.SubjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



import java.util.List;
import java.util.Properties;

@RestController
public class SubjectRestController {
    @Autowired
    private SubjectService subjectService;
    
    @Autowired
    private SendService sendService;

    @Autowired
    private ListenService listenService;



    public String p = null;

    @GetMapping("/subjects")
    public List<Subject> getSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/subject/{id}")
    public Subject getSubject(@PathVariable int id) {
        return subjectService.getSubject(id);
    }

    @PostMapping("/subject")
    public Subject addProduct(@RequestBody Subject subject) {
        return subjectService.addSubject(subject);
    }
    
    @PostMapping("/sendSubjectNew/{id}")
    public String sendProductNew(@PathVariable int id) {
        Subject subject = subjectService.getSubject(id);
        return sendService.SendSubject(subject);
    }

    @GetMapping("/receiveSubjectNew")
    public Subject receiveProductNew()  {
        return listenService.receiveSubject();
    }

}
