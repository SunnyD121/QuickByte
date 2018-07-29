import { Component, OnInit } from '@angular/core';
import { Router, NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-errorpage404',
  templateUrl: './errorpage404.component.html',
  styleUrls: ['./errorpage404.component.css']
})
export class ErrorPage404Component implements OnInit {

  ngOnInit() {
  }

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

}
