import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router'

@Component({
  selector: 'app-perfil-pesquisado',
  templateUrl: './perfil-pesquisado.component.html',
  styleUrls: ['./perfil-pesquisado.component.css']
})
export class PerfilPesquisadoComponent implements OnInit {

  usuarioAtual:any = JSON.parse(window.localStorage.getItem("usuarioPesquisado") || "{}");

  constructor( private router: Router) { }

  listaJogos = this.usuarioAtual.user_owned_games;
  listaDesejos = this.usuarioAtual.user_wanted_games;

  ngOnInit(): void {
  }

  goToMainProfile(){
    this.router.navigate(['/perfil']);
  }


}
