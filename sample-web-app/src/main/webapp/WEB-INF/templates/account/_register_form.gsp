<g:withModel modelAttribute="cmd" override="${false}">


    <div class="form-group">
        <g:label path="name" />
        <g:input path="name" class="form-control" />
        <g:eachError path="name" >
            <g:message message="${it}" />
        </g:eachError>
    </div>

    <div class="alert alert-info">
        Fields below renders ${'<bs:propertyFormGroup path="..." /> tag which is a custom GSP tag defined in this project\'s BootstrapFormTagLib class.'}
    </div>


    <bs:propertyFormGroup path="dateOfBirth" type="text"/>

    <bs:propertyFormGroup path="weight" type="text"/>

    <bs:propertyFormGroup path="height" type="text"/>

    <bs:propertyFormGroup path="code" type="text"/>

    <g:applyLayout name="panel" params="[showHead:true]" >
        <html>
            <head>
                <div class="panel-title pull-left">Addresses</div>

                <div class="pull-right"><button type="submit" name="mode" value="addAddress"
                                                class="btn btn-primary">Add Address</button></div>
            </head>
            <body>
                <g:each in="${cmd.addresses}" var="address" status="i">
                    <h4>Address ${i+1}</h4>
                    <bs:propertyFormGroup path="addresses[${i}].streetAddress" type="textarea"/>

                    <bs:propertyFormGroup path="addresses[${i}].zipCode" />
                </g:each>
            </body>
        </html>
    </g:applyLayout>


    <div class="form-group">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</g:withModel>