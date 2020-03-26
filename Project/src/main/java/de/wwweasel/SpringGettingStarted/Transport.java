package de.wwweasel.SpringGettingStarted;

public class Transport {
	
	private final String base = "Hello ";
	private String name;
	
	public Transport() {}
	
	public Transport(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Transport [name=" + name + "]";
	}

	public String getBase() {
		return base;
	}
	
	
}
