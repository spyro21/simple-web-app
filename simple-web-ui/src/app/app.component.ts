import { Component } from '@angular/core';
import {HttpService} from "./services/http.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'simple-web-ui';

  classes: string[] = []

  constructor(httpService: HttpService) {
    httpService.get('/classes').subscribe((classes) => {
      this.classes = classes as string[];
    })
  }
}
