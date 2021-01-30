import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-pesquisa',
  templateUrl: './pesquisa.component.html',
  styleUrls: ['./pesquisa.component.css']
})

export class PesquisaComponent implements OnInit {

  constructor( private http: HttpClient ) { }

  gameToSearch: string = '';
  users: any = '';

  async searchGames(){
    let games = await this.http.get<any>(`${environment.api}/games/`+`${this.gameToSearch}`).toPromise();
    this.users = games.owners;
  }

  ngOnInit(): void {
  }

}
