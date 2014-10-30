package 命令模式;

public class Test {

	/**
	 * @author 李晓伟
	 * 2014-10-23 下午11:23:34
	 * @描述:
	 */
	public static void main(String[] args) {
		/*CompanyArmy 三连=new CompanyArmy();//命令接收者
		Command command=new ConcreateCommand(三连);//创建具体命令并指定接收者
		//ArmySuperior 指挥官=new ArmySuperior(command);//1、带参数构造方法
		ArmySuperior 指挥官=new ArmySuperior();//2、无参构造方法
		指挥官.setCommand(command);
		指挥官.startExecutCommand();*/
		//创建文件与删除文件
		MakeDir makeDir=new MakeDir();//创建接收者
		Command command=new ConcreateCommand(makeDir);//创建具体命令,并指定接收者
		RequestMakedir requestMakedir=new RequestMakedir();//创建请求者
		requestMakedir.setCommand(command);//设置命令
		requestMakedir.startExcutCommand("jiafei");//创建jiafei目录
		requestMakedir.startExcutCommand("tom");//创建tom目录
		requestMakedir.startExcutCommand("jerry");//创建jerry目录
		requestMakedir.undoCommand();//删除jerry目录
		requestMakedir.undoCommand();//删除tom目录
		requestMakedir.undoCommand();//删除jiafei目录
	}

}
