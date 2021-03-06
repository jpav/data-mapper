/*
 * Copyright 2014 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.mapper.forge;

import static org.jboss.mapper.forge.MapperContext.JAVA_TYPE;
import static org.jboss.mapper.forge.MapperContext.XML_TYPE;
import static org.jboss.mapper.forge.MapperContext.JSON_TYPE;

import java.io.File;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.camel.model.DataFormatDefinition;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.model.dataformat.DataFormatsDefinition;
import org.apache.camel.model.dataformat.JsonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.jboss.forge.addon.projects.Project;
import org.jboss.forge.addon.ui.context.UIBuilder;
import org.jboss.forge.addon.ui.context.UIContext;
import org.jboss.forge.addon.ui.context.UIExecutionContext;
import org.jboss.forge.addon.ui.context.UINavigationContext;
import org.jboss.forge.addon.ui.context.UIValidationContext;
import org.jboss.forge.addon.ui.input.UIInput;
import org.jboss.forge.addon.ui.input.UISelectOne;
import org.jboss.forge.addon.ui.metadata.UICommandMetadata;
import org.jboss.forge.addon.ui.metadata.WithAttributes;
import org.jboss.forge.addon.ui.result.NavigationResult;
import org.jboss.forge.addon.ui.result.Result;
import org.jboss.forge.addon.ui.result.Results;
import org.jboss.forge.addon.ui.result.navigation.NavigationResultBuilder;
import org.jboss.forge.addon.ui.wizard.UIWizard;
import org.jboss.forge.addon.ui.wizard.UIWizardStep;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class NewTransformationWizard extends AbstractMapperCommand implements UIWizard {
	
	public static final String NAME = "new-transformation";
	public static final String DESCRIPTION = "Create a new data transformation";
	
	private static List<String> TYPES = Arrays.asList(
			new String[] {XML_TYPE, JAVA_TYPE, JSON_TYPE});
	
	@Inject
	@WithAttributes(label = "Source Type", 
		required = true, 
		description = "Data type of transformation input.")
	UISelectOne<String> sourceType;
	
	@Inject
	@WithAttributes(label = "Target Type", 
		required = true, 
		description = "Data type of transformation output.")
	UISelectOne<String> targetType;
	
	@Inject
	@WithAttributes(label = "Name", 
		required = true, 
		description = "Unique name for the transformation.")
	UIInput<String> name;
	

	@Override
	public void initializeUI(UIBuilder builder) throws Exception {
		sourceType.setValueChoices(TYPES);
		targetType.setValueChoices(TYPES);
		builder.add(name).add(sourceType).add(targetType);
	}

	@Override
	public Result execute(UIExecutionContext context) throws Exception {
		Project project = getSelectedProject(context);
		MapperContext mapCtx = getMapperContext(project);
		mapCtx.setSourceType(sourceType.getValue());
		mapCtx.setTargetType(targetType.getValue());
		mapCtx.setTransformId(name.getValue());
		return Results.success();
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

	@Override
	public NavigationResult next(UINavigationContext context) throws Exception {
		NavigationResultBuilder nrb = Results.navigationBuilder();
		nrb.add(CreateMappingCommand.class);
		nrb.add(ConfigureCamelStep.class);
		
		return nrb.build();
	}
}

