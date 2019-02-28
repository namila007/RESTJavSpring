package hello.Controller;

import hello.Model.User;
import hello.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController
{


	@Autowired
	private UserService userService;

	//GET a user from ID
	@GetMapping("/{id}")
	public ResponseEntity<?> showbyId( @PathVariable(value = "id") int id )
	{
		return new ResponseEntity<User>( userService.getUser( id ), HttpStatus.OK );
	}

	//GET get all users list
	@GetMapping()
	public ResponseEntity<List<User>> getAllUsers()
	{
		return new ResponseEntity<List<User>>( userService.getAll(), HttpStatus.OK );
	}

	//POST create a new user
	@PostMapping()
	public ResponseEntity<?> addUser( @RequestBody User user )
	{

		return new ResponseEntity<User>( userService.addUser( user ), HttpStatus.CREATED );
	}

	//Delete User
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletUserbyId( @PathVariable(value = "id") int id )
	{
		return new ResponseEntity<User>( userService.deletUserbyId( id ), HttpStatus.OK );
	}

}
