package hello.Service;

import hello.Model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProfileService extends CrudRepository<Profile, Integer>
{

}
