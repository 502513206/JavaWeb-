package zhujie.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	public void printUser() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		for (int i = 0; i < 5; i++) {
			System.out.println("����aspect���棬����printUser����");
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println("��ǰ�����ʱ��" + (endTime - startTime) + "ms");
	}

}
