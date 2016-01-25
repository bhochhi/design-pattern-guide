Command/Query Object Pattern
---

The idea is to abstract out the data interaction logic into separate layer so that other part of application does not have to deal with these complexities. Repository pattern gets us to there by encapsulating all related data into seperate object. For instance if we have product concept in our application, the repository object that interact with datasource may look like this:

```c#
public interface IProductRepository
{
    IEnumarable<Product> GetProductById(in id);
    IEnumarable<Product> GetMostLikeProducts();
    IEnumarable<Product> GeLeastLikeProducts();
}
```
This list of functions could grow quicky based on requirements resulting thick repository object that is holding huge business logic. So, command/Query object pattern is about breaking down such repository class into granular object call query object which will be resposible only for one set of data corresponding to one query. For instance, for the same product repository with three functions, there will be three Query Objects:

```c#
public interface IQuery{
     IEnumarable<Product> Execute(Session session);
}


public class ProductByIdQuery : IQuery{
     IEnumarable<Product> Execute(Session session){
      return session....
     }
}

public class MostLikeProductQuery : IQuery{
      IEnumarable<Product> Execute(Session session);
}

public class LeastLikeProductQuery : IQuery{
      IEnumarable<Product> Execute(Session session);
}

```



http://stackoverflow.com/questions/17831623/why-query-object-design-pattern
https://coderkarl.wordpress.com/2012/05/02/the-query-object-pattern-2/

[Variaous Design pattern can be categorized into three groups:](https://github.com/bhochhi/design-pattern-guide/wiki/Variaous-Design-patterns)

   
   
All I was trying to do was just reorganize my thoughts on what drives us to use certain approaches, tools and techniques during building the software products. I know it's the way we understand the nature of problem dictates everything what we do to solve the problem. And everything is about making the choices. It starts with the design approaches. Test Driven Development, Behavior-driven Design  

 I didn't realize that I will have a brainfuck after a week    
   
   


Data driven programming/ Data oriented Programming all clear. Still seeking what data-driven-design associated with....


   
   
###[What is data driven development?](https://github.com/bhochhi/design-pattern-guide/wiki/What-is-data-driven-programming%3F) 





Data driven design in Software Development.

I kind of have good understanding how one could practice Data driven Design for better User experience. However, I don't know what this approach dictates the way you code, does it has any preference in term of programming paradigms or does it even dictates to use certain programming techniques like OOP or functional. 




Development means design and program.

###[Domain driven design vs Data Driven Design]()
output = myfunc(input)
vs.
output = input.myfunc()

Most often I have use certain techniques and approaches without giving much thoughts to it, like what kind 

If you already have platform or framework defined which will be used to develop your application, you don't have to worry to much about what patterns or paradigms to use. the framework or language already dictates you to use one they are made for.



In a data-centric design, the system is generally separated into objects based upon the data that they encapsulate. For example, in an e-commerce application you are likely to find objects that represent products, invoices, payments, and users. These objects provide methods which operate on that data, either returning its values, or mutating its state. A Product object might provide a method to determine how many of a given product are currently in stock, or possibly a method to add that product to the current shopping cart.

Names for data-centric objects are often nouns, because they frequently correspond to real-world objects. This real-worldliness is generally also true of the methods that these objects provide. The methods either represent accessors to the object's data, relationships between objects, or actions that could be taken on the object. 
Nicely, put thoughts. Gave me a good explanation with example but not the answer. May be that's the reality. We use all those techniques and tools but never put enough thoughts how such abstract thinking and when we try to do, guy like me get confused with all those jargons people has been using differently. May be compromise is what we need, instead of being dogmatic about certain practice, and as a result what you ended up is a solution that is simple, testable and within the budget and deadline. However, for me compromise, is also mean having anti patterns in my solution. But does that even a big deal? Honestly, I have never seen or done any real life project that doesn't have some sort of anti patterns based on definition of anti pattern. 

__ The problems we wanted to solve needed different way of thinkings, that means a paradigm shift is needed to solve various problems. contexts, complexity are different for different problems. If you trying to solve all such problem using the same techniques, practices and patterns, you may end up with the solution but the path and process would be painful and complex, inconvinent and results to anti-pattern to reach the goal. All I am saying is its not good idea to try to solve all problems with the same set of mind, you need to develop different way of thinkings, which gives birth to various paradigms. Now, the problem is how to know what paradigm is better shoots to what kind of problems? __

__How to know which paradigm is choose? Depends upon what is required/problem and also on the what type of development platform we choose, as some may not suppose certain methodology and approaches. This means Design and programing is very co-related. You can not design the system and expect to be implemented readily on any platform you choose. you need to tune the design with certain paradigm that is supported by your programming platform. For instance, use OOD to implement using OOP. Use Data-driven Design to use Data-Driven Programming. Design and development/programming process is inextriable. 

The most significant complexity of many application is not technical but it is in the domain itself, activities or business of the user.

Primary focus of most software should be in domain and domain logic. Starts with analyzing domain context, then modelling, then moving to OOP.

 
__DDD is not a silver bullet. When done sensibly, it's about taking a craftsman-like approach to building software, and recognizing the need to reduce the cognitive friction between development teams and the businesses they are building software for. One of the most important practices is to have a layer in which the domain vocabulary used by the software team and the business team matches as closely as possible. You build this layer iteratively as you come to understand the business problem that you are trying to solve. When business logic is sensibly encoded in this layer, isolated from all the convoluted dependencies that enterprise applications typically have by factoring interactions with those systems out to interfaces, the language used in the actual domain layer eventually becomes fairly concise, obvious, and readable. When you review your model with the business, they will often correct you, and you gradually refactor to a deeper understanding of the domain.

If you practice object-oriented design, including the discipline of loose coupling, and you practice unit testing fairly religiously, and you mercilessly refactor code, and you work with domain experts while building your system, essentially you'll end up with a result that's basically what advocates of domain driven design are talking about.__

DDD is a pragmatic approach to software development that can, over time, reduce the buildup of technical debt, and make your customers happier because you are able to speak the same language with each other, and deliver better-working solutions because of the advantages of understanding each other better.

Recently I was trying to reorganize my thoughts on various design approaches I have been practicing. One of them is Data-Driven Design. Most often, there were certain techniques that I apply 

http://buytaert.net/the-future-of-software-is-data-driven 
https://passwork.me/info/blog/applicationdesign
http://www.informit.com/articles/article.aspx?p=25074&seqNum=4http://stackoverflow.com/questions/1641580/what-is-data-oriented-design
http://stackoverflow.com/questions/1641580/what-is-data-oriented-design/1641615#1641615

Data-driven: focus in data, design, based on measurement, based on facts, why--> better user experience. 
cosumer product business, walmart/target. product sorting/display/placement/pricing/personalized offers. 
Collecting and redesign. 
telecom/google/





Domain-driven: focus in logic





http://www.codeproject.com/Articles/29036/Patterns-in-Real-Life
http://file.allitebooks.com/20150625/Designing%20Data-Intensive%20Applications.pdf



