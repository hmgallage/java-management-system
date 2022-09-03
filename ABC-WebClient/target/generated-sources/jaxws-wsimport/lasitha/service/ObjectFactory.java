
package lasitha.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lasitha.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddDrug_QNAME = new QName("http://service.lasitha/", "addDrug");
    private final static QName _AddPaymentResponse_QNAME = new QName("http://service.lasitha/", "addPaymentResponse");
    private final static QName _AddDrugResponse_QNAME = new QName("http://service.lasitha/", "addDrugResponse");
    private final static QName _DeleteDoctor_QNAME = new QName("http://service.lasitha/", "deleteDoctor");
    private final static QName _GetPayments_QNAME = new QName("http://service.lasitha/", "getPayments");
    private final static QName _GetDrug_QNAME = new QName("http://service.lasitha/", "getDrug");
    private final static QName _GetDrugResponse_QNAME = new QName("http://service.lasitha/", "getDrugResponse");
    private final static QName _GetPatient_QNAME = new QName("http://service.lasitha/", "getPatient");
    private final static QName _GetDoctors_QNAME = new QName("http://service.lasitha/", "getDoctors");
    private final static QName _DeleteDrugResponse_QNAME = new QName("http://service.lasitha/", "deleteDrugResponse");
    private final static QName _GetPatientResponse_QNAME = new QName("http://service.lasitha/", "getPatientResponse");
    private final static QName _AddPatient_QNAME = new QName("http://service.lasitha/", "addPatient");
    private final static QName _GetDrugsResponse_QNAME = new QName("http://service.lasitha/", "getDrugsResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://service.lasitha/", "helloResponse");
    private final static QName _GetDoctorResponse_QNAME = new QName("http://service.lasitha/", "getDoctorResponse");
    private final static QName _DeleteUser_QNAME = new QName("http://service.lasitha/", "deleteUser");
    private final static QName _DeletePatientResponse_QNAME = new QName("http://service.lasitha/", "deletePatientResponse");
    private final static QName _Hello_QNAME = new QName("http://service.lasitha/", "hello");
    private final static QName _AddDoctorResponse_QNAME = new QName("http://service.lasitha/", "addDoctorResponse");
    private final static QName _AddPayment_QNAME = new QName("http://service.lasitha/", "addPayment");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://service.lasitha/", "deleteUserResponse");
    private final static QName _GetUsersResponse_QNAME = new QName("http://service.lasitha/", "getUsersResponse");
    private final static QName _GetUserResponse_QNAME = new QName("http://service.lasitha/", "getUserResponse");
    private final static QName _DeletePatient_QNAME = new QName("http://service.lasitha/", "deletePatient");
    private final static QName _AddUser_QNAME = new QName("http://service.lasitha/", "addUser");
    private final static QName _GetDoctorsResponse_QNAME = new QName("http://service.lasitha/", "getDoctorsResponse");
    private final static QName _AddDoctor_QNAME = new QName("http://service.lasitha/", "addDoctor");
    private final static QName _GetPatients_QNAME = new QName("http://service.lasitha/", "getPatients");
    private final static QName _GetUser_QNAME = new QName("http://service.lasitha/", "getUser");
    private final static QName _GetDrugs_QNAME = new QName("http://service.lasitha/", "getDrugs");
    private final static QName _AddPatientResponse_QNAME = new QName("http://service.lasitha/", "addPatientResponse");
    private final static QName _DeleteDrug_QNAME = new QName("http://service.lasitha/", "deleteDrug");
    private final static QName _DeleteDoctorResponse_QNAME = new QName("http://service.lasitha/", "deleteDoctorResponse");
    private final static QName _GetDoctor_QNAME = new QName("http://service.lasitha/", "getDoctor");
    private final static QName _GetUsers_QNAME = new QName("http://service.lasitha/", "getUsers");
    private final static QName _GetPaymentsResponse_QNAME = new QName("http://service.lasitha/", "getPaymentsResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://service.lasitha/", "addUserResponse");
    private final static QName _GetPatientsResponse_QNAME = new QName("http://service.lasitha/", "getPatientsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lasitha.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link DeletePatient }
     * 
     */
    public DeletePatient createDeletePatient() {
        return new DeletePatient();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link GetDoctorsResponse }
     * 
     */
    public GetDoctorsResponse createGetDoctorsResponse() {
        return new GetDoctorsResponse();
    }

    /**
     * Create an instance of {@link AddDoctor }
     * 
     */
    public AddDoctor createAddDoctor() {
        return new AddDoctor();
    }

    /**
     * Create an instance of {@link GetPatients }
     * 
     */
    public GetPatients createGetPatients() {
        return new GetPatients();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetDrugs }
     * 
     */
    public GetDrugs createGetDrugs() {
        return new GetDrugs();
    }

    /**
     * Create an instance of {@link AddPatientResponse }
     * 
     */
    public AddPatientResponse createAddPatientResponse() {
        return new AddPatientResponse();
    }

    /**
     * Create an instance of {@link DeleteDrug }
     * 
     */
    public DeleteDrug createDeleteDrug() {
        return new DeleteDrug();
    }

    /**
     * Create an instance of {@link DeleteDoctorResponse }
     * 
     */
    public DeleteDoctorResponse createDeleteDoctorResponse() {
        return new DeleteDoctorResponse();
    }

    /**
     * Create an instance of {@link GetDoctor }
     * 
     */
    public GetDoctor createGetDoctor() {
        return new GetDoctor();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link GetPaymentsResponse }
     * 
     */
    public GetPaymentsResponse createGetPaymentsResponse() {
        return new GetPaymentsResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link GetPatientsResponse }
     * 
     */
    public GetPatientsResponse createGetPatientsResponse() {
        return new GetPatientsResponse();
    }

    /**
     * Create an instance of {@link AddDrug }
     * 
     */
    public AddDrug createAddDrug() {
        return new AddDrug();
    }

    /**
     * Create an instance of {@link AddPaymentResponse }
     * 
     */
    public AddPaymentResponse createAddPaymentResponse() {
        return new AddPaymentResponse();
    }

    /**
     * Create an instance of {@link AddDrugResponse }
     * 
     */
    public AddDrugResponse createAddDrugResponse() {
        return new AddDrugResponse();
    }

    /**
     * Create an instance of {@link DeleteDoctor }
     * 
     */
    public DeleteDoctor createDeleteDoctor() {
        return new DeleteDoctor();
    }

    /**
     * Create an instance of {@link GetPayments }
     * 
     */
    public GetPayments createGetPayments() {
        return new GetPayments();
    }

    /**
     * Create an instance of {@link GetDrug }
     * 
     */
    public GetDrug createGetDrug() {
        return new GetDrug();
    }

    /**
     * Create an instance of {@link GetDrugResponse }
     * 
     */
    public GetDrugResponse createGetDrugResponse() {
        return new GetDrugResponse();
    }

    /**
     * Create an instance of {@link GetPatient }
     * 
     */
    public GetPatient createGetPatient() {
        return new GetPatient();
    }

    /**
     * Create an instance of {@link GetDoctors }
     * 
     */
    public GetDoctors createGetDoctors() {
        return new GetDoctors();
    }

    /**
     * Create an instance of {@link DeleteDrugResponse }
     * 
     */
    public DeleteDrugResponse createDeleteDrugResponse() {
        return new DeleteDrugResponse();
    }

    /**
     * Create an instance of {@link GetPatientResponse }
     * 
     */
    public GetPatientResponse createGetPatientResponse() {
        return new GetPatientResponse();
    }

    /**
     * Create an instance of {@link AddPatient }
     * 
     */
    public AddPatient createAddPatient() {
        return new AddPatient();
    }

    /**
     * Create an instance of {@link GetDrugsResponse }
     * 
     */
    public GetDrugsResponse createGetDrugsResponse() {
        return new GetDrugsResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetDoctorResponse }
     * 
     */
    public GetDoctorResponse createGetDoctorResponse() {
        return new GetDoctorResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link DeletePatientResponse }
     * 
     */
    public DeletePatientResponse createDeletePatientResponse() {
        return new DeletePatientResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link AddDoctorResponse }
     * 
     */
    public AddDoctorResponse createAddDoctorResponse() {
        return new AddDoctorResponse();
    }

    /**
     * Create an instance of {@link AddPayment }
     * 
     */
    public AddPayment createAddPayment() {
        return new AddPayment();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link Drug }
     * 
     */
    public Drug createDrug() {
        return new Drug();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link Doctor }
     * 
     */
    public Doctor createDoctor() {
        return new Doctor();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDrug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "addDrug")
    public JAXBElement<AddDrug> createAddDrug(AddDrug value) {
        return new JAXBElement<AddDrug>(_AddDrug_QNAME, AddDrug.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "addPaymentResponse")
    public JAXBElement<AddPaymentResponse> createAddPaymentResponse(AddPaymentResponse value) {
        return new JAXBElement<AddPaymentResponse>(_AddPaymentResponse_QNAME, AddPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDrugResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "addDrugResponse")
    public JAXBElement<AddDrugResponse> createAddDrugResponse(AddDrugResponse value) {
        return new JAXBElement<AddDrugResponse>(_AddDrugResponse_QNAME, AddDrugResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "deleteDoctor")
    public JAXBElement<DeleteDoctor> createDeleteDoctor(DeleteDoctor value) {
        return new JAXBElement<DeleteDoctor>(_DeleteDoctor_QNAME, DeleteDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPayments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getPayments")
    public JAXBElement<GetPayments> createGetPayments(GetPayments value) {
        return new JAXBElement<GetPayments>(_GetPayments_QNAME, GetPayments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getDrug")
    public JAXBElement<GetDrug> createGetDrug(GetDrug value) {
        return new JAXBElement<GetDrug>(_GetDrug_QNAME, GetDrug.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrugResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getDrugResponse")
    public JAXBElement<GetDrugResponse> createGetDrugResponse(GetDrugResponse value) {
        return new JAXBElement<GetDrugResponse>(_GetDrugResponse_QNAME, GetDrugResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getPatient")
    public JAXBElement<GetPatient> createGetPatient(GetPatient value) {
        return new JAXBElement<GetPatient>(_GetPatient_QNAME, GetPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getDoctors")
    public JAXBElement<GetDoctors> createGetDoctors(GetDoctors value) {
        return new JAXBElement<GetDoctors>(_GetDoctors_QNAME, GetDoctors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDrugResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "deleteDrugResponse")
    public JAXBElement<DeleteDrugResponse> createDeleteDrugResponse(DeleteDrugResponse value) {
        return new JAXBElement<DeleteDrugResponse>(_DeleteDrugResponse_QNAME, DeleteDrugResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getPatientResponse")
    public JAXBElement<GetPatientResponse> createGetPatientResponse(GetPatientResponse value) {
        return new JAXBElement<GetPatientResponse>(_GetPatientResponse_QNAME, GetPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "addPatient")
    public JAXBElement<AddPatient> createAddPatient(AddPatient value) {
        return new JAXBElement<AddPatient>(_AddPatient_QNAME, AddPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrugsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getDrugsResponse")
    public JAXBElement<GetDrugsResponse> createGetDrugsResponse(GetDrugsResponse value) {
        return new JAXBElement<GetDrugsResponse>(_GetDrugsResponse_QNAME, GetDrugsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getDoctorResponse")
    public JAXBElement<GetDoctorResponse> createGetDoctorResponse(GetDoctorResponse value) {
        return new JAXBElement<GetDoctorResponse>(_GetDoctorResponse_QNAME, GetDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "deletePatientResponse")
    public JAXBElement<DeletePatientResponse> createDeletePatientResponse(DeletePatientResponse value) {
        return new JAXBElement<DeletePatientResponse>(_DeletePatientResponse_QNAME, DeletePatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "addDoctorResponse")
    public JAXBElement<AddDoctorResponse> createAddDoctorResponse(AddDoctorResponse value) {
        return new JAXBElement<AddDoctorResponse>(_AddDoctorResponse_QNAME, AddDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "addPayment")
    public JAXBElement<AddPayment> createAddPayment(AddPayment value) {
        return new JAXBElement<AddPayment>(_AddPayment_QNAME, AddPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "deletePatient")
    public JAXBElement<DeletePatient> createDeletePatient(DeletePatient value) {
        return new JAXBElement<DeletePatient>(_DeletePatient_QNAME, DeletePatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getDoctorsResponse")
    public JAXBElement<GetDoctorsResponse> createGetDoctorsResponse(GetDoctorsResponse value) {
        return new JAXBElement<GetDoctorsResponse>(_GetDoctorsResponse_QNAME, GetDoctorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "addDoctor")
    public JAXBElement<AddDoctor> createAddDoctor(AddDoctor value) {
        return new JAXBElement<AddDoctor>(_AddDoctor_QNAME, AddDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getPatients")
    public JAXBElement<GetPatients> createGetPatients(GetPatients value) {
        return new JAXBElement<GetPatients>(_GetPatients_QNAME, GetPatients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrugs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getDrugs")
    public JAXBElement<GetDrugs> createGetDrugs(GetDrugs value) {
        return new JAXBElement<GetDrugs>(_GetDrugs_QNAME, GetDrugs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "addPatientResponse")
    public JAXBElement<AddPatientResponse> createAddPatientResponse(AddPatientResponse value) {
        return new JAXBElement<AddPatientResponse>(_AddPatientResponse_QNAME, AddPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDrug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "deleteDrug")
    public JAXBElement<DeleteDrug> createDeleteDrug(DeleteDrug value) {
        return new JAXBElement<DeleteDrug>(_DeleteDrug_QNAME, DeleteDrug.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "deleteDoctorResponse")
    public JAXBElement<DeleteDoctorResponse> createDeleteDoctorResponse(DeleteDoctorResponse value) {
        return new JAXBElement<DeleteDoctorResponse>(_DeleteDoctorResponse_QNAME, DeleteDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getDoctor")
    public JAXBElement<GetDoctor> createGetDoctor(GetDoctor value) {
        return new JAXBElement<GetDoctor>(_GetDoctor_QNAME, GetDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPaymentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getPaymentsResponse")
    public JAXBElement<GetPaymentsResponse> createGetPaymentsResponse(GetPaymentsResponse value) {
        return new JAXBElement<GetPaymentsResponse>(_GetPaymentsResponse_QNAME, GetPaymentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lasitha/", name = "getPatientsResponse")
    public JAXBElement<GetPatientsResponse> createGetPatientsResponse(GetPatientsResponse value) {
        return new JAXBElement<GetPatientsResponse>(_GetPatientsResponse_QNAME, GetPatientsResponse.class, null, value);
    }

}
