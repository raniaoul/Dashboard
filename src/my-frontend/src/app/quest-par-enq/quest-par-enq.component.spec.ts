import { ComponentFixture, TestBed } from '@angular/core/testing';

import { QuestParEnqComponent } from './quest-par-enq.component';

describe('QuestParEnqComponent', () => {
  let component: QuestParEnqComponent;
  let fixture: ComponentFixture<QuestParEnqComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [QuestParEnqComponent]
    });
    fixture = TestBed.createComponent(QuestParEnqComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
