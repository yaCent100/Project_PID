import { Injectable } from '@angular/core';
import { Role } from '../model/role.model';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RoleService {

   private apiUrlRoles = 'http://localhost:8080/roles';

    constructor(private http: HttpClient) {}

    getAllRoles(): Observable<Role[]> {
      return this.http.get<Role[]>(`${this.apiUrlRoles}`);
    }

    getRoleById(id: number): Observable<Role> {
      return this.http.get<Role>(`${this.apiUrlRoles}/${id}`);
    }
}
