import { Component, Input, OnInit } from '@angular/core';
import { User } from 'src/User';
import { Router } from '@angular/router';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})

export class PerfilComponent implements OnInit {

  usuarioAtual:User = JSON.parse(window.localStorage.getItem("usuario") || "{}");

  constructor( private router: Router) { }

  ngOnInit(): void {
  }

  goToSearchPage(){
    this.router.navigate(['/pesquisa']);
  }

}
