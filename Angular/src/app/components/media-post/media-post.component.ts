import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-media-post',
  templateUrl: './media-post.component.html',
  styleUrls: ['./media-post.component.css']
})
export class MediaPostComponent implements OnInit {
    img1Path: string;
    postPic: string;
    testImage: string;
    recipe1: string;
  constructor() {
      this.img1Path = 'assets/images/img_avatar1.png';
      this.testImage = 'assets/images/testImage.png';
      this.postPic = 'assets/images/main_pic.jpg';

      this.recipe1 = "Voilà! In view, a humble vaudevillian veteran, cast vicariously as both victim and villian"
      +" by the vicissitudes of Fate. This visage, no mere veneer of vanity, is a vestige of the"
      +" vox populi, now vacant, vanished. However, this valorous visitation of a by-gone vexation,"
      +" stands vivified and has vowed to vanquish these venal and virulent vermin vanguarding vice"
      +" and vouchsafing the violently vicious and voracious violation of volition. (he carves a \"V\""
      +" into a sign) The only verdict is vengence; a vendetta, held as a votive, not in vain, for"
      +" the value and veracity of such shall one day vindicate the vigilant and the virtuous."
      +" (giggles) Verily, this vichyssoise of verbiage veers most verbose, so let me simply add"
      +" that it is my very good honor to meet you and you may call me V.\n     -V for Vendetta";

  }

  ngOnInit() {
  }

}
