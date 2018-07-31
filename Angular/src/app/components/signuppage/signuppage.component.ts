import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signuppage',
  templateUrl: './signuppage.component.html',
  styleUrls: ['./signuppage.component.css']
})
export class SignupPageComponent implements OnInit {
    password = "";
    passwordConfirm = "";
    username = "";
    cardNum: number;
    authenticationCheck: boolean;
    uniquenessCheck: boolean;
    validCardCheck: boolean;

    constructor(private router: Router) { }

  ngOnInit() {
  }

  displayError = {
      display: 'none',
  }


  public checkPasswordMatch(){
     this.displayError.display = (this.password != this.passwordConfirm) ? 'block' : 'none';
     this.authenticationCheck = (this.password == this.passwordConfirm) ? true : false;
  }

  public checkIfUsernameTaken(){
      alert("TODO: checkIfUsernameTaken(): NOT IMPLEMENTED YET.");
      this.uniquenessCheck = true;
  }

  public checkValidCardNumber(){
      if (this.cardNum < 1000000000000 || this.cardNum >= 10000000000000000){ //between 13 and 16 digits
          this.validCardCheck = false;
      }
      else this.validCardCheck = true;
  }


  public authenticate(){
      this.checkPasswordMatch();
      this.checkIfUsernameTaken();
  }

  public submit(){
    //   this.router.navigate(['/homepage']);
  }

  public authenticateAndSubmit(){
      this.authenticate();
      if (this.authenticationCheck && this.uniquenessCheck && this.validCardCheck){
          this.submit();
      }
      else{}
  }

}
