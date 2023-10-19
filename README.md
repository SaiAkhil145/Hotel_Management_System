# Hotel Management System
## Language and Framework

![Java](https://img.shields.io/badge/Language-Java-green)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)

## Description

Welcome to the Hotel Management System repository! This open-source project is a Java-based application built using the Spring Boot framework. The Hotel Management System allows users to manage application users through a set of APIs. With these APIs, users can perform various operations such as adding rooms, updating room information (including all properties), deleting rooms, retrieving rooms by their 
room ID, and retrieving a list of all rooms.

## Project Structure

The project is organized into several parts, each serving a specific purpose:

### 1. Configuration

In this section, you'll find the configuration class for the database. Note that in this project, we're using a MySQL database, with user IDs as Primary keys and user.

### 2. Entities

This section contains the `User` class, which represents the core entity of the system. The `User` class includes the following properties:

- `roomId` (Integer): Unique identifier for each room.
- `roomNumber` (String) room number
- `roomType` (Type/enum): room type (AC/NON-AC)
- `roomAvailability` (boolean): room availability.
- `roomPrice` (double) : rooms price

### 3. Repository

In this section, you'll find the interface responsible for interacting with the database (MySQL) and performing CRUD (Create, Read, Update, Delete) operations on user data.

### 4. Services

The Services section includes a set of service classes that the API Controller class uses to handle user management operations. The list of services includes:

- `addURoom`: Adds a new room to the Hotel.
- `getRoom`: Retrieves room information by room ID.
- `getAllRoom`: Retrieves a list of all rooms in the Hotel.
- `updateRoomInfo`: Updates room information, allowing for changes to number, roomType, room status, and room price.
- `deleteRoom`: Deletes a room by their room ID.

### 5. Controller

This section houses the `APIController` class, which provides API endpoints for interacting with the Hotel Management System. Here is a list of available endpoints:

- `POST /room`: Adds a new room. Accepts a room object in the request body.
- `GET /room/{id}/id`: Retrieves room information by room ID.
- `GET /rooms`: Retrieves a list of all rooms.
- `PUT /update/{id}/info`: Updates room information. Accepts room ID and optional parameters for roomNumber, room Type, and room price.
- `DELETE /delete/{id}/id`: Deletes a room by room ID.

note: for further understanding you can use Swagger Ui at http://localhost:8080/swagger-ui/index.html# if your running the app in localHost
## Data Flow
As soon as user hit any API the Controller handel it and Call the respective service, In Services section the buisness logic is applied and if the data base interaction required it hit the repository section. In repository section the data base interation take place

## Database Scema
Room{
roomId*	Integer($int32)
roomNumber*	Integer
roomType*	string
roomAvailability*	boolean
roomPrice*	double

}

## Getting Started

To get started with the Hotel Management System, follow the instructions in the [Installation](#installation) section below.

### Prerequisites

Make sure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Maven
- Spring Boot Dependecy

### Installation

1. Clone this repository to your local machine:

   ```bash
   git clone 
   
2. Navigate to the project directory

    ```bash
    cd
## Usage

To use the User Management app, you can make HTTP requests to the provided API endpoints using your favorite API testing tool or framework.
