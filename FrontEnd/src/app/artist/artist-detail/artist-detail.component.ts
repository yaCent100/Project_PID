import { Component, Inject } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { ArtistService } from '../../service/artist.service';
import { Artist } from '../../model/artist.model';

@Component({
  selector: 'app-artist-detail',
  templateUrl: './artist-detail.component.html',
  styleUrls: ['./artist-detail.component.css']
})
export class ArtistDetailComponent {

 artist: any;

 constructor( @Inject(ActivatedRoute)private activateRoute: ActivatedRoute,
              private route: Router,
              private artistService: ArtistService) {}

 ngOnInit(): void {
    const artistId = Number(this.activateRoute.snapshot.paramMap.get('id'));
        this.artistService.getArtistById(artistId).subscribe((artist: Artist) => {
          this.artist = artist;
        });
  }
  goBackToList() {
    this.route.navigate(['/artist']);
  }
}
