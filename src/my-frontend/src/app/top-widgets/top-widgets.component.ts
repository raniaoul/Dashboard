import { Component } from '@angular/core';
import {faLocation, faBriefcase, faContactBook, faPenToSquare} from '@fortawesome/free-solid-svg-icons';
@Component({
  selector: 'app-top-widgets',
  templateUrl: './top-widgets.component.html',
  styleUrls: ['./top-widgets.component.css']
})
export class TopWidgetsComponent {
faLocation=faLocation;
faContactBook= faContactBook;
faPenToSquare = faPenToSquare;
faBriefCase = faBriefcase;
}
