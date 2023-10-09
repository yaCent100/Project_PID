import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Locality } from '../model/locality.model';

@Injectable({
  providedIn: 'root'
})
export class LocalityService {

  private apiUrlLocalities = 'http://localhost:8080/localities';

  constructor(private http: HttpClient) { }


getAllLocalities(): Observable<Locality[]> {
    return this.http.get<Locality[]>(`${this.apiUrlLocalities}`);
  }

 getLocalityById(id: number): Observable<Locality> {
    const url = `${this.apiUrlLocalities}/${id}`;
    return this.http.get<Locality>(url);

    }
  }
