# logbook
logbook app for flight hour tracking

This is a java gradle project built using spring boot. Underneath it sits a mySQL database. Using Thymeleaf as our templating tool.

Overall features I'm building towards:

Main dashboard to display relevant stats (total flight hours, total miles/kilometers traveled, night hours, multi-engine, turbine,
prop, etc.). Data will be pulled from the flight database. This is 0% as of 6/28.

Aircraft page where you can add specific aircraft, including tail numbers. This is complete.

Route page where you can create a specific route. This is about 50% complete as of 6/28. The difficulty I'm having now is figuring
out how to enable a user to incrementally build a route, so you would add a point on the route, that would display in a static 
field on the page, with a form entry to add another point in the route. Once completed, there is an operation to determine the 
distance between each point, based on the airport data stored in the airports database. The logic for distance calculation is complete
but the logic to calculate per route isn't there yet. This is the next feature I need to complete.

Flight page where one can add a new flight. User will input the date, choose the routes (from those already set up), add an aircraft,
and flight duration, then the record will be added. 25% complete; works as intended pre-route, but the route portion still needs
work.

Rough plan going forward - build out route logic, templates, and database logic. Once complete, move to adding flights. After that,
start on the dashboard.

Finally, we will want to import the existing log of flights from our lone user. We will likely have to create a script to build the
routes, then another script to biuld the flights once the aircraft and routes are ready.
