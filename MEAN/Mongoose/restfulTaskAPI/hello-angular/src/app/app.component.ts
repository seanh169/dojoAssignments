import { Component, OnInit } from '@angular/core';
import { HttpService } from './http.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  tasks; 
  title = 'MEAN';
  constructor(private _httpService: HttpService){}

  ngOnInit(){
      this.getTasksFromService();
      // console.log("Hello");
    }
    getTasksFromService(){
    let observable = this._httpService.getTasks();
    observable.subscribe(data => console.log("Got our tasks!", data));
    this.tasks = data; 
}

}
