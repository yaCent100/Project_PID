import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoleFicheComponent } from './role-fiche.component';

describe('RoleFicheComponent', () => {
  let component: RoleFicheComponent;
  let fixture: ComponentFixture<RoleFicheComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RoleFicheComponent]
    });
    fixture = TestBed.createComponent(RoleFicheComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
