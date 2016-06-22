<%@ page contentType="text/html;charset=UTF-8" %>
<g:applyLayout name="main">
    <html xmlns:g="http://rabbytes.com/tags/gsp">
        <head>
            <title><g:layoutTitle/></title>
            <g:layoutHead/>
        </head>

        <body>
            <div class="row">
                <div class="col-sm-4 col-xs-12">
                    <div g:layoutBody>Page content here</div>
                </div>
                <g:ifPageProperty name="page.side">
                    <div class="col-sm-4 col-xs-12">
                        <g:pageProperty name="page.side"/>
                    </div>
                </g:ifPageProperty>
            </div>
        </body>
    </html>

    <content tag="footScripts">
        <g:if test="${g.pageProperty(name: 'page.footScripts')}">
            <g:pageProperty name="page.footScripts" />
        </g:if>
    </content>
</g:applyLayout>


