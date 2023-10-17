import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TopThreeEnqComponent } from './top-three-enq.component';

describe('TopThreeEnqComponent', () => {
  let component: TopThreeEnqComponent;
  let fixture: ComponentFixture<TopThreeEnqComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TopThreeEnqComponent]
    });
    fixture = TestBed.createComponent(TopThreeEnqComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
