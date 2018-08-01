import { Component, OnInit, Input } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-expandable-pane',
  templateUrl: './expandable-pane.component.html',
  styleUrls: ['./expandable-pane.component.css']
})
export class ExpandablePaneComponent implements OnInit {
    @Input() width: string;
    @Input() min_height: string;

    expanded = false;
    overflow = "hidden";
    height: string;

    clickTitle = "Click to Expand";

    public customClick(){
        if (this.cookie.get("LoggedIn") == 'true'){
            if (this.expanded = !this.expanded){
                this.overflow = "visible";
                this.height = "auto";
                this.clickTitle = "Less";
            }
            else{
                this.overflow = "hidden";
                this.height = (this.min_height) ? this.min_height : "64px";
                this.clickTitle = "Click to Expand";
            }
        }
        else {
            this.clickTitle = "Locked: Content Only Available to Premium Members";
        }
    }

  constructor(private cookie: CookieService) {
      if (this.cookie.get("LoggedIn") != 'true') this.clickTitle = "Locked: Content Only Available to Premium Members";
  }

  ngOnInit() {
      this.height = (this.min_height) ? this.min_height : "64px";
  }

}
