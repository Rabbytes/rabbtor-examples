<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>Register</title>
        <meta name="layout" content="sidebar_right"/>
    </head>

    <body>
        <h1>Sample Registration Form</h1>
        <div class="alert alert-info">
            This form uses Rabbtor GSP form tags such as
            <ul class="list-inline" style="display: inline">
                <g:each in="['form', 'input', 'label']" var="item"><li>
                    ${'<g:' + item + '>'}
                </li></g:each>
            </ul>
            <p>It submits its data via Rabbtor's simple AJAX support. AJAX script is registered with the content tag in this page.</p>
            <p>This page renders the form using ${'<' + 'g:render template="/account/register_form"' + '>'}. This way we can use that same template in our ajax call result.</p>
        </div>

        <g:form id="registerForm" action="${g.mvcUrl(mapping: 'account#registerPost')}" ajax="[target:'#registerForm']" modelAttribute="cmd">
            <g:render template="/account/register_form"/>
        </g:form>

    </body>
</html>

<content tag="footScripts">
    <g:javascript src="~/content/jquery.rabbtor-ajax.js"/>
</content>