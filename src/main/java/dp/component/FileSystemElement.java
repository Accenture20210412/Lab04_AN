package main.java.dp.component;

import java.util.List;

public interface FileSystemElement {

	public boolean rename(String newName);
	public boolean remove(FileSystemElement fileSystemElement);
	public void move(FileSystemElement element, Directory directory, List<Directory> directories);
	public void print();
	public void add(FileSystemElement fileSystemElement);
	public String getName();
	public void setName(String name);

}
