import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { HttpHeaders } from '@angular/common/http';
import { UserService } from '../../services/user-service/user-service.service';
import { User } from '../../objects/User';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginPageComponent implements OnInit {

    username = "";
    password = "";
    credentialCheck = false;
    displayError = "none";
    cookieValue: string;
    loadingText = "";
    errorMessage = ""

  constructor( private router: Router, private userService: UserService, private cookie: CookieService) { }

  ngOnInit() {
  }


  public validateCredentials(){
      this.loadingText = "Submitting, Please wait..."
      this.toggleError(false);
      this.userService.checkCredentials(this.username, this.password).subscribe(
          loginBoolean => {
              this.credentialCheck = loginBoolean;
              if (loginBoolean =="success"){
                  this.cookie.set('LoggedIn', 'true');
                  this.cookie.set('Username', this.username);
                  this.loadingText = "";
                  this.router.navigate(['/homepage']);
              }
              else if(loginBoolean == "invalid") {
                  console.log("Invalid Credentials.");
                  this.errorMessage = "Username or Password is incorrect";
                  this.toggleError(true);
                  this.loadingText = "";
              }
              else if (loginBoolean == "banned"){
                  this.errorMessage = "You have been Banned.";
                  this.toggleError(true);
                  this.loadingText = "";
              }
              else console.log("WARNING! Unsupported return value");
          },
          error =>{console.log(error)}
      );
  }

  public toggleError(display){
      this.displayError =  (display) ? "block" : "none";
  }

}
