package 命令模式;

public interface Command {
	public abstract void execute();
	public abstract void execute(String fileName);
	public abstract void undo();
}
