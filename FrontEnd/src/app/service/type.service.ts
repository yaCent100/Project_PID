import { Injectable } from '@angular/core';
import { Type } from '../model/type.model';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';




@Injectable({
  providedIn: 'root'
})
export class TypeService {

    private apiUrlTypes = 'http://localhost:8080/types';

    constructor(private http: HttpClient) {}

    getAllTypes(): Observable<Type[]> {
      return this.http.get<Type[]>(`${this.apiUrlTypes}`);
    }

    getTypeById(id: number): Observable<Type> {
      return this.http.get<Type>(`${this.apiUrlTypes}/${id}`);
    }
}
