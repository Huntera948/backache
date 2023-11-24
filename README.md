## Database

- The script 'resets' the database state in 3 steps:
    - Drops the database and recreates it.
    - Inserts a demo customer and cart, and all other data.
    - Creates a user `ecommerceapp` and grants permissions as needed.
- **Always run it after testing to ensure a clean slate.**
- **Don't open the file directly.** Instead, follow these steps:
    - Open MySQL Workbench
    - Click on the 'Local instance MySQL80` connection.
    - Go to File > Open SQL Script
    - The script is located at `C:\LabFiles\create_and_populate_db.sql`
    - Click the lightning bolt to execute the script.

## Frontend

- To start the frontend, open PowerShell and run this command in a seperate powershell window, with the backend already running: <br>
cd 'C:\LabFiles\D288 Front End\'; ng serve

- Leave the powershell window open. You'll know it's running when you see `√ Compiled successfully.` in the output.

- You can also use the debug feature of VS Code by opening the project folder: (C:\LabFiles\D288 Front End) and selecting the ng serve configuration.

- Open [http://localhost:4200/](http://localhost:4200/)

- If you need to stop the frontend, press `CTRL + C` repeatedly in the PowerShell window.

## Application Properties

The application.properties file contains connection strings for your Spring application to connect to the database. 
Please add it to your spring project.