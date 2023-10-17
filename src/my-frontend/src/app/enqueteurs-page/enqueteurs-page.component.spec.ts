import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnqueteursPageComponent } from './enqueteurs-page.component';

describe('EnqueteursPageComponent', () => {
  let component: EnqueteursPageComponent;
  let fixture: ComponentFixture<EnqueteursPageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EnqueteursPageComponent]
    });
    fixture = TestBed.createComponent(EnqueteursPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
