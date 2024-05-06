package day5;

public class Books {
	private Integer id;
	private String bname;
	private Float price;
	private Integer pages;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public Books() {
		super();
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Books(Integer id, String bname, Float price, Integer pages) {
		super();
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "id=" + id + ", bname=" + bname + ", price=" + price + ", pages=" + pages;
	}

}
