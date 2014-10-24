package ÃüÁîÄ£Ê½;

public class RequestMakedir {
	private Command command;
	/*
	 * Ö´ĞĞÃüÁî
	 */
	public void startExcutCommand(String name){
		command.execute(name);
	}
	/*
	 * ³·ÏúÃüÁî
	 */
	public void undoCommand(){
		command.undo();
	}
	public void setCommand(Command command) {
		this.command = command;
	}
}
