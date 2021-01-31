import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthenticationComponent } from './layout/authentication/authentication.component';
import { MainScreenComponent } from './layout/main-screen/main-screen.component';
import { AuthguardGuard } from './shared/authguard.guard';
import { AccountComponent } from './tela/account/account.component';
import { LoginComponent } from './tela/login/login.component';
import { PerfilPesquisadoComponent } from './tela/perfil-pesquisado/perfil-pesquisado.component';
import { PerfilComponent } from './tela/perfil/perfil.component';
import { PesquisaComponent } from './tela/pesquisa/pesquisa.component';

const routes: Routes = [

  {
    path: '', component: MainScreenComponent,
    children: [
      { path: '', component: PerfilComponent}
    ], canActivate: [AuthguardGuard]
  },

  {
    path: '', component: AuthenticationComponent,
    children: [
      { path: '', redirectTo: 'login', pathMatch:'full' },
      { path: 'login', component: LoginComponent},
      { path: 'create-account', component: AccountComponent},
      { path: 'perfil', component: PerfilComponent},
      { path: 'pesquisa', component: PesquisaComponent},
      { path: 'perfilPesquisado', component: PerfilPesquisadoComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
