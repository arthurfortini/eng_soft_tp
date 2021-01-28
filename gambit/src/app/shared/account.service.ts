import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})


export class AccountService {

  toLogin (usuario: any){
    return new Promise((resolve) => {
      window.localStorage.setItem('token', 'meu_token');
      resolve(true);
    });
  }

  newAccount (newacc: any){
    return new Promise((resolve) => {
      resolve(true);
    })

  }

  constructor() { }
}
