package pl.mm.notesKeeper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mm.notesKeeper.dao.BaseInfoRepository;
import pl.mm.notesKeeper.dao.RoleRepository;
import pl.mm.notesKeeper.dto.Request;
import pl.mm.notesKeeper.dto.Response;
import pl.mm.notesKeeper.dto.UserDto;
import pl.mm.notesKeeper.model.Role;
import pl.mm.notesKeeper.model.User;

import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.stream.Collectors;

@Transactional
@Service
public class UserService extends BaseInfoService<User, Long> implements UserDetailsService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    protected UserService(BaseInfoRepository<User, Long> repository) {
        super(repository);
    }

    public Response createUser(Request<UserDto> request) {
        UserDto userDto = request.getRequest();
        User user = modelMapper.map(userDto, User.class);

        user.setUuid(UUID.randomUUID());
        user.setRoles(Collections.singletonList(roleRepository.findByRoleName("USER").orElse(null)));

        user = repository.save(user);


        return Response
                .builder()
                .response("User " + user.getUserName() + " created successfully")
                .build();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toList());
    }

}
