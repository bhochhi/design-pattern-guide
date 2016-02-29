Clean code checklist
---


* Code is clean if it can be understood easily by everyone on the team. With Understandability comes readability, changeability, extensibility and maintability. All the things needed to keep a project going over a long time without accumulating up a large amount of technical debt.
* Writing clean code from the start in a project is an investment in keeping the Cost of Change(CoC) as constant as possible throughout the lifecycle of a software product. Building the house analogy applies here. If you spend little more initaially during the fundation, your maintenance cost will be less compare to house that were built quick and dirty.
* _In Clean Code, Bugs Cannot Hide_ Most software defects are introduced when changing existing code. The reason behind this is that the developer changing the code cannot fully grasp the effects of the changes made. Clean code minimises the risk of introducing defects by making the code as easy to understand as possible.
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



