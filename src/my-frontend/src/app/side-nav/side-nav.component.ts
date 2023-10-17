import {Component, OnInit} from '@angular/core';
import {faDashboard, faLocation, faBox, faContactBook, faHand} from '@fortawesome/free-solid-svg-icons';
@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.css']
})
export class SideNavComponent {
faDashboard = faDashboard;
faLocation = faLocation;
faBox = faBox;
faContactBook = faContactBook;
faHand = faHand;


}
