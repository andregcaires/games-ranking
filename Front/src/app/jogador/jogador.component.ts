import { Component, OnInit } from '@angular/core';
import { Jogador } from '../app.model';
import { AppService } from '../app.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-jogador',
  templateUrl: './jogador.component.html',
  styleUrls: ['./jogador.component.css']
})
export class JogadorComponent implements OnInit {

  public salvar(obj: Jogador): void{
    console.log(obj)
    if(this.jogador.id === 0){
      this.service.salvaJogador(obj).subscribe( () => this.router.navigate(['/']))
    }
    else{
      this.service.atualizaJogador(obj).subscribe( () => this.router.navigate(['/']))
    }    
  }

  jogador: Jogador = {
    id: 0,
    nome: '',
    qtdVitorias : 0,
    qtdPartidas : 0
  }
  constructor(private service: AppService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    if(this.route.snapshot.params['id'] !== "0"){
      this.service.jogadorPorId(this.route.snapshot.params['id'])
      .subscribe(jogador => this.jogador = jogador)
    }
  }
}
