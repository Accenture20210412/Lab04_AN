package main.java.dp.component;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Directory implements FileSystemElement {
	
	private String name;
	private List<FileSystemElement> fileSystemElements = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public boolean rename(String newName) {
		this.name = newName;
		return true;
	}

	@Override
	public boolean remove(FileSystemElement fileSystemElement) {
		if (fileSystemElements.contains(fileSystemElement)) {
			fileSystemElements.remove(fileSystemElement);
			return true;
		} else {
			System.out.println("W wybranym folderze nie znajduje się podany obiekt");
			return false;
		}
	}

	@Override
	public void move(FileSystemElement element, Directory directory) {

	}

	@Override
	public void print() {
		fileSystemElements.forEach(System.out::println);
	}

	@Override
	public void add(FileSystemElement fileSystemElement) {
		fileSystemElements.add(fileSystemElement);
	}

	public void renameElementIncluded(String oldName, String newName) {
		for(FileSystemElement element : fileSystemElements) {
			if(element.getName() == oldName) element.setName(newName);
		}
	}

	public void removeElementIncluded(String fileName) {
		fileSystemElements.removeIf(element -> element.getName() == fileName);
	}



	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}


}
