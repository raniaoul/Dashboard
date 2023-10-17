import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-location-page',
  templateUrl: './location-page.component.html',
  styleUrls: ['./location-page.component.css']
})
export class LocationPageComponent {
  data: any[] | undefined;

  constructor(private http: HttpClient) { }

  loadData() {
    const selectedOption = (document.getElementById("selectOption") as HTMLSelectElement).value;
    let url = "";

    switch (selectedOption) {
      case "region":
        url = "http://localhost:8080/Regions";
        break;
      case "commune":
        url = "http://localhost:8080/Communes";
        break;
      case "province":
        url = "http://localhost:8080/Provinces";
        break;
      default:
        console.error("Option invalide");
        return;
    }

    this.http.get<any[]>(url).subscribe(
      data => {
        this.data = data;
      },
      error => {
        console.error("Erreur lors du chargement des données :", error);
      }
    );
  }

}
