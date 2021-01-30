import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})


export class AccountService {

  constructor( private http: HttpClient ) { }

  async toLogin (usuario: any){

    try {
        let result = await this.http.post<any>(`${environment.api}/users/login`, usuario).toPromise();
        return true;
      } catch (error) {
        return false;
      }
    /*
    const result = await this.http.post<any>(`${environment.api}/users/login`, usuario).toPromise();

    if(result){
      console.log(result.status);
      window.localStorage.setItem('token', result.status);
      return true;
    }
    else {
      console.log(result);
      return false;
    }
    */
  }

  async createAccount (newacc: User){
    let name = newacc.login;
    console.log("CREATE ACCOUNT CONTA:");
    console.log(newacc);
    const result = await this.http.post<any>(`${environment.api}/users/`+`${name}`, newacc).toPromise();
    return result;
  }

  getAuthorizationToken(){
    const token = window.localStorage.getItem('token');
    return token;
  }

  isUserLoggedIn() {
    const token = this.getAuthorizationToken();

    if(token != '200'){
      return false;
    }
    else{
      return true;
    }
  }

}
