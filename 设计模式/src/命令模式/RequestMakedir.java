package 命令模式;

public class RequestMakedir {
	private Command command;
	/*
	 * 执行命令
	 */
	public void startExcutCommand(String name){
		command.execute(name);
	}
	/*
	 * 撤销命令
	 */
	public void undoCommand(){
		command.undo();
	}
	public void setCommand(Command command) {
		this.command = command;
	}
}
