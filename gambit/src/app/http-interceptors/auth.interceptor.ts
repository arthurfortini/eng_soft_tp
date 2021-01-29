import { Injectable } from '@angular/core';
import {
  HttpEvent, HttpInterceptor, HttpHandler, HttpRequest, HttpErrorResponse
} from '@angular/common/http';
import { AccountService } from '../shared/account.service';

import { Observable } from 'rxjs';
import { throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';


@Injectable()
export class AuthInterceptor implements HttpInterceptor {

  constructor ( private accountService: AccountService ) {}

  intercept(req: HttpRequest<any>, next: HttpHandler) {

    const token = this.accountService.getAuthorizationToken();
    let request: HttpRequest<any> = req;

    if(token){ //lembrar que token guarda o meu nome de usuario para o get
      // Acredito que aqui eu farei o get para pegar info do usuario aqui
    }

    return next.handle(request)
    .pipe(catchError(this.handleError)
    );
  }

  private handleError(error: HttpErrorResponse){
    if(error.error instanceof ErrorEvent) {
      console.error('Ococrreu um Erro!', error.error.message);
    }
    else {
      console.error(`Codigo do erro ${error.error}, ` +
      `Erro: ${JSON.stringify(error.error)}`);
    }

    return throwError('Ocorreu um Erro! Por favor, tente novamente.');
  }
}
