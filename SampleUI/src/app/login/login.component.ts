import { Component, OnInit } from '@angular/core';
import { HttpClientService } from '../service/http-client.service';

import { 
  MatDatepickerModule, 
  MatNativeDateModule,
  MatFormFieldModule,
  MatInputModule
} from '@angular/material';
import { Router } from '@angular/router';
import { HardcodedAutenticationService } from '../service/hardcoded-autentication.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
name = "guru sir";
pwd = "";
errorMessage = "Invalid Credentials"
isInvalid = false;
startDate = new Date(2000, 0, 2);
Employees: string[];
  constructor(private router: Router, private hardcodedAuthentication: HardcodedAutenticationService, private http:HttpClientService) 
  {

   }

  ngOnInit() {
     this.http.getEmployees().subscribe(response=>this.handleSuccessfulResponse(response),);
  }

  handleLogin(){
    console.log(this.name)
    if(this.hardcodedAuthentication.authentication(this.name, this.pwd)){  
      this.router.navigate(["welcome", this.name]);
    }
    else{this.isInvalid = true;}
    
   // alert("ngInit()"+this.name)

  }
  handleSuccessfulResponse(response)
{
    this.Employees=response;
}

}
