package fr.obeo.dsl.arduino.arduinomt;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface NamedElement extends EObject {
  public abstract String getName();
  
  public abstract void setName(final String newName);
}