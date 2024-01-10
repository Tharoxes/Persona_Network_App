import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent implements OnInit{
  username: string='';
  password: string='';
  isUsernameValid: boolean = true;

  constructor() {}

  ngOnInit(): void {
    
  }

  // validateUsername(): void{
  //   const pattern = RegExp(/^[\w-.]
  // }

  onKey(event: any, type: string){
    if (type === 'username'){
      this.username = event.target.value;
    } else if (type === 'password') {
      this.password = event.target.value;
    }
  }
}
