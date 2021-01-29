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

@NgModule({
  declarations: [
    AppComponent,
    AccountComponent,
    LoginComponent,
    AuthenticationComponent,
    MainScreenComponent,
    PerfilComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
