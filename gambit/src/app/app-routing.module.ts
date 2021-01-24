import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountComponent } from './tela/account/account.component';
import { LoginComponent } from './tela/login/login.component';

const routes: Routes = [
  { path: '', component: LoginComponent},
  { path: 'create-account', component: AccountComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
