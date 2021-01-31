import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-pesquisa',
  templateUrl: './pesquisa.component.html',
  styleUrls: ['./pesquisa.component.css']
})

export class PesquisaComponent implements OnInit {

  constructor( private http: HttpClient , private router: Router) { }

  gameToSearch: string = '';
  users: any = '';
  usuarioPesquisado:any = '';


  async searchGames(){
    let games = await this.http.get<any>(`${environment.api}/games/`+`${this.gameToSearch}`).toPromise();
    this.users = games.owners;
  }

  async goToUserPage(user:any){
    this.usuarioPesquisado = await this.http.get<any>(`${environment.api}/users/`+`${user}`).toPromise();
    window.localStorage.setItem('usuarioPesquisado',JSON.stringify(this.usuarioPesquisado));
    this.router.navigate(['/perfilPesquisado']);
  }

  ngOnInit(): void {
  }

}
