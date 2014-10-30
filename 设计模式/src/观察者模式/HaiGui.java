package 观察者模式;
/**
 * 
 *
 */
public class HaiGui implements Observer{
	
	public HaiGui(Subject s){
		s.addObserver(this);
	}
	@Override
	public void hearTelephone(String heardMessage) {
		if(heardMessage.contains("java")){
			System.out.println("我是海龟,我收到信息:"+heardMessage);
		}else{
			System.out.println("我是海龟,这次没有我想要的信息");
		}
	}

}
