import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-enqueteurs-page',
  templateUrl: './enqueteurs-page.component.html',
  styleUrls: ['./enqueteurs-page.component.css']
})
export class EnqueteursPageComponent implements OnInit {

  data: any[] | undefined;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.loadData();
  }

  loadData() {
    this.http.get<any[]>('http://localhost:8080/Enqueteurs').subscribe(data => {
      this.data = data;})
  }}
