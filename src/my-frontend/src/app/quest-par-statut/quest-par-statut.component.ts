import { Component } from '@angular/core';
import * as Highcharts from 'highcharts';
import * as Highmaps from 'highcharts/highmaps';
import * as Highstock from 'highcharts/highstock';
import  {Chart} from 'angular-highcharts';

@Component({
  selector: 'app-quest-par-statut',
  templateUrl: './quest-par-statut.component.html',
  styleUrls: ['./quest-par-statut.component.css']
})
export class QuestParStatutComponent {

  chart = new Chart({
    chart: {
      type: 'pie',
      height: 325
    },
    title: {
      text: 'questionnaires par statut'
    },
    xAxis: {
      categories: [
        '0- en cours',
        '1- enregistré',
        '2- rempli partiellement',
        '3- refus',
        '4- injoignable',
      ]
    },
    yAxis: {
      title: {
        text: ''
      }
    },
    series: [
      {
        type: 'pie',
        data: [
          {
            name: '0- en cours',
            y: 211,
            color: '#77003a',
          },
          {
            name: '1- enregistrés',
            y:3790,
            color: '#db803a',
          },
          {
            name: '2- remplis partiellement',
            y: 6,
            color: '#044342',
          },
          {
            name: '3- refusés',
            y: 66,
            color: '#5e31b9',
          },
          {
            name: '4- injoignables',
            y: 60,
            color: '#343333',
          },
        ]
      }
    ],
    credits: {
      enabled: false
    }
  })

}
