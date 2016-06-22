<%@ page contentType="text/html;charset=UTF-8"  %>
<html xmlns:g="http://rabbytes.com/tags/gsp">
    <head>
        <title>Home</title>
        <meta name="layout" content="main"/>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    </head>

    <body>
        <div class="jumbotron">
            <h1>Hello, world!</h1>

            <p>
                This is your first Rabbtor application. Rabbtor is a collection of utilities which extend Spring MVC applications
                with easy to use and time-saving features.
            </p>

            <p><a class="btn btn-primary btn-lg" href="https://rabbytes.atlassian.net/wiki/display/rabbtordoc/"
                  target="_blank" role="button">Learn more</a></p>
        </div>




        <div>
            This application uses Groovy Server Pages templates with Rabbtor's addional features.One of these is the <strong>Data bound form fields.</strong>
            Click the button below to see a form which uses Rabbtor form tags.
            <p>
                This button uses <code><%='$'%>{g.mvcUrl(mapping: 'account#register')}</code> to generate its url.</p>

            <p>
                <a class="btn btn-info" href="${g.mvcUrl(mapping: 'account#register')}">Launch Form</a>
            </p>
        </div>


    </body>
</html>

