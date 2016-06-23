package com.rabbtor.example.web.controllers

import com.rabbtor.example.web.models.AddressCommand
import com.rabbtor.example.web.models.RegisterCommand
import com.rabbtor.model.ModelMetadataAccessorFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.propertyeditors.StringTrimmerEditor
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BeanPropertyBindingResult
import org.springframework.validation.BindingResult
import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.InitBinder
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

import javax.servlet.http.HttpServletRequest
import javax.validation.Valid


@Controller
@RequestMapping(name = "account", path = "/account")
class AccountController
{

    @RequestMapping(name = 'register', path = "/register", method = RequestMethod.GET)
    def register(Model model)
    {
        model['cmd'] = new RegisterCommand()
        return '/account/register'
    }

    @RequestMapping(name = 'registerPost', path = "/register", method = RequestMethod.POST)
    def registerPost(Model model,
                     @ModelAttribute("cmd") @Valid RegisterCommand cmd, BindingResult errors, HttpServletRequest request)
    {
        if (cmd.mode == 'addAddress')
        {
            cmd.addresses << new AddressCommand()

            // clear any validation errors
            model[BindingResult.MODEL_KEY_PREFIX + 'cmd'] = new BeanPropertyBindingResult(errors.target, errors.objectName)
        }

        return '/account/_register_form'
    }

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }


}
