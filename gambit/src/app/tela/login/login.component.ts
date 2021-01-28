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
    name: '',
    password: ''
  }

  constructor( private accountService: AccountService, private router: Router) { }

  async onSubmit(){

    try {
      const enter = await this.accountService.toLogin(this.login);
      console.log(`Login efetuado {$result}`);

      this.router.navigate(['']);
    }catch(error){
      console.error("erro");
    }
  }

  ngOnInit(): void {
  }

}
