import { Component, OnInit } from '@angular/core';
import { HardcodedAutenticationService } from '../service/hardcoded-autentication.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
 // isUserLoggedIn: boolean = false;
 
  constructor(private hardcodedauthentication: HardcodedAutenticationService) { }

  ngOnInit() {
   // this.isUserLoggedIn = this.hardcodedauthentication.isUserLoggedIN();
  }

}
