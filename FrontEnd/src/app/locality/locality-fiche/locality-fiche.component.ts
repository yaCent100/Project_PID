import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LocalityService } from '../../service/locality.service';
import { Locality } from '../../model/locality.model';

@Component({
  selector: 'app-locality-fiche',
  templateUrl: './locality-fiche.component.html',
  styleUrls: ['./locality-fiche.component.css']
})
export class LocalityFicheComponent implements OnInit{
 locality!: Locality;

  constructor(
    private route: Router,
    private localityService: LocalityService,
    private activateRoute: ActivatedRoute
  ) {}

    ngOnInit(): void {
      const localityId = Number(this.activateRoute.snapshot.paramMap.get('id'));
      this.localityService.getLocalityById(localityId).subscribe((locality: Locality) => {
        this.locality = locality;
      });
    }

     goBackToList() {
        this.route.navigate(['/localities']);
      }
}
