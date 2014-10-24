package 命令模式;

public class Test {

	/**
	 * @author 李晓伟
	 * 2014-10-23 下午11:23:34
	 * @描述:
	 */
	public static void main(String[] args) {
		CompanyArmy 三连=new CompanyArmy();//命令接收者
		Command command=new ConcreateCommand(三连);//创建具体命令并指定接收者
		//ArmySuperior 指挥官=new ArmySuperior(command);//1、带参数构造方法
		ArmySuperior 指挥官=new ArmySuperior();//2、无参构造方法
		指挥官.setCommand(command);
		指挥官.startExecutCommand();
	}

}
