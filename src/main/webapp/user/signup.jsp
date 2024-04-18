<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Signup Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">
        <script src="https://cdn.tailwindcss.com"></script>
    </head>

    <body class="bg-gray-200 h-screen flex justify-center items-center ">
        <div class="w-96 border-4 border-black relative bg-white shadow-md rounded-lg flex items-center justify-center"
            style="height: 600px;">
            <div 
                class="flex justify-center items-center flex-col text-lg bg-slate-500 text-white w-80 shadow-lg rounded-lg p-8 ">
                <div class="text-black bg-white w-16 h-16 flex justify-center items-center rounded-full">
                    <i class="fa-solid fa-user text-4xl"></i>
                </div>
                <h1 class="text-2xl mt-2 mb-4 font-semibold">SignUp Here</h1>
                <form action="" class="w-full max-w-md">
                    <label for="name" class="my-2 w-full" >Enter your name</label><br>
                    <input type="text" id="name" name="name" class="my-2 outline-none w-full px-2"><br>
                    <label for="gmail" class="my-2 w-full">Enter your email</label><br>
                    <input type="email" id="gmail" name="gmail" class="my-2 outline-none w-full px-2"><br>
                    <label for="password" class="my-2 w-full">Enter your password</label><br>
                    <input type="password" id="password" name="password" class="my-2 outline-none w-full px-2"><br>
                    <button type="submit"
                        class="bg-blue-500 w-full my-2 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">Submit</button>
                    <p class="text-sm text-center">Already have an account <a href="loginpage"
                            class="text-blue-500">Login</a></p>
                </form>
            </div>

            <div class="flex justify-around p-4 text-lg bg-gray-200 absolute w-full bottom-0 left-0">
                <i class="fa-regular fa-square"></i>
                <i class="fa-regular fa-circle"></i>
                <i class="fa-solid fa-caret-right"></i>
            </div>
        </div>
    </body>

    </html>