package com.authserver.config;

import java.util.Collection;
import java.util.List;

import com.authserver.entity.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class SecUser implements UserDetails{

	private static final long serialVersionUID = 1L;
	
	private UserEntity userEntity;

	public SecUser(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	

	public UserEntity getUserEntity() {
		return userEntity;
	}




	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<String> rolesList=userEntity.getRoles();
		String []rolesArray=rolesList.toArray(new String[rolesList.size()]);
		
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
