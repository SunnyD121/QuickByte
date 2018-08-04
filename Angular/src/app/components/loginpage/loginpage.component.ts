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

  constructor( private router: Router, private userService: UserService, private cookie: CookieService) { }

  ngOnInit() {
  }


  public validateCredentials(){
      this.loadingText = "Submitting, Please wait..."
      this.toggleError(false);
      this.userService.checkCredentials(this.username, this.password).subscribe(
          loginBoolean => {
              this.credentialCheck = loginBoolean;
              if (loginBoolean){
                  this.cookie.set('LoggedIn', 'true');
                  this.cookie.set('Username', this.username);
                  this.loadingText = "";
                  this.router.navigate(['/homepage']);
              }
              else {
                  console.log("Invalid Credentials.");
                  this.toggleError(true);
                  this.loadingText = "";
              }
          },
          error =>{console.log(error)}
      );
  }

  public toggleError(display){
      this.displayError =  (display) ? "block" : "none";
  }

}
