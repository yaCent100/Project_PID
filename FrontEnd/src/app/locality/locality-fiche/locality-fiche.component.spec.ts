import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LocalityFicheComponent } from './locality-fiche.component';

describe('LocalityFicheComponent', () => {
  let component: LocalityFicheComponent;
  let fixture: ComponentFixture<LocalityFicheComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LocalityFicheComponent]
    });
    fixture = TestBed.createComponent(LocalityFicheComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
