import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ArtistComponent } from './artist/artist.component';
import { HttpClientModule } from '@angular/common/http';
import { ArtistDetailComponent } from './artist/artist-detail/artist-detail.component';
import { TypeComponent } from './type/type.component';
import { LocalityComponent } from './locality/locality.component';
import { RoleComponent } from './role/role.component';
import { TypeFicheComponent } from './type/type-fiche/type-fiche.component';
import { LocalityFicheComponent } from './locality/locality-fiche/locality-fiche.component';
import { RoleFicheComponent } from './role/role-fiche/role-fiche.component';






@NgModule({
  declarations: [
    AppComponent,
    ArtistComponent,
    ArtistDetailComponent,
    TypeComponent,
    LocalityComponent,
    RoleComponent,
    TypeFicheComponent,
    LocalityFicheComponent,
    RoleFicheComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
