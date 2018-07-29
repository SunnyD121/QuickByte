import { Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginPageComponent implements OnInit {

    username = "";
    password = "";
    usernameCheck = false;
    passwordCheck = false;

  constructor() { }

  ngOnInit() {
  }


  public checkIfValidUsername(){
      alert("TODO: checkIfValidUsername() NOT IMPLEMENTED YET.");
      this.usernameCheck = true;
  }

  public checkIfValidPassword(){
      alert("TODO: checkIfValidPassword() NOT IMPLEMENTED YET.");
      this.passwordCheck = true;
  }
  public validateCredentials(){
      this.checkIfValidUsername();
      this.checkIfValidPassword();

      if (this.usernameCheck && this.passwordCheck){
          this.router.navigate(['/homepage']);
      }
      else {}
  }

}
