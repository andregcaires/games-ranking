import { Routes } from "@angular/router";
import { RankingComponent } from './ranking/ranking.component';
import { JogadorComponent } from './jogador/jogador.component';


export const ROUTES: Routes = [
    {path: '', component: RankingComponent},
    {path: 'jogador/:id', component: JogadorComponent}
]