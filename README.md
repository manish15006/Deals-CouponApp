# Deals-CouponApp
1.Admin-Service(Adding Deals),Coupon-Service-> interlinked :- working perfectly [Admin can Add,delete,update,view the deals],
2.Admin-service,User-service(customers)-> interlinked :- working perfectly [Admin can edit the customer and delete the customer]
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
# MICROSERVICES
Admin-Service[dealer],
Coupon-service[coupons],
User-service[customers],
Eureka-server,
Gateway[Zuul-Gateway]
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
Eureka-server is connected with the microservice's.
All the Microservice's are connected with the ZuulGateway.
Swagger is Enabled. 
