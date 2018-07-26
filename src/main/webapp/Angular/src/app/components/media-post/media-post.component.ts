import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-media-post',
  templateUrl: './media-post.component.html',
  styleUrls: ['./media-post.component.css']
})
export class MediaPostComponent implements OnInit {
    img1Path: string;
    postPic: string;
  constructor() {
      this.img1Path = 'assets/images/img_avatar1.png';
      this.postPic = 'assets/images/main_pic.jpg';

  }

  ngOnInit() {
  }

}
