package hello.Controller;

import hello.Model.User;
import hello.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/")
public class UserController
{

	private static final String USER_END_POINT = "/user/";

	@Autowired
	private UserService userService;

	@GetMapping("{id}")
	public User showbyId( @RequestParam(value = "id") int id )
	{
		return userService.getUser( id );
	}
}
