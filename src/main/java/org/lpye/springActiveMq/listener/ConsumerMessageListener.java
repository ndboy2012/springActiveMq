package org.lpye.springActiveMq.listener;

import org.lpye.springActiveMq.entity.Student;

public class ConsumerMessageListener {
     
	public void receiveMessage(String message) {
		System.out.println("接收到一个String类型的数据"+message);
	}
	
	public void receiveMessage(Student student) {
		System.out.println("学生名字为："+student.getName());
		
	}
	
	
	 

}
