Clean code checklist
---


* Code is clean if it can be understood easily by everyone on the team. With Understandability comes readability, changeability, extensibility and maintability. All the things needed to keep a project going over a long time without accumulating up a large amount of technical debt.
![](https://github.com/bhochhi/design-pattern-guide/blob/master/why-clean-code.png)

* Writing clean code from the start in a project is an investment in keeping the Cost of Change(CoC) as constant as possible throughout the lifecycle of a software product. Building the house analogy applies here. If you spend little more initaially during the fundation, your maintenance cost will be less compare to house that were built quick and dirty.
* _In Clean Code, Bugs Cannot Hide_ Most software defects are introduced when changing existing code. The reason behind this is that the developer changing the code cannot fully grasp the effects of the changes made. Clean code minimises the risk of introducing defects by making the code as easy to understand as possible.

__Principles__

*  _Loose Coupling_ Two Classes, components or modules are coupled when at least one of them uses the other. The less these items know about each other, the looser they are coupled. A component that is only loosely coupled to its envionment can be easily changed or replaced than a strongly coupled component.
*  _High Cohesion_ is the degree to which elements of a whole belong together. Methods and fields in a single class and classes of a component should have high cohesion. High cohesion in classes and components results in simpler, more easily understandable code structure and design.
*  _Change is Local_ When a software system has to be maintained, extended and changed for a long time, keeping changes local reduces involved costs and risks. Keeping change local means that there are boundaries in the design which changes do not cross.
*  _It is Easy to Remove_ We normally build software by adding, extending or changing features. However removing elements is important so that the overall design can be kept as simple as possible. When a block gets too complicated, it has to be removed and replaced with one or more simpler blocks. 

__Code Smells when__
* _Rigidity_ The software is difficult to change. A small change causes cascade of subsequent changes.
* _Fragility_ The software breaks in many places due to a single change.
* _Immobility_ You can't use part of the code in other project because of involved risk and high effort.
* _Viscosity of Environment_ Building, testing and other tasks take a long time. Therefore, these activities are not executed properly by everyone and technical debt is introduced.
* _Needless Repetition_ Code contains lots of code duplication: exact code duplications or design duplicates(doing the same thing in a different way). Making a change to a duplicated of code is more expensive and more error-prone because the change has to be made in several places with the risk that one place is not changed accordingly.
* _Opacity_ The code is hard to understand. Therefore, any change takes additional time to first reengineer the code and is more likely to result in defects due to not understanding the side effects.

__Class Design__
* _Single Responsibility Principles (SRP)_ A class should have one, and only one, reason to change.
* _Open Closed Principle(OCP)_ You should be able to extend a classes behaviour without modifying it.
* _Liskov Substitution Principle(LSP)_ Derived classes must be substitutable for their base classes.
* _Dependency Inversion Principle(DIP)_ Depends on abstraction, not on concretions.
* _Interface Segregation Priciple(ISP)_ Make find grained interfaces that are client-specific.
* _Classes should be small_ Smaller classes are easier to grasp. Classes should be smaller than about 100 lines of code, Otherwise, it is hard to spot how the class does its job and it probably does more than a single job.

__Package Cohesion__
* _Release Reuse Equivalency Principle(RREP)_ The granule of reuse is the granule of release.
* _Common Closure Principle_ Classes that changes together are packaged together.
* _Common Reuse Principle_ Classes that are used together are packaged together.

__Package Coupling__
* _Acyclic Dependencies Principle(ADP)_ The dependency graph of packages must have no cycles. 
* _Stable Dependencies Priciple(SDP)_ Depend in the direction of stability.
* _Stable Abstractions Principle(SAP)_ Abstractness increses with stability.
* 
__General__
* _Follow Standard Convention_ Coding-, architecture-, design guidelines( check them with tools).
* _Keep it Simple, Stupid (KISS)_ Simpler is always better. Reduce complexity as much as possible.
* _Boy Scout Rule_ Leave the campground cleaner then you found it.
* _Root Cause Analysis_ Always look for the root cause of problem. Otherwise, it will get you again and again.
* _Overridden Safeties_ Do not override warnings, errors, exception handling - they will catch you.

__Dependency Injection__
* _Decouple Contruction from Runtime_ Decoupling the contruction phase completely from runtime helps to simplify the runtime behaviour.

__Design__
* _Keep Configurable Data at High Levels_ If you have a contstant such as default or configuration value that is known and expected at high level of abstraction, do not bury it in a low-level function. Expose it as an argument to the low-level function called from the high-level function
* _Don't be Arbitrary_ Have a reason for the way you structure your code, and make sure that reason is communicated by the structure of the code. If a structure appears arbitary, other will feel empowered to change it.
* _Structure over Convention_ Enforce design decisions with structure over convention. Naming conventions are good, but they are inferior to structures that force compliance.
* _Be Precise_ When you make a decision in your code, make sure you make it precisely. Know why you have made it and how you will deal with any exception.
* _Prefer Polymorphism To If/Else or Switch/Case_ "ONE SWITCH": There may be no more than one switch statement for a given type of selection. There cases in that switch statement must create polymorphic objects that take the place of other such switch statements in the rest of the system.
* _Symmetry/Analogy_ Favour symmetric designs(e.g. Load-Save) and design that follow analogies.
* _Separate Multi-Threading Code_ Do not mix code that handles multi-threading aspects with the rest of the code. Separate them into different classes.
* _Misplaced Responsibility_ Something put in the wrong place.
* _Code at Wrong Level of Abstraction_ Functionalities are at wrong level of abstraction.
* _Fields not defining State_ Fields holding data that does not belong to the state of the instance but are used to hold temporary data. Use local variables or extract to a class abstracting the perfomed action. 
* 





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



