package ÃüÁîÄ£Ê½;

public class ArmySuperior {
	private Command command;
	public ArmySuperior() {
	}
	public ArmySuperior(Command command) {
		this.command=command;
	}
	public void startExecutCommand() {
		command.execute();
	}
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	
}
