What is GWT?
GWT is a development toolkit for building and optimizing complex browser-based applications. Its goal is to enable productive development of high-performance web applications without the developer having to be an expert in browser quirks, XMLHttpRequest, and JavaScript. GWT is used by many products at Google, including AdWords, AdSense, Flights, Hotel Finder, Offers, Wallet, Blogger. It’s open source, completely free, and used by thousands of developers around the world.

What is Material Design?
Created and designed by Google, Material Design is a design language that combines the classic principles of successful design along with innovation and technology. Google's goal is to develop a system of design that allows for a unified user experience across all their products on any platform.

What is Errai?
Errai is a GWT-based framework for building rich web applications using next-generation web technologies. Built on-top of ErraiBus, the framework provides a unified federation and RPC infrastructure with true, uniform, asynchronous messaging across the client and server, CDI/EE/JPA in the Browser, JAX-RS Integration and other features.

Ok, I got it, now, what is this?
GwtMaterial works over UiBiner (its support will be dropped soon), moreover the Errai Template subsystem uses another way of widget initialization, so the main goal of this project is to allow to use GwtMaterial widgets with Errai UI.

How to run this demo:

 clone it and run in console:
 
 [user@errai-material-demo]$ mvn clean gwt:run
 
 after gwt:run get started open http://127.0.0.1:8888 in a browser
 