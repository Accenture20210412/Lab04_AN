package main.java.dp.component;

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
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		System.out.println(name);
	}

	@Override
	public void add(FileSystemElement fileSystemElement) {

	}


}
