package 观察者模式;
/**
 * 具体观察者大学生类,当求职中心发布消息时,他都接收
 *
 */
public class UniversityStudent implements Observer{
	
	public UniversityStudent(Subject s){
		s.addObserver(this);
	}
	
	@Override
	public void hearTelephone(String heardMessage) {
		System.out.println("我是大学生,我收到信息:"+heardMessage);
	}

}
