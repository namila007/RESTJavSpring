package hello.Model;

import lombok.Data;

@Data
public class User
{
	private String name;
    private int id;

	public User( String name, int id )
	{
		this.name = name;
		this.id = id;
	}
}
