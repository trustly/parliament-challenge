# Parliament Challenge

This is a coding challenge using open API services to make a composite result.


## The task

Create an application that serves requests for parliament speeches. To be able to serve the information required you need to merge data from two different APIs.

The expected response should be in JSON. 

The expected response should _at least_ contain:

 - A unique ID, representing the speech itself
 - Date of speech
 - The name of the speaker, and only the name
 - Political affiliation
 - The official e-mail address
 - Constituency
 - A decent sized image that could be used in a web site listing
 - The debate subject
 - A link to the speech (HATEOAS style)

A minimum requirement is to accept a request and list the ten latest speeches. 
Filtering or search criteria for the request is a bonus!


## Resources

The Swedish parliament has a [number of open APIs](http://data.riksdagen.se/).

### Speeches in the Chamber

This API let us list the latest, or search for speeches and retrieve meta data about them.

 - Description: <http://data.riksdagen.se/data/anforanden/>
 - Query tool: <http://data.riksdagen.se/anforandelista/>
 - Example query: <http://data.riksdagen.se/anforandelista/?anftyp=Nej&sz=10>
 
Here is an example output with some of the values replaced with an English equivalent of the field's name.
 
 ```xml
<anforandelista antal="10">
    <anforande>
        <dok_titel>document title</dok_titel>
        <dok_rm>season</dok_rm>
        <dok_nummer>doc number</dok_nummer>
        <dok_datum>doc date ISO 8601 format</dok_datum>
        <avsnittsrubrik>debate title</avsnittsrubrik>
        <kammaraktivitet>activity type</kammaraktivitet>
        <anforande_id>speech id</anforande_id>
        <anforande_nummer>speech</anforande_nummer>
        <talare>prestended speaker</talare>
        <parti>affiliated political party</parti>
        <intressent_id>stakeholder id</intressent_id>
        <rel_dok_id>related dok id</rel_dok_id>
        <replik>reply</replik>
        <systemdatum>system date ISO 8601 format</systemdatum>
        <systemnyckel>system key</systemnyckel>
        <anforande_url_xml>speech xml</anforande_url_xml>
        <anforande_url_html>speech html formatted</anforande_url_html>
        <protokoll_url_www>speech web url</protokoll_url_www>
    </anforande>
</anforandelista>
 
 ```

 
### Members

The Members API provides information about people in the parliament. 
You can query the resource with name, gender, political party affiliation, the parliament's unique identifier, what district the person represents etc 

 - Description: <http://data.riksdagen.se/data/ledamoter/>
 - Query tool: <http://data.riksdagen.se/data/ledamoter/skapa-sokfraga-for-ledamotsdata/>
 - Example query: <http://data.riksdagen.se/personlista/?iid=0980681611418>
 
 Here is an example output with some of the values replaced with an English equivalent of the field's name.

```xml
<personlista systemdatum="2019-03-07 13:28:59" hits="1">
    <person>
        <sourceid>source GUID</sourceid>
        <intressent_id>stakeholder ID</intressent_id>
        <fodd_ar>birth date</fodd_ar>
        <kon>gender</kon>
        <efternamn>surname</efternamn>
        <tilltalsnamn>name</tilltalsnamn>
        <sorteringsnamn>catalog name</sorteringsnamn>
        <parti>affiliated party</parti>
        <valkrets>constituency</valkrets>
        <personuppgift>
            <uppgift>
                <kod>meta data type code</kod>
                <uppgift>meta data</uppgift>
                <typ>eadress</typ>
                <intressent_id>stakeholder id</intressent_id>
            </uppgift>
        </personuppgift>
    </person>
</personlista>

```


### Boilerplate project

If you read this as a README, you already have the boiler plate. This is a Maven based Spring Boot 2 project and you are free to use it as you like. Add dependencies, use MVC or Webflux, it is up to you.


## What do we Expect From you

 - Spend an evening on the task
 - As a bare minimum we want to be able to send a request and get a response with the merged data
 - If there are things you want to add but you run out of time, please document your thoughts somehow!
 - What would you do or like to add to deploy this in a production environment?  
 - Don't excuse yourself. Make code you can stand for. That is what we will judge you on in the end, right?
 - But most importantly, enjoy the coding and have fun!

Good luck, Godspeed to You!


 