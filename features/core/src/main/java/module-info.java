module org.apache.karaf.features.core {
  requires java.base;
  requires org.apache.felix.utils;
  requires org.osgi.service.repository;
  requires org.apache.karaf.util;
  requires org.slf4j;
  requires java.xml;
  requires java.xml.bind;
  requires java.management;
  requires org.eclipse.equinox.region;
  requires org.osgi.util.promise;
  requires org.osgi.service.cm;
  requires org.apache.felix.resolver;
  requires com.fasterxml.jackson.databind;
  requires org.osgi.service.component;
  requires org.osgi.service.event;
  requires org.osgi.core;
  requires org.osgi.namespace.service;
  requires org.apache.felix.cm.json;
  requires pax.url.mvn;
  provides org.ops4j.pax.url.mvn.MavenResolver with org.apache.karaf.features;

}