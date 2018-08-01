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
    displayErrorCardNum = "none";
    displayGeneralError = "none";

    constructor(private router: Router, private registerService: RegisterService, private cookie: CookieService) { }

  ngOnInit() {
  }


  public checkPasswordMatch(){
     this.displayErrorPasswords = (this.password != this.passwordConfirm) ? 'block' : 'none';
     this.authenticationCheck = (this.password == this.passwordConfirm) ? true : false;
  }

  public checkIfUsernameTaken(){
      this.registerService.checkUniqueUsername(this.username).subscribe(
          returnValue => {
              this.uniquenessCheck = returnValue;
              this.displayErrorUsername = (this.uniquenessCheck) ? 'none' : 'block';
          }, error => {console.log(error);}
      );

  }

  public checkValidCardNumber(){
      if (!this.cardNum) this.validCardCheck = false;
      this.registerService.checkValidCardNumber(this.creditCardNum).subscribe(
          returnValue => {
              this.validCardCheck = returnValue;
              this.displayErrorCardNum = (this.validCardCheck) ? 'none' : 'block';
          }, error => {console.log(error)}
      );
      if (this.cardNum < 1000000000000 || this.cardNum >= 10000000000000000){ //between 13 and 16 digits
          this.validCardCheck = false;
      }
      else this.validCardCheck = true;
      this.displayErrorCardNum = this.validCardCheck ? "none" : "block";
  }


  public authenticate(){
      this.checkPasswordMatch();
      this.checkIfUsernameTaken();
      this.checkValidCardNumber();
  }

  public authenticateAndSubmit(){
      this.authenticate();
      if (this.authenticationCheck && this.uniquenessCheck && this.validCardCheck){
          this.registerUser();
      }
      else{console.log("One of the frontend checks failed.")}
  }

  private registerUser(){
      this.toggleError(false);
      this.registerService.registerUser(this.username, this.password, this.cardNum).subscribe(
          returnValue => {
              //whaterver gets returned.
              this.serverSideCheck = returnValue;
              console.log("Return Value: " + returnValue);
              if (this.serverSideCheck) {
                  this.cookie.set("LoggedIn", 'true');
                  this.router.navigate(['/homepage']);
              }
              else {
                  //One of the fields was invalid
                  console.log("An expected error occurred during registration.");
                  console.log(returnValue);
                  this.toggleError(true);
              }
          },
          error => {
              console.log("error:");
              console.log(error)}
      );
  }

  public toggleError(display){
      this.displayGeneralError =  (display) ? "block" : "none";
  }

}
