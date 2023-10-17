import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {MainComponent} from "./main/main.component";
import {EnqueteursPageComponent} from "./enqueteurs-page/enqueteurs-page.component";
import {LocationPageComponent} from "./location-page/location-page.component";
import {ContactPageComponent} from "./contact-page/contact-page.component";
import {AidePageComponent} from "./aide-page/aide-page.component";
import {EmployeComponent} from "./employe/employe.component";


const routes: Routes = [
  {path: 'dashboard', component : MainComponent, pathMatch: 'full'},
  {path: '', redirectTo: 'dashboard', pathMatch: 'full'},
  {path: 'Enqueteurs', component: EnqueteursPageComponent},
  {path: 'Localisation', component: LocationPageComponent},
  {path: 'Contact', component: ContactPageComponent},
  {path: 'Aide', component: AidePageComponent},
  {path: 'Employes', component: EmployeComponent},
  {path: '', redirectTo: 'main', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
