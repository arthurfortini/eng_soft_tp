import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AccountService } from 'src/app/shared/account.service';
import { User } from 'src/User';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  login = {
    login: '',
    password: ''
  }

  usuario = {
    login: '',
    password: '',
    full_name: '',
    age: 0,
    city_name: '',
    available_in: '',
    cell_phone: '',
    home_phone:'',
    insta: '',
    face: '',
    twitter: ''
  }

  constructor( private accountService: AccountService, private router: Router, private http: HttpClient ) { }

  async onSubmit(){

    try {
      const enter = await this.accountService.toLogin(this.login);

      if(enter){
        console.log(`Login efetuado`);
        this.usuario = await this.http.get<any>(`${environment.api}/users/`+`${this.login.login}`).toPromise();
        window.localStorage.setItem('usuario',JSON.stringify(this.usuario));
        this.router.navigate(['perfil']);
      }
      else {
        alert('Wrong password and/or user account');
        this.router.navigate(['']);
      }
    }catch(error){
      console.error("erro");
    }
  }

  goToCreateAcc(){
    this.router.navigate(['/create-account']);
  }

  ngOnInit(): void {
  }

}
