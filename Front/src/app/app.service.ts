import { Injectable } from "@angular/core";
import { URL_API } from './app.url'
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from "rxjs";
import { map, catchError } from "rxjs/operators";
import { ErrorHandler } from './app.error'
import { Jogador } from './app.model';
import { RequestOptions } from '@angular/http';

@Injectable()
export class AppService {

    constructor(private http: HttpClient){}

    ranking(): Observable<Jogador[]>{
        return this.http.get<Jogador[]>(`${URL_API}/visualizarRanking`)
        .pipe(catchError(ErrorHandler.handleError))
    }
    
    jogadorPorId(id:string): Observable<Jogador>{
        return this.http.get<Jogador>(`${URL_API}/${id}`)
        .pipe(catchError(ErrorHandler.handleError))
    }

    salvaJogador(obj: Jogador): Observable<any>{
        const httpOptions = {
            headers: new HttpHeaders({
            'Content-Type':  'application/json',
            'Access-Control-Allow-Headers': 'Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers'
           })
        };
        return this.http.post(`${URL_API}/adicionar`, JSON.stringify(obj), httpOptions)
    }

    atualizaJogador(obj: Jogador): Observable<any>{
        const httpOptions = {
            headers: new HttpHeaders({
            'Content-Type':  'application/json',
            'Access-Control-Allow-Headers': 'Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers'
           })
        };
        return this.http.put(`${URL_API}/atualiza`, JSON.stringify(obj), httpOptions)
    }
}
