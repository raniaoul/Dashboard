import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-quest-par-enq',
  templateUrl: './quest-par-enq.component.html',
  styleUrls: ['./quest-par-enq.component.css']
})
export class QuestParEnqComponent implements OnInit {

  data: any[] | undefined;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.loadData();
  }

  loadData() {
    this.http.get<any[]>('http://localhost:8080/Enqueteurs').subscribe(data => {
      this.data = data;})
  }}
