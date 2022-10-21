package com.example._NguyenQuyKha_KTTKPM_GK.service;

import com.example._NguyenQuyKha_KTTKPM_GK.entity.Subject;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;



@Component
public class ListenService {
	
	Subject subject = null;
	 	
	@JmsListener(destination = "QuyKha")
	public void receive(Subject subject) {
		this.subject = subject;
		System.out.println(subject);
	}
	public Subject receiveProduct() {
		// TODO Auto-generated method stub
		return subject;
	}
} 
