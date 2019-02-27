package hello.Service;

import hello.Model.User;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class UserService
{
	private static List<User> userList;
	private static int userID;

	public UserService()
	{
		userList = new ArrayList<>();

	}

	public int addUser( String name )
	{
		userList.add( new User( name, userList.size() ) );
		return userList.size();
	}

	public User getUser( int id )
	{
		return userList.get( id );
	}
}
