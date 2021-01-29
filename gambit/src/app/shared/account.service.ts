import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})


export class AccountService {

  constructor( private http: HttpClient ) { }

  async toLogin (usuario: any){

    const result = await this.http.post<any>(`${environment.api}/users/login`, usuario).toPromise();
    if(result){ //nao tenho certeza se isso funcionara, tenho q debuggar e ver oq o result retorna para consertar e fazer a checagem certa
      console.log(result); //Ver como a cara desse result vai ser
      window.localStorage.setItem('token', result);
      return true;
    }
    else {
      console.log(result); //Checa se deu problema no BD (se pelo menos o post foi enviado)
      return false;
    }
  }

  async createAccount (newacc: any){
    const result = await this.http.post<any>(`${environment.api}/users/`, newacc).toPromise();
    return result
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
