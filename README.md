[Clean code checklist](https://github.com/bhochhi/design-pattern-guide/wiki/clean-code-checklist)
---

__Dependencies__
* _Make Logical Dependencies Physical_ If one module depends upon another, that dependency should be physical, no just logical. Don't make assumptions. 
* _Singletons / Service Locator_ Use dependency injection, Singletons hide dependencies.
* _Base classes Depending On their derivatives_ Base classes should work with any derived class.
* _Too Much Information_ Minimise interface to minimise coupling
* _Feature Envy_ The methods of a class should be interested in the variables and functions of the class they belong to, and not the variables and functions of other classes. When a method uses accesssors and mutators of some other object to manipulate the data within that object, then it envies the scope of the class of that other object. It wishes that it were inside that other class so that it could have direct access to the variables it is manipulating.
* _Artificial Coupling_ Things that don't depend upon each other should not be artificially coupled.
* _Hidden Temporal Coupling_ If, for example, the order of some method calls is important, then make sure that they cannot be called in the wrong order.
* _Transitive Navigation_ Aka Law of Demeter, writing shy code. A module should know only its direct dependencies.


__Naming__
* _Choose Descriptive / Unambiguous Names_ Names have to reflect what a variable, field, property stands for. Names have to be precise.
* _Choose Names at Appropriate Level of Abstraction_ Choose names that reflect the level of abstraction of the class or method you are working in.
* _Name Interfaces After Functionality They Abstract_ The name of an interface should be derived from its usage by the client.
* _Name Classes After How They Implement Their Interfaces_ The name of a class should reflect how it fulfils the functionality provided by its interface(s).
* _Name Method After What They Do_ The name of the method should describe what is done, not how it is done.
* _Use Long Names for Long Scopes_
* _Names Decribe Side Effects_ Names have to reflect the entire functionality
* _Standard Namenclature Where Possible_ Don't invent your own language when there is a standard.
* _Encodings in Names_ No prefixes, no type/scope information

__Understandability__
* _Consistency_ If you do something a certain way, do all similar things in the same way: same variable name for same concepts, same naming pattern for corresponding concepts.
* _Use Explanatory Variables_ Use locals to give steps in algorithms names.
* _Encapsulate Boundary Conditions_ Boundary conditions are hard to keep track of. Put the processing of them in one place.
* _Prefer Dedicated Value Objects to Primitives Types_ Instead of passing primitives types, use dedicated primitive types.
* _Poorly Written Comment_ Comment does not add any value(redundant to code), is not well formed not correct grammer/spelling.
* _Obivious Behaviour is Unimplemented_ Violations of "the Principle of Least Astonishment". What you expect is what you get.
* _Hidden Logical Dependency_ A method can only work when invoked correctly depending on something else in the same class.


__Methods__
* _Methods Shound Do One Thing_ Loops, exception handling, ...encapsulate in sub-methods.
* _Methods Should Descend 1 Level of Abstraction_ The statements within a method should all be written at the same level of abstraction, which should be one level below the operation described by the name of the function.
* _Method with Too Many Arguments_ Prefer fewer arguments. Maybe functionality can be outsourced to a dedicated class that holds the information in fields.

A



Lightening Thoughts
---
* Simplicity is not feature reduction
 Simplifying a programming model does not reduce its functionality. Simplification merely hides the complex logic behind framework code or reusable components.In essence, it shifts complexity from one part of the system that needs explicit management by application developers to another part invisible to most developers. 

*  what drives us to use certain approaches, tools and techniques during building the software products? Its the way we understand the nature of problem dictates everything what we do to solve the problem. And everything is about making the choices. It starts with the design approaches. Test Driven Development, Behavior-driven Design ...
*  When we think of making reusable components, question is how far you need to or how granular you need to get. A person who need to build a table, he can either buy all those tools and raw woods or he can buy one of those assembles or the last option is fully readymade one, all depends on his ability, interest, requirements and flexibility he is looking for. However, as furniture dealer, what you want to sell? do you just want to sell just tools and woods or self assemble furniture or readymade one? I believe most of them want to sell all options because that covers the all possible market. And that's exactly my point when building reusable components. All components doesn't need to be pieces of woods and tools but some could be sold as bigger piece may be built using those granular components so that user doesnt always has to start from scratch. 
*  





###[Variaous Design pattern can be categorized into three groups:](https://github.com/bhochhi/design-pattern-guide/wiki/Various-Design-patterns)

   
   
###[Data driven Design?](https://github.com/bhochhi/design-pattern-guide/wiki/data-driven-design) 








http://file.allitebooks.com/20150625/Designing%20Data-Intensive%20Applications.pdf



