package com.ecommerce.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.ecommerce.entity.Product;
import com.ecommerce.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		HttpMethod[] theUnsupportedAction = {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
		
		//disable Http method for product put,post,delete;
		config.getExposureConfiguration()
		       .forDomainType(Product.class)
		       .withItemExposure((Metdata,httpMethods)-> httpMethods.disable(theUnsupportedAction))
		       .withCollectionExposure((Metdata,httpMethods)-> httpMethods.disable(theUnsupportedAction));
		
		//disable Http method for productCategory put,post,delete;
				config.getExposureConfiguration()
				       .forDomainType(ProductCategory.class)
				       .withItemExposure((Metdata,httpMethods)-> httpMethods.disable(theUnsupportedAction))
				       .withCollectionExposure((Metdata,httpMethods)-> httpMethods.disable(theUnsupportedAction));
	} 
    
	
	
}
