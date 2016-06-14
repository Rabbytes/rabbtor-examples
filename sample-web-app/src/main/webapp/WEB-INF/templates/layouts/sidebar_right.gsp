<%@ page contentType="text/html;charset=UTF-8" %>
<div class="col-sm-4 col-xs-12">
    <g:pageProperty name="page.main"  />
</div>
<g:ifPageProperty name="page.side">
    <div class="col-sm-4 col-xs-12">
    <g:pageProperty name="page.side"  />
    </div>
</g:ifPageProperty>
