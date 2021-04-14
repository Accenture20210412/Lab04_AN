package main.java.dp.component;

import java.util.List;

public interface FileSystemElement {

	public boolean rename(String newName);
	public void print();
	public void add(FileSystemElement fileSystemElement);
	public String getName();
	public void setName(String name);

}
