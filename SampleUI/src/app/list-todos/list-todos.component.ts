import { Component, OnInit } from '@angular/core';
import { MAR } from '@angular/material';

@Component({
  selector: 'app-list-todos',
  templateUrl: './list-todos.component.html',
  styleUrls: ['./list-todos.component.css']
})
export class ListTodosComponent implements OnInit {

  todos = [
    {id: 1, description: "Spring Boot", complete: "no", date: new Date()},
    {id: 2, description: "java", complete: "yes", date: new Date()},
    {id: 3, description: "Angular", complete: "no", date: new Date()},
    {id: 4, description: "Data Structures", complete: "no", date: new Date()},
    {id: 5, description: "Hibernate", complete: "no", date: new Date()},
    {id: 6, description: "Rest API", complete: "no", date: new Date()}
  ];

  constructor() { }

  ngOnInit() {
  }

}
