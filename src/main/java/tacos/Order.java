package tacos;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraints.Digits;

@Data
public class Order {
     
	@NotBlank(message="Name is required")
	 private String name;
	 private String street;
	 private String city;
	 private String state;
	 private String zip;
	 private String ccNumber;
	 private String ccExpiration;
	 private String ccCVV;
}
