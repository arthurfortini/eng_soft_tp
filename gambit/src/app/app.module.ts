import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AccountComponent } from './tela/account/account.component';
import { LoginComponent } from './tela/login/login.component';
import { AuthenticationComponent } from './layout/authentication/authentication.component';
import { MainScreenComponent } from './layout/main-screen/main-screen.component';
import { PerfilComponent } from './tela/perfil/perfil.component';
import { FormsModule } from '@angular/forms'
import { HttpClientModule } from '@angular/common/http';
import { httpInterceptorProviders} from './http-interceptors';
import { PesquisaComponent } from './tela/pesquisa/pesquisa.component';
import { PerfilPesquisadoComponent } from './tela/perfil-pesquisado/perfil-pesquisado.component';

@NgModule({
  declarations: [
    AppComponent,
    AccountComponent,
    LoginComponent,
    AuthenticationComponent,
    MainScreenComponent,
    PerfilComponent,
    PesquisaComponent,
    PerfilPesquisadoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ httpInterceptorProviders ],
  bootstrap: [AppComponent]
})
export class AppModule { }
