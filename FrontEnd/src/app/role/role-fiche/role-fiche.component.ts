import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RoleService } from '../../service/role.service';
import { Role } from '../../model/role.model';

@Component({
  selector: 'app-role-fiche',
  templateUrl: './role-fiche.component.html',
  styleUrls: ['./role-fiche.component.css']
})
export class RoleFicheComponent {
 role!: Role;

  constructor(
    private router: Router,
    private roleService: RoleService,
    private activatedRoute: ActivatedRoute
  ) {}

  ngOnInit(): void {
    const roleId = Number(this.activatedRoute.snapshot.paramMap.get('id'));
    this.roleService.getRoleById(roleId).subscribe((role: Role) => {
      this.role = role;
    });
  }

  goBackToList() {
    this.router.navigate(['/roles']);
  }
}
