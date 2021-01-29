import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})


export class AuthguardGuard implements CanActivate {

  constructor(private router: Router) {}

  canActivate( route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
      const key = window.localStorage.getItem('token');
      if (key) { //Aqui sera implemntada a logica de acesso a partir do login
        return true;
      }
      else {
        this.router.navigate(['login']);
      }

    return true;
  }

}
