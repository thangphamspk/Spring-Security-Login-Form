package com.thangphamspk.service;

import com.thangphamspk.entity.Role;

public interface RoleService {

    Role findRoleById(long id);

    Role addRole(Role role);

    void deleteRoleById(long id);
}
