import { Component } from '@angular/core';
import { Fakepost } from '../fakepost';
import { TestService } from '../service/test.service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  title = 'ng-provide';
  posts: Fakepost[]=[];

  constructor(private test_Service: TestService) {  }

  ngOnInit() {
    this.test_Service.getAllPost().subscribe({
      next: (posts) => {
        this.posts = posts;
        console.log(posts);
      }
    })
  }
}
