/*package com.ankush.annotation;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

@SupportedAnnotationTypes("com.ankush.annotation.NullValueValidate")
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class NullValueValidateAnnotationProcessor2 extends AbstractProcessor{
	
	public NullValueValidateAnnotationProcessor2(){
		super();
	}

	@Override
	public boolean process(Set<? extends TypeElement> annotations,
			RoundEnvironment roundEnv) {
		for (Element elem : roundEnv.getElementsAnnotatedWith(NullValueValidate.class)) {
			NullValueValidate nullValueValidate = elem.getAnnotation(NullValueValidate.class);
			if(nullValueValidate.paramName() == null) {
                throw new NullPointerException("The value of the field "+elem.getSimpleName()+" can't be NULL.");
            } else
                System.out.println("Value of the Object : "+elem.getSimpleName());
	        String message = "annotation found in " + elem.getSimpleName()
	                       + " with complexity " + nullValueValidate.paramName();
	        System.out.println(message);
	    }

		return true;
	}

}
*/