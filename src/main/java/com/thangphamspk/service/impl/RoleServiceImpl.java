package com.thangphamspk.service.impl;

import com.thangphamspk.entity.Role;
import com.thangphamspk.repository.RoleRepository;
import com.thangphamspk.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRoleById(long id) {
        return roleRepository.getOne(id);
    }

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRoleById(long id) {
        roleRepository.deleteById(id);
    }
}
