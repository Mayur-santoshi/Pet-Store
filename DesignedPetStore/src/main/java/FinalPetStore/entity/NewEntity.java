package FinalPetStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pets")
public class NewEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String breed;
    private String species;
    private String color;
    private String description;
    private double price;
    private String status; // Example: "Available", "Adopted"
    private String imageUrl;
    
    
	public NewEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public NewEntity(int id, String name, int age, String breed, String species, String color, String description,
			double price, String status, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.species = species;
		this.color = color;
		this.description = description;
		this.price = price;
		this.status = status;
		this.imageUrl = imageUrl;
	}
	
	
	@Override
	public String toString() {
		return "NewEntity [id=" + id + ", name=" + name + ", age=" + age + ", breed=" + breed + ", species=" + species
				+ ", color=" + color + ", description=" + description + ", price=" + price + ", status=" + status
				+ ", imageUrl=" + imageUrl + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
    
    

}
