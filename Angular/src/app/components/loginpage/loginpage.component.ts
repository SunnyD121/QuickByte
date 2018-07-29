import { Component, OnInit} from '@angular/core';
import { Router, NavigationEnd } from '@angular/router';

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

  constructor(private router: Router) {
      this.navigationSubscription = this.router.events.subscribe((e: any) => {
         // If it is a NavigationEnd event re-initalise the component
         if (e instanceof NavigationEnd) {
           this.initializeValues();
         }
       });
  }

  initializeValues() {}

  ngOnDestroy() {
      //For avoiding memory leaks
    if (this.navigationSubscription) {
       this.navigationSubscription.unsubscribe();
    }
  }

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
