import { ComponentFixture, TestBed } from '@angular/core/testing';

import { QuestParStatutComponent } from './quest-par-statut.component';

describe('QuestParStatutComponent', () => {
  let component: QuestParStatutComponent;
  let fixture: ComponentFixture<QuestParStatutComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [QuestParStatutComponent]
    });
    fixture = TestBed.createComponent(QuestParStatutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
