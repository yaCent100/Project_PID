import { Component } from '@angular/core';
import { TypeService } from '../service/type.service';
import { Type } from '../model/type.model';


@Component({
  selector: 'app-type',
  templateUrl: './type.component.html',
  styleUrls: ['./type.component.css']
})
export class TypeComponent {
 types: Type[] = [];

  constructor(private typeService: TypeService) {}

  ngOnInit(): void {
  this.typeService.getAllTypes().subscribe((types: Type[]) => {
    this.types = types;
    console.log(types);
  });
  }
}
