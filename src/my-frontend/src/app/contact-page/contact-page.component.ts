import { Component } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
    selector: 'app-contact-page',
    templateUrl: './contact-page.component.html',
    styleUrls: ['./contact-page.component.css']
})
export class ContactPageComponent {
    employeeForm: FormGroup = new FormGroup({});

    constructor(private formBuilder: FormBuilder, private http: HttpClient, private router: Router) { }


    ngOnInit() {
        this.employeeForm = this.formBuilder.group({
            name: ['', Validators.required],
            familyName: ['', Validators.required],
            id: ['', Validators.required],
            number: ['', Validators.required],
            email: ['', [Validators.required, Validators.email]]
        });
    }

    onSubmit() {
        if (this.employeeForm.valid) {
            const employeeData = this.employeeForm.value;
            this.http.post('http://localhost:8080/api/ajouterEmploye', employeeData).subscribe(
                () => {
                    alert('Employee added successfully!');
                    this.employeeForm.reset();
                },
                (error) => {
                    console.error('Error adding employee:', error);
                    alert('Failed to add employee. Please try again.');
                }
            );
            this.goToEmployeList();
        }
    }

    goToEmployeList(){
        this.router.navigate(['/Employes']);
    }
}
