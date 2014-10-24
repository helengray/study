package 命令模式;
/**
 * 
 * @author 李晓伟
 * 2014-10-23 下午11:19:56
 * TODO 具体命令，实现了命令接口
 */
public class ConcreateCommand implements Command {
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
}
