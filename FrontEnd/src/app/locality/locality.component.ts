import { Component, OnInit } from '@angular/core';
import { LocalityService } from '../service/locality.service';
import { Locality } from '../model/locality.model';
import { Router } from '@angular/router';


@Component({
  selector: 'app-locality',
  templateUrl: './locality.component.html',
  styleUrls: ['./locality.component.css']
})
export class LocalityComponent implements OnInit{

 localities: Locality[] = [];

 constructor(private localityService: LocalityService) {}

 ngOnInit(): void {
    this.localityService.getAllLocalities().subscribe((localities: Locality[]) => {
      this.localities = localities;
    });
  }
}
