package 观察者模式;


public class Test {

	/**
	 * @author Helen
	 * Oct 30, 2014 10:30:02 AM
	 * @param args
	 * void
	 * TODO
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SeekJobCenter center=new SeekJobCenter();
		UniversityStudent zhanglin=new UniversityStudent(center);
		HaiGui wanghao=new HaiGui(center);
		center.giveNewMessage("腾辉公司需要10个java程序员");
		center.notifyObservers();
		center.giveNewMessage("仁海公司需要9个电工");
		center.notifyObservers();
		center.giveNewMessage("仁海公司需要9个电工");
		center.notifyObservers();
	}

}
