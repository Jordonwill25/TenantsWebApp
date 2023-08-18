import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginPageComponent } from './login/login-page/login-page.component';
import { RegisterComponent } from './login/register/register.component';
import { AppComponent } from './app.component';
import { IndexComponent } from './index/index.component';
import { CommentComponent } from './comment/comment.component';
import { PaymentComponent } from './payment/payment.component';

const routes: Routes = [
  {path:'', component: IndexComponent},
  {path:'login', component: LoginPageComponent},
  {path:'register', component: RegisterComponent},
  {path:'comment', component: CommentComponent},
  {path:'payment', component: PaymentComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
