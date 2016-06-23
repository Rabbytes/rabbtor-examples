package com.rabbtor.example.web.controllers

import com.rabbtor.model.ModelMetadataAccessorFactory
import com.rabbtor.validation.MetadataAwareBindingErrorProcessor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.InitBinder


@ControllerAdvice
class GlobalInitBinder
{
    @Autowired
    ModelMetadataAccessorFactory modelMetadataAccessorFactory

    @InitBinder
    public void binder(WebDataBinder binder) {
        binder.setBindingErrorProcessor( new MetadataAwareBindingErrorProcessor(modelMetadataAccessorFactory))
    }
}
