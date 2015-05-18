========================= JSP Expression Language =====================
1. Syntax 1 (Dot Operator) : ${firstThing.secondThing}
	a) "firstThing" could be following
	   1. Implicit Objects eg : {pageScope,requestScope,sessionScope,applicationScope,cookie,intparam,pagecontext}
	      Note: All these are "MAP" objects but pagecontext. pagecontext is actual reference to pageContext Object.
	   2. Attributes set to any scope (page,req,session,app). eg: req.setAttribute("person",person);
	   
	   This means "firstThing" must be Map or bean.
	b) "secondThing" must be map key or bean property
	
2. Syntax 2 ([] Operator) : ${firstThing[secondThing]}

   a) "firstThing" could be Map, bean, array or list
   b) "secondThing" could be Map key, bean property, index to array or list