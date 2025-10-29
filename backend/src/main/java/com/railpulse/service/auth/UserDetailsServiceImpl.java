// UserDetailsServiceImpl for loading users from DB
package com.railpulse.service.auth;
import com.railpulse.model.auth.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Load user from DB and return UserDetailsImpl
        // Placeholder: throw exception
        throw new UsernameNotFoundException("User not found");
    }
}
