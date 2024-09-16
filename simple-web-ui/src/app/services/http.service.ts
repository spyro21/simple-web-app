import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  httpHeaders: HttpHeaders = new HttpHeaders({
    'Content-Type': 'text/plain',
    'Accept': '*/*',
    'Access-Control-Allow-Origin': '*',
    'Access-Control-Allow-Credentials': 'true',
  })

  constructor(private http: HttpClient) {
  }


  get(endpoint: string) {
    return this.http.get('http://localhost:8080' + endpoint, {headers: this.httpHeaders});
  }
}
