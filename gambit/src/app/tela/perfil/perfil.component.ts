import { Component, Input, OnInit } from '@angular/core';
import { User } from 'src/User';
import { Router } from '@angular/router';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})

export class PerfilComponent implements OnInit {

  usuarioAtual:any = JSON.parse(window.localStorage.getItem("usuario") || "{}");

  constructor( private router: Router) { }
  listaJogos = this.usuarioAtual.user_owned_games;
  listaDesejos = this.usuarioAtual.user_wanted_games;
  
  ngOnInit(): void {
  }

  goToSearchPage(){
    this.router.navigate(['/pesquisa']);
  }

  

}
