import { Component, Input, OnInit } from '@angular/core';
import { User } from 'src/User';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})

export class PerfilComponent implements OnInit {

  usuarioAtual:User = JSON.parse(window.localStorage.getItem("usuario") || "{}");

  constructor() { }

  ngOnInit(): void {
  }

}
