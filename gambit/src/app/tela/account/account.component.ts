import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { AccountService } from 'src/app/shared/account.service';

import { User } from 'src/User';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  account: User = {
    login: '',
    password: '',
    full_name: '',
    age: 0,
    created_at: '',
    city_code: '',
    avaible_in: '',
    cellphone: '',
    home_phone:'',
    insta: '',
    face: '',
    twitter: ''
  }

  constructor( private http: HttpClient, private accountService: AccountService) { }

  async onSubmit(){
    try {
      const result = await this.accountService.createAccount(this.account);

      window.alert("YOur account has been created!");
      console.log(result);
    } catch(error){
      console.error(error);
    }
  }

  ngOnInit(): void {
  }

}
