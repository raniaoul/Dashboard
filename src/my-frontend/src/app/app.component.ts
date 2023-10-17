import { Component } from '@angular/core';
import {ActivatedRoute, NavigationEnd, Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Tableau de bord';
  showMainComponent: boolean = true; // Initialize to true to display MainComponent by default

  constructor(private router: Router, private activatedRoute: ActivatedRoute) {
    // Listen to the NavigationEnd event to determine the current route
    this.router.events.subscribe((event) => {
      if (event instanceof NavigationEnd) {
        // Check if the current route is '/Enqueteurs'
        this.showMainComponent = event.url == '/Dashboard';
      }
    });
  }
}
