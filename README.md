# rabbtor-examples

Contains a sample Spring Boot MVC web application enhanced with Rabbtor features. 
Check out the sources and from a command prompt or terminal, run it with gradle:

`gradlew bootRun`

or 

`./gradlew bootRun`

Please note that, example classes are implemented in Groovy, but their Java versions will be similar ( though tiresome )

# Includes samples for 

-  GSP layout template  **/WEB-INF/templates/layouts/main.gsp** for global layout which shows an example of rendering a header
template
-  home page template  **/WEB-INF/templates/home/index.gsp**
- **HomeController** which renders the index.gsp
- **AccountController** which renders and processes a sample model object RegisterCommand
-  tag library  implementation **BootstrapFormTagLib.groovy** to render Bootstrap form elements. It shows examples for reusing
existing tags
- register page which displays how Sitemesh layouts can be applied to specific page parts
- registration form which uses Rabbtor form tags, metadata aware labels and custom bootstrap tags. It also shows how Rabbtor
AJAX features are used and how you include a template within the form for AJAX scenarios
-  messages.properties file which explains label localization ( please see comments in the file )
- **<g:message>** examples for accessing localized messages
- **@defaultCodec** directive in _register_form.gsp to prevent HTML escaping of expressions
- **application.yml** file for auto configuring GSP in Spring boot applications

Please consult the [Rabbtor Documentation](https://rabbytes.atlassian.net/wiki/display/rabbtordoc) for more information or features not displayed here and 
please be aware that some features in these samples may not have been documented yet.


