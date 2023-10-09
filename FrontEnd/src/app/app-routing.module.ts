import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ArtistComponent } from './artist/artist.component';
import { ArtistDetailComponent } from './artist/artist-detail/artist-detail.component';
import { TypeComponent } from './type/type.component';
import { TypeFicheComponent } from './type/type-fiche/type-fiche.component';
import { LocalityComponent } from './locality/locality.component';
import { LocalityFicheComponent } from './locality/locality-fiche/locality-fiche.component';
import { RoleComponent } from './role/role.component'
import { RoleFicheComponent } from './role/role-fiche/role-fiche.component'


const routes: Routes = [
{ path: 'artist', component: ArtistComponent },
{ path: 'artist/:id', component: ArtistDetailComponent },
{ path: 'types', component: TypeComponent },
{ path: 'localities', component: LocalityComponent },
{ path: 'types/:id', component: TypeFicheComponent },
{ path: 'localities/:id', component: LocalityFicheComponent },
{ path: 'roles', component: RoleComponent },
{ path: 'roles/:id', component: RoleFicheComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
