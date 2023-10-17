import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SideNavComponent } from './side-nav/side-nav.component';
import { MainComponent } from './main/main.component';
import { TopWidgetsComponent } from './top-widgets/top-widgets.component';
import { QuestParEnqComponent } from './quest-par-enq/quest-par-enq.component';
import { TopThreeEnqComponent } from './top-three-enq/top-three-enq.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { QuestParStatutComponent } from './quest-par-statut/quest-par-statut.component';
import {ChartModule} from "angular-highcharts";
import { CarteComponent } from './carte/carte.component';
import {HttpClientModule} from "@angular/common/http";
import { EnqueteursPageComponent } from './enqueteurs-page/enqueteurs-page.component';
import { LocationPageComponent } from './location-page/location-page.component';
import { ContactPageComponent } from './contact-page/contact-page.component';
import { AidePageComponent } from './aide-page/aide-page.component';
import { DropDownMenuComponent } from './drop-down-menu/drop-down-menu.component';
import {NgOptimizedImage} from "@angular/common";
import { MapsModule } from '@syncfusion/ej2-angular-maps';
import {ReactiveFormsModule} from "@angular/forms";
import { EmployeComponent } from './employe/employe.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SideNavComponent,
    MainComponent,
    TopWidgetsComponent,
    QuestParEnqComponent,
    TopThreeEnqComponent,
    QuestParStatutComponent,
    CarteComponent,
    EnqueteursPageComponent,
    LocationPageComponent,
    ContactPageComponent,
    AidePageComponent,
    DropDownMenuComponent,
    EmployeComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    ChartModule,
    HttpClientModule,
    NgOptimizedImage,
    MapsModule,
    ReactiveFormsModule,


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
