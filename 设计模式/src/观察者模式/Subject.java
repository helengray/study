package 观察者模式;
/**
 *　主题（用于添加、删除观察者，以及通知观察者更新数据） 
 *
 */
public interface Subject {
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public void notifyObservers();
}
