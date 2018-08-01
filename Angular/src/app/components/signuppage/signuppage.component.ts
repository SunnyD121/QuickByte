import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegisterService } from '../../services/register-service/register-service.service';
import { CookieService } from 'ngx-cookie-service';

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
    serverSideCheck: string;
    displayErrorPasswords = "none";
    displayErrorUsername = "none";

    constructor(private router: Router, private registerService: RegisterService, private cookie: CookieService) { }

  ngOnInit() {
  }


  public checkPasswordMatch(){
     this.displayErrorPasswords = (this.password != this.passwordConfirm) ? 'block' : 'none';
     this.authenticationCheck = (this.password == this.passwordConfirm) ? true : false;
  }

  public checkIfUsernameTaken(){
      alert("TODO: checkIfUsernameTaken(): NOT IMPLEMENTED YET.");
      this.uniquenessCheck = false;
      this.displayErrorUsername = (this.uniquenessCheck) ? 'none' : 'block';

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

  public authenticateAndSubmit(){
      this.authenticate();
      if (this.authenticationCheck && this.uniquenessCheck && this.validCardCheck){
          this.registerUser();
      }
      else{}
  }

  private registerUser(){
      this.toggleError(false);
      this.registerService.registerUser(this.username, this.password, this.cardNum).subscribe(
          returnValue => {
              //whaterver gets returned.
              this.serverSideCheck = returnValue;
              if (this.serverSideCheck == 'true') {
                  cookie.set("LoggedIn", 'true');
                  this.router.navigate(['/homepage']);
              }
              else {
                  //One of the fields was invalid
              }
          },
          error => {console.log(error)}
      );
  }

}
