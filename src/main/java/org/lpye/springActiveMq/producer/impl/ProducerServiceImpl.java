package org.lpye.springActiveMq.producer.impl;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.lpye.springActiveMq.producer.IProducerService;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements IProducerService {

	@Resource
	private JmsTemplate jmsTemplate;

	public void sendMessage(Destination destination, Serializable obj) {
		jmsTemplate.convertAndSend(destination, obj);  
	}
}
