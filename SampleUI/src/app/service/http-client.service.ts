import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { from } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class HttpClientService {
  data: string[];

  constructor(private httpClient1:HttpClient) { }
  getEmployees()
  {
    console.log("test call");
   // return this.httpClient1.get<string[]>('http://localhost:8080/employees');
   return this.httpClient1.get<string[]>('http://springbootbasic2-env.kiemekmpmi.us-east-1.elasticbeanstalk.com/employees');
  }

}
