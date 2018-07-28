import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-expandable-pane',
  templateUrl: './expandable-pane.component.html',
  styleUrls: ['./expandable-pane.component.css']
})
export class ExpandablePaneComponent implements OnInit {
    @Input() contentString: string;

    expanded = false;
    overflow = "hidden";
    height = "64px";
    clickTitle = "Click to Expand";

    public customClick(){
        if (this.expanded = !this.expanded){
            this.overflow = "visible";
            this.height = "auto";
            this.clickTitle = "Less";
        }
        else{
            this.overflow = "hidden";
            this.height = "64px";
            this.clickTitle = "Click to Expand";
        }
    }

  constructor() {}

  ngOnInit() {
  }

}
