import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodedAutenticationService {

  constructor() { }
  authentication(userName, password){
    if(userName == "guru" && password == "guru"){
      sessionStorage.setItem("name", userName);
      return true;
    }
    return false;
  }
isUserLoggedIN(){
  let user = sessionStorage.getItem("name");
  return !(user == null);
}
logout(){
  sessionStorage.removeItem("name");
}

}
