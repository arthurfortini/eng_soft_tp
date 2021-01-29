import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { AccountService } from './account.service';

@Injectable({
  providedIn: 'root'
})


export class AuthguardGuard implements CanActivate {

  constructor( private router: Router,
        private accountService: AccountService
    ) {}

  canActivate( route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {

      if (this.accountService.isUserLoggedIn()) {
      }
      else {
        this.router.navigate(['login']);
      }

    return true;
  }

}
