package hello.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Profile
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String name;
	private int id;
	private String email;
}


