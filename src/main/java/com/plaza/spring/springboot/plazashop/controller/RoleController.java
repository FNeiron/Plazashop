package com.plaza.spring.springboot.plazashop.controller;

import com.plaza.spring.springboot.plazashop.dto.RoleDto;
import com.plaza.spring.springboot.plazashop.entities.User;
import com.plaza.spring.springboot.plazashop.service.impl.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/role/update/{oldName}/{newName}")
    public RoleDto updateRole(@PathVariable String oldName, @PathVariable String newName){
        return roleService.updateRole(oldName, newName);
    }

    @GetMapping("/user/addRole/{username}/{newRole}")
    public User addRole(@PathVariable String username, @PathVariable String newRole){
        return roleService.setRole(username, newRole);
    }
}
