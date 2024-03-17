<!DOCTYPE html>
<html>
    <head>
        <title>Zad5</title>
        <style>
            form {
                text-align: center;
            }
            input[type="email"],
            input[type="password"],
            input[type="submit"],
            input[type="reset"] {
                padding: 10px;
                margin: 5px;
                font-size: 18px;
            }
            div {
                text-align: center;
            }
        </style>
    </head>
    <body>
        <form method="post">
            <hr>
            <h2>Log in</h2>
            <input type="email" name="email" placeholder="Email" required>
            <br>
            <input type="password" name="password" placeholder="Password" required>
            <br>
            <input type="submit" name="submit" value="Log in">
            <input type="reset" value="Clear">
        </form>
        <hr>

        <?php
            if(isset($_POST['submit'])) {
                $email = $_POST['email'];
                $password = $_POST['password'];
            
                echo "
                    <div>
                        <h2>PERSONAL INFO</h2>
                        <p>Email - $email</p>
                        <p>Password - $password</p>
                    </div>
                ";
            }
        ?>
    </body>
</html>