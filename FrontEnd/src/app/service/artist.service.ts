import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Artist } from '../model/artist.model';




@Injectable({
  providedIn: 'root'
})
export class ArtistService {

private apiUrlArtist = 'http://localhost:8080/artists'

  constructor(private http: HttpClient) { }

  getAllArtists(): Observable<Artist[]> {
      const url = `${this.apiUrlArtist}`
      return this.http.get<Artist[]>(url);
    }

    getArtistById(id: number): Observable<Artist> {
       const url = `${this.apiUrlArtist}/${id}`;
       return this.http.get<Artist>(url);
     }


}
