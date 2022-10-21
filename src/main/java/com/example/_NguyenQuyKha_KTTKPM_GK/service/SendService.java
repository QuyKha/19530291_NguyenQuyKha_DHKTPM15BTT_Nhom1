package com.example._NguyenQuyKha_KTTKPM_GK.service;

import com.example._NguyenQuyKha_KTTKPM_GK.entity.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;


@Service
public class SendService {

	@Autowired
	private JmsTemplate jTemplate;
	
	String topic = "jpa-topic";
	
	public String SendSubject(Subject subject) {
		jTemplate.convertAndSend("QuyKha", subject);
		return "Send successfull Quy Kha : " + subject.toString();
	}
}
