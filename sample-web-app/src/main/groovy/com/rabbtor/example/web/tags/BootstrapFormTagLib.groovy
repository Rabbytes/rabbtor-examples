package com.rabbtor.example.web.tags

import com.rabbtor.gsp.taglib.TagLibraryExt
import grails.gsp.TagLib

@TagLib
class BootstrapFormTagLib implements TagLibraryExt
{
    static namespace = 'bs'

    Closure formGroup = { Map attrs, Closure body ->
        out << '<div class="form-group">'
        out << body()
        out << "</div>"
    }

    Closure propertyFormGroup = { Map attrs ->
        if (!attrs.path)
            throwTagError("[path] attribute is required for <bs:propertyFormGroup>")

        def inputAttrs = attrs.clone() as Map
        inputAttrs['class'] = 'form-control'

        def formGroupBody = {
            out << g.label(attrs.clone())
            out << ( inputAttrs.type == 'textarea' ? g.textarea(inputAttrs) : g.input(inputAttrs) )

            def eachErrorBody = {
                out << g.message(message: it)
                // return null from the inline body closures
                null
            }

            out << g.eachError(attrs.clone(), eachErrorBody)

            // return null from the inline body closures
            null
        }

        out << formGroup(attrs, formGroupBody)
    }
}
