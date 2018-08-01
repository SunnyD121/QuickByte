import { Component, OnInit, Input } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-media-post',
  templateUrl: './media-post.component.html',
  styleUrls: ['./media-post.component.css']
})
export class MediaPostComponent implements OnInit {
    @Input() postPic: string;
    @Input() postComments: string;
    @Input() postRecipe: string;

    //TODO: initialize with values from the database
    likeCounter = 0;
    dislikeCounter = 0;

    img1Path: string;

  constructor(private cookieService: CookieService) {
      //TODO: Delete, these pictures are for testing only
      this.img1Path = 'assets/images/img_avatar1.png';
      // this.testImage = 'assets/images/testImage.png';
      // this.postPic = 'assets/images/main_pic.jpg';

  }

  public favoriteClicked(){
      alert("TODO: favoriteClicked() not implemented yet.");
      console.log("Value: "+this.cookieService.get("LoggedIn"));
  }
  public likeClicked(){
      this.likeCounter++;
  }
  public dislikeClicked(){
      this.dislikeCounter++;
  }
  public shareClicked(){
      //TODO: get url of the picture itself and show that in an alert for copying.
      alert("TODO: shareClicked() not implemented yet.");
  }

  ngOnInit() {
  }

}
