import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { TypeService } from '../../service/type.service';
import { Type } from '../../model/type.model';


@Component({
  selector: 'app-type-fiche',
  templateUrl: './type-fiche.component.html',
  styleUrls: ['./type-fiche.component.css']
})
export class TypeFicheComponent {
  type!: Type ;

   constructor(
      private route: Router,
      private typeService: TypeService,
      private activateRoute: ActivatedRoute
    ) {}


     ngOnInit(): void {
        const typeId = Number(this.activateRoute.snapshot.paramMap.get('id'));
        this.typeService.getTypeById(typeId).subscribe((type: Type) => {
          this.type = type;
        });
      }
  goBackToList() {
    this.route.navigate(['/types']);
  }
}
