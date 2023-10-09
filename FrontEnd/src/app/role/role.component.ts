import { Component } from '@angular/core';
import { RoleService } from '../service/role.service';
import { Role } from '../model/role.model';


@Component({
  selector: 'app-role',
  templateUrl: './role.component.html',
  styleUrls: ['./role.component.css']
})
export class RoleComponent {
 roles: Role[] = [];

  constructor(private roleService: RoleService) {}

  ngOnInit(): void {
    this.roleService.getAllRoles().subscribe((roles: Role[]) => {
      this.roles = roles;
      console.log(roles);
    });
  }
}
