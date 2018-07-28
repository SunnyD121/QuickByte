import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExpandablePaneComponent } from './expandable-pane.component';

describe('ExpandablePaneComponent', () => {
  let component: ExpandablePaneComponent;
  let fixture: ComponentFixture<ExpandablePaneComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExpandablePaneComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExpandablePaneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
