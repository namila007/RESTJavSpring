package hello.Controller;

import hello.Model.Profile;
import hello.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/profile")
public class ProfileController
{
	@Autowired
	private ProfileService profileService;

	//POST create new profilev
	@PostMapping
	public ResponseEntity<?> addProfile( @RequestBody Profile profile )
	{
		return new ResponseEntity<Profile>( profileService.save( profile ), HttpStatus.CREATED );
	}

	@GetMapping()
	public ResponseEntity<?> getAllProfiles()
	{
		return new ResponseEntity<Iterable<Profile>>( profileService.findAll(), HttpStatus.OK );
	}
}
