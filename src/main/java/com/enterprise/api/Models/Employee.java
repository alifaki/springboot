// package com.enterprise.api.Models;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Column;

// @Entity
// @Table(name = "employees")
// public class Employee {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     Integer id;

//     @jakarta.persistence.OneToOne
//     @jakarta.persistence.JoinColumn(name = "user_id", nullable = false)
//     private User user;

//     @Column(name = "full_name", nullable = false)
//     private String fullName;

//     @Column(name = "email", nullable = false)
//     private String email;

//     @Column(name = "position", nullable = false)
//     private String position;
    
//     public Employee(String fullName, String email, String position) {
//         this.fullName = fullName;
//         this.email = email;
//         this.position = position;
//     }

//     public String getFullName() {
//         return fullName;
//     }

//     public void setFullName(String fullName) {
//         this.fullName = fullName;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public String getPosition() {
//         return position;
//     }

//     public void setPosition(String position) {
//         this.position = position;
//     }
// }