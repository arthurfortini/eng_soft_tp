import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AccountService } from 'src/app/shared/account.service';
import { User } from 'src/User';

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

  constructor( private accountService: AccountService, private router: Router) { }

  async onSubmit(){

    try {
      const enter = await this.accountService.toLogin(this.login);

      if(enter){
        console.log(`Login efetuado`);
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
