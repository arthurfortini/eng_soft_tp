import { Component, OnInit } from '@angular/core';

import { User } from 'src/User'

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  create_account: User = {
    login: '',
    password: '',
    full_name: '',
    age: 0,
    created_at: '',
    city_code: '',
    avaible_in: ''
  }

  constructor() { }

  ngOnInit(): void {
  }

}
