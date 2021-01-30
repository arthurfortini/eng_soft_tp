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

  account = {
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

  constructor( private http: HttpClient, private accountService: AccountService) { }

  async onSubmit(){
    try {

      const result = await this.accountService.createAccount(this.account);
      alert("Your account has been created!");
      location.href = '/login';

    } catch(error){
      console.error(error);
    }
  }

  ngOnInit(): void {
  }

}
