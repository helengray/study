package 观察者模式;

import java.util.ArrayList;
/**
 * 具体主题，求职中心实现了主题接口，当有新职位消息时通知已注册的相关用户
 *
 */
public class SeekJobCenter implements Subject {
	private ArrayList<Observer> observers=new ArrayList<Observer>();//观察者集合
	private String msg="";
	private boolean changed=false;
	
	public SeekJobCenter(){
		
	}
	@Override
	public void addObserver(Observer o) {
		if(!observers.contains(o)){
			observers.add(o);
		}
	}

	@Override
	public void deleteObserver(Observer o) {
		if(o==null){
			throw new NullPointerException();
		}else{
			if(observers.contains(o)){
				observers.remove(o);
			}
		}
	}

	@Override
	public void notifyObservers() {
		if(changed){
			for (Observer o : observers) {
				o.hearTelephone(msg);
			}
			changed=false;
		}
	}
	public void giveNewMessage(String str){
		if(str==null){
			return;
		}
		if(msg.equals(str)){
			changed=false;
		}else{
			msg=str;
			changed=true;
		}
	}

}
