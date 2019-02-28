package hello.Service;

import hello.Model.User;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserService
{
	private static List<User> userList;


	public UserService()
	{
		userList = new ArrayList<>();

	}

	public User addUser( User user )
	{
		user.setId( userList.size() );
		userList.add( user );
		return user;
	}

	public User getUser( int id )
	{
		return userList.get( id );
	}

	public List<User> getAll()
	{
		return userList;
	}

	public User deletUserbyId( int id )
	{
		return userList.remove( id );
	}
}
