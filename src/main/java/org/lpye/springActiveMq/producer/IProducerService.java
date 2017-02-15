package org.lpye.springActiveMq.producer;

import java.io.Serializable;

import javax.jms.Destination;

public interface IProducerService {
   
	  public void sendMessage(Destination destination,Serializable obj);
}
