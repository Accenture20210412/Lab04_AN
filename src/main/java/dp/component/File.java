package main.java.dp.component;

import java.util.List;

public class File implements FileSystemElement {

	private String name;
	
	public File(String name) {
		this.name = name;
	}
	
	@Override
	public boolean rename(String newName) {
		this.name = newName;
		return true;
	}


	@Override
	public void print() {
		System.out.println(name);
	}

	@Override
	public void add(FileSystemElement fileSystemElement) {

	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
