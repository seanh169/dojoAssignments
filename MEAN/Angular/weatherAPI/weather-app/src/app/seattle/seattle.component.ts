import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-seattle',
  templateUrl: './seattle.component.html',
  styleUrls: ['./seattle.component.css']
})
export class SeattleComponent implements OnInit {
	statsTwo = [];
  constructor(private _http: HttpClient) {
  	let x = _http.get(`http://api.openweathermap.org/data/2.5/weather?id=5809844&APPID=195a40dd1ccaaeb3f13684fe02f04bcd`);
  	x.subscribe(data => {
  		// this.newStat = data;
  		// console.log(this.newStat);
  		// console.log(data);
  		for(let dat in data){
  			// this.newStat = data;
  			// console.log(data[name]);
  			// this.stats.push(dat);
  			this.statsTwo.push(data[dat]);
  		}


  	})

   }

  ngOnInit() {
  }

}