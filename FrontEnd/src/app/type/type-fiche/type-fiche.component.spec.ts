import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TypeFicheComponent } from './type-fiche.component';

describe('TypeFicheComponent', () => {
  let component: TypeFicheComponent;
  let fixture: ComponentFixture<TypeFicheComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TypeFicheComponent]
    });
    fixture = TestBed.createComponent(TypeFicheComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
