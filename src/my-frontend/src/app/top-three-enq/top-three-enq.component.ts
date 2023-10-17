import { Component } from '@angular/core';
import * as Highcharts from 'highcharts';
import * as Highmaps from 'highcharts/highmaps';
import * as Highstock from 'highcharts/highstock';
import  {Chart} from 'angular-highcharts';

@Component({
  selector: 'app-top-three-enq',
  templateUrl: './top-three-enq.component.html',
  styleUrls: ['./top-three-enq.component.css']
})
export class TopThreeEnqComponent {

  chart = new Chart({
    chart: {
      type: 'bar',
      height: 225
    },
    title: {
      text: 'Top 3 Enqueteurs'
    },
    xAxis: {
      categories: [
        '0709	IMANE',
        '0711 HIND',
        '0612 YASSER',
      ]
    },
    yAxis: {
      title: {
        text: 'Nombre de questionnaires enregistrés'
      }
    },
    series: [
      {
        type: 'bar',
        showInLegend: false,
        data: [
          {
            name: '0709	IMANE',
            y: 76,
            color: '#db803a',
          },
          {
            name: '0711 HIND',
            y: 75,
            color: '#77003a',
          },
          {
            name: '0612 YASSER',
            y: 71,
            color: '#044342',
          },
        ]
      }
    ],
    credits: {
      enabled: false
    }
  })

}
