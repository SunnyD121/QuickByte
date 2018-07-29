import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-media-post',
  templateUrl: './media-post.component.html',
  styleUrls: ['./media-post.component.css']
})
export class MediaPostComponent implements OnInit {
    @Input() postPic: string;
    @Input() postComments: string;
    @Input() postRecipe: string;
  constructor() {
      //TODO: Delete, these pictures are for testing only
      this.img1Path = 'assets/images/img_avatar1.png';
      // this.testImage = 'assets/images/testImage.png';
      // this.postPic = 'assets/images/main_pic.jpg';

  }

  ngOnInit() {
  }

}
