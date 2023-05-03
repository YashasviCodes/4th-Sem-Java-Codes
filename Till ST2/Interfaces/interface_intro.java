/*
  - interface supports multiple inheritance
  - can not make object of interfaces (just like abstract classes )
  - keyword : implements
  - methods inside interface must not be static, final, native (because then we can not change it)
  - all variabkes declared inside interface are implicitely (by default) public, staitc, and final 
  - all methods declared inside this are implicitely public and abstract , so in case we want to write the body of a method declared inside the 'interface' then use 'public' keyword in during the body writing.
  
  - interface can extend one or more other interface using 'extends'
  - it can not implement the class i.e an interface can only implement a parent interface and not a class, altough a class can implement a interface
  
  - interface can inherit another interface using 'extends' 

  - abstract classes may or may not contain body of method, but in interface there must not be body, only declaration.
  - Through Classes in java doesn't support multiple inheritance, but a class can implement more then one interfaces
  

 */
