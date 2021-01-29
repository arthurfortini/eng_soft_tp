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
    if(result === 200){ //nao tenho certeza se isso funcionara, tenho q debuggar e ver oq o result retorna para consertar e fazer a checagem certa
      console.log(result);
      window.localStorage.setItem('token', usuario.login); //meu token sera o nome do usuario que eu espero usar depois para pegar as infos do usuario no BD (pelo get)
      return true;
    }
    else {
      console.log(result); //Checa se deu problema no BD (se pelo menos o post foi enviado)
      return false; //se retornar false, nao ira setar nenhum token e o AuthGuard vai continuar false
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

}
