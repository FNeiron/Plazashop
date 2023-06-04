package com.plaza.spring.springboot.plazashop.service.impl;

import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    public RoleService(RoleRepository roleRepository, UserRepository userRepository) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    public RoleDto updateRole(String oldName, String newName){
        Role role = roleRepository.findByRole(oldName);
        role.setRole(newName);
        roleRepository.save(role);
        return new RoleDto(role.getRole());
    }

    public User setRole(String username, String newRole){
        User user = userRepository.findByUsername(username).orElse(null);
        Role role = roleRepository.findByRole(newRole);
        if (user != null){
            user.getRoles().add(role);
            userRepository.save(user);
        }
        return user;
    }
}
