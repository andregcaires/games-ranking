import { Component, OnInit } from '@angular/core';
import { Jogador } from '../app.model';
import { AppService } from '../app.service';

@Component({
  selector: 'app-ranking',
  templateUrl: './ranking.component.html',
  styleUrls: ['./ranking.component.css']
})
export class RankingComponent implements OnInit {

  jogadores: Jogador[]
  constructor(private service: AppService) { }

  ngOnInit() {
    this.service.ranking().subscribe(jogadores => this.jogadores = jogadores)
  }

}
