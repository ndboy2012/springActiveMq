package org.lpye.activeMq.junt;

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lpye.springActiveMq.entity.Student;
import org.lpye.springActiveMq.producer.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-activemq.xml")
public class ProducerConsumerTest {

	@Autowired
	private IProducerService producerService;
	
	@Autowired
	@Qualifier("queueDestination")
	private Destination destination;
	
	@Autowired
	@Qualifier("student")
	private Student stu;

	@Test
	public void test() {
		/*for (int i=0; i<2; i++) {  
            producerService.sendMessage(destination, "你好，生产者！这是消息：" + (i+1));  
        }  */
		producerService.sendMessage(destination, stu);
	}

}
