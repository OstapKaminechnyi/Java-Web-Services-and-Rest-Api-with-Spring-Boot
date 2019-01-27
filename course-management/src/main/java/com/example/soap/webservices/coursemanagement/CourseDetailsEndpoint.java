package com.example.soap.webservices.coursemanagement;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseDetailsEndpoint {


    @PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse processCourseDetailsRequest
            (@RequestPayload GetCourseDetailsResponse request) {

        GetCourseDetailsResponse response = new GetCourseDetailsResponse();
        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setId(request.getId());
        courseDetails.setDescription("That would be a wonderful course!");
        courseDetails.setName("Microservices Course");
        response.setCourseDetails(courseDetails);
        return response;
    }
}
