import { Component, OnInit } from '@angular/core';
import { ArtistService } from '../service/artist.service';
import { Artist } from '../model/artist.model';
import { Router } from '@angular/router';


@Component({
  selector: 'app-artist',
  templateUrl: './artist.component.html',
  styleUrls: ['./artist.component.css']
})
export class ArtistComponent implements OnInit{

 artists: any[] = [];

constructor(private artistService: ArtistService){
}

 ngOnInit(): void {
   this.artistService.getAllArtists().subscribe((artists: Artist[]) => {
      this.artists = artists;
    });
}
}
