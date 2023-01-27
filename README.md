# record-locator

* Ensure that Docker desktop is running if you are working from a windows machine.
* Clone this repository into a directory of your choising.
* In said directory Run the `docker-compose -f record-compose.yml up --build -d` command to build the record locaor application and db.
* When both the medtech and record locator compose files have built successfully open your search engine of choice and lookup `localhost:8080/medtech this will take you to a forms page with text boxes to input patient information 
* Enter in patient information and click submit 
* A webpage should return with the statement "Patient submitted successfully" and the patients NHI number

* To Test to see if the record has successfully been recorded in the record locator database in Postman import the `TestRL-MEDTECH.postman_collection.json` file that is stored in this repository and run the Get request with the NHI number you submitted to the medtech web form.
* The output should be a 200 OK status and an array of Record Locator objects showing the recordLocatorId systemId, dataType, and the patientId which will be equivalent to the NHI.
