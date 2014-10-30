package 命令模式;

import java.util.ArrayList;

/**
 * 
 * @author 李晓伟
 * 2014-10-23 下午11:19:56
 * TODO 具体命令，实现了命令接口
 */
public class ConcreateCommand implements Command {
	//指挥官与士兵的例子
	private CompanyArmy army;
	public ConcreateCommand() {
	}
	public ConcreateCommand(CompanyArmy army) {
		this.army=army;
	}
	@Override
	public void execute() {
		army.sneakAttack();
	}
	
	//创建文件与撤销创建文件(删除文件)的例子
	private ArrayList<String> dirNameList;
	MakeDir makeDir;
	
	public ConcreateCommand(MakeDir makeDir){
		dirNameList=new ArrayList<String>();
		this.makeDir=makeDir;
	}
	@Override
	public void execute(String fileName) {
		makeDir.createDir(fileName);
		dirNameList.add(fileName);
	}
	@Override
	public void undo() {
		if(dirNameList.size()>0){
			int m=dirNameList.size();
			String str=dirNameList.get(m-1);
			makeDir.deleteDir(str);
			dirNameList.remove(m-1);
		}
	}
}
