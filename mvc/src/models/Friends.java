package mvc.src.models;

public class Friends {
	private int id;
	private String name;
	private String address;
	private long number;

	public Friends (int id, String name, String address, long number) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public int getId() { return id; }

	public String getName() { return name; }

	public String getAddress() { return address; }

	public Long getNumber() { return  number; }

	public void putName(String name) { this.name = name; }

	public void putAddress(String address) { this.address = address; }

	public void putNumber(long number) { this.number = number; }
}
