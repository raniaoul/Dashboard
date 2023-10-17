import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AidePageComponent } from './aide-page.component';

describe('AidePageComponent', () => {
  let component: AidePageComponent;
  let fixture: ComponentFixture<AidePageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AidePageComponent]
    });
    fixture = TestBed.createComponent(AidePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
