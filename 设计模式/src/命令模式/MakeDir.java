package 命令模式;

import java.io.File;

public class MakeDir {
	/**
	 * 
	 * @author 李晓伟
	 * 2014-10-24 下午9:39:03
	 * @描述: 创建文件
	 */
	public void createDir(String name){
		File dir=new File(name);
		dir.mkdir();
	}
	
	public void deleteDir(String name){
		File dir=new File(name);
		if(dir.exists()){
			dir.delete();
		}
	}
}
