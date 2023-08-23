import Card from 'react-bootstrap/Card';
import ListGroup from 'react-bootstrap/ListGroup';
import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import {useNavigate} from 'react-router';
import {toast} from 'react-toastify';
import './styles/Home.css';
import {AiOutlineUser} from 'react-icons/ai';

const DoctorHome=()=>{
    return (
    <>
      <div class="wrapper">
        <div class="container main">
        <div class="row">
          <div class="col">
          <Card>
      <Card.Body>
        <Card.Title>Free Slots</Card.Title>
        <Card.Text>
          Click here to check your free slots here. You can edit your slots as well.
        </Card.Text>
      </Card.Body>
      <ListGroup className="list-group-flush">
        <ListGroup.Item>Cras justo odio</ListGroup.Item>
        <ListGroup.Item>Vestibulum at eros</ListGroup.Item>
      </ListGroup>
      <Card.Body>
        <Card.Link href="#">Visit</Card.Link>
      </Card.Body>
    </Card>
          </div>
          <div class="col">
          <Card>
      <Card.Body>
        <Card.Title>Payments</Card.Title>
        <Card.Text>
          Some quick example text to build on the card title and make up the
          bulk of the card's content.
        </Card.Text>
      </Card.Body>
      <ListGroup className="list-group-flush">
        <ListGroup.Item>Cras justo odio</ListGroup.Item>
        <ListGroup.Item>Vestibulum at eros</ListGroup.Item>
      </ListGroup>
    </Card>
          </div>
        <div class="col">
        <Card>
      <Card.Body>
        <Card.Title>Check Appointments</Card.Title>
        <Card.Text>
          Some quick example text to build on the card title and make up the
          bulk of the card's content.
        </Card.Text>
      </Card.Body>
      <ListGroup className="list-group-flush">
        <ListGroup.Item>Cras justo odio</ListGroup.Item>
        <ListGroup.Item>Vestibulum at eros</ListGroup.Item>
      </ListGroup>
    </Card>

</div>
        </div>
        </div>
      </div>  
    </>
  );
}
export default DoctorHome;