package com.demo.config;

import com.demo.entity.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class SecUser implements UserDetails {

    private UserEntity userEntity;

    public SecUser(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    //this method would be internally called by spring sec to find the roles of that user
    //this method would be internally called by spring sec to find the roles of that user
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<String> roles=userEntity.getRoles();
        //somehow u need to createe AL to Array
        String []rolesArray=roles.toArray(new String[roles.size()]);

        return AuthorityUtils.createAuthorityList(rolesArray);
    }

    @Override
    public String getPassword() {
        return userEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return userEntity.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
